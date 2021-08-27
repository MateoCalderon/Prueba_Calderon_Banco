
package dominio;

import java.util.Scanner;
import javax.swing.JTextField;

public class Caja {

    private String nombre,saldo;
    private int codigo;
    private static int nroCodigo;
    public Caja( String nombre, String saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.codigo=Caja.nroCodigo++;
    }
    
    public void Codigo(){
        nroCodigo=1;
    }
    
    public void Total(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void saldoTotal(){
        
    }
    
    }
    
