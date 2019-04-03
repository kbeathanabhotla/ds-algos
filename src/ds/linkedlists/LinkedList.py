
class LinkedList:
    def __init__(self):
        self.head = self.get_sentinal()
        self.tail = self.get_sentinal()

        self.head.next = self.tail

    def get_sentinal(self):
        return Node(None, None, None)


class Node:
    def __init__(self, prev, data, next):
        self.prev = prev
        self.data = data
        self.next = next
