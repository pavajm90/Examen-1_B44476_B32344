/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Xml.Modelo.Anotacion;

/**
 *
 * @author JOCSELY
 */
public class Persona
{
    @Anotacion
    private String ID;
    @Anotacion
    private String prodecencia;
   
    @Anotacion(guardar_xml = false)
    
    
    public Persona(String ID,
            String prodecencia)
    {
        this.ID = ID;
        this.prodecencia = prodecencia;
    }

    public Persona()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getID()
    {
        return ID;
    }

    public void setID(String ID)
    {
        this.ID = ID;
    }

    public String getProdecencia()
    {
        return prodecencia;
    }

    public void setProdecencia(String prodecencia)
    {
        this.prodecencia = prodecencia;
    }
    
    public boolean ciudadano()
    {
        return false;
    }
    public String Indigena(String procedencia)
    {
        return procedencia;
    }
    public String refugiado(String procedencia)
    {
        return procedencia;
    }
    public String migrante(String procedencia)
    {
        return procedencia;
    }
    
    
}
