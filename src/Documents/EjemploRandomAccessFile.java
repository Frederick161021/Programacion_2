package Documents;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
 
public class EjemploRandomAccessFile {
 
    public static void main(String[] args) {
 
        ArrayList<Producto> productos = new ArrayList<>();
 
        productos.add(new Producto(1, "Producto 1", 10.5, true, 'T'));
        productos.add(new Producto(2, "Producto 2", 15.1, true, 'R'));
        productos.add(new Producto(3, "Producto 3", 11.5, false, 'T'));
        productos.add(new Producto(4, "Producto 4", 50, false, 'D'));
        productos.add(new Producto(5, "Producto 5", 79.3, true, 'U'));
 
        try (RandomAccessFile raf = new RandomAccessFile("ejemplo_raf.dat", "rw")) {
 
            for (Producto p : productos) {
 
                raf.writeInt(p.getId());
 
                StringBuffer sb = new StringBuffer(p.getNombre());
                sb.setLength(10);
 
                raf.writeChars(sb.toString());
                raf.writeDouble(p.getPrecio());
                raf.writeBoolean(p.isDescuento());
                raf.writeChar(p.getTipo());
            }
 
            raf.seek(35);
 
            System.out.println(raf.readInt());
            String nombre = "";
            for (int i = 0; i < 10; i++) {
                nombre += raf.readChar();
            }
            System.out.println(nombre);
            System.out.println(raf.readDouble());
            System.out.println(raf.readBoolean());
            System.out.println(raf.readChar());
 
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
 
    }
 
}