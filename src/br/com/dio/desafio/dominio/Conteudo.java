package br.com.dio.desafio.dominio;

public sealed abstract class Conteudo permits Curso, Mentoria {
    protected static final double XP_PADRAO = 10.00;
    private String title, descricao;

    public abstract double calcularXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
