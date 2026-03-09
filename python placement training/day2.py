# max and min

# arr = list(map(int, input().split()))

# take inpts from user, when input is 0, stop
# print sum of all numbers


# s= 0
# while True:
#     n =int(input())
#     if  n==0:
#         print(s)
#         break
#     s+=n


## reverse a array/list

# ls = list(map(int,input().split()))
# start = 0
# end = len(ls)-1

# while start < end :
#     ls[start], ls[end] = ls[end], ls[start]
#     start+=1
#     end-=1

# print(ls)
    

## palindrome using string:

# s = str(input())

# start= 0
# end= len(s)-1

# while start < end:
#     if s[start] != s[end]:
#         print("not a palindrome")
#         break

#     start+=1
#     end-=1
# else:
#     print("is palindrome")
    


## palindorme using list:

# ls = list(map(int,input().split()))

# start= 0
# end= len(ls)-1

# while start < end:
#     if ls[start] != ls[end]:
#         print("not a palindrome")
#         break

#     start+=1
#     end-=1
# else:
#     print("is palindrome")


## reversed conditin:
# ls = list(map(int,input().split()))

# start= 0
# end= len(ls)-1

# while start < end:
#     if ls[start] == ls[end]:
#         print("is a palindrome")
#         break

#     start+=1
#     end-=1
# else:
#     print("not a palindrome")


# #set is writteen within {} they dont print duplicate values
# Set ={ 1,2,3,4,1,2}
# print(Set)


# dictionary:
# d = {
#     "name": "shivani",
#     "age":13
# }
# d["city"]= "mumbai"
# ls = d.values()
#keys= d.keys()

# print(d)

# for i in d:
# #     print(i)

# for k, v in d.items():
#     print(k, v)

# operations on dict
#delete a key:
# del d ["city"]
# print(d)

## getting a value:
# print(d.get("address", "not avaliable"))
# print(d["address"])


## print number of letters repeated n ur name
# name =str(input("enter you're name: "))
# count={}

# for ch in name:
#     if ch not in count:
#         count[ch] =1
#     else:
#         count[ch] +=1
# print(count)


# ## find the element which occurs most of the time

# ch =""
# c= 0
# for key, val in count.items():
#     if val >c:
#         c = val
#         ch = key
#     print(ch)

from collections import defaultdict, Counter

# d = defaultdict(int)
# name = input()

# for ch in name:
#     d[ch]+=1

# print(d)


# name = input()
# c = Counter(name)
# print(c)


##searching: 
# 
# linear search:
# arr =[2,4,5,2,1]
# key =1
# for i, ch in enumerate(arr):
#     if ch == key:
#         print("present",i)

# else:
#     print("Not present")

# #binary search
# arr =list(map(int, input("Enter elementts of list: ").split()))
# key=int(input("Enter number to serach: "))

# start = 0
# end = len(arr)-1


# while start <= end:
#     mid = (start + end)//2
#     if key == arr[mid]:
#         print("Element found at index ", mid)
#         break
#     elif key> arr[mid]:
#         start = mid+1
#     else:
#         end = mid-1
# else: 
#     print("Not Found")



#rotate array

# arr =list(map(int, input("Enter elementts of list: ").split()))
# k=int(input("Enter number to roate "))

# for i, ch in enumerate(arr):
#     if ch == key:
#         break

# print(arr[i+1:]+arr[:i])

# sir solution: divide thee array and then rverse the section and then reverse the whole to get the answer:
#method1: pop
# for _ in range(k):
#     ele = arr.pop(0)
#     arr.append(ele)

# print(arr)

# #method 2:

# s = 0
# e= k-1
# while s<e:
#     arr[s], arr[e] = arr[e], arr[s]
#     s +=1
#     e-=1

# s = k
# e = len(arr)-1
# while s<e:
#     arr[s], arr[e] = arr[e], arr[s]
#     s +=1
#     e -=1

# s = 0
# e= len(arr)-1
# while s<e:
#     arr[s], arr[e] = arr[e], arr[s]
#     s +=1
#     e -=1

# print(arr)



