import numpy as np
import matplotlib.pyplot as plt


def binnomial_coff(n, k):
    result = 1
    for x in range(k+1,n+1):
        result = result*x

    dom = 1
    for x in range(1, (n-k)+1):
        dom = dom*x
    result = result/dom
    return result


def compute_binomial(n, k, tetha):
    result = binnomial_coff(n,k)
    result = result*(pow(tetha, k))*(pow(tetha,(n-k)))
    return result

n = 10
tetha = [0.25, 0.9]
for value in tetha:
    arr = []
    for k in range(n+1):
        result = (compute_binomial(n,k,value))
        arr.append(result)
    plt.plot(arr)
    plt.title("With thetha %f"% value)
    plt.show()

