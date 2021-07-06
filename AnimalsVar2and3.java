package pavelmykhailutsa;

public class AnimalsVar2and3 {
    public static void main(String[] args) {
        int cow = 4;
        int cowLeg = 4;
        int chickenLeg = 2;

        for (int chicken = 1; chicken < 5; chicken++) {
            String chickenString = " Курица";
            String cowString = " Корова";

            if (chicken > 1) {
                chickenString = " Курицы";
            }
            if (cow > 1) {
                cowString = " Коровы";
            }
            System.out.println("У нас есть: " + chicken + chickenString + " и " + cow-- + cowString + "Количество ног = " + (cow*cowLeg*chicken*chickenLeg));
        }
    }
}
