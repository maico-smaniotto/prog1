import java.util.*;

class Escopo {
	private String comandos, buffer, instruct, novobloco;
	private ArrayList<Variavel> vars;
	private int i, j, h, l, blocos;
	
	private boolean FimComando (char c) {
		return (c != ';'  || c != '{');
	}
	
	private boolean AvaliaCondicao(String c) {
	
	}
	
	public Escopo(String comandos, ArrayList<Variavel> variaveis) {
		this.comandos = comandos;
		
		this.vars = new ArrayList<Variavel>(); // Funciona como um array, mas tem método add() para adicionar itens
		for (int i = 0; i < variaveis.size(); i++) {
			this.vars.add(variaveis.get(i));
		}
		processa(); // ver se não é melhor chamar este método de fora
	}
	
	private void processa() {
		buffer = new String();
		instruct = new String();
	
		for (i = 0; i < this.comandos.length(); i++) {
			j = 0;
			buffer = buffer + comandos.charAt(i+j);
			while (FimComando(buffer.charAt(j)))  { //aqui alimentamos o buffer até achar um fim de comando
				j++;
				buffer = buffer + comandos.charAt(i+j);
			}
			
			if (buffer.charAt(j) == '{') { //se o fim de comando foi o "{", então são quatro possibilidades, while, if, função ou erro
				for (l = 0; buffer.charAt(l) != ' ' && buffer.charAt(l) != '\n'; l++); //aqui eliminamos os primeiros espaços ou \n (sintaxe flexivel)
				h = 0;
				while (buffer.charAt(l) != ' ' && buffer.charAt(l) != '{' && buffer.charAt(l) != '(') { //por ser sintaxe flexivel, os parenteses podem estar colados no comando
					instruct = instruct + buffer.charAt(l); //aqui alimentamos a instrução (while, função, if ou erro)
					h++;
					l++;				
				}
				
				if (instruct.equals("while")) { //se for um while, vamos descobrir a condição e armazenar numa string
					while (buffer.charAt(l) != '(') { //se o ponteiro não tiver no parenteses, vamos deixar lá
						if (buffer.charAt(l) == '{') { //se após a instrução tem uma chave ao inves de um parentes, erro, tem q ter parenteses
							//ABORTAR PROGRAMA
						}
						l++;
					}
					blocos = 1;
					novobloco  = new String();
					while (blocos > 0) {
						for (h = 0; 
						
						
					}
				
					
				}
				
			}
		
		
		}		
	}
}