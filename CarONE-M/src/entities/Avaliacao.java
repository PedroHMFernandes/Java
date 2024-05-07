package entities;

public class Avaliacao {
	private Integer nota;
	private String comentario;
	private Viagem viagem;
	private Usuario usuario;

	public Avaliacao() {
	}

	public Avaliacao(Integer nota, String comentario, Viagem viagem, Usuario usuario) {
		this.nota = nota;
		this.comentario = comentario;
		this.viagem = viagem;
		this.usuario = usuario;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Viagem getViagem() {
		return viagem;
	}

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}

