# Enter your code here. Read input from STDIN. Print output to STDOUT
from collections import namedtuple

n, Data = int(input()), namedtuple('Data', input())

print(f'{sum([int(Data(*input().split()).MARKS) for _ in range(n)]) / n:.2f}')
