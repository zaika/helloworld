package am.zara.shop.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "ajaxUserData", eager = true)
@SessionScoped
public class AjaxUserData implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWelcomeMessage() {
		return "Hello " + name;
	}
}
