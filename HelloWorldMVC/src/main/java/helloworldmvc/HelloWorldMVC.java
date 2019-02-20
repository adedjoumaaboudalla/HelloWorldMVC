package helloworldmvc;

import helloworldmvc.controller.Controler;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class HelloWorldMVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Controler controler = new Controler(new Model(), new View()) ;
		controler.run();
	}

}
