import java.util.*;
class Subsets{
static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index){
  ArrayList<ArrayList<Integer>> allSubsets;
  if(set.size() == index){
    allSubsets = new ArrayList<ArrayList<Integer>>();
    allSubsets.add(new ArrayList<Integer>());
  }else{
    allSubsets = getSubsets(set, index + 1);
    int item = set.get(index);
    ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
    for (ArrayList<Integer> subset : allSubsets){
      ArrayList<Integer> newsubset =  new ArrayList<Integer>();
      newsubset.addAll(subset);
      newsubset.add(item);
      moresubsets.add(newsubset);
    }
    allSubsets.addAll(moresubsets);
  }
  return allSubsets;
  }
  
  public static void main(String []args){
  ArrayList<Integer> set = new ArrayList<Integer>(Arrays.asList(1,2,3));
  ArrayList<ArrayList<Integer>> subsets = getSubsets(set,3);
  System.out.println(subsets);
  }
}
