package Examen;

public class Automovil {
        private int x1, x2, x3, x4, x5,  y1, y2, y3, y4, y5;
    
    
    public Automovil (int x1, int y, int x2, int y2, int x3, int y3, int x24, int y4, int x5, int y5){
        this.x1 = x1;
        this.y1 =y1;
        this.x2 = x2;
        this.y2 =y2;
        this.x3 = x3;
        this.y3 =y3;
        this.x4 = x4;
        this.y4 =y4;
        this.x5 = x5;
        this.y5 =y5;
    }
    
    //Getters
    
    public int getX1 (){
        return x1;
    }
    
    public int getY1(){
        return y1;
    }
    
    public int getX2 (){
        return x2;
    }
    
    public int getY2(){
        return y2;
    }
    
    public int getX3 (){
        return x3;
    }
    
    public int getY3(){
        return y3;
    }
    
    public int getX4 (){
        return x4;
    }
    
    public int getY4(){
        return y4;
    }
    
    public int getX5 (){
        return x5;
    }
    
    public int getY5(){
        return y5;
    }
    
    //Setters
    
    
    public void setX1 (int x){
        this.x1 = x1;
    }
    
    public void setY1 (int y){
        this.y1 = y1;
    }  
    
    public void setX2 (int x){
        this.x2 = x2;
    }
    
    public void setY2 (int y){
        this.y2 = y2;
    }
    
    public void setX3 (int x){
        this.x3 = x3;
    }
    
    public void setY3 (int y){
        this.y3 = y3;
    }
    
    public void setX4 (int x){
        this.x4 = x4;
    }
    
    public void setY4 (int y){
        this.y4 = y4;
    }
    
    public void setX5 (int x){
        this.x5 = x5;
    }
    
    public void setY5 (int y){
        this.y5 = y5;
    }

    public int getSumaX(){
        int suma;
        suma= x1+x2+x3+x4+x5;
        return suma;   
    }
    
    public int getSumaY(){
        int suma;
        suma= y1+y2+y3+y4+y5;
        return suma;   
    }
    
    public String toString(){
        return " ( " + x1 + " , " + y1 + " ) " +"," +" ( " + x2 + " , " + y2 + " ) "+","+ " ( " + x3 + " , " + y3 + " ) "+","+" ( " + x4 + " , " + y4 + " ) "
               +"," +" ( " + x5 + " , " + y5 + " ) ";
    }
}