###MATRIX
# mat = [[1,2], [3,4], [5,6]]
# for ls in mat:
#     for i in ls:
#         print(i, end=" ")
#     print()

# m = len(mat)
# n= len(mat[0])
# for i in range(m):
#     for j in range(n):
#         print(mat[i][j], end=" ")
#     print()

# mat = []
# m = int(input("Enter m "))
# n = int(input("Enter n "))

# m = 3
# n = 3

# for i in range(m):
#     temp = []
#     for j in range(n):
#         n = int(input())
#         temp.append(n)
#     mat.append(temp)
# print(mat)

# print()

# for i in range(m):
#     for j in range(n):
#         print(mat[i][j], end=" ")
#     print()

# print()

# for i in range(m):
#     for j in range(n):
#         if i == 0 & j==0 & i== n-1 & j == n-1:
#             print(mat[i][j], end=" ")
#     print()



##skip 5
# for i in range(3):
#     ls =  list(map(int, input().split()))
#     mat.append(ls)

# print()

# row , col = len(mat), len(mat[0])

# for i in range(row):
#     for j in range(col):
#         if i == 0 or j==0 or i== row-1 or j == col-1:
#             print(mat[i][j], end=" ")
#     print()

# # zig zag row wise
# for i in range(3):
#     ls =  list(map(int, input().split()))
#     mat.append(ls)
# print()

# row , col = len(mat), len(mat[0])

# for i in range(row):
#     if i%2 ==0:
#         for j in range(col):
#             print(mat[i][j], end=" ")
#         print()
#     else:
#         for j in range(col -1, -1, -1):
#             print(mat[i][j], end=" ")
#         print()


##zigzag col wise
# for i in range(3):
#     ls =  list(map(int, input().split()))
#     mat.append(ls)
# print()

# row , col = len(mat), len(mat[0])

# for i in range(col):
#     if i%2 ==0:
#         for j in range(row):
#             print(mat[j][i], end=" ")
#         print()
#     else:
#         for j in range(row -1, -1, -1):
#             print(mat[j][i], end=" ")
#         print()

# ## spiral printng matrix

## transpose of matrix
# for i in range(3):
#     ls =  list(map(int, input().split()))
#     mat.append(ls)
# print()

# row , col = len(mat), len(mat[0])
# transpose =[]
# for i in range(col):
#     temp=[]
#     for j in range(row):
#         temp.append(mat[j][i])
#     transpose.append(temp)
# print(transpose)
# print()

# for i in range(m):
#     for j in range(n):
#         print(mat[i][j], end=" ")
#     print()


## 90 degre shift
# row , col = len(mat), len(mat[0])
# new =[]
# for i in range(row):
#     temp=[]
#     for j in range(row -1, -1, -1):
#         temp.append(mat[j][i])
#     new.append(temp)
# print(new)
# print()

# for i in range(row):
#     for j in range(col):
#         print(new[i][j], end=" ")
#     print()

## method 2: sirs solution
# row , col = len(mat), len(mat[0])
# for i in range (row):
#     for j in range(i, col):
#         mat[i][j], mat[j][i] = mat[j][i], mat[i][j]


# for ls in mat:
#     s ,e = 0, col-1
#     while s<e:
#         ls[s], ls[e] = ls[e], ls[s]
#         s +=1
#         e -=1
# print(mat)


###STRINGS::
# s = "shivani"
# print(s)
# for i in range(len(s)):
#     print(s[i])


##string methods:
# s1= s.upper()
# s2= s.title()
 

# print(s1, s2)


## first print word and ignore repeated letters
# name =str(input("enter you're name: "))
# count=""

# for ch in name:
#     if ch not in count:
#         count +=ch
   
# print(count)

##print first non repeating character for eg: ajay== j
# d = defaultdict(int)
# for i in name:
#     d[i] +=1

# for k, v in d.items():
#     if v==1:
#         print(k)
#         break


##anagram most asked interview questions
s1= input()
s2=input()

set1 = set()
for i in s1:
    set1.add(i)

for i in s2:
    if i not in s1:
        print("Not anagram")
        break
else:
    print("anagram")