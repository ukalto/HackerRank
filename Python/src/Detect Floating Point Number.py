# Enter your code here. Read input from STDIN. Print output to STDOUT
import re

if __name__ == '__main__':
    n = int(input())
    regex = r'[-+]?[0-9]*[.][0-9]+$'
    for i in range(n):
        print(bool(re.match(regex, input())))
