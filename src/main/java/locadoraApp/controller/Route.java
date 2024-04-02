package locadoraApp.controller;

public interface Route {

	Object handle(Request request, Response response) throws Exception;

}
