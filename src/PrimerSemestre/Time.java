package PrimerSemestre;

public class Time {
    
    private int hora=0;
    private int minuto=0;
    private int segundo=0;
    
    public void time(){}
    
    public void time(int hr, int min, int seg){
        this.hora=hr;
        this.minuto=min;
        this.segundo=seg;
    }
    
    public void setHora(int hr){
            this.hora=hr;
    }
    
    public void setMinutos(int min){
        if (min<59){
            this.minuto=min;
        }
        else{
            this.minuto=0;
        }
    }
    
    public void setSegundos(int seg){
        if (seg<=59){
            this.segundo=seg;
        }
        else{
            this.segundo=0;
        }
    }
    
    public int gethora(int hr){
        return hr;
    }
    
    public int getminutos(int min){
        return min;
    }
    
    public int getsegundos(int seg){
        return seg;
    }
    
    public String Tiempo(){
        return hora +":"+minuto+":"+segundo;
    }
}
