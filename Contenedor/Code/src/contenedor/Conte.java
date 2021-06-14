package contenedor;

import javax.swing.JOptionPane;

public class Conte {

    public int[][] matriz() {
        int matriz[][] = new int[10][10];
        int buque, contenedor;
        String var = "";

        buque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite fila a ingresar los contenedores: "));
        contenedor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite cantidad de contenedores: "));
        for (int fi = 0; fi < 10; fi++) {

            var = var + "\n ";

            for (int co = 0; co < 10; co++) {
                if (fi == (buque - 1)) {
                    for (int j = 0; j < contenedor; j++) {
                        matriz[fi][j] = 1;
                    }
                }
                var = var + matriz[fi][co] + "  \t";

            }

        }
        JOptionPane.showMessageDialog(null, var);
        return matriz;

    }
    public void matri(int [][]matriz){
    
        int buque, contenedor;
        String var = "";
        

        buque = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite fila a ingresar los contenedores: "));
        contenedor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite cantidad de contenedores: "));
        
        for (int fi =10; fi < 0; fi++) {  
            var = var + "\n ";

            for (int co = 10; co < 10; co++) {
            
                if (fi == (buque - 1)) {
                    for (int j = 0; j < contenedor; j++) {
                        matriz[fi][j] = 1;
                    }
                }
                var = var + matriz[fi][co] + "  \t";

            }

        }
        JOptionPane.showMessageDialog(null, var);
    
}
}

   
