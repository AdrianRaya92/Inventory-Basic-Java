public class ProductPart5 {

    protected int elemento=0;       //Numero de elementos
    protected String producto=null; //Nombre del producto
    protected int existencias=0;    //Numero de unidades en existencias 
    protected int precio=0;         //Precio de cada unidad
    protected String descripcion;
    protected double valorElemento;    //Valor de cada elemento del inventario segun la cantidad y el precio

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
    public double ValorElemento(){
    
        valorElemento= precio*existencias;
        
    return valorElemento;
    }
    
    //MÉTODOS PARA SUMAR Y RESTAR LAS EXISTENCIAS
    public void sumarExistencias(int nuevaCantidad){
        this.existencias = existencias+nuevaCantidad;
    }
    
    public void restarExistencias(int nuevaCantidad){
        this.existencias = existencias-nuevaCantidad;
    }
    
    //STRING QUE MUESTRA LA INFORMACION DE LOS DATOS
    @Override
    public String toString(){
       
      descripcion="Elemento:"+getElemento()+"  Producto:"+getProducto()+"  Existencias:"+getExistencias()+"  Precio:"+getPrecio()+"€"+" Valor total:"+ValorElemento()+"€";
    return descripcion;
    }
}

