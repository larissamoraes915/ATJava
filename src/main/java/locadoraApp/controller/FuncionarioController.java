package locadoraApp.controller;

import com.google.gson.Gson;
import locadoraApp.model.domain.Funcionario;
import locadoraApp.model.service.FuncionarioService;
import spark.Request;
import spark.Response; 
import spark.Route;

public class FuncionarioController {
    
    public static Route obterLista = new Route() { 
        @Override
        public Object handle(Request req, Response res) throws Exception { 
            return FuncionarioService.obterLista();
        }
    };
    
    public static Route incluirFuncionario = new Route() { 
        @Override
        public Object handle(Request req, Response res) throws Exception { 
            Funcionario funcionario = new Gson().fromJson(req.body(), Funcionario.class);
            FuncionarioService.incluir(funcionario);
            return "Inclusão realizada com sucesso: " + funcionario + "!";
        }
    };
    
    public static Route excluir = new Route() {
        @Override
        public Object handle(Request req, Response res) throws Exception { 
            Integer index = Integer.valueOf(req.params("id"));
            Funcionario funcionario = FuncionarioService.obterPorId(index);
            FuncionarioService.excluir(index);
            return "Exclusão realizada com sucesso: " + funcionario + "!";
        }
    };
    
    public static Route obter = new Route() { 
        @Override
        public Object handle(Request req, Response res) throws Exception { 
            Integer index = Integer.valueOf(req.params("id"));
            Funcionario funcionario = FuncionarioService.obterPorId(index);
            return "Recuperação realizada com sucesso: " + funcionario + "!";
        }
    };

	public static UsuarioController obterPorId;

	public static locadoraApp.controller.Route incluir;

}