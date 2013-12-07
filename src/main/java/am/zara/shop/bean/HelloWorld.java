package am.zara.shop.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {
	@ManagedProperty(value = "#{message}")
	private Message messageBean;

	private String message;

	public HelloWorld() {
		System.out.println("HelloWorld started!");
	}

	public String getMessage() {
		if (messageBean != null) {
			message = messageBean.getMessage();
		}
		return message;
	}

	public void setMessageBean(Message message) {
		this.messageBean = message;
	}

	public String getHusbandName() {
		return "Tikulechka";
	}

	public boolean isThisLove() {
		return true;
	}

	public String getButtonName() {
		return "Submit";
	}

	public String doIt() {
		System.out.println("efnksjdfksdkf");
		return "ok";
	}
}
