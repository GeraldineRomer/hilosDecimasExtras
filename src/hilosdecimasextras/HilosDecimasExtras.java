/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosdecimasextras;

import Clases.Parte1;

/**
 *
 * @author Geraldine Romero
 */
public class HilosDecimasExtras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vectorOriginal[]={3,2,3,4,5};
        int vectorClone1[]=new int[vectorOriginal.length/2];
        int vectorClone2[]=new int[vectorOriginal.length/2];
        
        for (int i = 0; i < vectorOriginal.length/2; i++) {
            vectorClone1[i]=vectorOriginal[i];
        }
        
        int x=0;
        for (int i = (vectorOriginal.length/2)+1; i <vectorOriginal.length ; i++) {
            vectorClone2[x]=vectorOriginal[i];
            x++;
        }
        
        for (int i = 0; i < vectorClone1.length; i++) {
            System.out.println("-"+vectorClone1[i]);
        }
        
        Parte1 hilito1=new Parte1(vectorClone1);
        Parte1 hilito2=new Parte1(vectorClone2);
        
        Thread proceso1=new Thread(hilito1);
        Thread proceso2=new Thread(hilito2);
        
        proceso1.start();
        proceso2.start();
    }
    
}
