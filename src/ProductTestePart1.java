
public class ProductTestePart1 {
    public static void main(String[] args){
    
        //PRODUCTOS POR DEFECTO
        ProductPart1 p1 = new ProductPart1();
        System.out.println(p1.toString());
        
        ProductPart1 p2 = new ProductPart1();
        System.out.println(p2.toString());       
           
        //PRODUCTOS CON PARÁMETROS
        ProductPart1 p3 = new ProductPart1();
        p3.setElemento(1);
        p3.setExistencias(500);
        p3.setProducto("Disco duro Seagate");
        p3.setPrecio(20);
        System.out.println(p3.toString());
        
        ProductPart1 p4 = new ProductPart1();
        p4.setElemento(2);
        p4.setExistencias(150);
        p4.setProducto("SSD Samsung");
        p4.setPrecio(50);
        System.out.println(p4.toString());
        
        ProductPart1 p5 = new ProductPart1();
        p5.setElemento(3);
        p5.setExistencias(55);
        p5.setProducto("USB Sandisk");
        p5.setPrecio(6);
        System.out.println(p5.toString());
        
        ProductPart1 p6 = new ProductPart1();
        p6.setElemento(4);
        p6.setExistencias(345);
        p6.setProducto("Disco duro WD");
        p6.setPrecio(30);
        System.out.println(p6.toString());
    }       
}
