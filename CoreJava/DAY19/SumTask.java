package DAY19;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {
    private static final int THRESHOLD=1000;
    private final int srt;
    private final int end;

    public SumTask(int srt, int end) {
        this.srt = srt;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end-srt<=THRESHOLD){
            long sum=0;
            for (int i=srt;i<=end;i++){
                sum+=i;
            }
            return sum;
        }
        else {
            int mid=srt+(end-srt)/2;
            SumTask t1=new SumTask(srt,mid);
            SumTask t2=new SumTask(mid+1,end);
            t1.fork();
            long r1=t2.compute();
            long r2=t1.join();
            return r2+r1;
        }
    }
    public static void main(String[] args) {
int srt=1;
int end=10000;
        ForkJoinPool fork=new ForkJoinPool();
        SumTask task=new SumTask(srt,end);
        long stime=System.currentTimeMillis();
        long res=fork.invoke(task);
        long etime=System.currentTimeMillis();
        System.out.println("Sum of "+srt+" to "+end+" are = "+res);
        System.out.println("Time = "+(etime-stime));

    }
}
