package br.com.diodesafio.dominio;

public class Curso extends Conteudo{

        private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "---\tCurso\t---\n" + "Titulo: " + getTitulo() +
                ", Descricao: " + getDescricao() +
                ", Carga Horario: " + cargaHoraria + '\n';
    }


}
