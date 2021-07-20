
import java.util.Scanner;

public class ProductTesterPart3 {
    public static void main(String[] args){
        int numeroProductos;    //VARIABLE NUMERO DE PRODUCTOS QUE DESEAMOS TENER EN EL INVENTARIO
        
        Scanner teclado = new Scanner(System.in);
        
        //NUMERO DE PRODUCTOS POSITIVOS
        do{
        System.out.print("Escribe el número de productos:");
        numeroProductos=teclado.nextInt();
        }while(numeroProductos<0);
        
        //CREACION DE LA MATRIZ
        ProductPart3 matriz[]= new ProductPart3[numeroProductos];
        
        //INTRODUCIR DATOS DE LOS PRODUCTOS
        for(int x=0;x<numeroProductos;x++){
            matriz[x]=new ProductPart3();
            
            System.out.print("Elemento:");
            matriz[x].setElemento(teclado.nextInt());
            teclado.skip("\n");
            System.out.print("Producto:");
            matriz[x].setProducto(teclado.nextLine());
            System.out.print("Existencias:");
            matriz[x].setExistencias(teclado.nextInt());
            System.out.print("Precio:");
            matriz[x].setPrecio(teclado.nextInt());
        }
        //MOSTRAR EL LISTADO DE LOS PRODUCTOS     
        for(int x=0;x<numeroProductos;x++){
           System.out.println(matriz[x].toString());
        }     
    }  
}
