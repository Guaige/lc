def per(a,cur):
    def swap(a,i,j):
        t = a[i]
        a[i] = a[j]
        a[j] = t
    if cur==len(a) - 1:
        print(a)
        return
    for i in range(cur,len(a)):
        if i!=cur:
            if a[i]!=a[cur]:
                swap(a,i,cur)
                per(a,cur+1)
                swap(a,i,cur)
        else:
                swap(a,i,cur)
                per(a,cur+1)
                swap(a,i,cur)