package ua.org.oa.ivanovd.homework6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Администратор on 19.06.2016.
 */
public class FileUtils {

    public static void main(String[] args) {
        FileUtils.commandExecution();
    }

    public static void createFile(String directory, String name){
        File file = new File(directory.concat("\\").concat(name));
        try {
            if (!file.createNewFile()) {
                System.out.println("File with this name already exists.");
            } else {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void deleteFile(String directory, String name){
        File file = new File(directory.concat("\\").concat(name));
        if(file.exists()){
            file.delete();
        } else {
            System.out.print("Can't find this file.");
        }
    }

    public static void renameFile(String directory, String oldName, String newName){
        File file = new File(directory.concat("\\").concat(oldName));
        if(file.exists()){
            file.renameTo(new File(directory.concat("\\").concat(newName)));
        } else {
            System.out.print("Can't find this file.");
        }
    }

    public static void getListOfFiles(String directory){
        File direct = new File(directory);
        String[] files = direct.list();
        if (files.length == 0){
            System.out.print("This folder is empty");
        } else {
            for (String file : files) {
                System.out.println(file);
            }
        }
    }

    public static void commandExecution(){
        System.out.println("Select a command: create, delete, rename, Show all files");
        Scanner sc = new Scanner(System.in);

        String command = null;
        String directory = null;
        String name = null;

        System.out.print("Command: ");
        command = sc.nextLine();

        switch (command) {
            case "create":
                System.out.print("Directory: ");
                directory = sc.nextLine();
                System.out.print("File name: ");
                name = sc.nextLine();
                FileUtils.createFile(directory, name);
                break;
            case "delete":
                System.out.print("Directory: ");
                directory = sc.nextLine();
                System.out.print("File name: ");
                name = sc.nextLine();
                FileUtils.deleteFile(directory, name);
                break;
            case "rename":
                System.out.print("Directory: ");
                directory = sc.nextLine();
                System.out.print("File name: ");
                String oldFileName = sc.nextLine();
                System.out.print("New file name: ");
                String newFileName = sc.nextLine();
                FileUtils.renameFile(directory, oldFileName, newFileName);
                break;
            case "show all files":
                System.out.print("Directory: ");
                directory = sc.nextLine();
                FileUtils.getListOfFiles(directory);
                break;
            default:
                System.err.println("This command isn't available");
                break;
        }

        System.out.print("\nContinue \"yes\" / \"no\": ");
        String isContinue = sc.nextLine();
        if (isContinue.equals("no")){
            System.out.println();
            FileUtils.commandExecution();
        }
        sc.close();
    }
}
