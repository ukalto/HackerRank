# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import product

l1 = list(input().split(' '))
l2 = list(input().split(' '))
print(' '.join(['(' + ', '.join(x) + ')' for x in list(product(l1, l2))]))
