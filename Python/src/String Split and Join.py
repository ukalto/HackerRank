def split_and_join(line):
    arr = line.split()
    return "-".join(arr)


if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
