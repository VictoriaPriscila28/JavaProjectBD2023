import java.util.Scanner;
public class MinhaClasse {

    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        // Informa texto e chave de criptografia
        System.out.print("Informe o texto a ser criptografado: ");
        String texto = entrada.nextLine();
        System.out.print("Informe a chave de deslocamento: ");
        int chave = entrada.nextInt();
        // Variavel que ira guardar o texto cifrado
        String textoCifrado = new String();
        int tamanhoTexto = texto.length();
        int letraCifradaASCII;
        // Criptografa cada caractere por vez
        for(int c=0; c < tamanhoTexto; c++){
            // Transforma o caracter em codigo ASCII e criptografa
            int letranormal = ((int) texto.charAt(c));
            letraCifradaASCII = letranormal + chave;

            // Transforma codigo ASCII criptografado em
            // caractere e adiciona ao novo texto
            textoCifrado = textoCifrado + ( (char) letraCifradaASCII );
        }
        System.out.println("\n\nTEXTO CRIPTOGRAFADO: " + textoCifrado);
    }
}