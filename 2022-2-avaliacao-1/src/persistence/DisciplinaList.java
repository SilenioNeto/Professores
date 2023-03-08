package persistence;
import java.util.ArrayList;
import java.util.List;

import domain.*;

public class DisciplinaList {
	private static List<Disciplina> disciplinas = new ArrayList<>();
	
	public static void incluir (Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	
	public static Disciplina resgatar(int indice) {
		return disciplinas.get(indice);
	}
	
	public static Disciplina procurar(String codigo) {
		for (Disciplina disciplina: disciplinas) {
			if (disciplina.getCodigo().equals(codigo))
				return disciplina;
		}
		return null;
	}
	
	public List<Disciplina> getLista() {
		return disciplinas;
	}
}
