import java.util.*;

class marks
{
	int roll_no;
	String name;
	double physics,chemistry,maths;
	double total_marks;
	
	void read(String nm,int rno,double p,double c,double m)
	{
		roll_no=rno;
		name=nm;
		physics=p;
		chemistry=c;
		maths=m;
	}
	
	void calculate()
	{
		total_marks=physics+chemistry+maths;
		
	}
	boolean compare(marks ms)
	{
		if(total_marks<ms.total_marks)
		return true;
		else
		return false;
	}
	
	void display()
	{
		
		System.out.println(roll_no+"\t"+name+"\t"+physics+"\t"+chemistry+"\t\t"+maths+"\t"+total_marks);
	
	}

}

class markmain
{
	public static void main(String args[])
	{
		int rno,i,j;
		String nm;
		double p,c,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NO OF STUDENTS");
		int n=sc.nextInt();
		marks ms[]=new marks[n];
		for(i=0;i<n;i++)
		{
			System.out.println("ENTER name");
			nm=sc.next();
			System.out.println("ENTER roll no");
			rno=sc.nextInt();			
			System.out.println("enter physics mks");
			p=sc.nextDouble();
			System.out.println("enter chem mks");
			c=sc.nextDouble();
			System.out.println("enter maths mks");
			m=sc.nextDouble();
			ms[i]=new marks();
			ms[i].read(nm,rno,p,c,m);
			ms[i].calculate();
		}
			marks t=new marks();
			for(i=0;i<n;i++)
			{
				for(j=0;j<n-1;j++)
				{
					if(ms[j].compare(ms[j+1]))
					{
						t=ms[j];
						ms[j]=ms[j+1];
						ms[j+1]=t;
					}
				}
			}
		
		
		System.out.println("ROLL_NO\tNAME\tPHYSICS\tCHEMISTRY\tMATHS\tTOTAL_MARKS");
		for(i=0;i<n;i++)
		{

			ms[i].display();
		}
	}
}	
