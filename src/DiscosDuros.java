//SUBCLASE DE LA CLASE PRODUCTPART5
public class DiscosDuros extends ProductPart5{ 
    //2 NUEVAS VARIABLES PARA EL INVENTARIO
    //VARIABLES LOS DISCOS DUROS COMO SON SU MARCA Y SU CAPACIDAD
    protected String marca=null;   //Marca del disco duro (SEAGATE, WD, TOSHIBA...)
    protected int capacidad=0;  //Capacidad del disco duro en GB

    //CONSTRUCTORES SET Y GET DE LAS NUEVAS VARIABLES PARA DISCOS DUROS
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    //MÉTODO VALOR DEL ELEMENTO SUMANDO UNA TASA DE DEVOLUCION DEL 5% AL VALOR TOTAL
    public double ValorElemento(){
  
        this.valorElemento= precio*existencias;
        this.valorElemento= valorElemento+(valorElemento*0.05);
        return valorElemento;
    }
    
    //MODIFICACIÓN DEL MÉTODO TO STRING PARA AÑADIR LOS NUEVOS VALORES MARCA Y CAPACIDAD
    public String toString(){
    return super.toString().concat(" Marca:").concat(getMarca()).concat(" Capacidad:").concat(Integer.toString(capacidad)).concat("GB");
    }  
}