import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyFile.help();
        System.out.println("");
        while (true) {
            String[] line = scanner.nextLine().split("\s");
            String command = line[0];
            String path = "";
            if (line.length > 1) path = line[1];
            String permissions = "";
            if (line.length > 2) permissions = line[2];
            if (command.equals("exit")) { 
                scanner.close();
                MyFile.exit();
            }
            else if (command.equals("help")) MyFile.help();
            else if (command.equals("ls")) MyFile.listDirectory(path);
            else if (command.equals("ls_py")) MyFile.listPythonFiles(path);
            else if (command.equals("is_dir")) MyFile.isDirectory(path);
            else if (command.equals("define")) MyFile.define(path);
            else if (command.equals("readmod")) MyFile.printPermissions(path);
            else if (command.equals("setmod")) MyFile.setPermissions(path, permissions);
            else if (command.equals("cat")) MyFile.printContent(path);
            else if (command.equals("append")) MyFile.appendFooter(path);
            else if (command.equals("bc")) MyFile.createBackup(path);
            else if (command.equals("greplong")) MyFile.printLongestWord(path);
            else System.out.println("Вы ввели неправильную команду, воспользуйтесь командой help чтобы ознакомиться с командами");
        }
    }
}