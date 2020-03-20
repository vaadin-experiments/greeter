package vaadin.webcomponents.greeter.views.main.greeter;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.webcomponent.WebComponent;

import lombok.extern.log4j.Log4j2;

/**
 * Exports  <ve-greeter> as web-component.
 */
@Log4j2
public class GreeterExporter extends WebComponentExporter<GreeterComponent> {
	private static final long serialVersionUID = 4768694800688798039L;
	public GreeterExporter() {
        super("ve-greeter");
    }
    protected void configureInstance(WebComponent<GreeterComponent> webComponent, GreeterComponent component) {
    	log.debug("configuring GreeterExporter");
    }
}
