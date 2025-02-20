package co.edu.uniquindio.poo;

public class Ninio {

    private String nombres;
    private int edad;
    private String genero, documento;
    private String alergias;
    private String nombreAcudiente;
    private String numeroContactoAcudiente;
    private String ID;

    public Ninio(String nombres, int edad, String genero, String documento, String alergias, String nombreAcudiente, String numeroContactoAcudiente, String ID) {
        this.nombres = nombres;
        this.edad = edad;
        this.genero = genero;
        this.documento = documento;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroContactoAcudiente = numeroContactoAcudiente;
        this.ID = ID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Ninio{" +
                "nombres='" + nombres + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", documento='" + documento + '\'' +
                ", alergias='" + alergias + '\'' +
                ", nombreAcudiente='" + nombreAcudiente + '\'' +
                ", numeroContactoAcudiente='" + numeroContactoAcudiente + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
