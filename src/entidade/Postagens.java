package entidade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagens {
	
	private Date momento;
	private String tituloDoLivro;
	private String tipoDolivro;
	private Integer quantidadeEmEstoque;
	
	public List<Comentario> comentarios = new ArrayList<>();
	
	public Postagens() {
		};
		
	public Postagens(Date momento,String tituloDoLivro, String tipoDoLivro, Integer quantidadeEmEstoque) {
		this.momento = momento;
		this.tituloDoLivro = tituloDoLivro;
		this.tipoDolivro = tipoDoLivro;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	public Date getMomento() {
		return momento;
	}
	
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	
	public String getTituloDoLivro() {
		return tituloDoLivro;
	}
	
	public void getTituloDoLivro(String tituloDoLivro) {
		this.tituloDoLivro = tituloDoLivro;
	}
	
	public String setTipoDoLivro() {
		return tipoDolivro;
	}
	
	public void getTipoDoLivro(String tipoDoLivro) {
		this.tipoDolivro = tipoDoLivro;
	}
	
	public Integer getquantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	
	public void setQuantidadeEmEstoque(Integer quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	public List<Comentario> getComentario() {
		return comentarios;
	}
	
	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removeComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
}
