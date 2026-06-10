import java.util.ArrayList;

public class aula1 {
    //Numeros inteiros
    int idade = 17;

    //Numeros decimais
    float altura = 1.7f;
    double pi = 3.1415926535897932384;

    //Texto
    String texto = "Gilberto";
    char letra = 'a';

    //bolleano
    boolean acordado = true;

    public static void main(String[] args) {
    String nome = "Gilberto";
    //condicionais
    if(nome.isBlank()) {
        System.out.println("Branco");
    } else if(nome == "Gilberto") {
        System.out.println("Gilberto");
    } else{
        System.out.println("Falso");
    }

    //Arrays
    //Tamanho definido
    int[] listaDeIdade = {17, 20, 83, 4};
    int[] numeros = new int[5]; //valor detro dos colchetes é o tamano do array
    System.out.println(listaDeIdade[3]);

    //ArrayList
    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("Maria"); //adicionar elementos
    nomes.add("João");
    nomes.add("Julia");
    System.out.println(nomes);
    nomes.remove(0); //remover um elemento
    nomes.remove(0);
    System.out.println(nomes);

    String[] listaNomes = {"Ana", "Pedro", "Maria", "Julio", "Gabriela", "Matheus"};
    //Loops
    //for
    for (int i = 0; i < listaNomes.length; i++){ //1°- criar um iterador; 2°- condição para o loop continuar; 3°- Oque acontece com o interador apos a volta
        System.out.println(listaNomes[i]);
    } 
    //foreach
    for (String item : listaNomes) { //para cada item dentro do array faça o laço
        System.out.println(item);
        
    }

    //while
    int y = 1;
    while(y < 6){ //condição para o laço acontecer
        System.out.println(y);
        y++;
    }

    //Passar string para int
    String nstr = "10";
    int paraInt = Integer.parseInt(nstr);
    //int para string
    String newstr = String.valueOf(paraInt);

}

}
