public class zaidan7{


        public static void main(String[] args) {
        int charecter = 65;
        boolean chek = false, chek2 = false;
        char name[] = new char[] {'A','B','O','D'};
        for (int i=0; i<6; i++) {

                for (int j = 0; j < 9; j++) {

                        if (i == 1 && j == 2 || chek2) {
                                System.out.print((char) charecter++ + " ");
                                chek2 = true;
                                if (j == 5) chek2 = false;
                        } else if (i == 3 && j == 2 || chek) {

                                System.out.print(name[j - 2] + " ");
                                chek = true;
                                if (j == 5) chek = false;
                        } else
                                System.out.print("+ ");
                }
                System.out.print("\n");
        }
        }
        }

