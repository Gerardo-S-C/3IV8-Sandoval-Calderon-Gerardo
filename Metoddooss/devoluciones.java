//esta clase la caracteriza las devoluciones del libro prestado
//al igual que indica si hay para devolver o no (reciclar codigo porque no ando muy seguro de como funcione esto de las herencias jjjj)

public class devoluciones extends libros{
    private int y;
    private int numal2 = (int) (Math.random()*0+1);
    public devoluciones(){
    }
    //constructor con los atributos de la clase junto a los heredados
    public devoluciones(String titulo, String autor, int libro, int prestados, int y, int numal2){///mas variables??
        super(titulo, autor, libro, prestados);
        this.y=y;
        this.numal2=numal2;
    }
    
    public void mostrarDevoluciones(){
        if (getNumal2()==0){
            System.out.println("Puedes devolver el/los libros :^) ("+getNumal2()+")");
        }
        else if (getNumal2()==1){
            System.out.println("No hay para devolver, puedes pedir uno si gustas o si no tambien es valido\n haz lo que quieras, solo quiero recibir mi paga en forma de calificaciones ;-; ("+getNumal2()+")");
        }
    }
    
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getNumal2(){
        return numal2;
    }
    public void setNumal2(int numal2){
        this.numal2=numal2;
    }
}
