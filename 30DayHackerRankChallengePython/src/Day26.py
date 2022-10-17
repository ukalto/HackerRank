rd, rm, ry = [int(x) for x in input().split(' ')]
dd, dm, dy = [int(x) for x in input().split(' ')]

if (ry, rm, rd) <= (dy, dm, dd):
    print(0)
elif (ry, rm) == (dy, dm):
    print((rd - dd) * 15)
elif ry == dy:
    print((rm - dm) * 500)
else:
    print(10000)
