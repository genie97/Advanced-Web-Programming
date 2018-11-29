package myPackage;

import java.io.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class RandomTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        Random rand = new Random();
        double randDouble = rand.nextDouble();
        out.print(randDouble);
    }
}
