import java.util.ArrayList;
import java.util.Arrays;
public class ReplaceSpace{
    public void replaceSpace(char[] str, int length){
        int spaceCount = 0;
        for (int i = 0; i< length; i ++){
            if (str[i] == ' '){
                spaceCount++;
            }
        }
        int new_length = length + spaceCount * 2;
        str[new_length]='\0';
        for (int i = length - 1; i >= 0; i--){
             if (str[i] == ' '){
                  str[new_length - 1] = '0';
                  str[new_length - 2] = '2';
                  str[new_length - 3] = '%';
                  new_length = new_length - 3;
             }
             else{
             str[new_length - 1] = str[i];
             new_length = new_length - 1;
             }
        }
    }
    public static void main(String[] args){
        String strs = " Mr Jhon Smith";
      
        char[] strs = strs.toCharArray();
        ArrayList<String> str = new ArrayList<String>();
        for (int i = 0; i < strs.length(); i++){
            str.add(strs[i]);
        }
        int length = str.size();
        System.out.println(length);
        ReplaceSpace rs = new ReplaceSpace();
        rs.replaceSpace(str, length);
        System.out.println(str);
    }
}






import java.util.ArrayList;
import java.util.Arrays;
public class ReplaceSpace{
    public void replaceSpace(ArrayList<String> str, int length){
        int spaceCount = 0;
        for (int i = 0; i< length; i ++){
            if (str.get(i) == ' '){
                spaceCount++;
            }
        }
        int new_length = length + spaceCount * 2;
        for (int i = length - 1; i >= 0; i--){
             if (str.get(i) == ' '){
                  str.set(new_length - 1, '0');
                  str.set(new_length - 2, '2');
                  str.set(new_length - 3, '%');
                  new_length = new_length - 3;
             }
             else{
             str.set(new_length - 1, str[i]);
             new_length = new_length - 1;
             }
        }
    }
    public static void main(String[] args){
        String strs = " Mr Jhon Smith";
      
        
        List<String> str = new ArrayList<String>();
        for (int i = 0; i < strs.length(); i++){
            str.add(strs[i]);
        }
        int length = str.size();
        System.out.println(length);
        ReplaceSpace rs = new ReplaceSpace();
        rs.replaceSpace(str, length);
        System.out.println(str);
    }
}
