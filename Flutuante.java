class Flutuante extends Variavel {
	private double valor;
	
	public Flutuante() {
		this.setTipo('F');
	}
	
	public void setValor (double v) {
		this.valor = v;
	}
	
	public double getValor () {
		return this.valor;
	}
	
	public Flutuante (String n) {
		this.setTipo ('f');
		this.setNome = n;
	}

}