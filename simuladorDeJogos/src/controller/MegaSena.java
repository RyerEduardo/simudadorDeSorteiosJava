/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.util.Random;




/**
 *
 * @author Eduardo
 */
public class MegaSena {
   
    
    public String novoSorteio(){
        
        //para gerar os numeros
        Random random = new Random();
        int contador = 0;
        int numeros[] = new int[6];
        
        while(contador < 6){
            int temp  = random.nextInt(61);
            boolean duplicidade = false;
            
                if(temp != 0){
                   for(int i=0; i<6; i++){
                       if(temp == numeros[i])
                       duplicidade = true;          
                   } 
                   if(duplicidade == false){
                       numeros[contador] = temp;
                       contador ++;
                   }
                }
        }
        //para ordenar
        int contador2 = 0;
        while(contador2 < 6){
          for(int i=0; i<5; i++){
              int temp1 = numeros[i];
              int temp2 = numeros[i+1];  
                   
              if(temp1 > temp2){
                  temp2 = numeros[i+1];
                  numeros[i] = temp2; 
                  numeros[i+1] = temp1;     
               } 
               
            } 
          
          contador2 ++; 
           
        }
        //para salvar
        String n = "";
          
        for(int i=0; i<6; i++){
           //if para converter em dezenas
          if(numeros[i] == 1 || numeros[i] == 2 || numeros[i] == 3 || numeros[i] == 4 ||
                  numeros[i] == 5 || numeros[i] == 6 || numeros[i] == 7 || numeros[i] == 8 || numeros[i] == 9){
             n += "   0"+numeros[i];  
          }
          else
          n += "   "+numeros[i];   
        }  
         return n;
    }
}
             
           
         