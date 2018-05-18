import java.io.*;
import java.nio.file.Files;
import java.util.function.IntPredicate;


public class CopyFlie {
    private String newurl;
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNewurl(String newurl) {
        this.newurl = newurl;
    }


    public void copyfile() {

        File oldfile = new File(url);
        File newfile = new File(newurl);

        try {
            Files.copy(oldfile.toPath(), newfile.toPath());
        } catch (IOException e) {

        }


    }
}