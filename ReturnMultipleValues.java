class MultiDiv
{
    int mul;    
    double div; 
    MultiDiv(int m, double d)
    {
        mul = m;
        div = d;
    }
}
 
public class ReturnMultipleValues
{
    static MultiDiv getMultandDiv(int a, int b)
    {
        return new MultiDiv(a*b, (double)a/b);
    }
 
    public static void main(String[] args)
    {
        MultiDiv ans = getMultandDiv(10, 20);
        System.out.println("Multiplication = " + ans.mul);
        System.out.println("Division = " + ans.div);
    }
}