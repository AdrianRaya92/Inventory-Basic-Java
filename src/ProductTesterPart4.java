
import java.util.Scanner;

public class ProductTesterPart4 {
        public static void main(String[] args){
        int numeroProductos;    //VARIABLE NUMERO DE PRODUCTOS QUE DESEAMOS TENER EN EL INVENTARIO
        String opcion;          //OPCION DE MODIFICAR O NO LAS EXISTENCIAS
        String opcionSumaResta; //OPCION DE SUMA O RESTA
        
        Scanner teclado = new Scanner(System.in);
        
        //NUMERO DE PRODUCTOS POSITIVOS
        do{
        System.out.print("Escribe el número de productos:");
        numeroProductos=teclado.nextInt();
        }while(numeroProductos<0);
         
        //CREACION DE LA MATRIZ
        ProductPart4 matriz[]= new ProductPart4[numeroProductos];
        
        //INTRODUCIR DATOS DE LOS PRODUCTOS
        for(int x=0;x<numeroProductos;x++){
            matriz[x]=new ProductPart4();
            System.out.println("----------NUEVO PRODUCTO----------");
            System.out.print("Elemento:");
            matriz[x].setElemento(teclado.nextInt());
            teclado.skip("\n");
            System.out.print("Producto:");
            matriz[x].setProducto(teclado.nextLine());
            System.out.print("Existencias:");
            matriz[x].setExistencias(teclado.nextInt());
            System.out.print("Precio:");
            matriz[x].setPrecio(teclado.nextInt());
            teclado.skip("\n");
       
            //INTRODUCIR SI SE QUIERE O NO MODIFICAR LAS EXISTENCIAS
            do{
                System.out.print("Elemento "+matriz[x].getElemento()+" -->DESEA SUMAR O RESTAR DEL INVENTARIO (S/N)?: ");
                opcion = teclado.nextLine();
            }while(!opcion.equals("S") && !opcion.equals("N"));
            
            //OPCION DE MODIFICAR EXISTENCIAS
            if(opcion.equals("S")){
                //INTRODUCIR SI SE QUIERE SUMAR O RESTAR
                do{
                    System.out.print("Elemento "+matriz[x].getElemento()+" -->SUMAR O RESTAR(+/-)?: ");
                    opcionSumaResta = teclado.nextLine();  
                }while(!opcionSumaResta.equals("+") && !opcionSumaResta.equals("-")); 
                //OPCION SUMA
                if(opcionSumaResta.equals("+")){
                    
                    System.out.print("++++ PRODUCTO ACTUAL ++++ \n"+matriz[x].toString()+"\n-->INTRODUZCA CANTIDAD PARA SUMAR: ");
                    matriz[x].sumarExistencias(teclado.nextInt());
                                 
                }
                //OPCION RESTA
                else if(opcionSumaResta.equals("-")){
                    System.out.print("++++ PRODUCTO ACTUAL ++++ \n"+matriz[x].toString()+"\n-->INTRODUZCA CANTIDAD PARA RESTAR: ");
                    matriz[x].restarExistencias(teclado.nextInt());
                }             
            }
        }
        //MOSTRAR EL LISTADO DE LOS PRODUCTOS
        System.out.println("----------LISTA DE PRODUCTOS----------");     
        for(int x=0;x<numeroProductos;x++){
           System.out.println(matriz[x].toString());
        }     
    }
    
}
