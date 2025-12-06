import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Intermediario");
        curso1.setCargaHoraria(52);

        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Java");
        mentoria.setDescricao("BootCamp Java");
        mentoria.setDate(LocalDate.now());

        System.out.println(mentoria);

    }
}