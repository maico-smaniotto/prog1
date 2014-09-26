import java.util.*;

class Escopo {
	private String[] comandos, buffer, instruct;
	private ArrayList<Variavel> vars;
	private int i, j, h, blocos=0;
	
	private boolean FimComando (char c) {
		return (c != ';'  || c != '{') {
	}
	
	private boolean AvaliaCondi (String c) {
	
	}
	
	public Escopo(String[] comandos, ArrayList<Variavel> variaveis) {
		this.comandos = comandos;
		buffer = new String[1000];
		instruct = new String [50];
		
		this.vars = new ArrayList<Variavel>(); // Funciona como um array, mas tem método add() para adicionar itens
		for (int i = 0; i < variaveis.size(); i++) {
			this.vars.add(variaveis.get(i));
		}
		
		for (i = 0; i < comandos.lenght; i++) {
			j = 0;
			buffer[j] = comandos[i+j];
			while (FimComando(buffer[j]))  { //aqui alimentamos o buffer até achar um fim de comando
				j++
				buffer[j] = comandos[i+j];			
			}
			
			if (buffer[j] == "{") { //se o fim de comando foi o "{", então são quatro possibilidades, while, if, função ou erro
				for (j = 0; buffer[j] != ' ' && buffer[j] != '\n'; j++); //aqui eliminamos os primeiros espaços ou \n (sintaxe flexivel)
				h = 0;
				while (buffer[j] != ' ' && buffer[j] != '{' && buffer[j] != '(') { //por ser sintaxe flexivel, os parenteses podem estar colados no comando, assim como a chave
					instruct[h] = buffer[j]; //aqui alimentamos a instrução (while, função, if ou erro)
					h++;
					j++;
				
				
				}
				
			}
		
		
		}
		
	}
	
	public void processa() {
		
	}
}