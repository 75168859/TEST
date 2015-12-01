package cn.comm.jax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class HeaderElement {
	
	@XmlElement(name="H")
	private CpYwGlDailyReportI cpYwGlDailyReportI;

	public CpYwGlDailyReportI getCpYwGlDailyReportI() {
		return cpYwGlDailyReportI;
	}

	public void setCpYwGlDailyReportI(CpYwGlDailyReportI cpYwGlDailyReportI) {
		this.cpYwGlDailyReportI = cpYwGlDailyReportI;
	}
	

	
}
