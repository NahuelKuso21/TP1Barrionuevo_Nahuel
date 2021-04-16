package ar.edu.unju.edm.punto2.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	private int a, b; 
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public Calculadora(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int sumar(){
		return a+b; 
	}
	
	public int restar() {
		return a-b; 
	}
	
	public int multiplicar() {
		return a*b; 
	}
	
	public int dividir() {
		return a/b; 
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calculadora [a=" + a + ", b=" + b + ", sumar()=" + sumar() + ", restar()=" + restar()
				+ ", multiplicar()=" + multiplicar() + ", dividir()=" + dividir() + ", getA()=" + getA() + ", getB()="
				+ getB() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}