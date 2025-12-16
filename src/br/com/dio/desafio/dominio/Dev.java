package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosEscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosCocluidos = new LinkedHashSet<>();

    public void escreverBootcamp(Bootcamp bootcamp) {
        this.conteudosEscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosEscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosCocluidos.add(conteudo.get());
            this.conteudosEscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nem um conteudo");

        }
    }

    public double calcularTotalXP() {
        return this.conteudosCocluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosEscritos() {
        return conteudosEscritos;
    }

    public void setConteudosEscritos(Set<Conteudo> conteudosEscritos) {
        this.conteudosEscritos = conteudosEscritos;
    }

    public Set<Conteudo> getConteudosCocluidos() {
        return conteudosCocluidos;
    }

    public void setConteudosCocluidos(Set<Conteudo> conteudosCocluidos) {
        this.conteudosCocluidos = conteudosCocluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosEscritos, dev.conteudosEscritos) && Objects.equals(conteudosCocluidos, dev.conteudosCocluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosEscritos, conteudosCocluidos);
    }
}
