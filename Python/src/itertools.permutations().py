# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import permutations

inp = list(input().split(' '))
print(''.join([''.join(x) + '\n' for x in sorted(list(permutations(inp[0], int(inp[1]))))]))
