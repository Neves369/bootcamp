package bootcamp;

import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private List<Curso> cursosInscritos;
    private List<Mentoria> mentoriasInscritas;


    public Dev(String nome) {
    	this.nome = nome;
        this.cursosInscritos = new ArrayList<>();
        this.mentoriasInscritas = new ArrayList<>();
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    public void inscreverMentoria(Mentoria mentoria) {
        mentoriasInscritas.add(mentoria);
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public List<Mentoria> getMentoriasInscritas() {
        return mentoriasInscritas;
    }
}


