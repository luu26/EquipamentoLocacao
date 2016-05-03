package br.com.softplan.ead.jee6.jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ExemploMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	public ExemploMB() {
		System.out.println("Criando uma instancia de ExemploMB");
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void executar() {
		System.out.println("Invocando metodo executar() ...");
		System.out.println("Nome digitado: " + nome);
	}

}
