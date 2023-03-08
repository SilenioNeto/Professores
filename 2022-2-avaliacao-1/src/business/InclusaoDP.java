package business;
import domain.*;
import persistence.*;

public class InclusaoDP {
	
	public static void incluirDisciplina(Disciplina disciplina) {
		DisciplinaList.incluir(disciplina);
	}
	
	public static void incluirProfessor(Professor professor) {
		ProfessorList.incluir(professor);
	}
	
}
