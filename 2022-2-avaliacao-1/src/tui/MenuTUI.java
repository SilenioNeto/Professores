package tui;
import enums.*;

public class MenuTUI {
	public static void executar() {
		Menu opcao;
		do {
			exebirOpcoes();
			opcao = obterOpcaoDesejada();
			executarOpcao(opcao);
		}while (opcao!= Menu.SAIR);
	}
	private static void executarOpcao(Menu opcao) {
		if (opcao == null) {
			System.out.println("Opção não válida.");
			return;
		}
		switch (opcao) {
		case INCLUIR_PROFESSOR:
			ProfessorTUI.incluir();
			break;
		case INCLUIR_DISCIPLINA:
			DisciplinaTUI.incluir();
			break;
		case LISTAR_PROFESSORES:
			ProfessorTUI.apresentar();
			break;
		case LISTAR_DISCIPLINAS:
			DisciplinaTUI.apresentar();
			break;
		case SAIR:
			System.out.println("Bye...");
			break;
		}
	}
	private static Menu obterOpcaoDesejada() {
		int opcaoInt = TUIUtil.obterInt("Informe o código da opção desejada:");
		return Menu.valueOfCodigo(opcaoInt);
	}
	private static void exebirOpcoes() {
		for(Menu opcao : Menu.values()) {
			System.out.println(opcao.getCodigo() + " - " +opcao.getDescricao());
		}
	}
}
