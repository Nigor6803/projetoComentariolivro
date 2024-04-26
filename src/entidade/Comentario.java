package entidade;

public class Comentario {
	
	private String autorDoComentario;
	private String texto;
	
	public Comentario() {
		}
	
	public Comentario(String autorDoComentario, String texto) {
		this.autorDoComentario = autorDoComentario;
		this.texto = texto;
	}
	
	public String setAutorDoComentario() {
		return autorDoComentario;
	}
	
	public void getAutorDoComentario(String autorDoComentario) {
		this.autorDoComentario = autorDoComentario;
	}
	
	public String setTexto() {
		return texto;
	}
	
	public void getTexto(String texto) {
		this.texto = texto;
	}
}
