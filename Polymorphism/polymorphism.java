import javax.lang.model.util.ElementScanner6;

public class polymorphism {
    public static void main(String[] args)
    {
        minimum obj=new minimum();
        obj.min(5,100);
        obj.min(10,89,56);


    }
}
class minimum{
    void min(int a,int b){  //form 1
        if(a>b)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(b);
        }
    }
    void min(int a,int b,int c)    //form 2
    {
        if(a>b && a>c)
        {
            System.out.println(a);
        }
        else if(b>c)
        {
            System.out.println(b);
        }
        else 
        {
            System.out.println(c);
        }

    }
}
