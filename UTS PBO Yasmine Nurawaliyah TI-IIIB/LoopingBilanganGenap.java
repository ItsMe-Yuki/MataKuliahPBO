/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class LoopingBilanganGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      for(int counter = 1; counter <= 100; counter++){
      if(counter % 2 == 1){
        continue;
      }

      System.out.println("Perulangan genap " + counter);
    }

    }
    
}
