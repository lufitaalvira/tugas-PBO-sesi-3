public class Looping {
    public static void main(String[] args) throws Exception {
        for(int i=0; i<7; i++){
            System.out.println("saya semangat belajar java");
        }
        
        int angka = 1;
        for (int i=0; i<6; i++){
            System.out.print(angka+" ");
            angka = angka + 2;
        }

        int Angka0 = 9;
        for (int i=0; i<6; i++) {
            System.out.print(Angka0+" ");
            Angka0 = Angka0 - 3;
        }

        for(int i=1; i<5; i++){
            System.out.println(" 4 * " + i + " = " + (4 * i));
        }
    }
}

class Main {
    public static void main(String[] args) {
        int star = 20;
        int base = 99;
        int loop = 5;
         
        for(int i = star; i <= loop; i++){
            System.out.println(base + " * " + i + " = " + (base * i));  
        }
    }   
}