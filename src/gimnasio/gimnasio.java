package gimnasio;


public class gimnasio {

    private int cantidadDeMaquinas;
    private int instructores;
    private boolean membresia;
    private int afiliados;
    private int sucursales;
    private boolean clases;

    public gimnasio(int cantidadDeMaquinas, int instructores, boolean membresia, int afiliados, int sucursales) {
        this.cantidadDeMaquinas = cantidadDeMaquinas;
        this.instructores = instructores;
        this.membresia = membresia;
        this.afiliados = afiliados;
        this.sucursales = sucursales;
        this.clases = clases;
    }

    public void nuevasMaquinas (){
        cantidadDeMaquinas = 60;
        
    }
    public void cantidadDeInstructores (){
        instructores = 5;
        
    }
    public void tieneMembresia (){
        membresia = true;
       
    }
    public void numeroDeAfiliados (){
        afiliados = 50;
    }
    public void cantidadDeSucursales(){
        sucursales = 5;
    }    
    public void clasesExtras(){
        clases = true;   
    }

    public int getCantidadDeMaquinas() {
        return cantidadDeMaquinas;
    }

    public void setCantidadDeMaquinas(int cantidadDeMaquinas) {
        this.cantidadDeMaquinas = cantidadDeMaquinas;
    }

    public int getInstructores() {
        return instructores;
    }

    public void setInstructores(int instructores) {
        this.instructores = instructores;
    }

    public boolean isMembresia() {
        return membresia;
    }

    public void setMembresia(boolean membresia) {
        this.membresia = membresia;
    }

    public int getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(int afiliados) {
        this.afiliados = afiliados;
    }

    public int getSucursales() {
        return sucursales;
    }

    public void setSucursales(int sucursales) {
        this.sucursales = sucursales;
    }

    public boolean isClases() {
        return clases;
    }

    public void setClases(boolean clases) {
        this.clases = clases;
    }


    public void nuevasMaquinas(int nuevaCantidadDeMaquinas){
        if(nuevaCantidadDeMaquinas<=this.cantidadDeMaquinas){
            System.out.println("No hay nuevas maquinas: ");
        }else{
            this.cantidadDeMaquinas = nuevaCantidadDeMaquinas;
            System.out.println("La cantidad de nuevas maquinas es: ");
        }
    }
    
  
    
}
