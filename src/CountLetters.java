public class CountLetters {
    public static void main(String[] args) {
        char[] letter = {'z', 'A', 'F', 'v', 'a', 'B', 'a'};

        int sumaA = 0;
        for (int i = 0; i < letter.length; i++)
            if (letter[i] == 'A') {
                sumaA++;
                System.out.println("Liter 'A' jest: " + sumaA);
            }
        int sumaa = 0;
        for (int i = 0; i < letter.length; i++)
            if (letter[i] == 'a')
                sumaa++;
        System.out.println("Liter 'a' jest: " + sumaa);


    }


}