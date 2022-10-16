#!/bin/python3

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))
    # Solution 1
    # maxSum = -sys.maxsize - 1
    # filterArr = [[1, 1, 1], [0, 1, 0], [1, 1, 1]]
    # for i in range(len(arr) - len(filterArr) + 1):
    #     for j in range(len(arr[0]) - len(filterArr[0]) + 1):
    #         currentSum = 0
    #         for y in range(len(filterArr)):
    #             for x in range(len(filterArr[0])):
    #                 currentSum += (arr[i + y][j + x] * filterArr[y][x])
    #         if maxSum < currentSum:
    #             maxSum = currentSum
    # print(maxSum)
    # Solution 2
    curr = []
    for y in range(0, 4):
        for x in range(0, 4):
            summ = sum(arr[x][y:y + 3]) + arr[x + 1][y + 1] + sum(arr[x + 2][y:y + 3])
            curr.append(summ)
    print(max(curr))
