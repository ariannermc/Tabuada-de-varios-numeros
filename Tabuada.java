public class Tabuada {
    public static void tabuada(){
        for(int i = 2; i <= 10; i++){
            System.out.println("\nTabuada de " + i);
            for(int j = 1; j <= 10; j++){
                System.out.println(i + "x"+ j + "=" + (i * j));
            }
        }
    }

    public static void main(String[] args) {
        tabuada();
    }
}