# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import Counter

x = int(input())
shoes = Counter(input().split())
n = int(input())
total = 0

for i in range(n):
    buyer = input().split()
    if buyer[0] in shoes and shoes[buyer[0]] > 0:
        total += int(buyer[1])
        shoes[buyer[0]] = shoes[buyer[0]] - 1
print(total)
