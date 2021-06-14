
package contenedor;

import javax.swing.JOptionPane;


public class Contenedor {

   
    public static void main(String[] args) {
       String txtCad;
    }
    public static char[][] create (int size){
        char matriz [][] = new char [10][10];
        
        for ( int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                matriz [i][j] = '-';
            }
        }
        return matriz;
    }
    public static void Dis(char matr [][]){
        String cad = "          CONTENEDORES \n";
        for ( int i = 0; i < matr.length; i ++){
            for ( int j = 0; j < matr[i].length; j ++){
                cad+= matr[i][j] + " ";
            }
            cad += "\n";
                 
        }
        JOptionPane.showMessageDialog(null, cad);
    }
     public static char [][]lugar(char matr [][]){
         char matriz [][] = matr;
         do{
             int fila= (int)Integer.parseInt(JOptionPane.showInputDialog("selecciona fila"));
             int columna= (int)Integer.parseInt(JOptionPane.showInputDialog("selecciona columna"));
             
             if (matriz [fila - 1][columna - 1] == 'x'){
                JOptionPane.showMessageDialog(null,"Vuelve a soleccionar. \n Buque ocupado");
         } else {
                 JOptionPane.showMessageDialog(null,"Lugar asignado a la fila: "+ fila+ " y columna: "+ columna);
                 matriz [fila - 1][columna - 1] = 'x';
                 break;
             }
         }while ( 1 == 1);
         return matriz;
     }
    

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

