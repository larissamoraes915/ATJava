package locadoraApp.controller;

import locadoraApp.model.domain.Usuario;

public class UsuarioController implements Route {

	@Override
	public String handle(Request request, Response response) throws Exception {
		StringBuilder html = new StringBuilder();
		html.append(new Usuario());
		
		html.append("<a href='/'>" + new Usuario() + "</a>");
	    
		return html.toString();
	}
}
