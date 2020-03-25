package vaadin.webcomponents.greeter.views.main;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.server.PageConfigurator;
import com.vaadin.flow.server.InitialPageSettings.WrapMode;

import vaadin.webcomponents.greeter.services.GreetService;
import vaadin.webcomponents.greeter.views.main.greeter.GreeterComponent;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Greeter Application",
        shortName = "Greeter",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
public class MainView extends VerticalLayout implements PageConfigurator {
   
	private static final long serialVersionUID = -1817009361621321205L;

	public MainView(GreetService service) {
    	add(new GreeterComponent(service));
    }

    @Override
    public void configurePage(InitialPageSettings settings) {
        settings.addInlineWithContents(
                "<script type='module' src='/greeter/VAADIN/build/vaadin-bundle.es5-47c6e09cb4a2c51595d3.cache.js'></script>", WrapMode.NONE);
    }

}
