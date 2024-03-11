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

    public int trimestreLluvioso() {
        int contador = 0, t1 = 0, t2 = 0, t3 = 0, t4 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 31; j++) {
                if (this.calendario[j][i]) {
                    contador++;
                }
            }
            t1 = contador;
        }
        contador = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 31; j++) {
                if (this.calendario[j][i]) {
                    contador++;
                }
            }
            t2 = contador;
        }
        contador = 0;
        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 31; j++) {
                if (this.calendario[j][i]) {
                    contador++;
                }
            }
            t3 = contador;
        }
        contador = 0;
        for (int i = 9; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                if (this.calendario[j][i]) {
                    contador++;
                }
            }
            t4 = contador;
        }

        int mayorTrimestre = t1;
        int[] valores = {t1, t2, t3, t4};

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > mayorTrimestre) {
                mayorTrimestre = valores[i];
            } else {
                return mayorTrimestre;
            }
        }
        return mayorTrimestre;
    }

    public int primerDiaLluvia(){
        int contador = 0; int diita = 0;
        do{
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 31; j++) {
                diita++;
                if (this.calendario[j][i]) {
                    contador++;
                }
            }
        }
        }while (contador!=1);
        return diita;
    }
}