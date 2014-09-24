class Imprimir{
	
	public Imprimir (String I[]){
		I[] = funcao_Identifica_Linha(I[]);           //função a ser criada, que espero, ESPERO, que retorne apenas o que vai ser impresso,
													// se não, vou ter que ver disso kkk e essa parte não esta bem pronta tbm
		private int a=0;
		while(a<I.length){                                          // vai rodar o While enquanto o a não for maior que o tamanho do vetor
			if(I[a] == ' " '){                                		//Testa se aquela parte do vetor contem aspas 
				for(a++; I[a] != ' " ' && a<I.length; a++){ 		//vai imprimindo tudo que esta entre as aspas, até achar uma outra aspa
				System.out.print(I[a]);								
				}						//	
			}else if( (I[a] >= 'a' && I[a] <='z') || (I[a]>= 'A' && I[a] <= 'Z'){   //testa se o caractere é uma letra, que caracteriza o inicio do nome da variavel 
				private Char nomVar[];												// seria a criação de um vetor char, para salvar esses caracteres
				private int i=0;														
				private nomVar[i];
				for(;I[a] != ' ' && a<I.length; a++, i++){                         //aqui ele salva todos os caracteres seguintes, até o espaço, que seria o nome da variavel																		
					nomVar[i]=I[a];													//aqui apenas salva esses caracteres na nomVar					
				}
				System.out.print (funcao_Que_procura_variavel(nomVar[i+1]) )	// passa como parâmetro a string com o nome da variavel para outra função, imprimindo ela direto
			}else if(I[a] == ' '){												//aqui é se encontrar um espaço, para desconsiderar e avançar uma posição
				a++;
			}
		}
	}
	
	
	//chegando aqui, espero que ele tenha impresso TUDO o que deveria ser impresso. Não haverá caractere especial fora das aspas né? como &, %, @ e etc etc?
	
	
