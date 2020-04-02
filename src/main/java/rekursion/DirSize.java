package rekursion;

import java.io.File;

public class DirSize {
    public static void main(String[] args) {
        File dir = new File("src");
        if(!dir.exists()){
            System.err.println(dir + "not exists! Abort.");
            return;
        }

        long dirSize = readDir(dir, 0);

        System.out.println(dirSize/1024d + " kB -> " + dirSize/1024d/1000 + " Mb");
    }

    private static long readDir(File dir, long l) {
        System.out.println("reading directory " + dir.toString());
        File[] files = dir.listFiles();
        for(File file:files){
            if(file.isDirectory()){
               l += readDir(file,l);
            }else{
                if(file.exists()){
                    long fileSize = file.length();
                    System.out.println("\t "+ file.toString() + " -> " + fileSize + "b  ->" + fileSize/1024d + " kB" )  ;
                    l += fileSize;
                }
            }
        }

        return l;
    }
}
