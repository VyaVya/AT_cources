/**
 * Created by Vladyslav_Yakymenko on 5/18/2016.
 */
public class Test_homework1 {

    public static void main(String[] args) {
        LoopBuilder();
    }

    /**
     * Print array of 7 elements by replacing in each next line * by the next umber starting from 1.
     */
    static void LoopBuilder() {

        int x;
        int y;
        int z;

        for (x = 1; x <= 7; x++){
            for (y=1; y<=x; y++){
                System.out.print(y);
            }
            for (z=7-x; z >= 1; z--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

