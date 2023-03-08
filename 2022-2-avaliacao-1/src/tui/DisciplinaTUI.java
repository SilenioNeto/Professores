package tui;
import business.*;
import domain.*;
import persistence.DisciplinaList;

public class DisciplinaTUI {
	public static void incluir() {
		String nome = TUIUtil.obterString("Informe o nome da disciplina:");
		String codigo = TUIUtil.obterString("Informe o código da disciplina:");
		int semestre = TUIUtil.obterInt("Informe o semestre:");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setNome(nome);
		disciplina.setCodigo(codigo);
		disciplina.setSemestre(semestre);
		InclusaoDP.incluirDisciplina(disciplina);
	}
	public static void apresentar() {
		DisciplinaList DisList = new DisciplinaList();
		for(int indice = 0; indice < DisList.getLista().size(); indice++ ) {
			System.out.println( "Código: " +DisList.getLista().get(indice).getCodigo());
			System.out.println( "Nome: " +DisList.getLista().get(indice).getNome());
			System.out.println( "Semestre: " +DisList.getLista().get(indice).getSemestre());
		}
	}
}
