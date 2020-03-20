package vaadin.webcomponents.greeter.views.main.greeter;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.spring.annotation.UIScope;

import lombok.AllArgsConstructor;
import vaadin.webcomponents.greeter.services.GreetService;

@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
@AllArgsConstructor
public class GreeterComponent extends Composite<VerticalLayout> {

	private static final long serialVersionUID = 1060716741515342770L;

	private GreetService service;
	
	@Override
	protected VerticalLayout initContent() {
		var content = super.initContent();

		var textField = new TextField("Your name");
		var button = new Button("Say hello", e -> Notification.show(service.greet(textField.getValue())));
		button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
		button.addClickShortcut(Key.ENTER);

		content.addClassName("centered-content");
		content.add(textField, button);
		return content;
	}
	
}
