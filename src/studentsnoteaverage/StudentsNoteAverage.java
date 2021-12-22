/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentsnoteaverage;

import java.util.Scanner;
/*
 * Patika dev kapsamında java101 dersi koşullu durumlar not ortalaması ödevi 
 */
/**
 *
 * @author alimdursun
 */
public class StudentsNoteAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int turkcenot,matematiknot,fiziknot,kimyanot,tarihnot;
        double notortalaması;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Not Ortalaması Hesaplama\n"
                + "Dersler\n"
                + "Türkçe,\n"
                + "Matematik,\n"
                + "Fizik,\n"
                + "Kimya,\n"
                + "Tarih");
        System.out.print("Türkçe: ");
        turkcenot=scanner.nextInt();
        if(turkcenot<=0 || turkcenot>100){
            turkcenot=0;
        }
        System.out.print("Matematik: ");
        matematiknot=scanner.nextInt();
        if(matematiknot<0 || matematiknot>100){
            matematiknot=0;
        }
        System.out.print("Fizik: ");
        fiziknot=scanner.nextInt();
        if(fiziknot<0 || fiziknot>100){
            fiziknot=0;
        }
        System.out.print("Kimya: ");
        kimyanot=scanner.nextInt();
        if(kimyanot<0 || kimyanot>100){
            kimyanot=0;
        }
        System.out.print("Tarih: ");
        tarihnot=scanner.nextInt();
        if(tarihnot<0 || tarihnot>100){
            tarihnot=0;
        }
        
        notortalaması=(turkcenot+matematiknot+fiziknot+kimyanot+tarihnot)/5;
        if(notortalaması > 55){
            System.out.println("geçtiniz ve not ortalamanız: "+notortalaması);
        }else{
            System.out.println("kaldınız ve not ortalamanız: "+notortalaması);
        }
    }
}
