package uk.gov.bcc.mobile.util;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class XMLResponseParseUtil {

	public Map<String, String> parseXMLResponse(String XMLResponse) {

		Map<String, String> responseMap = new HashMap<String, String>();

		String tagName = null;

		XmlPullParserFactory factory;
		try {
			factory = XmlPullParserFactory.newInstance();

			factory.setNamespaceAware(true);
			XmlPullParser xpp = factory.newPullParser();

			xpp.setInput(new StringReader(XMLResponse));
			int eventType = xpp.getEventType();

			while (eventType != XmlPullParser.END_DOCUMENT) {
				if (eventType == XmlPullParser.START_DOCUMENT) {
					System.out.println("Start document");
				} else if (eventType == XmlPullParser.START_TAG) {
					System.out.println("Start tag " + xpp.getName());
					tagName = xpp.getName();
				} else if (eventType == XmlPullParser.END_TAG) {
					System.out.println("End tag " + xpp.getName());
				} else if (eventType == XmlPullParser.TEXT) {
					System.out.println("Text " + xpp.getText());
					responseMap.put(tagName, xpp.getText());
				}
				eventType = xpp.next();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return responseMap;

	}

}
