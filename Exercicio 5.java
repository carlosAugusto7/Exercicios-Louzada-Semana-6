import java.util.Scanner;

public class NumerosPrimosIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número inicial do intervalo: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o número final do intervalo: ");
        int fim = scanner.nextInt();
        
        System.out.println("Números primos no intervalo:");
        
        for (int num = inicio; num <= fim; num++) {
            if (num > 1) {
                boolean ePrimo = true;
                
                for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
                    if (num % divisor == 0) {
                        ePrimo = false;
                        break;
                    }
                }
                
                if (ePrimo) {
                    System.out.print(num + " ");
                }
            }
        }
        
        // Fecha o scanner
        scanner.close();
    }
}
