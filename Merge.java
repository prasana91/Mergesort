public class Merge
{
    private Comparable[] aux;
    
    public void merge(comparable[] a, int lo, int mid, int hi)
    {
        int i = lo, j = mid+1;
        //copy array into auxillary storage
        for(int k = lo; k <= hi; k++)
            aux[k] = a[k];
        
        //merge the elements from lo on one end and mid+1 on the other end
        for(int k = lo; k <= hi; k++)
        if (i > mid) a[k] = aux[j++];
        else if (j > hi) a[k] = aux[i++];
        else if(less(aux[i], aux[j]) a[k] = aux[i++];
        else a[k] = aux[j++];
    }
    
    public void sort(Comparable[] a, int lo, int hi)
    {
        if(hi<=lo) return;
        int mid = lo + (hi - lo)/2;
        
        //sort left, sort right, merge
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }
}