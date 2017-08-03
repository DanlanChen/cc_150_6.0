def replaceSpace(s,length):
    spaceCount = 0
    for c in s:
        if c == ' ':
            spaceCount += 1
    newLength = length + 2 * spaceCount
    new_array = [0]*newLength
    for i in reversed(xrange(len(s))):
        if s[i] == ' ':
             new_array[newLength - 1] = '0'
             new_array[newLength - 2] = '2'
             new_array[newLength - 3] = '%'
             newLength -= 3
        else:
             new_array[newLength - 1] = s[i]
             newLength -= 1
    return new_array
if __name__ == '__main__':
     s = 'john loves sam'
     length = len(s)
     new_array = replaceSpace(s,length)
     print ''.join(new_array)
    
