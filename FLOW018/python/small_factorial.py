#!/bin/env python

import sys


def factorial(n):
    '''Return the factorial value of the parameter n. '''
    fact = 1
    # range(4, 1, -1) = [4, 3, 2]
    for x in range(n, 1, -1):
        fact *= x
    return fact

lines = sys.stdin.readline()

for x in range(0, int(lines)):
    line = sys.stdin.readline()
    print(factorial(int(line)))
