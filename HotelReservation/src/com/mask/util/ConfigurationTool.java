package com.mask.util;

import org.w3c.dom.Document;
import javax.xml.parsers.*;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.xml.sax.SAXException;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.io.File;

import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class ConfigurationTool {
	private static String ConfigFileName = "config.xml";
	private static String web_inf_Path;
	private static String ConfigFilePath;
	private static DocumentBuilderFactory domfac = DocumentBuilderFactory
			.newInstance();

	static {
		try {
			web_inf_Path = new File(ConfigurationTool.class.getResource("/")
					.getPath()).getParent()
					+ "";
			web_inf_Path = java.net.URLDecoder.decode(web_inf_Path, "utf-8");
			ConfigFilePath = web_inf_Path + "/" + ConfigFileName;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

	private static Document getDocumentByFileName(final String fileName) {
		Document doc = null;
		try {
			DocumentBuilder dombuilder = domfac.newDocumentBuilder();
			InputStream in = new FileInputStream(fileName);
			doc = dombuilder.parse(in);
		} catch (ParserConfigurationException ex) {
			ex.printStackTrace();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (SAXException ex) {
			ex.printStackTrace();
		}
		return doc;
	}

	public static String getWS_URL() {
		String macKey = null;
		Document doc = getDocumentByFileName(ConfigFilePath);
		NodeList pinKeyNodeList = doc.getElementsByTagName("ws_href");
		Node pinKeyNode = pinKeyNodeList.item(0);
		macKey = pinKeyNode.getFirstChild().getNodeValue();
		return macKey;
	}


	public static void main(String[] args) throws Exception {
		System.out.println(getWS_URL());
	}


}