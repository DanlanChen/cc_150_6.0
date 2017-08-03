def isUniqueChars( s):
    if len(s) > 128:
        return False
    char_set = [False]*128
    for char in s:
        char_ascii = ord(char)
        if char_set[char_ascii]:
             return False
        char_set[char_ascii] = True
    return True
     
if __name__ == '__main__':
     s = 'abbbb'
     print(s)
    # unique = UniqueChars()
     b = isUniqueChars(s)
     print (b)
