public class Marks {
    public static void main(String[] args) {


                int [] mark = {1,3,5,4,5};
                System.out.print("Oceny: ");
                for (int i=0;i< mark.length;i++) {

                    System.out.print(mark[i]+ ",");

                }
                System.out.println();
                System.out.print("Srednia: ");

                // double s = mark[0]+mark[1]+mark[2]+mark[3]+mark[4];
                double s = 0;
                for (int i=0;i< mark.length;i++){
                    s+=mark[i];
                }
                System.out.println(s/ mark.length);


        System.out.println("-----------------------------");


        int [] mark1 = {3, 4, 4, 4, 4, 3, 3, 5};
        System.out.print("Oceny: ");
        for (int i=0;i< mark1.length;i++) {

            System.out.print(mark1[i]+ ",");

        }
        System.out.println();
        System.out.print("Srednia: ");

        double s1 = 0;
        for (int i=0;i< mark1.length;i++){
            s1+=mark1[i];
        }
        System.out.println(s1/ mark1.length);




            }

        }




