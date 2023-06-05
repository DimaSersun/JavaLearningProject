package com.Orange.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) {

        File file = new File("src/main/java/com/Orange/filemanagementservice/testOutput.txt");

        FileManager.informIfTheFileExists(file);
        FileManager.createTheFileIfItDoesNotExist(file);
        FileManager.informIfTheFileExists(file);
        FileManager.printIfTheFileIsADirectoryOrNot(file);
        FileManager.printTheFileAbsolutePath(file);
        FileManager.printTheFileName(file);
        FileManager.deleteTheFileIfExists(file);

        String path = "src/main/java/com/Orange/filemanagementservice/testOutput.txt";
        String text1 = "admin";
        String text2 = "1111";

        OutputFileWriterManager.writeContentIntoFileWriter(path, text1);
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(path, text2);

        File fileObject = new File(path);
        InputFileReadManager.printDataFromAFileUsingBufferReader(fileObject);
        InputFileReadManager.printDataFromFileUsingFiles(fileObject);
        InputFileReadManager.printDataFromAFile(fileObject);
    }
}
