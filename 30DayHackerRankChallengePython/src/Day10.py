#!/bin/python3

import math
import os
import random
import re
import sys

if __name__ == '__main__':
    # n = int(input())
    # Solution 1
    # count = 0
    # while n != 0:
    #     n = (n & (n << 1))
    #     count = count + 1
    # print(count)
    # Solution 2
    print(len(max(bin(int(input()))[2:].split('0'))))
