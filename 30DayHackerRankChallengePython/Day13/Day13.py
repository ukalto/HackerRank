from abc import ABCMeta, abstractmethod


class Book(object, metaclass=ABCMeta):
    def __init__(self, title, author):
        self.title = title
        self.author = author

    @abstractmethod
    def display(self): pass


# Write MyBook class
class Day13(Book):
    price = 0

    def __init__(self, title, author, price):
        super(Day13, self).__init__(title, author)
        self.price = price

    def display(self):
        print("Title: " + title)
        print("Author: " + author)
        print("Price: " + str(price))


title = input()
author = input()
price = int(input())
new_novel = Day13(title, author, price)
new_novel.display()
