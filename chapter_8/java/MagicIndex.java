class MagicIndex{
int magicFast(int[] array){
    return magicFast(array, 0, array.length - 1);
}

int magicFast(int[] array, int start, int end){
    if (end < start){
    return -1;
    }
    int mid = (start + end) / 2;
    
    if (array[mid] == mid){
         return mid;
    }
    else if (array[mid] < mid){
        return magicFast(array, mid + 1, end);
    }else {
        return magicFast(array, start, mid - 1);
    }


}
public static void main(String[] args){
 int[] array = {-40,-20,-1,1,2,3,5,7,9,12,13};
 int magic_index = magicFast(array);
 System.out.println(magic_index);
}

}
