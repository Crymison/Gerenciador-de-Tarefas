/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gerenciadordetarefas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MATEUS
 */
public class GerenciadorDeTarefas {
 public static ArrayList lista;
    
   
  public static void getLista(){
        int i =0;
        while(i<lista.size()){
           System.out.println(lista.get(i).toString()+"\n");
           i++;                 
         }
  }
    public static void main(String[] args) {      
                int opc=0,checkTarefa=0;
                String continuar="Sim";
                String alt="";
           
                GerenciadorDeTarefas gt;
		lista = new ArrayList<String>();
                Scanner sc = new Scanner(System.in);
                lista.add("-- Gerenciador de Tarefas --");
               do{
                System.out.println("Digite: | 1- Adicionar Tarefa |2- Remover Tarefa| 3- Checar Tarefas |4- Sair");
                opc = Integer.parseInt(sc.nextLine());
     
                   switch(opc){
                       case 1 -> {
                           alt = sc.nextLine();
                           lista.add(alt);
                           
                           getLista();
                           
                           System.out.println("Deseja continuar?");
                           continuar = sc.nextLine();
                        }
                       
                       case 2 -> {
                           
                           System.out.println("Qual tarefa deseja remover?|Obs: Indique pelo numero da tarefa.");
                           System.out.println("Caso procurar por uma tabela removida, sera exibida uma excessao");
                           checkTarefa = Integer.parseInt(sc.nextLine());
                           
                           if(checkTarefa==0)
                           {
                               System.out.println("Voce nao pode remover o titulo!");
                               break;
                           }
                           
                           lista.remove(lista.get(checkTarefa));
                           getLista();
                        }
                       
                       case 3 -> {
                           System.out.println("Qual tarefa deseja marcar/desmarcar ?|Obs: Indique pelo numero da tarefa.");
                           System.out.println("Caso procurar por uma tabela removida, sera exibida uma excessao");
                           checkTarefa = Integer.parseInt(sc.nextLine());
                           
                             if(lista.get(checkTarefa).toString().contains("**Completa**")){
                                alt = lista.get(checkTarefa).toString().replace("**Completa**", "");
                                lista.set(checkTarefa, alt);
                              
                        
                              }else{
                                   alt = lista.get(checkTarefa).toString()+"**Completa**";
                                    lista.set(checkTarefa, alt);
                                      
                             }           
                             alt = "";  
                             getLista();
                           
                            System.out.println("Deseja continuar?");
                            continuar = sc.nextLine();
                        }
                      
                       case 4 -> System.exit(0);
                      
                       default -> System.out.println("Voce digitou um valor inválido");
                   }
                   
               }while(continuar.equals("Sim")|| continuar.equals("sim")||continuar.equals("s"));
    }
}
