def permutation(s,t):
    if len(s) != len(s):
        return False
    letters = [0] * 128
    for char in s:
        c = ord(char)
        letters[c] += 1
    for char in t:
        c = ord(char)
        letters[c] -= 1
        if letters[c] < 0:
            return False
    return True
if __name__ == '__main__':
     s = 'dogg'
     t = 'aras'
     b = permutation(s,t)
     print b
