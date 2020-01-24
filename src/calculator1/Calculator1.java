package calculator1;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Calculator1 {

    public static void main(String[] args) {
        try{
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Creando socket cliente");
            Socket clienteSocket = new Socket();
            System.out.println("Estableciendo la conexión");
            
            InetSocketAddress addr = new InetSocketAddress("192.168.0.1", 5555);
            clienteSocket.connect(addr);
            
            InputStream is = clienteSocket.getInputStream();
            OutputStream os = clienteSocket.getOutputStream();
            
            byte[] lectura = new byte[250];
            is.read(lectura);
            System.out.println(new String(lectura));
            
            
            System.out.println("Escogiendo tipo de operación");
            String respuesta = leer.nextLine();
            System.out.println("Enviando tipo de operación");
            os.write(respuesta.getBytes());
            
            System.out.println("Recibiendo respuesta del servidor");
            byte[] mensaje = new byte[40];
            is.read(mensaje);
            System.out.println(new String(mensaje));
            if(new String(mensaje).startsWith("Error")){
                System.out.println("Desconectandose del servidor");
            }
            else{
                respuesta = leer.nextLine();
                System.out.println("Enviando primer operando");
                os.write(respuesta.getBytes());
                
                System.out.println("Recibiendo respuesta del servidor");
                is.read(mensaje);
                
                System.out.println(new String(mensaje));
                respuesta = leer.nextLine();
                System.out.println("Enviando segundo operando");
                os.write(respuesta.getBytes());
                
                System.out.println("Recibiendo resultado de operación");
                is.read(mensaje);
                System.out.println(new String(mensaje));
            }
            
            System.out.println("Cerrando el socket cliente");
            clienteSocket.close();
            
            System.out.println("Terminado");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}