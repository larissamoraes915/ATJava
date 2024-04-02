package locadoraApp;

import locadoraApp.controller.FuncionarioController;
import locadoraApp.controller.Request;
import locadoraApp.controller.Response;
import locadoraApp.controller.UsuarioController;
import spark.Spark;

public class App {
    public static void main(String[] args) {
        Spark.port(8080);
        
        Spark.get("/rota", new Route() {
            public Object handle(Request request, Response response) throws Exception {
                return App.class.getResourceAsStream("/index.html");
            }
            });
        Spark.get("/usuario", new UsuarioController());
        
    Spark.get("/funcionario/lista" , FuncionarioController.obterLista);
    Spark.post("/funcionario/incluir" , FuncionarioController.incluir);
    Spark.delete("/funcionario/:id/excluir" , FuncionarioController.excluir);
    Spark.get("/funcionario/:id" , FuncionarioController.obterPorId);
    }
}