# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import combinations

word, c = input().split()
word = sorted(word)

for i in range(1, int(c) + 1):
    combs = sorted(list(map("".join, combinations(word, i))))
    for comb in combs:
        print(comb)
