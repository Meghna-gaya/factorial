public class FindFactorial {
    private final int number;
    public FindFactorial(int number) {
        this.number=number;
    }
    public int find() {
        if(number==0)
            return 1;
        int factorial=1;
        for(int i=1;i<=number;i++)
        {
            factorial*=i;
        }
        return factorial;
    }
}
