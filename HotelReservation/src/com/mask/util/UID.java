package com.mask.util;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UID {
	private static final long ONE_STEP = 10;
	private static final long BASE = 1129703383453l;
	private static final Lock LOCK = new ReentrantLock();
	private static long lastTime = System.currentTimeMillis();
	private static short lastCount = 0;

	/**
	 * a time (as returned by {@link System#currentTimeMillis()}) at which the
	 * VM that this UID was generated in was alive
	 * 
	 * @serial
	 */
	private final long time;

	/**
	 * 16-bit number to distinguish UID instances created in the same VM with
	 * the same time value
	 * 
	 * @serial
	 */
	private final short count;

	/**
	 * Generates a UID that is unique over time with respect to the host that it
	 * was generated on.
	 */
	public UID() {
		LOCK.lock();
		try {
			if (lastCount == ONE_STEP) {
				boolean done = false;
				while (!done) {
					long now = System.currentTimeMillis();
					if (now == lastTime) {
						// pause for a second to wait for time to change
						try {
							Thread.currentThread().sleep(1);
						} catch (java.lang.InterruptedException e) {
						} // ignore exception
						continue;
					} else {
						lastTime = now;
						lastCount = 0;
						done = true;
					}
				}
			}
			time = lastTime;
			count = lastCount++;
		} finally {
			LOCK.unlock();
		}
	}

	@Override
	public String toString() {
		String time = Long.toString(this.time + BASE);
		return time + this.count;
	}

	public static void main(String[] args) {
		UID id = new UID();
//		System.out.println(id.time);
//		System.out.println(id.count);
		System.out.println(id);
		UID id2 = new UID();
//		System.out.println(id2.time);
//		System.out.println(id2.count);
		System.out.println(id2);
		UID id3 = new UID();
//		System.out.println(id3.time);
//		System.out.println(id3.count);
		System.out.println(id3);
		UID id4 = new UID();
//		System.out.println(id4.time);
//		System.out.println(id4.count);
		System.out.println(id4);
		UID id5 = new UID();
//		System.out.println(id5.time);
//		System.out.println(id5.count);
		System.out.println(id5);
		UID id6 = new UID();
//		System.out.println(id6.time);
//		System.out.println(id6.count);
		System.out.println(id6);
		UID id7 = new UID();
//		System.out.println(id7.time);
//		System.out.println(id7.count);
		System.out.println(id7);
		UID id8 = new UID();
//		System.out.println(id8.time);
//		System.out.println(id8.count);
		System.out.println(id8);
		UID a = new UID();
//		System.out.println(a.time);
//		System.out.println(a.count);
		System.out.println(a);
		UID c = new UID();
//		System.out.println(c.time);
//		System.out.println(c.count);
		System.out.println(c);
		UID x = new UID();
//		System.out.println(x.time);
//		System.out.println(x.count);
		System.out.println(x);
	}
}
