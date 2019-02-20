package helloworldmvc.controller;

import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Controler {

	Model model = null ;
	View view = null ;
	
	public Controler(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
	}

	public void run() {
		String message = model.getMessage() ;
		view.display(message);
	}
}
