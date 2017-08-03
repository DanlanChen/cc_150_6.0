public class ReplaceSpace{
    public void replaceSpace(char[] str, int length){
        int spaceCount = 0;
        for (int i = 0; i< length; i ++){
            if (str[i] == ' '){
                spaceCount++;
            }
        }
        int new_length = length + spaceCount * 2;
        //str[new_length]='\0';
        char [] charsNew = new char [new_length];
        for (int i = length - 1; i >= 0; i--){
             if (str[i] == ' '){
                  charsNew[new_length - 1] = '0';
                  charsNew[new_length - 2] = '2';
                  charsNew[new_length - 3] = '%';
                  new_length = new_length - 3;
             }
             else{
             charsNew[new_length - 1] = str[i];
             new_length = new_length - 1;
             }
        }
        System.out.println(charsNew);
    }
    public static void main(String[] args){
        String strs = "Mr Jhon Smith";
        char[] str = strs.toCharArray();
        
        int length = str.length;
        System.out.println(length);
        ReplaceSpace rs = new ReplaceSpace();
        rs.replaceSpace(str, length);
        System.out.println(str);
    }
}
