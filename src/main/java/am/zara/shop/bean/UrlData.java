package am.zara.shop.bean;

public class UrlData {
	
	private String url;
	
	public UrlData(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String toString(){
		return url;
	}
}
