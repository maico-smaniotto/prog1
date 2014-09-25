class Caractere extends Variavel {
	private String valor;
	
	public Caractere() {
		this.setTipo('C');
	}
	
	public void setValor (String v) {
		this.valor = v;
	}
	
	public String getValor () {
		return this.valor;
	}
	
	public Caractere (String n) {
		this.setTipo ('c');
		this.setNome = n;
	}

}