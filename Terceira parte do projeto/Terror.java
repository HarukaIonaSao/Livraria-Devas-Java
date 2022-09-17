package livrariaDevas;

public class Terror extends LivrariaDevas {
	
private String outrosLivros;
	
	public Terror (String Nome, String Autor, String Genero, int ISBN, double Valor, String fmLivro, String outrosLivros) {
		super(Nome, Autor, Genero, ISBN, Valor, fmLivro);
		
		this.outrosLivros = outrosLivros;		
		
	}

	public String getOutrosLivros() {
		return outrosLivros;
	}

	public void setOutrosLivros(String outrosLivros) {
		this.outrosLivros = outrosLivros;
	}
	
	public void imprimirNovaInfo3() 
	{
		System.out.println("\nOutros livros famosos da autora(o): "+outrosLivros);
	}
	
}