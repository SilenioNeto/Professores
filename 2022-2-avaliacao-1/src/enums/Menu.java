package enums;

public enum Menu {
	INCLUIR_PROFESSOR(1, "incluir professor"),
	INCLUIR_DISCIPLINA(2, "incluir disciplina"),
	LISTAR_PROFESSORES(3, "listar professores"),
	LISTAR_DISCIPLINAS(4, "listar disciplinas"),
	SAIR(5, "sair");
	
	private int codigo;
	private String descricao;
	private Menu(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public static Menu valueOfCodigo(int codigo) {
		for(Menu opcao : values()) {
			if(codigo == opcao.getCodigo()) {
				return opcao;
			}
		}
		return null;
	}
}
