def print_formatted(number):
    l = len(bin(number)[2:])
    for d in range(1, number + 1):
        o = oct(d)[2:]
        h = hex(d)[2:].upper()
        b = bin(d)[2:]
        print(str(d).rjust(l), o.rjust(l), h.rjust(l), b.rjust(l))


if __name__ == '__main__':
    n = int(input())
    print_formatted(n)
