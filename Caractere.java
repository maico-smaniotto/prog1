class Caractere extends Variavel {
	private double valor;
	
	public void setValor (double v) {
		this.valor = v;
	}
	
	public double getValor () {
		return this.valor;
	}
	
	public Caractere (String n) {
		this.setTipo ('c');
		this.setNome = n;
	}

}