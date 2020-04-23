/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configelectronica;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class ConfigElectronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc = new Scanner(System.in);    
            
            // ASIGNAMOS LOS VALORES CORRESPONDIENTES PARA CADA ORBITA
            String orbitas[] = {"1s", "2s", "2p", "3s", "3p", "4s", "3d", "4p", "5s", "4d", "5p", "6s", "4f", "5d", "6p", "7s", "5f", "6d", "7p"};
            int valores[] = {2, 2, 6, 2, 6, 2, 10, 6, 2, 10, 6, 2, 14, 10, 6, 2, 14, 10, 6};
            
            //DECLARAMOS VARIABLES 
            int suma, n, diferencia;
            String resultado;
            boolean encontrado=false;
            // Numero de electrones que asignaremos.
            int NumeroElectrones = 0;
            
            // Nombre del Elemento
            String nombre = "";
            suma = 0;
            n = 0;
	    resultado = "";
            int contador = -1;

                System.out.println("");
                System.out.print("Nombre de Elemento: ");
                nombre = sc.next();
                if(!nombre.equals("Exit")){
                    if(nombre.length()<=50){
                        System.out.print("Numero atomico(Z): ");
                        NumeroElectrones = sc.nextInt();
                        if(NumeroElectrones>=0 && NumeroElectrones<=118){
                                  // Contador para recorrer los arrays

                                  while (!encontrado) {
                                          contador++;
                                          n = contador;
                                          // Suma de los electrones en los subniveles
                                          suma = suma + valores[contador];

                                          encontrado = (suma < NumeroElectrones) ? false : true;

                                  }

                                  diferencia = valores[n] - (suma - NumeroElectrones);
                                  // asignamos el resultado de la Configuracion Electronica por cada nivel
                                  for (int x = 0; x < n; x++) {
                                          resultado = resultado + orbitas[x] + "" + valores[x] + " ";
                                  }
                                  resultado = " " + resultado + orbitas[n] + "" + diferencia + " ";
                                  //Imprimimos el resultado
                                  System.out.print("C.E. :"+resultado);

                        }else{
                            System.out.println("Numero atomico fuera de rango, Numero entre 0 y 118");
                        }
                    }else{
                        System.out.println("Nombre de Elemento fuera de rango, Rango maximo 50");
                    }
                    System.out.println("");
                }else{
                    System.out.println("Saliendo..........");
                }
                     
             
             
    }
}
