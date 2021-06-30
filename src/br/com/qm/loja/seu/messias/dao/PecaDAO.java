package br.com.qm.loja.seu.messias.dao;

import java.util.List;
import br.com.qm.loja.seu.messias.entity.Peca;

public interface PecaDAO
{
//	- cadastrar uma nova peça;
//	- consultar uma peça pelo seu código de barras;
//	- listar todas as peças em estoque;
//	- listar todas as peças começadas com o nome começado por um determinado texto(ex: todas as peças com o nome começado pela letra m);
//	- listar todas as peças para um determinado modelo de carro (o carro deverá ser lido);
//	- listar todas as peças de uma determinada categoria;
//	- remover uma peça do estoque;
//	- voltar para o menu principal;
//	private EntityManager entityManager;
//	
//	public PecaDAO(EntityManager entityManager) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pecas");
//		this.entityManager = factory.createEntityManager();
//	}
	boolean cadastraPeca(Peca peca);
	boolean alteraQtdPeca(Peca peca, int qtdReduzida);	
	Peca consultaPeca(int codBarras);
	List<Peca> listaPecas();
	List<Peca> listaPecasPorTexto(String inicio);
	List<Peca> listaPecasPorModelo(String modelo);
	List<Peca> listaPecasPorCategoria(String categoria);
	boolean removePeca(int codBarras);
}