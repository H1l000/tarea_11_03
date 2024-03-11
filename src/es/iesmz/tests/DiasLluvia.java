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


    public boolean consultarDia(int dia, int mes) {
        return this.calendario[mes][dia];
    }

    public int contarDiasLluviosos() {
        int contador = 0;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                if (this.calendario[j][i]) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
