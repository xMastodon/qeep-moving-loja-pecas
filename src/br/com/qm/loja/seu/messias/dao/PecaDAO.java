package br.com.qm.loja.seu.messias.dao;

import java.util.List;
import br.com.qm.loja.seu.messias.entity.Peca;

public interface PecaDAO
{
//	- cadastrar uma nova pe�a;
//	- consultar uma pe�a pelo seu c�digo de barras;
//	- listar todas as pe�as em estoque;
//	- listar todas as pe�as come�adas com o nome come�ado por um determinado texto(ex: todas as pe�as com o nome come�ado pela letra m);
//	- listar todas as pe�as para um determinado modelo de carro (o carro dever� ser lido);
//	- listar todas as pe�as de uma determinada categoria;
//	- remover uma pe�a do estoque;
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