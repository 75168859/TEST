package cn.com.chinapost.ws.client;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.axis.utils.XMLUtils;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MyInterceptorTest extends AbstractSoapInterceptor{

	public static final String xml_namespaceUR_att = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
	public static final String xml_header_el = "soap:Header";
	public static final String xml_authentication_el = "wsse:Security";
	public static final String xml_userID_el = "wsse:Username";
	public static final String xml_password_el = "wsse:Password";

	
	
	public MyInterceptorTest() {
		super(Phase.WRITE);
	}
	
	
	@Override
	public void handleMessage(SoapMessage soapMessage) throws Fault {
		
		String userid = "cpweb";
		String passwd = "cpweb321";
		QName qname = new QName("RequestSOAPHeader");
		
		Document doc = (Document) DOMUtils.createDocument();
		Element root = doc.createElement(xml_header_el);
		
		Element e_userid = doc.createElement(xml_userID_el); 
		e_userid.setTextContent(userid);
		
		Element e_passwd = doc.createElement(xml_password_el);
		e_passwd.setTextContent(passwd);
		
		Element child = doc.createElementNS(xml_namespaceUR_att, xml_authentication_el);
		child.appendChild(e_userid);
		child.appendChild(e_passwd);
		root.appendChild(child);
		
		org.apache.cxf.helpers.XMLUtils.printDOM(root);
		SoapHeader head = new SoapHeader(qname, root);
		List<Header> headers = soapMessage.getHeaders();
		headers.add(head);
		
	}

	
	
}
