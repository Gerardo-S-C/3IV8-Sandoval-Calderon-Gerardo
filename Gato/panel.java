//aca ira el panel donde se jugara
//el arreglo sera bidimensional

public class panel extends variables{
    //private String[][] x = new String[3][3];
    //private String[][] y = new String[3][3];
    public panel(){}
    //constructor con los atributos de la clase junto a los heredados
    public panel(String[][]y,int num){///mas variables??
        super(num, y);
        //this.y=y;
    }
    public void mostrarPanel(){
        inicializar(y);
        visualizar(y);
    }

    public void inicializar(String[][] y){//clase que hara el registro de matrices
        for(int i=0;i<y.length;i++){
            for(int j=0;j<y[i].length;j++){
                //System.out.println(String.format("coordenada "+i+","+j, y[i][j]));//Ubica la cooredenada del numero ingresado
                y[0][0] = "1"; //Ingresa datos de la matriz
                y[0][1] = "2";
                y[0][2] = "3";
                y[1][0] = "4";
                y[1][1] = "5";
                y[1][2] = "6";
                y[2][0] = "7";
                y[2][1] = "8";
                y[2][2] = "9";
            }
        }
    }
    public void visualizar(String[][] y){
        for (int i=0; i < y.length; i++){
            for (int j=0; j < y[i].length; j++)
                  System.out.print(" [ " + y[i][j]+ " ] ");   
            System.out.println("\n---------------------------");
        }
    }


    //geters y seters
    /*public String[][] getY(){
        return y;
    }
    public void setY(String[][]y){
        this.y=y;
    }
    */
}