package com.example.demo.filesearch;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class FileSearchUtility {


    public static String searchFileBFS(String startPath, String targetFileName) {
        Queue<File> queue = new LinkedList<>();
        File startDir = new File(startPath);

        if (!startDir.exists() || !startDir.isDirectory()) {
            System.out.println("Invalid start path or it is not a directory.");
            return null;
        }

        queue.add(startDir);

        while (!queue.isEmpty()) {
            File current = queue.poll();

            File[] files = current.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().equals(targetFileName)) {
                        return file.getAbsolutePath();
                    }

                    if (file.isDirectory()) {
                        queue.add(file);
                    }
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String startPath = "C:/example/start";
        String targetFileName = "targetFile.txt";
        String result = searchFileBFS(startPath, targetFileName);

        if (result != null) {
            System.out.println("File found at: " + result);
        } else {
            System.out.println("File not found.");
        }
    }
}
