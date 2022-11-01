/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Bank {
    int saldo = 100000;
void simpanUang(int sld){
   saldo=saldo + sld;
   System.out.println("Saldo saat ini : Rp." +saldo);
    }
void ambilUang(int sld){
    if(sld<saldo){
          System.out.println("Saldo saat ini : Rp." +saldo);
    }else{
          System.out.println("Saldo saat ini tidak mencukupi");
    }
}
    void getSaldo(){
          System.out.println("Saldo saat ini : Rp." +saldo);
    }
}

