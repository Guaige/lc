def adjust_heap(a,cur,l):
    t = a[cur]
    i = 2*cur + 1
    while i<l:
        if i+1 < l and a[i]>a[i+1]:
            i+=1
        if a[i] < t:
            a[cur] = a[i]
            cur = i
        else:
            break;
        i = 2*i + 1
    a[cur] = t

a = [4,7,2,9,2,4,1]
for i in range(len(a)//2-2,-1,-1):
    adjust_heap(a,i,len(a))
for i in range(len(a)-2,0,-1):
    t = a[0]
    a[0] = a[i]
    a[i] = t
    adjust_heap(a,0,i)
