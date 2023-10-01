package WRI;

public class av {
    public static void main(String[] args) {
        for (int i = 0; i < 17; i++) {
            for (int a = 0; a < 65; a++) {
                if (i == 0 || i == 4 || i == 10 || i == 16) {
                    System.out.print("=");
                } else if ((((i >= 1 && i <= 17) && i != 2 && i != 7 && i != 13)
                        && (a == 0 || a == 64))
                        || ((i == 2 && (a == 0 || a == 60))
                                || (i == 7 && (a == 0 || a == 6 || a == 18 || a == 20 || a == 26 || a == 41))
                                || (i == 13 && (a == 0 || a == 6 || a == 59)))
                        || (((i >= 4 && i <= 10) && i != 7 && i != 13)
                                && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))
                        || ((i >= 11 && i <= 16) && a == 6)) {
                    System.out.print("|");
                } else if (i == 2 && a == 30) {
                    System.out.print("NILAI");
                } else if (i == 7 && a == 3) {
                    System.out.print("1");
                } else if (i == 7 && a == 8) {
                    System.out.print("MASUKKAN NILAI");
                } else if (i == 7 && a == 23) {
                    System.out.print("2");
                } else if (i == 7 && a == 28) {
                    System.out.print("LIHAT NILAI");
                } else if (i == 13 && a == 3) {
                    System.out.print("3");
                } else if (i == 13 && a == 29) {
                    System.out.print("KELUAR");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
