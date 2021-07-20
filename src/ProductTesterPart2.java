
import java.util.Scanner;


public class ProductTesterPart2 {
    public static void main(String[] args){
            
        Scanner teclado = new Scanner(System.in);
        
        //INTRODUCIR DATOS DE LOS PRODUCTOS
        ProductPart2 p1 = new ProductPart2();
        System.out.println("Escriba los datos del producto1:");  
        System.out.print("Elemento:");
        p1.setElemento(teclado.nextInt());
        teclado.skip("\n");
        System.out.print("Producto:");
        p1.setProducto(teclado.nextLine());
        System.out.print("Existencias:");
        p1.setExistencias(teclado.nextInt());
        System.out.print("Precio:");
        p1.setPrecio(teclado.nextInt());
        
        ProductPart2 p2 = new ProductPart2();
        System.out.println("Escriba los datos del producto2:"); 
        System.out.print("Elemento:");
        p2.setElemento(teclado.nextInt()); 
        teclado.skip("\n");
        System.out.print("Producto:");
        p2.setProducto(teclado.nextLine());
        System.out.print("Existencias:");
        p2.setExistencias(teclado.nextInt());
        System.out.print("Precio:");
        p2.setPrecio(teclado.nextInt());
        
        ProductPart2 p3 = new ProductPart2();
        System.out.println("Escriba los datos del producto3:");  
        System.out.print("Elemento:");
        p3.setElemento(teclado.nextInt());
        teclado.skip("\n");        
        System.out.print("Producto:");
        p3.setProducto(teclado.nextLine());
        System.out.print("Existencias:");
        p3.setExistencias(teclado.nextInt());
        System.out.print("Precio:");
        p3.setPrecio(teclado.nextInt());
        
        ProductPart2 p4 = new ProductPart2();
        System.out.println("Escriba los datos del producto4:");  
        System.out.print("Elemento:");
        p4.setElemento(teclado.nextInt());
        teclado.skip("\n");        
        System.out.print("Producto:");
        p4.setProducto(teclado.nextLine());
        System.out.print("Existencias:");
        p4.setExistencias(teclado.nextInt());
        System.out.print("Precio:");
        p4.setPrecio(teclado.nextInt()); 
        
        ProductPart2 p5 = new ProductPart2();
        System.out.println("Escriba los datos del producto5:");  
        System.out.print("Elemento:");
        p5.setElemento(teclado.nextInt());
        teclado.skip("\n");        
        System.out.print("Producto:");
        p5.setProducto(teclado.nextLine());
        System.out.print("Existencias:");
        p5.setExistencias(teclado.nextInt());
        System.out.print("Precio:");
        p5.setPrecio(teclado.nextInt());
        
        ProductPart2 p6 = new ProductPart2();
        System.out.println("Escriba los datos del producto6:"); 
        System.out.print("Elemento:");
        p6.setElemento(teclado.nextInt());
        teclado.skip("\n");        
        System.out.print("Producto:");
        p6.setProducto(teclado.nextLine());
        System.out.print("Existencias:");
        p6.setExistencias(teclado.nextInt());
        System.out.print("Precio:");
        p6.setPrecio(teclado.nextInt());  
        
        //MOSTRAR EL LISTADO DE LOS PRODUCTOS
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());

        
        
    }
}
