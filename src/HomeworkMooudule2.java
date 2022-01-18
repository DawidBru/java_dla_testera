public class HomeworkMooudule2 {
    public static void main(String[] args) {
        int num1 = 3242;
        int num2 = 543;
        int num3 = 12;
        int num4 = 864;

        int num12 = num1 + num2;

        if (num12 % 2 == 0){
            System.out.println("suma liczb 1 i 2 jest liczbą parzystą");
        } else {
            System.out.println("suma liczb 1 i 2 jest liczbą nieparzystą");
        }

        int num34 = num3 + num4;

        if (num34 % 2 ==0){
            System.out.println("suma liczb 3 i 4 jest liczbą parzystą");
        } else {
            System.out.println("suma liczb 3 i 4 jest liczbą nieparzystą");
        }

        int num1234 = num12 + num34;

        if (num1234 % 2 ==0){
            System.out.println("suma liczb 1, 2, 3 i 4 jest liczbą parzystą");
        } else {
            System.out.println("suma liczb 1, 2, 3 i 4  jest liczbą nieparzystą");
        }
    }
}
