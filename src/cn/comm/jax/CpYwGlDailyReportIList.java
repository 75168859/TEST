package cn.comm.jax;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@SuppressWarnings("serial")
@XmlRootElement(name="R")
@XmlAccessorType(XmlAccessType.FIELD)
public class CpYwGlDailyReportIList extends ArrayList<HeaderElement>{
	
	@XmlElement(name="HEADER")
	public List<HeaderElement> getR(){
		return this;
	}
}
