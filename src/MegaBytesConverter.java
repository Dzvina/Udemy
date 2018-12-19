public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        int YY;
        int ZZ;

        if (kiloBytes<0){
            System.out.println("Invalid Value");
        } else {
            YY = kiloBytes / 1024;
            ZZ = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + YY + " MB and " + ZZ + "KB");
        }
    }

}
