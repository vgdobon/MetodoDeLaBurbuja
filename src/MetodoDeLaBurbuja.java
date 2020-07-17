import java.util.Random;

public class MetodoDeLaBurbuja {
    int aux;
    int [] arrayInt;
    int tamaño;

    public MetodoDeLaBurbuja(int tamaño){
        arrayInt = new int[tamaño];
    }

    public void rellenar(){
        for (int i = 0; i <arrayInt.length ; i++) {
            arrayInt[i]= new Random().nextInt(1000);
        }
    }

    public void sort(){
        for (int i = 1; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt.length-i ; j++) {
                if(arrayInt[j]>arrayInt[j+1]){
                    aux = arrayInt[j];
                    arrayInt[j]=arrayInt[j+1];
                    arrayInt[j+1]=aux;
                }
            }
        }
    }

    public void dibujar(){
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i]+",");
        }

    }

    public String toString(){
        return "El array ahora es"+arrayInt;
    }
}
