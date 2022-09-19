package livrariaDevas;

public class Romance extends LivrariaDevas{
	
	private String outrosLivros;
	
	public Romance(String Nome, String Autor, String Genero, int ISBN, double Valor, String fmLivro, String outrosLivros) {
		super(Nome, Autor, Genero, ISBN, Valor, fmLivro);
		
		this.outrosLivros = outrosLivros;		
		
	}

	public String getOutrosLivros() {
		return outrosLivros;
	}

	public void setOutrosLivros(String outrosLivros) {
		this.outrosLivros = outrosLivros;
	}
	
	public void imprimirNovaInfo()
	{
		System.out.println("\nOutros livros famosos da autora(o): "+getOutrosLivros);
	}
}
