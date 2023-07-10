package sample0710;

public class Sample305 {

    public static void main(String[] args) {

        int dice = (int) (Math.random() * 8) + 1;
        System.out.println(dice);
        switch (dice) {
            case 7:
            case 8:
                System.out.println("範囲外");
                break;

            case 2:
            case 4:
            case 6:
                System.out.println("丁");
                break;

            default:
                System.out.println("半");
        }
    }
}
