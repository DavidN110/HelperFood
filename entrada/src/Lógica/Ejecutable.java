/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lógica;
import Interfaz.*;
import Clases.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author jaime
 */
public class Ejecutable implements Serializable{
    
    static HashMap<Long, Donante> listaDonantes = new HashMap<>();
    static HashMap<Long, Beneficiario> listaBeneficiarios = new HashMap<>();
    static ArrayList<Donacion> listaDonaciones = new ArrayList<>();
    static Long donanteActivo;
    static Long beneficiarioActivo;
    static int Elección;

    public static HashMap<Long, Donante> getListaDonantes() {
        return listaDonantes;
    }

    public static HashMap<Long, Beneficiario> getListaBeneficiarios() {
        return listaBeneficiarios;
    }

    public static ArrayList<Donacion> getListaDonaciones() {
        return listaDonaciones;
    }

    public static Long getDonanteActivo() {
        return donanteActivo;
    }

    public static void setDonanteActivo(Long donanteActivo) {
        Ejecutable.donanteActivo = donanteActivo;
    }

    public static Long getBeneficiarioActivo() {
        return beneficiarioActivo;
    }

    public static void setBeneficiarioActivo(Long beneficiarioActivo) {
        Ejecutable.beneficiarioActivo = beneficiarioActivo;
    }

    public static int getElección() {
        return Elección;
    }

    public static void setElección(int Elección) {
        Ejecutable.Elección = Elección;
    }

    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        File archivo1 = new File("Donaciones.txt");
        File archivo2 = new File("Donantes.txt");
        File archivo3 = new File("Beneficiarios.txt");
        if(archivo1.exists()){
            leerDonaciones();
        }
        if(archivo2.exists()){
            leerDonantes();
        }
        if(archivo3.exists()){
            leerBeneficiarios();
        }
        principal ventanaInicial = new principal();
        ventanaInicial.setVisible(true);
    }
    
    public static void crearUsuario(long identificacion, String contrasena, String ubicacion, String contacto, int decision) throws IOException, FileNotFoundException, ClassNotFoundException{
        if(decision == 1){
            Donante usuarioDonante = new Donante(identificacion, contrasena, ubicacion, contacto);
            listaDonantes.put(identificacion, usuarioDonante);
            try{
                guardarDonantes();
            }catch (IOException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            Beneficiario usuarioBeneficiario = new Beneficiario(identificacion, contrasena, ubicacion, contacto);
            listaBeneficiarios.put(identificacion, usuarioBeneficiario);
            try{
                guardarBeneficiarios();
            }catch (IOException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void editarUsuario(long identificacion, String contrasena, String ubicacion, String contacto, int decision) throws IOException, FileNotFoundException, ClassNotFoundException{
        if(decision == 1){
            Donante usuarioDonante = new Donante(identificacion, contrasena, ubicacion, contacto);
            listaDonantes.replace(identificacion, usuarioDonante);
            try{
                guardarDonantes();
            }catch (IOException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            Beneficiario usuarioBeneficiario = new Beneficiario(identificacion, contrasena, ubicacion, contacto);
            listaBeneficiarios.replace(identificacion, usuarioBeneficiario);
            try{
                guardarBeneficiarios();
            }catch (IOException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void crearDonacion(String alimento, int cantidad, String fechaCaducidad, Long nombreDonante) throws IOException, FileNotFoundException, ClassNotFoundException{
        Donante donante = listaDonantes.get(nombreDonante);
        Donacion productoDonado = new Donacion(alimento, cantidad, fechaCaducidad, donante);
        if (Elección == -1){
            listaDonaciones.add(productoDonado);
            try{
                guardarDonaciones();
            }catch (IOException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            listaDonaciones.set(Elección, productoDonado);
            try{
                guardarDonaciones();
            }catch (IOException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }catch (ClassNotFoundException ex) {
                Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void eliminarDonacion(int Indice) throws IOException, FileNotFoundException, ClassNotFoundException{
        listaDonaciones.remove(Indice);
        try{
            guardarDonaciones();
        }catch (IOException ex) {
            Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejecutable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void guardarDonaciones() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileOutputStream fout= new FileOutputStream("Donaciones.txt");
        try(ObjectOutputStream out = new ObjectOutputStream(fout)){
            out.writeObject(listaDonaciones);
            out.close();
        }  
    }
    
    public static void guardarDonantes() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileOutputStream fout= new FileOutputStream("Donantes.txt");
        try(ObjectOutputStream out = new ObjectOutputStream(fout)){
            out.writeObject(listaDonantes);
            out.close();
        }  
    }
    
    public static void guardarBeneficiarios() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileOutputStream fout= new FileOutputStream("Beneficiarios.txt");
        try(ObjectOutputStream out = new ObjectOutputStream(fout)){
            out.writeObject(listaBeneficiarios);
            out.close();
        }  
    }
    
    public static void leerDonaciones() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fin = new FileInputStream("Donaciones.txt");
        try(ObjectInputStream ois = new ObjectInputStream(fin)){
            listaDonaciones = (ArrayList<Donacion>)ois.readObject();
        } 
    }
    
    public static void leerDonantes() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fin = new FileInputStream("Donantes.txt");
        try(ObjectInputStream ois = new ObjectInputStream(fin)){
            listaDonantes = (HashMap<Long, Donante>)ois.readObject();
        } 
    }
    
    public static void leerBeneficiarios() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fin = new FileInputStream("Beneficiarios.txt");
        try(ObjectInputStream ois = new ObjectInputStream(fin)){
            listaBeneficiarios = (HashMap<Long, Beneficiario>)ois.readObject();
        } 
    }
}
