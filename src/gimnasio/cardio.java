package gimnasio;

public class cardio extends gimnasio{
    
    private final int maquinas;
    private final boolean ejercicios;
    private final String instructor;

    public cardio(int maquinas, boolean ejercicios, String instructor, int cantidadDeMaquinas, int instructores, boolean membresia, int afiliados, int sucursales) {
        super(cantidadDeMaquinas, instructores, membresia, afiliados, sucursales);
        this.maquinas = maquinas;
        this.ejercicios = ejercicios;
        this.instructor = instructor;
    }
            
    
}
