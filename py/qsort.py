a = [4,7,2,9,1]
def qsort(a,l,r):
    if l>r:
        return
    t = a[l]
    i=l
    j=r
    while i<j and a[j]<=t:
        j-=1
    while i<j and a[i]>=t:
        i+=1
    if i<j:
        tt = a[i]
        a[i] = a[j]
        a[j] = tt
    a[l] = a[i]
    a[i] = t
    qsort(a,l,i-1)
    qsort(a,i+1,r)