# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
phoneBook = dict(input().split() for _ in range(n))

while True:
    try:
        name = input()
        if name in phoneBook:
            print('%s=%s' % (name, phoneBook[name]))
        else:
            print('Not found')
    except:
        break
