import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("实验七");
        Scanner scanner =new Scanner(System.in);
        int i=scanner.nextInt();

        if (i==1){
            CopyFlie copyFlie = new CopyFlie();
            copyFlie.setUrl(scanner.next());
            copyFlie.setNewurl(scanner.next());
            copyFlie.copyfile();

        }
        if(i==2){
            FoundTxtFlie foundTxtFlie = new FoundTxtFlie();
            foundTxtFlie.setUrl(scanner.next());
            foundTxtFlie.found();



        }

    }
}
