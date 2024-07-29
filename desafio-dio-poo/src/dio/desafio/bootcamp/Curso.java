package dio.desafio.bootcamp;

public class Curso extends Conteudo{

    private int cargaHorariaDoCurso;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHorariaDoCurso;
    }

    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHorariaDoCurso;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHorariaDoCurso = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHorariaDoCurso +
                '}';
    }
}
