package am.zara.shop.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "autocompleteBean", eager = true)
@SessionScoped
public class AutocompleteBean {
	private List<String> suggestions = null;

	public List<String> getSuggestions() {
		return suggestions;
	}

	public void setSuggestions(List<String> suggestions) {
		this.suggestions = suggestions;
	}

	public AutocompleteBean() {
		suggestions = new ArrayList<String>();
		suggestions.add("Banana");
		suggestions.add("Cranberry");
		suggestions.add("Blueberry");
		suggestions.add("Orange");
		suggestions.add("Apple");
		suggestions.add("Strawberry");
	}
	// Getter and setter
}
