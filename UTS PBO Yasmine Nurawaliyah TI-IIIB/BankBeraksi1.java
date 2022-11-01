
import static javax.xml.bind.DatatypeConverter.parseInt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class BankBeraksi1 {

    /**
     * @param args the command line arguments
     */
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("Selamat Datang di BankIT");
        b.getSaldo();
        
        System.out.println("Simpan Uang:Rp. ");
        int input=parseInt(scanner.nextLine());
        
        b.simpanUang(input);
        
        System.out.println("Ambil Uang:Rp. ");
        input=parseInt(scanner.nextLine());
        
        b.ambilUang(input);
    }
    
}
