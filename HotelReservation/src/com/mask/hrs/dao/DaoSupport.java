package com.mask.hrs.dao;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.hibernate.engine.SessionFactoryImplementor;
import org.hibernate.hql.ast.QueryTranslatorImpl;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.mask.util.PageInfo;

public class DaoSupport<T> extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DaoSupport.class);

	protected void initDao() {
	}

	@SuppressWarnings("unchecked")
	public T findById(Class<T> clazz, Serializable id) {
		log.debug("getting " + clazz + " instance with id: " + id);
		try {
			T obj = (T) getHibernateTemplate().get(clazz, id);
			return obj;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/**
	 * 查找出自增长的ID值
	 */
	public Long findId(Class<T> clazz) {
		String hql = "select max(id) from " + clazz.getSimpleName();
		Session session = super.getHibernateTemplate().getSessionFactory()
				.openSession();
		Query query = session.createQuery(hql);
		Long count = (Long) query.uniqueResult();
		session.close();
		return count;
	}

	/**
	 * 保存实体对象
	 * 
	 * @param entity
	 */
	public void save(T entity) {
		try {
			log.debug("saving " + entity.getClass().getSimpleName()
					+ " instance");
			// Session session =
			// getHibernateTemplate().getSessionFactory().openSession();
			// Transaction tran = session.beginTransaction();
			// session.save(entity);
			// tran.commit();
			// session.close();
			getHibernateTemplate().save(entity);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/**
	 * 修改实体对象
	 * 
	 * @param entity
	 */
	public void update(T entity) {
		try {
			log.debug("updating " + entity.getClass().getSimpleName()
					+ " instance");
			// Session session =
			// getHibernateTemplate().getSessionFactory().openSession();
			// Transaction tran = session.beginTransaction();
			// session.update(entity);
			// tran.commit();
			// session.close();
			getHibernateTemplate().update(entity);
			log.debug("update successful");
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	/**
	 * 删除实体对象
	 * 
	 * @param entity
	 */
	public void delete(T entity) {
		log
				.debug("deleting " + entity.getClass().getSimpleName()
						+ " instance");
		try {
			// Session session =
			// getHibernateTemplate().getSessionFactory().openSession();
			// Transaction tran = session.beginTransaction();
			// session.delete(entity);
			// tran.commit();
			// session.close();
			getHibernateTemplate().delete(entity);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/**
	 * @author chenjie
	 * @param hql
	 *            批量修改,删除
	 */
	public int bulkUpdate(String hql, Object... params) {
		return getHibernateTemplate().bulkUpdate(hql, params);
	}

	/**
	 * 根据实体模板进行模糊查找 做模糊查询建议不使用， 除非确定非限制性的属性一定为null
	 * 
	 * @param entity
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByExample(T entity) {
		log.debug("finding instance by example:" + entity.toString());
		try {
			List results = getHibernateTemplate().findByExample(entity);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/**
	 * 根据条件进行查询
	 * 
	 * @param entity
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByCriteria(Class<T> clazz, DetachedCriteria criteris) {
		log.debug("finding instance by criteria");
		try {
			List results = getHibernateTemplate().findByCriteria(criteris);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/**
	 * 根据实体的某属性进行查找
	 * 
	 * @param propertyName
	 *            实体类某属性名称
	 * @param value
	 *            该属性的值
	 */
	public List<T> findByProperty(Class<T> clazz, String propertyName,
			Object value) {
		log.debug("finding instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from " + clazz.getSimpleName()
					+ " as model where model." + propertyName
					+ "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/**
	 * 查找所有某类对象
	 * 
	 * @param clazz
	 *            类名称
	 */
	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<T> clazz) {
		log.debug("finding all " + clazz + " instances");
		try {
			String queryString = "from " + clazz.getSimpleName()
					+ " as model";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/**
	 * 查找所有某类对象 更新：只能查找出del为0的数据
	 * 
	 * @param clazz
	 *            类名称
	 * @param curentIndex
	 *            当前页面编号
	 * @return 对象集合的页面信息
	 */
	@SuppressWarnings("unchecked")
	public PageInfo findAll(Class<T> clazz, int curentIndex) {
		log.debug("finding all " + clazz + " instances into PageInfo");
		try {
			String queryString = "from " + clazz.getSimpleName()
					+ " as model";
			return findPageInfoByHQL(queryString, curentIndex);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/**
	 * 根据id , 查找所有某类对象
	 * 
	 * @param clazz
	 *            类名称
	 * @param curentIndex
	 *            当前页面编号
	 * @return 对象集合的页面信息
	 * 
	 * name 字段名 id 字段值
	 */
	@SuppressWarnings("unchecked")
	public PageInfo findAll(Class<T> clazz, int curentIndex, String name,
			String id) {
		log.debug("finding all " + clazz + " instances into PageInfo");
		try {
			String queryString = "from " + clazz.getSimpleName() + " where "
					+ name + " = '" + id + "'";
			return findPageInfoByHQL(queryString, curentIndex);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PageInfo findCurentObj(String hql, int curentIndex) {
		return findPageInfoByHQL(hql, curentIndex);
	}

	public PageInfo findByHQL(String hql, int PageIndex) {
		return findPageInfoByHQL(hql, PageIndex);
	}

	/**
	 * 通过HQL查找类对象
	 * 
	 * @param curentIndex
	 *            当前页面编号
	 * @return 对象集合的页面信息
	 */
	@SuppressWarnings("deprecation")
	private PageInfo findPageInfoByHQL(final String HQL, final int curentIndex) {
		final int findSum = this.getCount(getCountSQL(HQL));
		return (PageInfo) getHibernateTemplate().execute(
				new HibernateCallback() {
					@SuppressWarnings("unchecked")
					public Object doInHibernate(Session session)
							throws HibernateException {
						PageInfo pageInfo = new PageInfo(curentIndex, findSum);
						int recordCount = findSum;
						int pageId = pageInfo.getPageId();
						int pageSize = pageInfo.getPageSize();
						int pages = (recordCount - 1) / pageSize + 1;
						int newPageId = pageId > pages ? pages : pageId;
						int sIndex = (newPageId - 1) * pageSize + 1;
						sIndex = sIndex > recordCount ? recordCount : sIndex;
						int eIndex = sIndex + pageSize - 1;
						eIndex = eIndex > recordCount ? recordCount : eIndex;
						Query query = session.createQuery(HQL);
						query.setFirstResult(sIndex - 1);
						query.setMaxResults(pageSize);
						List items = query.list();
						pageInfo.setItems(items);
						pageInfo.setPageId(curentIndex);
						return pageInfo;
					}
				}, true);
	}

	public T findUnique(T instance) {
		log.debug("merging " + instance.getClass().getSimpleName()
				+ " instance");
		try {
			T result = (T) getHibernateTemplate().merge(instance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public T merge(T instance) {
		log.debug("merging " + instance.getClass().getSimpleName()
				+ " instance");
		try {
			T result = (T) getHibernateTemplate().merge(instance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(T instance) {
		log.debug("attaching dirty " + instance.getClass().getSimpleName()
				+ " instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(T instance) {
		log.debug("attaching clean " + instance.getClass().getSimpleName()
				+ " instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/**
	 * 抽象方法，通过若干属性值查找对象 必须制定查找的del=0
	 * 
	 * @param hql
	 *            包含若干属性值查询的HQL
	 * @param values
	 *            若干属性值
	 * @return 符合的结果集
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByQuery(String hql, Object... values) {
		log.debug("finding instance with property :" + hql);
		try {
			return getHibernateTemplate().find(hql, values);

		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/**
	 * 取得分页的结果集
	 * 
	 * @param pageInfo
	 *            分页信息, 只需要其中的pageId和pageSize属性, 其它的属性将被忽略
	 * @param HQL
	 *            查询分页的HQL
	 * @return PageInfo 分页信息, 里面包含记录列表对象items
	 */
	protected PageInfo findPageInfoByHQL(final PageInfo pageInfo,
			final String HQL) {
		return this.findPageInfoByHQL(pageInfo, HQL, (String[]) null,
				(Object[]) null);
	}

	/**
	 * 取得分页的结果集
	 * 
	 * @param pageInfo
	 *            分页信息, 只需要其中的pageId和pageSize属性, 其它的属性将被忽略
	 * @param HQL
	 *            查询分页的HQL
	 * @paramName 参数名, 如name=:nameParam, 中的nameParam
	 * @value 参数值
	 * @return PageInfo 分页信息, 里面包含记录列表对象items
	 */
	protected PageInfo findPageInfoByHQL(final PageInfo pageInfo,
			final String HQL, final String paramName, final Object value) {
		return this.findPageInfoByHQL(pageInfo, HQL,
				new String[] { paramName }, new Object[] { value });
	}

	/**
	 * 取得分页的结果集
	 * 
	 * @param pageInfo
	 *            分页信息, 只需要其中的pageId和pageSize属性, 其它的属性将被忽略
	 * @param HQL
	 *            查询分页的HQL, 如"FROM TestReport WHERE activityItemId = :itemId"
	 * @paramNames 参数名, 如activityItemId = :itemId, 中的itemId
	 * @values 参数值
	 * @return PageInfo 分页信息, 里面包含记录列表对象items
	 */
	@SuppressWarnings("deprecation")
	protected PageInfo findPageInfoByHQL(final PageInfo pageInfo,
			final String HQL, final String[] paramNames, final Object[] values) {
		final String countHQL = this.getCountSQL(HQL);

		return (PageInfo) getHibernateTemplate().execute(
				new HibernateCallback() {
					@SuppressWarnings("unchecked")
					public Object doInHibernate(Session session)
							throws HibernateException {

						Query queryCount = session.createSQLQuery(countHQL);
						if (paramNames != null && paramNames.length > 0) {
							for (int i = 0; i < paramNames.length; i++) {
								queryCount.setParameter(paramNames[i],
										values[i]);
							}
						}
						int recordCount = ((BigDecimal) queryCount
								.uniqueResult()).intValue();

						int pageId = pageInfo.getPageId();
						int pageSize = pageInfo.getPageSize();
						int pages = (recordCount - 1) / pageSize + 1;
						int newPageId = pageId > pages ? pages : pageId;
						int sIndex = (newPageId - 1) * pageSize + 1;
						sIndex = sIndex > recordCount ? recordCount : sIndex;
						int eIndex = sIndex + pageSize - 1;
						eIndex = eIndex > recordCount ? recordCount : eIndex;

						Query query = session.createQuery(HQL);
						if (paramNames != null && paramNames.length > 0) {
							for (int i = 0; i < paramNames.length; i++) {
								query.setParameter(paramNames[i], values[i]);
							}
						}
						query.setFirstResult(sIndex - 1);
						query.setMaxResults(pageSize);
						List items = query.list();

						PageInfo pageInfo = new PageInfo();
						pageInfo.setPageId(newPageId);
						pageInfo.setStartIndex(sIndex);
						pageInfo.setEndIndex(eIndex);
						pageInfo.setPageCount(pages);
						pageInfo.setPageSize(pageSize);
						pageInfo.setRecordCount(recordCount);
						pageInfo.setItems(items);
						return pageInfo;
					}
				}, true);
	}

	/**
	 * 取得分页的结果集
	 * 
	 * @param pageInfo
	 *            分页信息, 只需要其中的pageId和pageSize属性, 其它的属性将被忽略
	 * @param HQL
	 *            查询分页的HQL, 如"FROM TestReport WHERE activityItemId = ?"
	 * @value 参数值
	 * @return PageInfo 分页信息, 里面包含记录列表对象items
	 */
	protected PageInfo findPageInfoByHQL(final PageInfo pageInfo,
			final String HQL, final Object value) {
		return this.findPageInfoByHQL(pageInfo, HQL, new Object[] { value });
	}

	/**
	 * 取得分页的结果集
	 * 
	 * @param pageInfo
	 *            分页信息, 只需要其中的pageId和pageSize属性, 其它的属性将被忽略
	 * @param HQL
	 *            查询分页的HQL, 如"FROM TestReport WHERE activityItemId = ?"
	 * @values 参数值
	 * @return PageInfo 分页信息, 里面包含记录列表对象items
	 */
	@SuppressWarnings("deprecation")
	protected PageInfo findPageInfoByHQL(final PageInfo pageInfo,
			final String HQL, final Object[] values) {
		final String countSQL = this.getCountSQL(HQL);

		return (PageInfo) getHibernateTemplate().execute(
				new HibernateCallback() {
					@SuppressWarnings("unchecked")
					public Object doInHibernate(Session session)
							throws HibernateException {
						Query queryCount = session.createSQLQuery(countSQL);
						if (values != null && values.length > 0) {
							for (int i = 0; i < values.length; i++) {
								queryCount.setParameter(i, values[i]);
							}
						}
						int recordCount = ((BigDecimal) queryCount
								.uniqueResult()).intValue();

						int pageId = pageInfo.getPageId();
						int pageSize = pageInfo.getPageSize();
						int pages = (recordCount - 1) / pageSize + 1;
						int newPageId = pageId > pages ? pages : pageId;
						int sIndex = (newPageId - 1) * pageSize + 1;
						sIndex = sIndex > recordCount ? recordCount : sIndex;
						int eIndex = sIndex + pageSize - 1;
						eIndex = eIndex > recordCount ? recordCount : eIndex;

						Query query = session.createQuery(HQL);
						if (values != null && values.length > 0) {
							for (int i = 0; i < values.length; i++) {
								query.setParameter(i, values[i]);
							}
						}
						query.setFirstResult(sIndex - 1);
						query.setMaxResults(pageSize);
						List items = query.list();

						PageInfo pageInfo = new PageInfo();
						pageInfo.setPageId(newPageId);
						pageInfo.setStartIndex(sIndex);
						pageInfo.setEndIndex(eIndex);
						pageInfo.setPageCount(pages);
						pageInfo.setPageSize(pageSize);
						pageInfo.setRecordCount(recordCount);
						pageInfo.setItems(items);
						return pageInfo;
					}
				}, true);
	}

	/**
	 * 取得分页的结果集
	 * 
	 * @param pageInfo
	 *            分页信息, 只需要其中的pageId和pageSize属性, 其它的属性将被忽略
	 * @param detachedCriteria
	 *            查询对象
	 * @return PageInfo 分页信息, 里面包含记录列表对象items
	 */
	@SuppressWarnings("deprecation")
	protected PageInfo findPageInfoByCriteria(final PageInfo pageInfo,
			final DetachedCriteria detachedCriteria) {

		return (PageInfo) getHibernateTemplate().execute(
				new HibernateCallback() {
					@SuppressWarnings("unchecked")
					public Object doInHibernate(Session session)
							throws HibernateException {
						Criteria criteria = detachedCriteria
								.getExecutableCriteria(session);
						int recordCount = ((Integer) criteria.setProjection(
								Projections.rowCount()).uniqueResult())
								.intValue();
						criteria.setProjection(null);
						criteria.setResultTransformer(Criteria.ROOT_ENTITY);
						criteria
								.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

						int pageId = pageInfo.getPageId();
						int pageSize = pageInfo.getPageSize();
						int pages = (recordCount - 1) / pageSize + 1;
						int newPageId = pageId > pages ? pages : pageId;
						int sIndex = (newPageId - 1) * pageSize + 1;
						sIndex = sIndex > recordCount ? recordCount : sIndex;
						int eIndex = sIndex + pageSize - 1;
						eIndex = eIndex > recordCount ? recordCount : eIndex;
						List items = criteria.setFirstResult(sIndex - 1)
								.setMaxResults(pageSize).list();
						PageInfo pageInfo = new PageInfo();
						pageInfo.setPageId(newPageId);
						if (newPageId == pages)
							pageInfo.setLastPage(true);
						if (newPageId == 1)
							pageInfo.setFirstPage(true);
						pageInfo.setStartIndex(sIndex);
						pageInfo.setEndIndex(eIndex);
						pageInfo.setPageCount(pages);
						pageInfo.setPageSize(pageSize);
						pageInfo.setRecordCount(recordCount);
						pageInfo.setItems(items);
						return pageInfo;
					}
				}, true);
	}

	private String getCountSQL(final String HQL) {
		QueryTranslatorImpl queryTranslator = new QueryTranslatorImpl(HQL, HQL,
				Collections.EMPTY_MAP, (SessionFactoryImplementor) this
						.getSessionFactory());
		queryTranslator.compile(Collections.EMPTY_MAP, false);
		String tempSQL = queryTranslator.getSQLString();
		if (tempSQL.toLowerCase().lastIndexOf("order") != -1) {
			tempSQL = tempSQL.substring(0, tempSQL.toLowerCase().lastIndexOf(
					"order"));
		}
		return "SELECT COUNT(*) FROM (" + tempSQL + ")";
	}

	/**
	 * 分页查询
	 * 
	 * @param sql
	 *            String
	 * @param firstRow
	 *            int
	 * @param maxRow
	 *            int
	 * @return List
	 */
	@SuppressWarnings("unchecked")
	protected int getPageCount(final String sql) {
		int totalCount = 0;
		List<T> result = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session)
							throws HibernateException {
						Query query = session.createQuery(sql);
						return (query.list()); // 增加---取得总计录数
					}
				});
		if (result != null && !result.isEmpty())
			totalCount = result.size();
		return totalCount;
	}

	protected int getCount(String sql) {
		Query queryCount = getSession().createSQLQuery(sql);
		return ((BigDecimal) queryCount.uniqueResult()).intValue();
	}

}
