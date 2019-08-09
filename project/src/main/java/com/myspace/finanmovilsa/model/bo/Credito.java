package com.myspace.finanmovilsa.model.bo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Credito implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Descripcion Credito")
	private java.lang.String desCredito;
	@org.kie.api.definition.type.Label("Valor de Credito")
	private Integer valCredito;
	@org.kie.api.definition.type.Label("Tiempo de Amortizacion")
	private java.lang.Integer timAmortizacion;
	@org.kie.api.definition.type.Label("Salario Persona")
	private Integer salPersona;
	@org.kie.api.definition.type.Label("Gastos Persona")
	private Integer gasPersona;
	@org.kie.api.definition.type.Label("Total endeudamiento")
	private Integer totEndeudamiento = 0;
	public Credito() {
	}

	public java.lang.String getDesCredito() {
		return this.desCredito;
	}

	public void setDesCredito(java.lang.String desCredito) {
		this.desCredito = desCredito;
	}

	public java.lang.Integer getTimAmortizacion() {
		return this.timAmortizacion;
	}

	public void setTimAmortizacion(java.lang.Integer timAmortizacion) {
		this.timAmortizacion = timAmortizacion;
	}

	public java.lang.Integer getValCredito() {
		return this.valCredito;
	}

	public void setValCredito(java.lang.Integer valCredito) {
		this.valCredito = valCredito;
	}

	public java.lang.Integer getSalPersona() {
		return this.salPersona;
	}

	public void setSalPersona(java.lang.Integer salPersona) {
		this.salPersona = salPersona;
	}

	public java.lang.Integer getGasPersona() {
		return this.gasPersona;
	}

	public void setGasPersona(java.lang.Integer gasPersona) {
		this.gasPersona = gasPersona;
	}

	public java.lang.Integer getTotEndeudamiento() {
		return this.totEndeudamiento;
	}

	public void setTotEndeudamiento(java.lang.Integer totEndeudamiento) {
		this.totEndeudamiento = totEndeudamiento;
	}

	public Credito(java.lang.String desCredito, java.lang.Integer valCredito,
			java.lang.Integer timAmortizacion, java.lang.Integer salPersona,
			java.lang.Integer gasPersona) {
		this.desCredito = desCredito;
		this.valCredito = valCredito;
		this.timAmortizacion = timAmortizacion;
		this.salPersona = salPersona;
		this.gasPersona = gasPersona;
	
	}

}