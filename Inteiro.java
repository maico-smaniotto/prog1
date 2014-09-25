class Inteiro extends Variavel {
	private int valor;
	
	public Inteiro() {
		this.setTipo('I');
	}
	
	public void setValor (int v) {
		this.valor = v;
	}
	
	public int getValor () {
		return this.valor;
	}
	
	public Inteiro (String n) {
		this.setTipo ('i');
		this.setNome = n;
	}
}