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

}