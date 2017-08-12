def magicFast(array):
     return help(array, 0, len(array) - 1)
def help(array, start, end):
     if start > end:
          return -1
     mid = (start + end) / 2
     midValue = array[mid]
     if midValue == mid:
          return mid
     leftEnd = min(mid - 1, midValue)
     left =  help(array, start, leftEnd)
     if left> 0:
          return left
     rightStart = max(mid + 1, midValue)
     right =  help(array, rightStart, end)
     return right
if __name__ == '__main__':
    array = [-10,-5,2,2,2,3,4,7,9,12,13]
    magicIndex = magicFast(array)
    print magicIndex
