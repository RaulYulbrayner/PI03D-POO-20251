package co.edu.uniquindio.poo;

public class Producto {

    private String nombre, categoria;
    private double valor;
    private int codProducto;
    public int stock;

    public Producto(String nombre, String categoria, double valor, int codProducto, int stock){
        this.nombre = nombre;
        this.categoria = categoria;
        this.valor = valor;
        this.codProducto = codProducto;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", valor=" + valor +
                ", codProducto=" + codProducto +
                ", stock=" + stock +
                '}';
    }
}