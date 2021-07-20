public class ProductPart2 {
    private int elemento=0;       //Numero de elementos
    private String producto=null; //Nombre del producto
    private int existencias=0;    //Numero de unidades en existencias 
    private int precio=0;         //Precio de cada unidad
    private String descripcion;
    private int valorElemento;    //Valor de cada elemento del inventario segun la cantidad y el precio
    
    //GETTER Y SETTER DEL PRODUCTO
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
    
    //MÉTODO PARA EL VALOR TOTAL DEL ELEMENTO
    public int valorElemento(){
    
        valorElemento= precio*existencias;
        
    return valorElemento;
    }
    
    //STRING QUE MUESTRA LA INFORMACION DE LOS DATOS
    @Override
    public String toString(){
      descripcion="Elemento:"+getElemento()+"  Producto:"+getProducto()+"  Existencias:"+getExistencias()+"  Precio:"+getPrecio()+"€"+" Valor total:"+valorElemento()+"€";
    return descripcion;
    }
    
}
