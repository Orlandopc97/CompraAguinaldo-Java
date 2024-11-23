import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        double aguinaldo=13000;
        System.out.println("Tu tienes de aguinaldo: $" + aguinaldo);

        System.out.println("Ingresa la cantidad de retiros: ");
        int numeroRetiros=Integer.parseInt(br.readLine());



        for(int i=0;i<numeroRetiros;i++){
            System.out.println("Ingresa el retiro: $");
            double montoRetiro=Double.parseDouble(br.readLine());
            aguinaldo=aguinaldo-montoRetiro;
        }

        if (aguinaldo < 0){
            System.out.println("Tu quedas a deber: $" + aguinaldo);
        }else {
            System.out.println("Esto te queda del aguinaldo: $" + aguinaldo);
        }

    }
}