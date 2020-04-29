package Bridge_Pattern;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtilPen {
	public static Object getBean(String str) {
		try {
			// ����DOM�ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("Bridge_Pattern.xml"));

			// ��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = null;
			if (str == "color") {
				classNode = nl.item(0).getFirstChild();
			}
			if (str == "pen") {
				classNode = nl.item(1).getFirstChild();
			}
			String cName = classNode.getNodeValue();

			// ͨ����������ʵ�����󲢽��䷵��
			//String[] a = XMLUtilPen.class.getPackage().toString().split(" ");
			//Class c = Class.forName(a[1] + "." + cName);
			Class c = Class.forName(cName);
			Object obj = c.newInstance();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
