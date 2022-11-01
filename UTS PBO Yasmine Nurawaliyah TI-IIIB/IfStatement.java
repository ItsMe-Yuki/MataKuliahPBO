/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class IfStatement {
     public static void main(String[] args) {
    int nilai = 80;
    int absen = 30;
    
    boolean lulusNilai = nilai >= 75;
    boolean lulusAbsen = absen >= 75;
    
    boolean lulus=lulusNilai&&lulusAbsen;
    
    if (lulus){
    System.out.println("Selamat Anda Lulus");
}else{
    System.out.println("Silahkan Coba Lagi tahun Depan");
}
    if(nilai >=80 && absen >=80){
        System.out.println("Nilai Anda A");
    }else if (nilai >=70 && absen >= 70){
     System.out.println("Nilai Anda B");
    }else if (nilai >=60 && absen >=60){
      System.out.println("Nilai Anda C");
    }else if (nilai >=50 && absen >= 50)  {
         System.out.println("Nilai Anda D");
    }else {
         System.out.println("Nilai Anda E");
    }
}
}
