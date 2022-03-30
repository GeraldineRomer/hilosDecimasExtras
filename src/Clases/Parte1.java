/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Geraldine Romero
 */
public class Parte1 implements Runnable {
    private int vector[];

    public Parte1() {
    }

    public Parte1(int[] vector) {
        this.vector = vector;
    }

    /**
     * @return the vector
     */
    public int[] getVector() {
        return vector;
    }

    /**
     * @param vector the vector to set
     */
    public void setVector(int[] vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        //encontrar el mayor
        int mayor=Integer.MIN_VALUE;
        for (int i = 0; i < this.vector.length; i++) {
            if(vector[i]>mayor){
                mayor=vector[i];
            }
        }
        System.out.println(mayor);
    }
    
    
}
