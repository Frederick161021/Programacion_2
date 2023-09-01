package Examen;

import java.io.*;
import javax.swing.JOptionPane;

public class Ejemplo {
    public static void main(String[] args) {
        long matricula=4456;
        String nombre="Erick", materia="Matematicas";
        int grado=2;
        
        try (RandomAccessFile archivo = new RandomAccessFile("InformacionAlumnos.txt", "rw")){
            archivo.writeLong(matricula);
            StringBuffer nom = new StringBuffer(nombre);
            nom.setLength(80);
            archivo.writeChars(nom.toString());
            archivo.writeInt(grado);
            StringBuffer mate = new StringBuffer(materia);
            mate.setLength(20);
            archivo.writeChars(mate.toString());
            archivo.seek(0);
        
            System.out.println(archivo.readLong());
        String nomb = "";
        for (int i = 0; i < 80; i++) {
            nomb += archivo.readChar();
        }
        System.out.println(nomb);
        System.out.println(archivo.readInt());
        String mat = "";
        for (int i = 0; i < 20; i++) {
            mat += archivo.readChar();
        }
        System.out.println(mat);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO EJECUTAR CORRECTAMENTE EL ARCHIVO");
        }
}
}
