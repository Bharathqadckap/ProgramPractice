package base;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import bsh.org.objectweb.asm.Type;


public class TestProgram9 {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File xmlDoc = new File("Student.xml");
		DocumentBuilderFactory dbFact = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbBuild = dbFact.newDocumentBuilder();
		Document doc = dbBuild.parse(xmlDoc);
		
		NodeList listofEmployee = doc.getElementsByTagName("credential");
		System.out.println(listofEmployee);
		for (int i = 0; i < listofEmployee.getLength(); i++) {
			Node eachitem = listofEmployee.item(i);
			System.out.println("in loop");
			System.out.println(eachitem);
				Element eElement = (Element) eachitem;
				System.out.println(eElement);
				System.out.println("----------");
				System.out.println(eElement.getElementsByTagName("name").item(0).getTextContent());
				System.out.println(eElement.getElementsByTagName("system").item(0).getTextContent());
				System.out.println(eElement.getElementsByTagName("hostname").item(0).getTextContent());
				System.out.println(eElement.getElementsByTagName("timezone").item(0).getTextContent());
				
				Node all_keys = eElement.getElementsByTagName("keys").item(0);
				NodeList all_keys_list = all_keys.getChildNodes();
				
				for (int j = 0; j < all_keys_list.getLength(); j++) {
					Node eachitem1 = all_keys_list.item(j);
					if(eachitem1.getNodeName() != "#text") {
					System.out.println("============");
					System.out.println(j);
					System.out.println("text "+eachitem1.getTextContent());
					System.out.println("nodename "+eachitem1.getNodeName());
					System.out.println("type "+eachitem1.getNodeType());
					System.out.println("value "+eachitem1.getNodeValue());
					System.out.println("============");
					}
					
					//cred.enter_Keys("", "");
//					Element eElement1 = (Element) eachitem1;
//					System.out.println(eElement.getElementsByTagName("grant_type").item(0).getTextContent());
					
				}
		}
	}

}
