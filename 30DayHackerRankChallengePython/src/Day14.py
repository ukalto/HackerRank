class Day14:
    def __init__(self, a):
        self.__elements = a

    # Add your code here

    def computeDifference(self):
        self.maximumDifference = max(self.__elements) - min(self.__elements)


# End of Difference class

_ = input()
a = [int(e) for e in input().split(' ')]

d = Day14(a)
d.computeDifference()

print(d.maximumDifference)
