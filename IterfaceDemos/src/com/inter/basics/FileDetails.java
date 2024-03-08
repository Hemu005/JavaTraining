package com.inter.basics;

public class FileDetails {
    public static void main(String[] args) {
        ICompressor compressor=new ZipCompressor();
        System.out.println("From Zip File:");
        String[] zip=compressor.compressFiles("Boss","KGF");
        for (String z:zip){
            System.out.println(z);
        }

        System.out.println();

        compressor=new JarCompressor();
        System.out.println("From Jar File:");
        String[] jar=compressor.compressFiles("Kantara","KTM");
        for (String j:jar){
            System.out.println(j);
        }
    }
}
