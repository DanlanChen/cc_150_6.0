public class PermutationString{
   public boolean permutations(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        int[] letters = new int[128];
        char[] s_array = s.toCharArray();
        for (char c : s_array){
            letters[c]++;
        }
        for (int i = 0; i < t.length(); i++){
            int c = t.charAt(i);
            letters[c]--;
            if (letters[c] < 0){
                return false;
            }
        
        }
        return true;
   }



    public static void main(String[] args){
        String s = "oogg";
        String t = "gooa";
        PermutationString ps = new PermutationString();
        boolean b = ps.permutations(s,t);
        System.out.println(b);
    }
}
