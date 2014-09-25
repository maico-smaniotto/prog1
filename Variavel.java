class Variavel {
	private char tipo;
	private String nome;
		
	protected void setTipo(char t) {
		this.tipo = t;
	}
	protected char getTipo () {
		return this.tipo;
	}
	protected void setNome(String n) {
		this.nome = new String(n);
	}
	protected String getNome () {
		return this.nome;
	}
	
}