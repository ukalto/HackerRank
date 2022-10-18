if __name__ == '__main__':
    n = int(input())
    integer_list = list(map(int, input().split()))
    my_tupel = ()
    for i in integer_list:
        my_tupel = my_tupel + (i,)
    print(hash(my_tupel))
