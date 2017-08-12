class MagicIndexDuplicate{
static int magicFast(int[] array){
    return magicFast(array, 0 ,array.length - 1);
}
static int magicFast(int[] array, int start, int end){
    if (start > end){
        return -1;
    }
    int mid = (start + end ) / 2;
    int midValue = array[mid];
    if (midValue == mid){
        return mid;
    }
    int leftEnd = Math.min(mid - 1, midValue);
    int left =  magicFast(array, start, leftEnd);
    if (left > 0){
        return left;
    }
    int rightStart = Math.max(mid + 1, midValue);
    int right = magicFast(array, rightStart, end);
    return right;
    
}
public static void main(String[] args){
 int[] array = {-10,-5,2,2,2,3,4,7,9,12,13};
 int magic_index = magicFast(array);
 System.out.println(magic_index);
}


}
