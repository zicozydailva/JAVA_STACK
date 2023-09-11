public class logicals {
    public static void main(String[] args) {
        int score = 100;
        int studentScore = 88;

//        BITWISE OPERATOR - AND | OR

//        LOGICAL AND
        if(score > 90 && studentScore > 80) {
            System.out.println("Congrats!!... You did good!");
        }


//        LOGICAL OR
        if(score > 90 || studentScore > 100) {
            System.out.println("Congrats!!... You average bro!");
        }
    }


}
