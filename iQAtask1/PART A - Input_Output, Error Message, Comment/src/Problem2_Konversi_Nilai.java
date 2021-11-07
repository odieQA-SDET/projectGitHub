public class Problem2_Konversi_Nilai {
    public static void main(String[] args) {
        // input
        int studentScore = -1;
// Process: Your Solution Code Here
        if ((studentScore >= 80) && (studentScore <= 100)) {
            System.out.println("SELAMAT ANDA KEREN: A");
        } else {
            if ((studentScore >= 65) && (studentScore <= 79)) {
                System.out.println("SELAMAT ANDA HEBAT: B+");
            } else { if ((studentScore >= 50) && (studentScore <= 64)) {
                    System.out.println("SELAMAT ANDA CUKUP HEBAT: B");
                } else { if ((studentScore >= 35) && (studentScore <= 49)) {
                        System.out.println("WALAH ANDA DAPAT: C");
                    } else { if ((studentScore >= 0) && (studentScore <= 34)) {
                            System.out.println("ASYEEM ANDA DAPAT: D");
                    } else { if ((studentScore != 0) && (studentScore != 100)) {
                        System.out.println("SELAMAT ANDA SIAP AJA JADI BEGO KALAU KAYA GINI MAH: invalid " +studentScore);
                        }
// Nilai A
                        }
                    }
                }
            }
        }
    }
}

