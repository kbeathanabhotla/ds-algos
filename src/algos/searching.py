def binary_search_2(arr, elem, start, end):
    """

    A method to perform binary search on a sorted array.

    :param arr: The array to search
    :param elem: The element to search
    :param start: start position from where to start searching
    :param end: start position till where to search
    :return: The index at which the element is found, -1 if not found
    """
    if start <= end:
        mid = int((start + end) / 2)

        if arr[mid] == elem:
            return mid
        elif elem < arr[mid]:
            return binary_search_2(arr, elem, start, mid - 1)
        else:
            return binary_search_2(arr, elem, mid + 1, end)
    else:
        return -1


def binary_search(arr, elem):
    """

    This method would search for an element in a sorted array using binary search.

    Space complexity = O(1)
    Time complexity = O(log n)

    :param arr: The array to search
    :param elem: The elemtn to search for
    :return: The index at which the element is found, -1 if not found
    """

    if len(arr) == 0:
        return -1

    return binary_search_2(arr, elem, 0, len(arr) - 1)


def binary_search_test():
    assert binary_search([1, 2, 3, 4, 5, 6], 4) == 3
    assert binary_search([1, 2, 3, 4, 5, 6], 20) == -1
    assert binary_search([1], 1) == 0
    assert binary_search([], 1) == -1


if __name__ == '__main__':
    binary_search_test()
