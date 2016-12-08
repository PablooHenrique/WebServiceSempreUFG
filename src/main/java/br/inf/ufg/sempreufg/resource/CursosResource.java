package br.inf.ufg.sempreufg.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.inf.ufg.sempreufg.controller.CursoController;
import br.inf.ufg.sempreufg.dominio.CursoUfg;

@Path("cursos")
public class CursosResource {
	
	@GET
	@Path("listarCursosGraduacao")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarCursosGraduacao(){
		CursoController controller = new CursoController();
		List<CursoUfg> cursosUfg = controller.listarCursosGraduacao();
		String json = new Gson().toJson(cursosUfg);
		return Response.ok(json).build();
	}
	
	
	@GET
	@Path("listarCursosPosGraduacao")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarCursosPosGraduacao(){
		CursoController controller = new CursoController();
		List<CursoUfg> cursosUfg = controller.listarCursosPosGraduacao();
		String json = new Gson().toJson(cursosUfg);
		return Response.ok(json).build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarTodosCursos(){
		CursoController controller = new CursoController();
		List<CursoUfg> cursos = controller.listarTodos();
		String json = new Gson().toJson(cursos);
		return Response.ok(json).build();
	}
}
