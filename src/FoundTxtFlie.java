import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FoundTxtFlie {
    private String fileName;
    private String url;



    public void setUrl(String url) {
        this.url = url;
    }
    public void found(){
        File file =new File(url);
        String data="" ;

       // String[] fileName = file.list();

       // for (String s : fileName) {
       //     System.out.println(s);
       // }


        File [] files = file.listFiles();
        for(File f:files){
            System.out.println(f.getPath()+"---"+f.getName()+"---"+f.length());
        }

        String TEXT=new String("txt") ;
        System.out.println("其中txt文件有：");

        for (File f:files) {
            String flieName_SE = f.getName();
            String suffix = flieName_SE.substring(flieName_SE.lastIndexOf(".") + 1);


            if (suffix.equals(TEXT)) {
                System.out.println(f.getPath() + "---" + f.getName() + "---" + f.length());
                try {
                    BufferedReader openfile=new BufferedReader(new FileReader(url+'\\'+f.getName()));
                    String content=openfile.readLine();
                    while(content!=null) {
                        data += content;
                        content = openfile.readLine();
                    }
                    System.out.println(data);

                }catch (IOException w){

            }
        }





        }





    }
}
