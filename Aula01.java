//Começo
import java.util.Date; // Importa a biblioteca Date
import java.util.Locale; // Importa a biblioteca de idioma
import java.awt.Toolkit;
import java.awt.Dimension;
public class Aula01 { //Classe geral do bloco principal
    public static void main(String[] args){ //Bloco de comando vazio e publico
        System.out.println("Ola Mundo"); //Comando para inprimir (print)
        Date relogio = new Date(); // cria a variavel relogio que recebe a data do dispositivo
        System.out.println(relogio.toString()); // Imprime a data dentro da variavel relogio
        Locale idioma = Locale.getDefault();
        System.out.println(idioma);
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension dimensao = tela.getScreenSize();
        System.out.println(dimensao);
    }
}
/*camelcase  -> uso de maiusculas em palavras juntas -> ExemploDeCamelCase
---------------------
MinhaClasse -> Camelcase em ambas é uma classe ou interface
---------------------
meuAtributo
minhaVariavel -> segunda palavra em maiuscula é um atributo, variavel ou metodo
meuMetodo
---------------------
meu_pacote -> sem maiuscula é um pacote
---------------------
MINHA_CONSTANTE -> todas maiusculas é uma constante/ ex. PI
 */

