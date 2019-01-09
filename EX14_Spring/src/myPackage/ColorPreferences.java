package myPackage;

import java.io.Serializable;

public class ColorPreferences implements Serializable {
	private static final long serialVersionUID = 1L;
	private String foreground, background;
	
	public String getForeground() {
		return foreground;
	}
	
	public String getBackground() {
		return background;
	}
	
	public void setForeground(String foreground) {
		if(isEmpty(background)) {
			this.foreground = "black";
		} else {
			this.foreground = foreground;
		}
		
	}
	
	public void setBackground(String background) {
		if(isEmpty(background)) {
			this.background = "white";
		} else {
			this.background = background;
		}
	}
	
	private boolean isEmpty(String param) {
		return ((param == null) || (param.trim().equals("")));
	}

}
