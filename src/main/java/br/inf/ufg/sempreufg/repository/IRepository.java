package br.inf.ufg.sempreufg.repository;

import java.util.List;
import java.util.Map;

public interface IRepository<T> {
	public void salvar(T t);
	public void atualizar(T t);
	public List<T> listar();
	public T listarPorId(long id);
	public void remover(long id);
	public List<T> select(String jpql);
	public List<T> select(String jpql, Map<String, Object> parametros);
}
