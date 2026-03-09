# l=[]
# for i in range(1,6):
#     n= int(input("Enter number: "))
#     l.append(n)

# print(l)



# #print all the string of list using while
# l=['shivani', 'samruddhi','srushti']
# i=0
# while i< len(l):
#     print(l[i])
#     i+=1



# # find the length of list without using len()
# l=[1,2,3,4,5]
# count=0
# for i in l:
#     count= count+1

# print(count)

# #find largest element without function
# l=[1,2,3,4,5,6]
# largest=l[0]

# for i in l:
#     if i > largest:
#         largest=i

# print(largest)


# #find smallest element wihtout function
# l=[1,2,3,4,5]

# smallest= l[0]

# for i in l:
#     if i < smallest:
#         smallest= i

# print(smallest)

# #find countof even numbers present in alist
# l=[1,2,3,4,5,6,7,8,9]

# count=0

# for i in l:
#     if i % 2==0:
#         count+=1

# print(count)


## print only positive numbers
l=[-1,-4,2,6,-19,23]

for i in l:
    if i > 0:
        print(i)


# print only negative num
for i in l: 
    if i < 0:
        print(i)

# search number in a list
target= 3

for i in l:
    if i == target:
        print("Found")
        break
    elif i > len(l):
        print("not found")
        break


#reverse list without function
r =0
while ()