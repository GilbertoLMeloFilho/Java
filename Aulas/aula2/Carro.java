package aula2;
public class Carro{ //construir um objeto
    String modelo;
    public Carro(String modelo){
        this.modelo = modelo;
    }
    public void acelerar(){
        System.out.println("Acelerar " + this.modelo);
    }
}
/**
 * Modificadores de Acesso:
 * public -> acesso para todo mundo
 * private -> acesso somente detro da classe definido
 * protected -> acesso somente para o mesmo pacote
 */