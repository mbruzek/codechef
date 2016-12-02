#!/bin/env python

import sys


def largest_sum(triangle):
    """Return the largest sum of numbers on a path starting from the top
    towards the base. A path is defined where the next number is located on the
    row below, either directly below or below and one place to the right.
    """
    size = len(triangle)
    # Loop backwards starting at the second to last row going to zero.
    for a in range(size - 2, -1, -1):
        # Loop through all the elements on the current row.
        for b in range(0, len(triangle[a])):
            # Is the largest element below this one or below and to the right?
            if triangle[a + 1][b] >= triangle[a + 1][b + 1]:
                triangle[a][b] += triangle[a + 1][b]
            else:
                triangle[a][b] += triangle[a + 1][b + 1]
    # The top element has the largest sum.
    return triangle[0][0]


def main():
    """Read in the number of test cases and then read in each triangle line by
    line, print out the largest sum path for each triangle."""
    # Read the number of test cases.
    test_cases = int(sys.stdin.readline())
    for a in range(0, test_cases):
        # Read the number of lines in the triangle.
        lines = int(sys.stdin.readline())
        triangle = []
        for b in range(0, lines):
            # Read each line for the triangle.
            line = sys.stdin.readline()
            # Convert the line of space separated strings to integers.
            triangle.append([int(a) for a in line.split()])
        # Print the largest sum path on the triangle.
        print(largest_sum(triangle))


if __name__ == '__main__':
    main()
