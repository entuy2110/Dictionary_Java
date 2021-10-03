import java.io.DataInputStream;
import java.io.FileInputStream;

public class Dictionary {
    public static DictionaryManagement[] words;
    Word[] words = new Word[100000];
    FileInputStream fis = new FileInputStream("dictionaries.txt");
    DataInputStream dis = new DataInputStream(fis);
    // ..................................
}
