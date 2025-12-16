import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitle("Java");
        curso1.setDescricao("Intermediario");
        curso1.setCargaHoraria(52);

        Curso curso2 = new Curso();

        curso2.setTitle("C");
        curso2.setDescricao("Intermediario");
        curso2.setCargaHoraria(52);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitle("Java");
        mentoria.setDescricao("BootCamp Java");
        mentoria.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Development");
        bootcamp.setDescricao("Intermediario");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev murilo = new Dev();
        murilo.setNome("Antonio murilo");
        murilo.escreverBootcamp(bootcamp);
        murilo.progredir();
        murilo.progredir();
        System.out.println("Conteudos escritos Murilo " + murilo.getConteudosEscritos());
        System.out.println("Conteudos cocluidos Murilo " + murilo.getConteudosCocluidos());
        System.out.println("XP: " + murilo.calcularTotalXP());

        System.out.println("----------------------------------------");
        Dev julia = new Dev();
        julia.setNome("Julia");
        julia.escreverBootcamp(bootcamp);
        julia.progredir();
        julia.progredir();
        julia.progredir();
        System.out.println("Conteudos escritos Julia " + julia.getConteudosEscritos());
        System.out.println("Conteudos cocluidos Julia " + julia.getConteudosCocluidos());
        System.out.println("XP: " + julia.calcularTotalXP());

        System.out.println("----------------------------------------");
        Dev marcos = new Dev();
        marcos.setNome("Marcos");
        marcos.escreverBootcamp(bootcamp);
        marcos.progredir();
        System.out.println("Conteudos escritos Marcos " + marcos.getConteudosEscritos());
        System.out.println("Conteudos cocluidos Marcos " + marcos.getConteudosCocluidos());
        System.out.println("XP: " + marcos.calcularTotalXP());

    }
}