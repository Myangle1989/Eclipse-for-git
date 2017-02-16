package com.yld.selfTag;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SysCurDateTag extends SimpleTagSupport{
	
	private String format = "YYYY-MM-dd HH:mm:ss";
	
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public void doTag() throws JspException, IOException {
		String sysCurDate = new SimpleDateFormat(format).format(new Date());
		PageContext pc = (PageContext)getJspContext();
		JspWriter writer = pc.getOut();
		writer.println(sysCurDate);
	}
}
