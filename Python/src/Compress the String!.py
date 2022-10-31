# Enter your code here. Read input from STDIN. Print output to STDOUT

s = list(input())
c = 1
l = []
for i in range(len(s)):
    if i + 1 < len(s) and s[i] == s[i + 1]:
        c += 1
    else:
        l.append(f'({c}, {s[i]})')
        c = 1
print(' '.join(l))
