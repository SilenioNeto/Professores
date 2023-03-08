package persistence;
import java.util.ArrayList;
import java.util.List;

import domain.*;

public class ProfessorList {
	private static List<Professor> professores = new ArrayList<>();
	
	public static void incluir (Professor professor) {
		professores.add(professor);
	}
	
	public List<Professor> getLista() {
		return professores;
	}
}
