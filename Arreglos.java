/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

/**
 *
 * @author Hogar
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         char [][] lec = new char [3][5];
        char letras= 'a';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                lec[i][j]=letras;
                letras++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(lec[i][j]+ " ");
                
            }
            System.out.println(" ");
        }
        // TODO code application logic here
    }
    
}
