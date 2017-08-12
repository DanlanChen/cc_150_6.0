def magicFast(array):
    return help(array, 0, len(array) -1 )
def help(array, start, end):
    if start > end:
         return -1
    mid = (start + end) / 2
    if array[mid] == mid:
          return mid
    elif  array[mid]  < mid:
        return help(array, mid+1 , end)
    else:
        return help(array, start, mid - 1)
if __name__ == '__main__':
     array = [-40, -20, -1,1,2,4,5,7,9,12,13]
     magic_index = magicFast(array)
     print magic_index
