package spearman_FINAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class spearman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> precs = new ArrayList<Double>();
		
		// TEXTO 1
		/*
		List<String> algoritmo = Arrays.asList("alunos","digital","novas tecnologias","tecnologias","professores","educacao","aula","escola","faz","uso","parte");
		List<String> sobek = Arrays.asList("alunos","digital","educacao","novas tecnologias","parte","aula","escola","faz","professores","tecnologias","uso");
		
		List<String> humano16 = Arrays.asList("escola","educacao","professores","alunos","aula","novas tecnologias","tecnologias","digital","uso","parte","faz");
		
		List<String> humano1 = Arrays.asList("tecnologias","educacao","novas tecnologias","professores","alunos","digital","escola","aula","uso","parte","faz");
		List<String> humano2 = Arrays.asList("educacao","alunos","professores","escola","digital","aula","tecnologias","uso","parte","faz","novas tecnologias");
		List<String> humano3 = Arrays.asList("educacao","tecnologias","alunos","aula","professores","faz","uso","novas tecnologias","escola","digital","parte");
		List<String> humano4 = Arrays.asList("tecnologias","novas tecnologias","digital","educacao","escola","professores","alunos","aula","uso","faz","parte");
		List<String> humano5 = Arrays.asList("educacao","novas tecnologias","professores","alunos","digital","tecnologias","escola","faz","uso","aula","parte");
		List<String> humano6 = Arrays.asList("novas tecnologias","tecnologias","educacao","digital","escola","professores","uso","aula","parte","alunos","faz");
		List<String> humano7 = Arrays.asList("novas tecnologias","educacao","uso","escola","professores","alunos","tecnologias","aula","digital","faz","parte");
		List<String> humano8 = Arrays.asList("aula","educacao","tecnologias","escola","professores","alunos","novas tecnologias","digital","uso","parte","faz");
		List<String> humano9 = Arrays.asList("educacao","alunos","professores","tecnologias","novas tecnologias","digital","escola","aula","parte","faz","uso");
		List<String> humano10 = Arrays.asList("educacao","novas tecnologias","digital","aula","uso","professores","alunos","tecnologias","escola","faz","parte");
		
		List<String> humano11 = Arrays.asList("novas tecnologias","digital","educacao","professores","alunos","tecnologias","escola","aula","parte","faz","uso");
		List<String> humano12 = Arrays.asList("novas tecnologias","educacao","digital","tecnologias","escola","professores","alunos","aula","faz","uso","parte");
		List<String> humano13 = Arrays.asList("tecnologias","educacao","professores","alunos","escola","aula","novas tecnologias","digital","faz","parte","uso");
		List<String> humano14 = Arrays.asList("novas tecnologias","digital","tecnologias","educacao","professores","escola","aula","alunos","uso","faz","parte");
		List<String> humano15 = Arrays.asList("educacao","tecnologias","novas tecnologias","escola","alunos","professores","aula","digital","uso","faz","parte");
		
		*/
		// TEXTO 2
		
		List<String> algoritmo = Arrays.asList("familia","videogames","sintomas de vicio","viciados","efeitos","alguns","negativos","pesquisa","criancas","estados unidos","jogos","azar","games");
		List<String> sobek = Arrays.asList("familia","videogames","criancas","jogos","alguns","azar","efeitos","estados unidos","games","negativos","pesquisa","sintomas de vicio","viciados");
		
		List<String> humano1 = Arrays.asList("sintomas de vicio","jogos","games","videogames","efeitos","negativos","criancas","pesquisa","viciados","azar","familia","estados unidos","alguns");
		List<String> humano2 = Arrays.asList("familia","criancas","sintomas de vicio","jogos","videogames","games","pesquisa","viciados","efeitos","negativos","azar","alguns","estados unidos");
		List<String> humano3 = Arrays.asList("games","videogames","criancas","sintomas de vicio","viciados","efeitos","jogos","negativos","familia","azar","pesquisa","estados unidos","alguns");
		List<String> humano4 = Arrays.asList("criancas","sintomas de vicio","viciados","videogames","jogos","familia","efeitos","negativos","games","azar","pesquisa","estados unidos","alguns");
		List<String> humano5 = Arrays.asList("jogos","games","videogames","sintomas de vicio","pesquisa","azar","negativos","alguns","familia","efeitos","estados unidos","criancas","viciados");
		List<String> humano6 = Arrays.asList("pesquisa","estados unidos","videogames","familia","negativos","sintomas de vicio","criancas","viciados","alguns","efeitos","azar","jogos","games");
		List<String> humano7 = Arrays.asList("viciados","videogames","criancas","pesquisa","familia","games","jogos","negativos","sintomas de vicio","azar","efeitos","estados unidos","alguns");
		List<String> humano8 = Arrays.asList("pesquisa","efeitos","videogames","games","jogos","sintomas de vicio","criancas","familia","viciados","azar","alguns","negativos","estados unidos");
		List<String> humano9 = Arrays.asList("videogames","sintomas de vicio","criancas","familia","efeitos","pesquisa","estados unidos","alguns","jogos","games","azar","negativos","viciados");
		List<String> humano10 = Arrays.asList("games","jogos","negativos","viciados","videogames","alguns","sintomas de vicio","pesquisa","familia","estados unidos","criancas","efeitos","azar");
		
		List<String> humano11 = Arrays.asList("videogames","games","viciados","sintomas de vicio","criancas","familia","jogos","efeitos","negativos","azar","pesquisa","estados unidos","alguns");
		List<String> humano12 = Arrays.asList("videogames","criancas","sintomas de vicio","pesquisa","estados unidos","familia","games","viciados","efeitos","negativos","jogos","azar","alguns");
		List<String> humano13 = Arrays.asList("videogames","viciados","sintomas de vicio","criancas","pesquisa","estados unidos","efeitos","negativos","games","jogos","azar","familia","alguns");
		List<String> humano14 = Arrays.asList("games","videogames","jogos","efeitos","sintomas de vicio","criancas","viciados","negativos","familia","pesquisa","azar","estados unidos","alguns");
		List<String> humano15 = Arrays.asList("sintomas de vicio","games","videogames","viciados","negativos","jogos","azar","efeitos","familia","criancas","estados unidos","pesquisa","alguns");
		List<String> humano16 = Arrays.asList("sintomas de vicio","videogames","efeitos","negativos","criancas","jogos","azar","alguns","pesquisa","estados unidos","viciados","games","familia");
		
		
		
		
		// TEXTO 3
		/*
		List<String> algoritmo = Arrays.asList("informatica na educacao","computacao","conhecimento","educacao","vezes","areas","distintas","deste","diferentes","outros","cada","mundo");
		List<String> sobek = Arrays.asList("informatica na educacao","computacao","conhecimento","educacao","outros","areas","cada","deste","diferentes","distintas","mundo","vezes");
		
		List<String> humano1 = Arrays.asList("informatica na educacao","educacao","computacao","conhecimento","areas","diferentes","distintas","mundo","vezes","outros","cada","deste");
		List<String> humano2 = Arrays.asList("educacao","informatica na educacao","areas","conhecimento","computacao","mundo","diferentes","distintas","vezes","deste","outros","cada");
		List<String> humano3 = Arrays.asList("educacao","informatica na educacao","computacao","conhecimento","diferentes","areas","distintas","deste","mundo","cada","vezes","outros");
		List<String> humano4 = Arrays.asList("educacao","computacao","informatica na educacao","diferentes","areas","conhecimento","deste","mundo","distintas","cada","vezes","outros");
		List<String> humano5 = Arrays.asList("conhecimento","computacao","educacao","informatica na educacao","vezes","outros","cada","mundo","deste","distintas","diferentes","areas");
		List<String> humano6 = Arrays.asList("informatica na educacao","computacao","educacao","mundo","conhecimento","areas","vezes","diferentes","deste","cada","distintas","outros");
		List<String> humano7 = Arrays.asList("informatica na educacao","conhecimento","computacao","educacao","areas","mundo","diferentes","distintas","cada","vezes","deste","outros");
		List<String> humano8 = Arrays.asList("informatica na educacao","areas","conhecimento","distintas","computacao","educacao","diferentes","cada","vezes","outros","deste","mundo");
		List<String> humano9 = Arrays.asList("informatica na educacao","distintas","areas","conhecimento","educacao","computacao","diferentes","vezes","deste","cada","outros","mundo");
		List<String> humano10 = Arrays.asList("computacao","educacao","conhecimento","vezes","diferentes","mundo","distintas","deste","areas","informatica na educacao","outros","cada");
		
		List<String> humano11 = Arrays.asList("diferentes","distintas","informatica na educacao","areas","conhecimento","educacao","computacao","mundo","vezes","outros","cada","deste");
		List<String> humano12 = Arrays.asList("informatica na educacao","educacao","conhecimento","computacao","areas","mundo","diferentes","distintas","outros","vezes","cada","deste");
		List<String> humano13 = Arrays.asList("informatica na educacao","computacao","educacao","areas","conhecimento","mundo","diferentes","distintas","outros","vezes","deste","cada");
		List<String> humano14 = Arrays.asList("informatica na educacao","educacao","areas","distintas","computacao","conhecimento","mundo","diferentes","outros","vezes","deste","cada");
		List<String> humano15 = Arrays.asList("informatica na educacao","computacao","educacao","areas","conhecimento","diferentes","distintas","mundo","deste","outros","vezes","cada");
		List<String> humano16 = Arrays.asList("informatica na educacao","conhecimento","computacao","areas","educacao","outros","cada","distintas","deste","vezes","diferentes","mundo");
		*/
		//
		
	
		//////////
		List<List> humanos = new ArrayList();
		humanos.add(humano1);
		humanos.add(humano2);
		humanos.add(humano3);
		humanos.add(humano4);
		humanos.add(humano5);
		humanos.add(humano6);
		humanos.add(humano7);
		humanos.add(humano8);
		humanos.add(humano9);
		humanos.add(humano10);
		humanos.add(humano11);
		humanos.add(humano12);
		humanos.add(humano13);
		humanos.add(humano14);
		humanos.add(humano15);
		humanos.add(humano16);
		for(int i=0; i<humanos.size() ;i++){
			System.out.println(humanos.get(i)); //IMPRIME A LISTA DO HUMANO
			int somatorio = 0;
			for(int j=0; j<humanos.get(i).size();j++){
				//System.out.println(humanos.get(i).get(j)); //Imprime o elemento da lista do humano
				int dif = 0;
				for (int k=0; k<algoritmo.size(); k++){
					if (algoritmo.get(k).matches((String) humanos.get(i).get(j))){ // AQUI, ALTERNA A LISTA "algoritmo" POR "sobek" E VICE VERSA, DEPENDENDO DA QUE QUISER USAR
						dif=j-k;
						//System.out.println(" dif: "+ dif*dif);
						somatorio = (int) (somatorio + Math.pow(dif,2));
						break;
					}
				}
			}
			System.out.println(" SUM(i²): "+somatorio);
			int n = humanos.get(i).size();
			double coef_rel = (1 - ((6*somatorio)/(n*(Math.pow(n,2)-1))));
			precs.add(coef_rel);
			System.out.println("Coefic. de Relação: " + coef_rel);
			System.out.println();
		}
		double media = 0;
		for(int i=0; i<precs.size(); i++){
			media = media + precs.get(i);
		}
		media = media/precs.size();
		float var = 0;
		for(int i=0; i<precs.size(); i++){
			var = (float) (var + Math.pow((precs.get(i)-media),2));
		}
		var = var/precs.size();
		float desvio = (float) Math.sqrt(var);
		System.out.println();
		System.out.println("MÉDIA Coeficiente de Relacionamento: " + media+ " Desvio: "+desvio);
	}
}
