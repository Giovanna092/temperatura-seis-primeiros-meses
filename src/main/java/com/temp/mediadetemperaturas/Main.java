package com.temp.mediadetemperaturas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        //criação de lista de objetos da classe Temperatura
        List<Temperatura> primeirosMeses = List.of(
                new Temperatura("janeiro", 0d),
                new Temperatura("fevereiro", 0d),
                new Temperatura("março", 0d),
                new Temperatura("abril", 0d),
                new Temperatura("maio", 0d),
                new Temperatura("junho", 0d));


        //entrada para armazenamento da temperatura media dos meses pré-determinados
        double tempMediaMes;
        for (int i = 0; i < primeirosMeses.size(); i++) {
            System.out.println("Adicione a temperatura média do mês de "+
                    primeirosMeses.get(i).getMes());
            tempMediaMes = leitura.nextDouble();
            primeirosMeses.get(i).setTemp(tempMediaMes);
        }

        System.out.println("");

        //exibição da lista
        System.out.println("Temperatura dos 6 semestres");
        System.out.println(primeirosMeses);


        //calculos para obter a media semestral
        double soma=0;
        Iterator<Temperatura> iterator = primeirosMeses.iterator();
        while(iterator.hasNext()){
            Temperatura next = iterator.next();
            soma += next.getTemp();
        }
        double media = soma / primeirosMeses.size();

        System.out.println("");

        System.out.println("A media semestral é de:"+ media);

        List<Temperatura> acimaMedia = new ArrayList<>();


        //mostrar temperaturas acima da media semestral
        iterator = primeirosMeses.iterator();
        while(iterator.hasNext()){
            Temperatura next = iterator.next();
            if (next.getTemp() > media) {
                acimaMedia.add(next);
            }
        }

        System.out.println("\nMeses com temperatura acima da media semestral: \n"+ acimaMedia);


    }
}
