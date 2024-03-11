package es.iesmz.tests;

public class DiasLluvia {
    private boolean[][] calendario;

    public DiasLluvia(boolean[][] calendario) {
        this.calendario = new boolean[12][31];
    }

    public boolean registroDia(int dia, int mes, boolean lluvia) {
        if (dia > 0 && dia <= 31) {
            if (lluvia) {
                this.calendario[mes][dia] = true;
            }
        } else {
            System.err.println("Fecha no válida");
        }
        return false;
    }


}
