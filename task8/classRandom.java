package task8;

public class classRandom {
    long a;
    int c;
    long m;
    classRandom(long a, int c, long m)
    {
        this.a=a;
        this.c=c;
        this.m=m;
    }

    public long get_(long xn    ){
        return (int)((this.a*xn+(long)this.c) % this.m);
    }
}
