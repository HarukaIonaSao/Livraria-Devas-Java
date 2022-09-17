package livrariaDevas;

public class LivrariaDevas {
	
	private String Nome;
	private String Autor;
	private String Genero;
	private int ISBN;
	private double Valor;
	private String fmLivro;
	
	public LivrariaDevas(String Nome, String Autor, String Genero, int ISBN, double Valor, String fmLivro)
	{
		this.Nome = Nome;
		this.Autor = Autor;
		this.Genero = Genero;
		this.ISBN = ISBN;
		this.Valor = Valor;
		this.fmLivro = fmLivro;
		
	}
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getGenero() {
		return Genero;
	}
	public void setGenero(String genero) {
		Genero = genero;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public double getValor() {
		return Valor;
	}
	public void setValor(double valor) {
		Valor = valor;
	}
	public String getFmLivro() {
		return fmLivro;
	}
	public void setFmLivro(String fmLivro) {
		this.fmLivro = fmLivro;
	}
	
	void imprimirInfo() {
		System.out.println("Nome do livro: " + Nome);
		System.out.println("Nome do autor: " + Autor);
		System.out.println("Gênero do livro: " + Genero);
		System.out.println("Código: " + ISBN);
		System.out.println("Preço atual: " + Valor);
		System.out.println("Formato: " + fmLivro);
	}
	
}
	
	
