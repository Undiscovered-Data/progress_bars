import java.io.*;

class JavaBar {
    public static void main(String[] args) {
        Writer o = new PrintWriter(System.out);

        System.out.println("\n  ***            Percent Complete                ***");
        System.out.println("  |                                                |");
        System.out.println("  0%                    50%                     100%");
        System.out.println("  |                                                |");
        System.out.print("  ");

        for (int i = 0; i < 50; i++) {
            try {
                o.append("*");
                o.flush();
                try {
                    Thread.sleep(100);
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }
            catch (IOException e) {
                System.out.println(e);
            }

        }
        System.out.println("\n");

    }
}
