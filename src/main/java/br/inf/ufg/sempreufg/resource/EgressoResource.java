package br.inf.ufg.sempreufg.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.inf.ufg.sempreufg.controller.EgressoController;
import br.inf.ufg.sempreufg.dominio.Egresso;

@Path("egressos")
public class EgressoResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar(){
		EgressoController controller = new EgressoController();
		List<Egresso> egressos = controller.listar();
		String json = new Gson().toJson(egressos);
		return Response.ok(json).build();
	}
	
	@GET
	@Path("listarPorMatricula/{matriculas}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarPorMatricula(@PathParam("matriculas") String matriculas){
		EgressoController controller = new EgressoController();
		List<Egresso> egressos = controller.listarPorMatricula(matriculas);

		String json = new Gson().toJson(egressos);
		return Response.ok(json).build();
	}
	
	@GET
	@Path("listarPorIdentificadorCurso/{codigos}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarPorIdentificadorCurso(@PathParam("codigos") String codigos){
		EgressoController controller = new EgressoController();
		List<Egresso> egressos = controller.listarPorIdentificadorCurso(codigos);
		String json = new Gson().toJson(egressos);
		return Response.ok(json).build();
	}
}
