arr = [ 11, 12,13,7, 8, 9, 10 ]
print(arr)
min = arr[0]
for i in arr:
    if i < min:
        min = i

print("min value:", min)
