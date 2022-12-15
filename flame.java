import java.io.*;
public class flame 
{
    public static void main(String args[])throws IOException
    {
        String str1,str2;
        int c=0,p=0;
        int lmin=0,lmax=0;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter your name");
        str1 = in.readLine();
        System.out.println("Enter your Partners name");
        str2 = in.readLine();
        int n1=str1.length();
        int n2=str2.length();
        int s=0,t=0,d=0;
        if(n1>=n2)
        {
            lmin=n2;
            lmax=n1;
            for(int i=0;i<lmin;i++)  
            {
                for(int j=0;j<lmax;j++)
                {
                    if(str2.charAt(i)==str1.charAt(j))
                    {
                        System.out.println(str2.charAt(i));
                        c++;
                        break;
                    }
                }
            }   
        }
        else
        {
            lmin=n1;
            lmax=n2;
            for(int i=0;i<lmin;i++)  
            {
                for(int j=0;j<lmax;j++)
                {
                    if(str1.charAt(i)==str2.charAt(j))
                    {
                        System.out.println(str1.charAt(i));
                        c++;
                        break;
                    }
                }
            }   
        }
  
        p=(n1+n2)-(c*2);
        while(p>5)
        {
            p=p-5;
        }
        if(p<=5)
        {
            if(p==5)
            {
                System.out.println("Enemy");
            }
            if(p==4)
            {
                System.out.println("Marriage");
            }
            if(p==3)
            {
                System.out.println("Attraction");
            }
            if(p==2)
            {
                System.out.println("Love");
            }
            if(p==1)
            {
                System.out.println("Friends");
            }
        }
    }   
}
