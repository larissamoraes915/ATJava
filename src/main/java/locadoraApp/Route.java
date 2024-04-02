package locadoraApp;

import locadoraApp.controller.Request;
import locadoraApp.controller.Response;

public interface Route {

	Object handle(Request request, Response response) throws Exception;

}
