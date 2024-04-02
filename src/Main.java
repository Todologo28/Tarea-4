import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte edad;
        int nApart1, nApart2, nApart3, nApart4, nApart5, nApart6, nApart7,
                nVis1, nVis2, nVis3, nVis4, nVis5, nVis6, nVis7, p1, p2, p3, p4, p5, p6, p7,
                totalVisit = 0;
        long tel, d1, d2, d3, d4, d5, d6, d7;
        String nom, ape, gen, resp;
        double totalStayTime = 0, stayTime;

        System.out.println("\n\t\t\t\t\tBienvenido al Edificio 28");
        System.out.println("\n\t\tPorfavor ingrese su edad:");
        edad = scanner.nextByte();


        for (int i = 0; i < 7; i++) {
            System.out.println("\n\n\t\t\t\t\tBienvenido al Edificio 28");
            System.out.println("\n\t\tEs usted un estudiante? ");
            resp = scanner.next();

            System.out.println("\n\t\tIngrese su nombre:");
            nom = scanner.next();

            System.out.println("\n\t\tIngrese su apellido:");
            ape = scanner.next();

            System.out.println("\n\t\t Su genero es:");
            gen = scanner.next();

            System.out.println("\n\t\tBrindenos su numero de Telefono:");
            tel = scanner.nextLong();

            System.out.println("\n\n\t\tLunes");
            System.out.println("\t\tDigame a que numero de piso se dirige:");
            p1 = scanner.nextInt();

            System.out.println("\t\t¿Hacia que habitacion se dirije? ");
            nApart1 = scanner.nextInt();

            System.out.println("\t\t¿Cuantas horas desea quedarse el dia de hoy ?");
            d1 = scanner.nextLong();

            System.out.println("\t\t¿Cuantos visitantes ingresaran a la habitacion? ");
            nVis1 = scanner.nextInt();

            System.out.println("\n\n\t\tMartes");
            System.out.println("\t\tDigame a que numero de piso se dirige:");
            p2 = scanner.nextInt();

            System.out.println("\t\t¿Hacia que habitacion se dirije? ");
            nApart2 = scanner.nextInt();

            System.out.println("\t\t¿Cuantas horas desea quedarse el dia de hoy ?");
            d2 = scanner.nextLong();

            System.out.println("\t\t¿Cuantos visitantes ingresaran a la habitacion? ");
            nVis2 = scanner.nextInt();

            System.out.println("\n\n\t\tMiercoles");
            System.out.println("\t\tDigame a que numero de piso se dirige:");
            p3 = scanner.nextInt();

            System.out.println("\t\t¿Hacia que habitacion se dirije? ");
            nApart3 = scanner.nextInt();

            System.out.println("\n\t\t¿Cuantas horas desea quedarse el dia de hoy ?");
            d3 = scanner.nextLong();

            System.out.println("\n\t\t¿Cuantos visitantes ingresaran a la habitacion? ");
            nVis3 = scanner.nextInt();

            System.out.println("\n\n\t\tJueves");
            System.out.println("\t\tDigame a que numero de piso se dirige:");
            p4 = scanner.nextInt();

            System.out.println("\t\t¿Hacia que habitacion se dirije? ");
            nApart4 = scanner.nextInt();

            System.out.println("\n\t\t¿Cuantas horas desea quedarse el dia de hoy ?");
            d4 = scanner.nextLong();

            System.out.println("\n\t\t¿Cuantos visitantes ingresaran a la habitacion? ");
            nVis4 = scanner.nextInt();

            System.out.println("\n\n\t\tViernes");
            System.out.println("\t\tDigame a que numero de piso se dirige:");
            p5 = scanner.nextInt();

            System.out.println("\t\t¿Hacia que habitacion se dirije? ");
            nApart5 = scanner.nextInt();

            System.out.println("\t\t¿Cuantas horas desea quedarse el dia de hoy ?");
            d5 = scanner.nextLong();

            System.out.println("\t\t¿Cuantos visitantes ingresaran a la habitacion? ");
            nVis5 = scanner.nextInt();


            System.out.println("\n\n\t\tSabado");
            System.out.println("\t\tDigame a que numero de piso se dirige:");
            p6 = scanner.nextInt();

            System.out.println("\t\t¿Hacia que habitacion se dirije? ");
            nApart6 = scanner.nextInt();

            System.out.println("\t\t¿Cuantas horas desea quedarse el dia de hoy ?");
            d6 = scanner.nextLong();

            System.out.println("\t\t¿Cuantos visitantes ingresaran a la habitacion? ");
            nVis6 = scanner.nextInt();


            System.out.println("\n\n\t\tDomingo");
            System.out.println("\t\tDigame a que numero de piso se dirige:");
            p7 = scanner.nextInt();

            System.out.println("\t\t¿Hacia que habitacion se dirije? ");
            nApart7 = scanner.nextInt();

            System.out.println("\t\t¿Cuantas horas desea quedarse el dia de hoy ?");
            d7 = scanner.nextLong();

            System.out.println("\t\t¿Cuantos visitantes ingresaran a la habitacion? ");
            nVis7 = scanner.nextInt();


            System.out.println("\n\n\t\t\t\t\t Edificio 28");
            System.out.println("\t\t\t" + resp + ", es un estudiante ");
            System.out.println("\t\t\tNombre del visitante: " + nom + " " + ape);
            System.out.println("\t\t\tSu genero es: " + gen);
            System.out.println("\t\t\tSu edad es: " + edad);
            if (edad >= 18) {
                System.out.println("Su edad es: " + edad + " y es mayor de edad");
            } else {
                System.out.println("Su edad es: " + edad + " y es menor de edad");
            }
            System.out.println("\t\t\tSu numero de telefono es: " + tel);

            System.out.println("\n\n\t\tLunes");
            System.out.println("\t\t\tNumero de piso al que se dirigio: " + p1);
            System.out.println("\t\t\tNumero de habitación que visito: " + nApart1);
            System.out.println("\t\t\tUsted se quedo " + d1 + "Horas");
            System.out.println("\t\t\tCantidad de visitantes ingresados: " + nVis1);

            System.out.println("\n\n\t\tMartes");
            System.out.println("\t\t\tNumero de piso al que se dirigio: " + p2);
            System.out.println("\t\t\tNumero de habitación que visito: " + nApart2);
            System.out.println("\t\t\tUsted se quedo " + d2 + "Horas");
            System.out.println("\t\t\tCantidad de visitantes ingresados: " + nVis2);

            System.out.println("\n\n\t\tMiercoles");
            System.out.println("\t\t\tNumero de piso al que se dirigio: " + p3);
            System.out.println("\t\t\tNumero de habitación que visito: " + nApart3);
            System.out.println("\t\t\tUsted se quedo " + d3 + "Horas");
            System.out.println("\t\t\tCantidad de visitantes ingresados: " + nVis3);

            System.out.println("\n\n\t\tJueves");
            System.out.println("\t\t\tNumero de piso al que se dirigio: " + p4);
            System.out.println("\t\t\tNumero de habitación que visito: " + nApart4);
            System.out.println("\t\t\tUsted se quedo " + d4 + "Horas");
            System.out.println("\t\t\tCantidad de visitantes ingresados: " + nVis4);

            System.out.println("\n\n\t\tViernes");
            System.out.println("\t\t\tNumero de piso al que se dirigio: " + p5);
            System.out.println("\t\t\tNumero de habitación que visito: " + nApart5);
            System.out.println("\t\t\tUsted se quedo " + d5 + "Horas");
            System.out.println("\t\t\tCantidad de visitantes ingresados: " + nVis5);

            System.out.println("\n\n\t\tSabado");
            System.out.println("\t\t\tNumero de piso al que se dirigio: " + p6);
            System.out.println("\t\t\tNumero de habitación que visito: " + nApart6);
            System.out.println("\t\t\tUsted se quedo " + d6 + "Horas");
            System.out.println("\t\t\tCantidad de visitantes ingresados: " + nVis6);

            System.out.println("\n\n\t\tDomingo");
            System.out.println("\t\t\tNumero de piso al que se dirigio: " + p7);
            System.out.println("\t\t\tNumero de habitación que visito: " + nApart7);
            System.out.println("\t\t\tUsted se quedo " + d7 + "Horas");
            System.out.println("\t\t\tCantidad de visitantes ingresados: " + nVis7);

            System.out.println("\n\n\t\t\tTotal de visitas en la semana: " + (nVis1 + nVis2 + nVis3 + nVis4 + nVis5 + nVis6 + nVis7));
            System.out.println("\t\t\tTiempo promedio de estadía de la semana: " + (d1 + d2 + d3 + d4 + d5 + d6 + d7) + " horas");
        }
    }
}