package tui;
import java.util.Scanner;

public class TUIUtil {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String obterString(String mensagem) {
		System.out.println(mensagem);
		return scanner.nextLine();
	}
	public static int obterInt(String mensagem) {
		System.out.println(mensagem);
		int valor = scanner.nextInt();
		scanner.nextLine();
		return valor;
	}
}
