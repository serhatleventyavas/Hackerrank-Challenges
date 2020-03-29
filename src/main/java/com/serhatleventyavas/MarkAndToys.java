package com.serhatleventyavas;

public class MarkAndToys {

    private void quickSort(int arr[],int p, int r)
    {
        int q;
        if(p<r)
        {
            q=partition(arr, p, r);
            quickSort(arr, p, q-1);
            quickSort(arr,q+1, r);
        }
    }

    private int partition(int A[],int p, int r){
        int tmp;
        int x = A[r];
        int i = p-1;

        for(int j=p; j<=r-1; j++)
        {
            if(A[j]<=x)
            {
                i++;
                tmp=A[i];
                A[i]=A[j];
                A[j]=tmp;
            }
        }
        tmp=A[i+1];
        A[i+1]=A[r];
        A[r]=tmp;
        return i+1;
    }

    public int maximumToys(int[] prices, int k) {
        quickSort(prices, 0, prices.length-1);
        int totalPrices = 0;
        int toysCount = 0;
        for (int i = 0; i < prices.length; i++) {
            if ((totalPrices + prices[i]) >= k) {
                break;
            }

            toysCount = toysCount + 1;
            totalPrices = totalPrices + prices[i];
        }
        return toysCount;
    }
}
