public class conditionals {
    public static void main(String[] args) {
        boolean isAlien = false;

//        IF ELSE
        if(isAlien == true) {
            System.out.println("It's an Alein, Run!!!!");
        } else {
            System.out.println("It's not an Alein, Don't Run!!!!");
        }

//        SWITCH

        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, a 4 or a 5");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

//        or


        int switchValue2 = 2;
        switch (switchValue2) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            default -> System.out.println("Value was not 1 or 2");
        }
    }
}
