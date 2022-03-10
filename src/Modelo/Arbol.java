/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.IOException;

/**
 *
 * @author joseg
 */
public class Arbol {
    public Nodo raiz;

    
    public Arbol()
    {
        raiz=null;
    }
    
    public void insertar(int valor)
    {
        if(raiz==null)
        {
            raiz=new Nodo(valor);
        }else
        {
            raiz.insertar(valor);
        }
    }
    
    public void PreOrden() throws IOException
    {
        this.PreOrden(this.raiz);
    }
    
    public void PreOrden(Nodo nodo) throws IOException
    {
        if(nodo == null)
        {
            return;
        }else
        {
            System.out.print(nodo.getRaiz()+ ", ");
            PreOrden(nodo.getIzquierdo());
            PreOrden(nodo.getDerecho());
        }
    }
    
    
    public void InOrden() throws IOException
    {
        this.InOrden(this.raiz);
    }
    
    public void InOrden(Nodo nodo) throws IOException
    {
        if(nodo == null)
        {
            return;
        }else
        {
            InOrden(nodo.getIzquierdo());
            System.out.print(nodo.getRaiz()+ ", ");
            InOrden(nodo.getDerecho());
        }
    }
    
    
    
    public void PosOrden() throws IOException
    {
        this.PosOrden(this.raiz);
    }
    
    public void PosOrden(Nodo nodo) throws IOException
    {
        if(nodo == null)
        {
            return;
        }else
        {
            PosOrden(nodo.getIzquierdo());
            PosOrden(nodo.getDerecho());
            System.out.print(nodo.getRaiz()+ ", ");
        }
    }
}
