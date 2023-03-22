package com.temp.mediadetemperaturas;

/**
 * Classe usada para armazenar a temperatura media dos 6 primeiros meses do ano (janeiro à junho)
 */
public class Temperatura {
    private String mes;
    private Double temp;

    public Temperatura(String mes, Double temp) {
        this.mes = mes;
        this.temp = temp;
    }

    public Double getTemp() {
        return temp;
    }

    public String getMes() {
        return mes;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "{" +
                "mes='" + mes + '\'' +
                ", temp=" + temp +
                '}';
    }
}

