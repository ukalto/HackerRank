#!/bin/python3

import sys

n = int(input().strip())
a = list(map(int, input().strip().split(' ')))
# Write Your Code Here
numSwaps = 0
for i in range(0, n):
    for j in range(0, n - 1):
        if a[j] > a[j + 1]:
            save = a[j]
            a[j] = a[j + 1]
            a[j + 1] = save
            numSwaps += 1
first = a[0]
last = a[len(a) - 1]
print(f'Array is sorted in {numSwaps} swaps.')
print(f'First Element: {first}')
print(f'Last Element: {last}')
