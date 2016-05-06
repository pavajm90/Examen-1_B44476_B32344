/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.*;
import javax.swing.JOptionPane;

public class ArrayListPersona {
 
  /* Crea un ArrayListPersona y le decimos que almacenara
  * objetos de tipo persona*/
 private ArrayList<Persona>lista;
    private int persona;
 
 public ArrayListPersona(){
  lista =new ArrayList<Persona>();
 }
 
 /*Este metodo inserta un objeto de tipo persona
  * usando el metodo add(Object arg)*/
 public void insertarElemento(Persona persona){  
    lista.add(persona);
    JOptionPane.showMessageDialog(null,"Persona insertada a la lista");
 }
 

  /*Este método elimina una persona del ArrayListPersona
  * recibe la cédula, busca la cédula en la lista
  * si la encuantra, asigna a la referencia personaEliminar
  * la instancia de Persona que tiene la lista en esa posición
  * El metodo remove elimina el objeto del ArrayListPersona */
 public void eliminarPersona(String ID, Object Persona){
     Persona personaEliminar = null;
   for(int indice=0;indice < lista.size() ; indice++){
      if(lista.get(indice).getID()  == ID) 
      personaEliminar = lista.get(indice);
   }
   if ( personaEliminar == null) {
      JOptionPane.showMessageDialog(null,"La persona no se encuentra en la lista"); }
   else  {
      JOptionPane.showMessageDialog(null," SE ELIMINÓ DE LA LISTA");
  
      lista.remove( persona);
 }
 
 //Elimina todo el contenido del ArrayListPersona

 
 // Retorna el tamaño de la lista actualmente

 
 
}
}