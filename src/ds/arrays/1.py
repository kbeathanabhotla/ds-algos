def array_rotate(arr, n):
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




if __name__ == '__main__':
    array_rotate_test()
