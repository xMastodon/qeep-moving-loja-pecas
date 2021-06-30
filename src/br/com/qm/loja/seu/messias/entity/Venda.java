package br.com.qm.loja.seu.messias.entity;

public class Venda
{
//	Código 	Nome 						Quantidade 	Valor
//	123 	Escapamento Esportivo XPTO 	1 			R$ 150,00
//	456 	Parafuso XPTO 				4 			R$ 80,00
	private int codigo;
	private String nome;
	private int quantidade;
	private float valor;
	
	public Venda(int codigo, String nome, int quantidade, float valor)
	{
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public int getCodigo()
	{
		return codigo;
	}	
	public void setCodigo(int codigo)
	{
		this.codigo = codigo;
	}	
	public String getNome()
	{
		return nome;
	}	
	public void setNome(String nome)
	{
		this.nome = nome;
	}	
	public int getQuantidade()
	{
		return quantidade;
	}	
	public void setQuantidade(int quantidade)
	{
		this.quantidade = quantidade;
	}	
	public float getValor()
	{
		return valor;
	}	
	public void setValor(float valor)
	{
		this.valor = valor;
	}	
}