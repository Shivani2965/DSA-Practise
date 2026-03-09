a= [1,2,3]

def fun(ans=None, i=0):
    if ans == None:
        ans=[]
    if i == len(a):
        print(ans, end =" ")
        return


    fun(ans + [a[i]], i+1) #include
    fun(ans, i+1) #exclude


fun()