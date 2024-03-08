package com.inter.basics;

public class JarCompressor implements ICompressor {
    @Override
    public String[] compressFiles(String file1, String file2) {
        String[] jarFiles=new String[2];
        jarFiles[0]=file1;
        jarFiles[1]=file2;
        return jarFiles;
    }
}
