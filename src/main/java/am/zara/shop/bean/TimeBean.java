package am.zara.shop.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "timeBean", eager = true)
@SessionScoped
public class TimeBean {
	
	public Date getNow() {
		return new Date();
	}	
}
