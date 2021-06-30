package br.com.qm.loja.seu.messias.dao;

import java.util.ArrayList;
import java.util.List;
import br.com.qm.loja.seu.messias.entity.Peca;
import br.com.qm.loja.seu.messias.entity.Venda;

public class VendaDAO
{
	private List<Venda> vendas;
	private PecaDAO pecaDao;
	
	public VendaDAO(PecaDAO pecaDao)
	{
		this.vendas = new ArrayList<Venda>();
		this.pecaDao = pecaDao;
	}	
	public boolean realizaVenda(int codBarras, int quantidade)
	{		
		// Consultar a peca 
		Peca peca = pecaDao.consultaPeca(codBarras);		
		// Se a peça for null codBarras nem existe		
		// Avaliar se tem a quantidade necessária		
		// SE CHEGOU ATÉ AQUI 		
		// Registrar uma venda 		
		// new Venda(codBarras, nome (Peca), quantidade, valor -> pensar sobre onde está o preço)
		// adicionar na estrutura;		
		// registrar a modificação		
		pecaDao.alteraQtdPeca(peca, quantidade);		
		return true;
	}	
	public boolean geraRelatorioVendas()
	{		
		// Abrir um arquivo txt -> usar o método do File que conta quantos arquivos tem num diretório
		// relatorio_1
		// relatorio_2		
		// Laço pela lista de vendas 
		// Pra cada venda escrever uma linha no arquivo		
		//Vendas - Dia 01 (Esse número pode ser definido com base na quantidade de arquivos em uma pasta, a biblioteca File tem um método que faz isso ~pesquise~)
		//Código 	Nome 						Quantidade 	Valor
		//123 	Escapamento Esportivo XPTO 	1 			R$ 150,00
		//456 	Parafuso XPTO 				4 			R$ 80,00		
		// Total de faturamento: R$ 450,00		
		return true;
	}	
}