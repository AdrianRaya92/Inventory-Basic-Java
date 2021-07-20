public class ProductPart1 {
    private int elemento=0;       //Numero de elementos
    private String producto=null;    //Nombre del producto
    private int existencias=0;    //Numero de unidades en existencias 
    private int precio=0;         //Precio de cada unidad
    
    private String descripcion;

    
    
    //GETTER Y SETTER
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    
    public int getElemento() {
        return elemento;
    }
    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
    
    public int getExistencias() {
        return existencias;
    }
    public void setExistencias(int existencias) {
        this.existencias = existencias;
    } 
    
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }    
   
    //STRING QUE MUESTRA LA INFORMACION DE LOS DATOS
    @Override
    public String toString(){
      descripcion="Elemento:"+getElemento()+"  Producto:"+getProducto()+"  Existencias:"+getExistencias()+"  Precio:"+getPrecio()+"€";
    return descripcion;
    }
    
    
    
    
}
