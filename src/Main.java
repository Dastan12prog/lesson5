//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array = {3, 54, 22, -2, 0 , 3, 15, -10, 28};

        int pos = 0;
        int neg = 0;

        for(int i= 0; i <= array.length; i++){

            if(i % 2 == 0){
                pos += 1;
            }
            else if(i < 0){
                neg += 1;
            }
        }
        int[] list = {array.length};

        System.out.println("Положительных чисел " + list[pos]);
        System.out.println("Отрицательные чисел " + list[neg]);
    }
}