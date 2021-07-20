
import java.util.Scanner;

public class ProductTesterPart5 {
        public static void main(String[] args){
        int numeroProductos;    //VARIABLE NUMERO DE PRODUCTOS QUE DESEAMOS TENER EN EL INVENTARIO
        String opcion;          //OPCION DE MODIFICAR O NO LAS EXISTENCIAS
        String opcionSumaResta; //OPCION DE SUMA O RESTA
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("//// INVENTARIO DE DISCOS DUROS ////");
        
        //NUMERO DE PRODUCTOS POSITIVOS
        do{
        System.out.print("INTRODUZCA EL NUMERO DE PRODUCTOS:");
        numeroProductos=teclado.nextInt();
        }while(numeroProductos<0);
        
        //CREACION DE LA MATRIZ
        DiscosDuros matriz[] =new DiscosDuros[numeroProductos];
        
        //INTRODUCIR DATOS DE LOS PRODUCTOS
        for(int x=0;x<numeroProductos;x++){
            matriz[x]=new DiscosDuros();
            System.out.println("----------NUEVO PRODUCTO DE DISCOS DUROS----------");
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
            //Nuevas variables para los discos duros
            System.out.print("Marca:");
            matriz[x].setMarca(teclado.nextLine());
            System.out.print("Capacidad(GB):");
            matriz[x].setCapacidad(teclado.nextInt()); 
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
        System.out.println("----------LISTA DE DISCOS DUROS----------");     
        for(int x=0;x<numeroProductos;x++){
           System.out.println(matriz[x].toString());
        }     
    }   
}