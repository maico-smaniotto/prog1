class Escopo {
	private String comandos;
	private ArrayList<Variavel> vars;
	
	public void setComandos(String v) {
		this.comandos = v;
	}
	
	public Escopo(String[] comandos, Variavel[] variaveis]) {
		this.comandos = comandos;
		
		this.vars = new ArrayList<Variavel>(); // Funciona como um array, mas tem método add() para adicionar itens
		for (int i = 0; i < variaveis.length; i++) {
			this.vars.add(variaveis[i]);
		}
	}
	
	public void processa() {
		
	}
}