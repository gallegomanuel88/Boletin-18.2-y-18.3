package boletin.pkg18.pkg2;

import java.util.Scanner;

/**
 *
 * @author galle
 */
public class Metodos {
    int notas[] = new int[3];
    String alu[] = new String[3];
    private int not;
    private int sus;
    private int apr;

    public void notasalumnos() {
        for (int n = 0;n< notas.length ; n++) {
            not = (int) (Math.random() * 10 + 1);
            notas[n] = not;
            if (not > 5) {
                apr++;

            }

            if (not < 5) {
                sus++;
            }

        }
        System.out.println("Aprobados = " + apr + "Supensos = " + sus);
    }

    public void notamedia() {
        int suma = 0;
        int nmedia;

        for (int i = 0; i < notas.length; i++) {
            suma = suma + notas[i];

        }
        nmedia = suma / notas.length;
        System.out.println("Nota media =" + nmedia);
    }

    public void notamasAlta() {
        int notal = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notal) {
                notal = notas[i];

            }
        }
        System.out.println("La nota mas alta es " + notal);
    }

    public void nombres() {
        String nombre = "";
        for (int i = 0; i < alu.length; i++) {
            Scanner nom = new Scanner(System.in);
            nombre = nom.nextLine();
            alu[i] = nombre;

        }

    }

    public void nespecifica() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno" + alu[i] + "Nota ==>" + notas[i]);
        }
    }

    public void alumnosAprobados() {
        for (int i = 0; i < notas.length; i++) {
            not = (int) (Math.random() * 10 + 1);
            notas[i] = not;
            if (not >= 5) {
                System.out.println("Aprobó" + alu[i] + " " + notas[i]);
            }

        }
    }

    public void listaOrdenada() {

        int  aux;
        String al;

        
            
            for (int i = 0; i < notas.length - 1; i++) {
                for (int j=i+1;j<notas.length;j++){
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;

                    al = alu[i];
                    alu[i] = alu[j];
                    alu[j] = al;
                    
                }
                }
            }

        } 
    

    public void pedir() {
        String al;
        Scanner d = new Scanner(System.in);
        al = d.nextLine();

        for (int i = 0; i < notas.length; i++) {
            if (al.equals(alu[i])) {
                System.out.println(notas[i]);
            }
        }

    }
}
