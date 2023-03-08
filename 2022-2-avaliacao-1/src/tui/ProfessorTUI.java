package tui;
import business.*;
import domain.*;
import persistence.DisciplinaList;
import persistence.ProfessorList;

public class ProfessorTUI {
	public static void incluir() {
		String nome = TUIUtil.obterString("Informe o nome:");
		String matricula = TUIUtil.obterString("Informe a matricula:");
		String telefone = TUIUtil.obterString("Informe o telefone:");
		String codigo = TUIUtil.obterString("Informe o código da disciplina: ");
		if (DisciplinaList.procurar(codigo) == null) {
			System.out.println("Erro: Não existe qualquer disciplina com o código " + codigo + ".");
			return;
		}
		
		Professor professor = new Professor();
		professor.setDisciplina(codigo);
		professor.setNome(nome);
		professor.setMatricula(matricula);
		professor.setTelefone(telefone);
		InclusaoDP.incluirProfessor(professor);
	}
	
	public static void apresentar() {
		ProfessorList profList = new ProfessorList();
		for(int indice = 0; indice < profList.getLista().size(); indice++) {
			System.out.println( "Matrícula: " +profList.getLista().get(indice).getMatricula());
			System.out.println( "Nome: " +profList.getLista().get(indice).getNome());
			System.out.println( "Telefone: " +profList.getLista().get(indice).getTelefone());
			System.out.println( "Disciplina: " +profList.getLista().get(indice).getDisciplina().getCodigo());
		}
	}
}
