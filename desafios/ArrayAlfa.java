package desafios;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAlfa {
    public static void main(String[] args) {
        String[] Alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 26: ");
        int num = scanner.nextInt();
        ArrayList<String> ListLetras = new ArrayList<>();
        for(int i = 0; i < num; i++){
            System.out.println(i);
        }
        System.out.println(ListLetras);

    }
}
