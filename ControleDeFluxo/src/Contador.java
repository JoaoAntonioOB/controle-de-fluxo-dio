import java.util.Scanner;

class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}

public class Contador {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = ler.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = ler.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }

        catch(ParametrosInvalidosException e){
            System.out.print(e.getMessage());
        }
        
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm < parametroDois){
            int contagem = parametroDois - parametroUm;
            for(int i=1; i < contagem; i++){
                System.out.println(parametroUm + i);
            }
        }
        else{
            throw new ParametrosInvalidosException();
        }

    }

}
