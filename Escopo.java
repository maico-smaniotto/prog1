class Escopo {
	private String[] comandos;
	private ArrayList<Variavel> vars;
	
	public Escopo(String[] comandos, ArrayList<Variavel> variaveis) {
		this.comandos = comandos;
		
		this.vars = new ArrayList<Variavel>(); // Funciona como um array, mas tem método add() para adicionar itens
		for (int i = 0; i < variaveis.size(); i++) {
			this.vars.add(variaveis.get(i));
		}
	}
	
	public void processa() {
		
	}
}