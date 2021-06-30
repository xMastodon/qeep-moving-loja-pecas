package br.com.qm.loja.seu.messias.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Peca
{	
//	Sobre as peças nós guardaremos as seguintes características:
//
//		- código de barras (chave primária)
//		- nome
//		- modelo do carro (para qual carro é aquela peça)
//		- fabricante
//		- preço de custo
//		- preço de venda
//		- quantidade em estoque
//		- categoria (aqui você deverá guardar valores fixos, ex: funilaria, motor, performance, som). 
//		- [Aqui seria um bom momento para tentar utilizar os Enums]
	
	@Id
	@Column(name = "cod_barras")
	private int codBarras;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false, length = 50)
	private String modelo;
	
	@Column(nullable = false)
	private String fabricante;
	
	@Column(name = "preco_custo", nullable = false)
	private float precoCusto;
	
	@Column(name = "preco_venda", nullable = false)
	private float precoVenda;
	
	@Column(name = "qtd_estoque", nullable = false)
	private int qtdEstoque;
	
	@Column(nullable = false)
	private String categoria;


	public int getCodBarras()
	{
		return codBarras;
	}
	public void setCodBarras(int codBarras)
	{
		this.codBarras = codBarras;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getModelo()
	{
		return modelo;
	}
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	public String getFabricante()
	{
		return fabricante;
	}
	public void setFabricante(String fabricante)
	{
		this.fabricante = fabricante;
	}
	public float getPrecoCusto()
	{
		return precoCusto;
	}
	public void setPrecoCusto(float precoCusto)
	{
		this.precoCusto = precoCusto;
	}
	public float getPrecoVenda()
	{
		return precoVenda;
	}
	public void setPrecoVenda(float precoVenda)
	{
		this.precoVenda = precoVenda;
	}
	public int getQtdEstoque()
	{
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque)
	{
		this.qtdEstoque = qtdEstoque;
	}
	public String getCategoria()
	{
		return categoria;
	}
	public void setCategoria(String categoria)
	{
		this.categoria = categoria;
	}
}