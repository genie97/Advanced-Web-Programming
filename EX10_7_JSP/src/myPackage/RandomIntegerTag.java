package myPackage;

import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class RandomIntegerTag extends SimpleTagSupport {
	private int limit = 10;

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		Random rand = new Random();
		int randInteger = rand.nextInt(limit);
		out.print(randInteger);
	}

	public void setLimit(String limit) {
		try {
			this.limit = Integer.parseInt(limit);
		} catch (NumberFormatException e) {
			this.limit = 10;
		}
	}
}
