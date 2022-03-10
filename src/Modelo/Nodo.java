/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author joseg
 */
public class Nodo {
    private Nodo Izquierdo, Derecho;
    private int raiz;
    
    public Nodo(int raiz)
    {
        this.raiz=raiz;
        this.Izquierdo=null;
        this.Derecho=null;
    }

    public Nodo getIzquierdo() {
        return Izquierdo;
    }

    public void setIzquierdo(Nodo Izquierdo) {
        this.Izquierdo = Izquierdo;
    }

    public Nodo getDerecho() {
        return Derecho;
    }

    public void setDerecho(Nodo Derecho) {
        this.Derecho = Derecho;
    }

    public int getRaiz() {
        return raiz;
    }

    public void setRaiz(int raiz) {
        this.raiz = raiz;
    }
    
    
    public void insertar(int numero)
    {
        if(numero<this.raiz)
        {
            if(this.Izquierdo==null)
            {
                this.Izquierdo = new Nodo(numero);
            }
            else
            {
                this.Izquierdo.insertar(numero);
            }
        }
        else
        {
            if(this.Derecho==null)
            {
                this.Derecho = new Nodo(numero);
            }
            else
            {
                this.Derecho.insertar(numero);
            }
        }
    }
    
}
