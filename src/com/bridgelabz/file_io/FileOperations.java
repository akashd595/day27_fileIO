package com.bridgelabz.file_io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperations {//E:\

    public static void main(String[] args) {
        try {

            File file = new File("E:\\aug08.txt");
            file.createNewFile();

            System.out.println("file exists or not : "+file.exists());

            file.delete();
            System.out.println("file exists or not : "+file.exists());

            File file1 = new File("E:\\aug08\\");

            file1.mkdir();

            Files.list(Path.of("E:\\RFP-Batch\\")).filter(Files::isRegularFile).forEach(System.out::println);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
