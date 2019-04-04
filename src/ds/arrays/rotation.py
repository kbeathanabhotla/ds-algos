from algos.searching import binary_search


def array_rotate(arr, n):
    """

    This method would rotate the array by breaking down the array into two pieces
    1. The rotated part
    2. The remaining part

    Then an array would be reconstructed using these two parts.

    Space complexity = O(n)
    Time complexity = O(1)

    :param arr: The array to rotate
    :param n: number of rotation positions
    :return: rotated array
    """
    if len(arr) == 0 or n == 0 or len(arr) == n:
        return arr

    if len(arr) > n:
        ret = []

        ret.extend(arr[len(arr) - n:])
        ret.extend(arr[:len(arr) - n])

        return ret
    else:
        n = n % len(arr)
        return array_rotate(arr, n)


def array_rotate_test():
    assert array_rotate([1, 2, 3, 4, 5, 6], 3) == [4, 5, 6, 1, 2, 3]
    assert array_rotate([1, 2], 3) == [2, 1]
    assert array_rotate([1, 2], 0) == [1, 2]
    assert array_rotate([1], 3) == [1]
    assert array_rotate([], 3) == []


def reverse_array_2(arr, start, end):
    """
    A method to reverse an array within the given start and end ranges

    Space complexity = O(1)
    Time complexity = O(n)/2

    :param arr: The array to reverse
    :param start: The start index within array to reverse
    :param end: The end index within array to reverse
    :return: reversed array
    """
    while start < end:
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        start += 1
        end -= 1

    return arr


def reverse_array(arr):
    """
    A simple method to reverse an array.

    Space complexity = O(1)
    Time complexity = O(n)/2

    :param arr: The array to reverse
    :return: reversed array

    """
    return reverse_array_2(arr, 0, len(arr) - 1)


def array_reverse_test():
    assert reverse_array([1, 2, 3, 4, 5]) == [5, 4, 3, 2, 1]
    assert reverse_array([5]) == [5]
    assert reverse_array([]) == []


def array_rotate_reversal_technique(arr, n):
    """
    This method uses the technique of reversal to rotate the array.

    Approach:
    1. reverse(arr[0:n-1])
    2. reverse(arr[n:])
    3. reverse(arr)

    Space Complexity = O(1)
    Time Complexity = O(n)

    :param arr: The array to rotate
    :param n: number of rotation positions
    :return: rotated array
    """
    if len(arr) == 0 or n == 0:
        return arr

    if n > len(arr):
        n = n % len(arr)

    return reverse_array_2(reverse_array_2(reverse_array_2(arr, n, len(arr) - 1), 0, n - 1), 0, len(arr) - 1)


def array_rotate_reversal_technique_test():
    assert array_rotate_reversal_technique([1, 2, 3, 4, 5, 6], 3) == [4, 5, 6, 1, 2, 3]
    assert array_rotate_reversal_technique([1, 2], 3) == [2, 1]
    assert array_rotate_reversal_technique([1, 2], 0) == [1, 2]
    assert array_rotate_reversal_technique([1], 3) == [1]
    assert array_rotate_reversal_technique([], 3) == []


def search_elem_in_sorted_rotated_array(arr, elem):
    """
    This method would search for an element in an array which is sorted and rotated

    :param arr: A sorted rotated array
    :param elem: The elem to look out for
    :return: the index at which the element is found, -1 if not found
    """
    pass


def search_elem_in_sorted_rotated_array_test():
    assert search_elem_in_sorted_rotated_array([], 3)


if __name__ == '__main__':
    array_rotate_reversal_technique_test()
