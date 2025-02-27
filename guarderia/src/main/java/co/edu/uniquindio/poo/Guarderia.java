package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Guarderia {

    private String nombres;
    private List<Ninio> listNinios;

    public Guarderia(String nombres) {
        this.nombres = nombres;
        this.listNinios = new ArrayList<>();
    }

    public boolean verificarNinio(Ninio ninio){
        boolean existe = true;
        for(Ninio ninios : listNinios){
            if(ninios.getID().equals(ninio.getID())){
                existe = false;
            }
        }
        return existe;
    }

    public void eliminarNinio(String ID){
        Boolean ninioEliminar = false;
        for(int i = 0; i < listNinios.size(); i++){
            if(listNinios.get(i).getID().equals(ID)){
                listNinios.remove(i);
                ninioEliminar = true;
                break;
            }
        }
    }

    public boolean esPalindromo(String nombre){
        int inicio = 0;
        int fin = nombre.length()-1;
        boolean palindromo = true;
        while(inicio < fin){
            if(nombre.charAt(inicio)!=nombre.charAt(fin)){
                palindromo = false;
            }
            inicio++;
            fin--;
        }
        return palindromo;
    }

    public List<String> nombresPalindromos(){
        List<String> nombresPalindromos = new ArrayList<>();
        for(Ninio ninio : listNinios){
            String nombre = ninio.getNombres();
            if(esPalindromo(nombre)){
                nombresPalindromos.add(nombre);
            }
        }
        return nombresPalindromos;
    }

    public void actualizarNinio(String ID, Ninio ninio){
        Boolean ninioActualizar = false;
        for(int i = 0; i < listNinios.size(); i++){
            if(listNinios.get(i).getID().equals(ID)){
                listNinios.set(i, ninio);
                ninioActualizar = true;
                break;
            }
        }
    }

    public void almacenarNinios(Ninio ninio) {
        if(verificarNinio(ninio)){
            listNinios.add(ninio);
            System.out.println("Niño almacenado com exito");
        }else{
            System.out.println("Niño ya esta almacenado");
        }
    }

    @Override
    public String toString() {
        return "Guarderia{" +
                "nombres='" + nombres + '\'' +
                ", listNinios=" + listNinios +
                '}';
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public List<Ninio> getListNinios() {
        return listNinios;
    }

    public void setListNinios(List<Ninio> listNinios) {
        this.listNinios = listNinios;
    }
}
