import java.util.Scanner;
import javax.swing.JOptionPane;

public class Caixa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] options = {"Registrar Produto", "Finalizar Compra", "Sair"};

        double soma = 0;
        int dialog = 0;

        while (dialog != 2) {
            dialog = JOptionPane.showOptionDialog(
                    null,
                    "Escolha Uma Ação",
                    "Simulador de Caixa de Supermercado",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    null);

            if (dialog == 0) {
                System.out.print("Digite o valor do produto: ");
                double valor = entrada.nextDouble();
                soma += valor;
            } else if (dialog == 1) {
                if (soma>=100) {
                    soma = soma-soma*0.1;
                }
                String formatado = String.format("R$%.2f", soma);
                JOptionPane.showMessageDialog(
                        null,
                        "O valor total a ser pago foi de R$" + formatado);
                soma = 0;
            }
        }
    }
}