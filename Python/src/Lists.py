if __name__ == '__main__':
    N = int(input())
    arr = []
    input1 = []
    for _ in range(N):
        call = input().split()
        if call[0] == "insert":
            index = int(call[1])
            number = int(call[2])
            arr.insert(index, number)
        elif call[0] == "print":
            print(arr)
        elif call[0] == "remove":
            arr.remove(int(call[1]))
        elif call[0] == "append":
            arr.append(int(call[1]))
        elif call[0] == "sort":
            arr.sort()
        elif call[0] == "pop":
            arr.pop()
        elif call[0] == "reverse":
            arr.reverse()
