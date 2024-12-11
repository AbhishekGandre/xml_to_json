package xmltojson;

import org.json.XML;

public class Test {

	
	public static String convertXMLtoJSON(String xmlString) {
		String json = XML.toJSONObject(xmlString).toString();
		return json;
	}
	
	public static void main(String[] args) {
		String xml =
				"<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>  \r\n"
				+ "<root>\r\n"
				+ "    <metadata>\r\n"
				+ "        <author>Abhishek Gandre</author>\r\n"
				+ "        <description>Description of XML to JSON Conversion in Java\r\n"
				+ "		XML to JSON conversion in Java involves transforming XML data into a\r\n"
				+ "		JSON format, enabling seamless integration between systems or\r\n"
				+ "		applications that consume data in different formats. This is\r\n"
				+ "		particularly useful for APIs, data transformation, and cross-platform\r\n"
				+ "		communication.\r\n"
				+ "\r\n"
				+ "		Benefits:\r\n"
				+ "		Simplifies data transformation between XML and JSON.\r\n"
				+ "		Reduces complexity in systems consuming multiple data formats.\r\n"
				+ "		Enhances compatibility between older XML-based systems and modern\r\n"
				+ "		JSON-centric systems.</description>\r\n"
				+ "    </metadata>\r\n"
				+ "    <data>\r\n"
				+ "        <element>Enjoy data transformation </element>\r\n"
				+ "    </data>\r\n"
				+ "</root>\r\n";
		
		xml="?ghfcghghhi><<<><note> <to>Tove</to> <from>Jani</from> <heading>Reminder</heading> <body>Don't forget me this weekend!</body> </note>";
	     // Convert XML to JSON
	     String json = null;
		try {
			json = convertXMLtoJSON(xml);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     System.out.println(json);

	}

}
