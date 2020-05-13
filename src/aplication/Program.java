package aplication;

import model.domain.DomainException;
import model.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        try {

            System.out.print("Numero do Quarto: ");
            int numero = sc.nextInt();
            System.out.print("Data de Check-In: (dd/mm/aaaa) ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Data de Check-Out: (dd/mm/aaaa) ");
            Date checkOut = sdf.parse(sc.next());

            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Digite a Data para a atualização da reserva: ");
            System.out.println("Digite a Data de Check-In: ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Digite a Data de Check-Out: ");
            checkOut = sdf.parse(sc.next());

            reserva.updateDates(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

        }
        catch (ParseException e){
            System.out.println("Formato de Data invalido");
        }
        catch (DomainException e){
            System.out.println("Erro na reserva" + e.getMessage());
        }









     sc.close();
    }

}
