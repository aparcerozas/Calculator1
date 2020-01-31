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
            
            byte[] mensaje = new byte[40];
            is.read(mensaje);
            System.out.println(new String(mensaje));
            
            System.out.println("Enviando primer operando");
            String envio = leer.nextLine();
            os.write(envio.getBytes());
            
            mensaje = new byte[40];
            is.read(mensaje);
            System.out.println(new String(mensaje));
            
            System.out.println("Enviando segundo operando");
            envio = leer.nextLine();
            os.write(envio.getBytes());
            
            mensaje = new byte[200];
            is.read(mensaje);
            System.out.println(new String(mensaje));
            
            System.out.println("Enviando tipo de operación");
            envio = leer.nextLine();
            os.write(envio.getBytes());
            
            System.out.println("Recibiendo resultado de operación");
            mensaje = new byte[40];
            is.read(mensaje);
            System.out.println(new String(mensaje));
            
            System.out.println("Cerrando el socket cliente");
            clienteSocket.close();
            
            System.out.println("Terminado");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}