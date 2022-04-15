package TratamentoDeErros.Finaly;

import java.util.Scanner;

public class Finaly {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println(7 / entrada.nextInt());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finalmente....");
            entrada.close();
        }

        System.out.println("Fim");
    }
}
