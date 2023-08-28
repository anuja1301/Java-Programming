import java.util.Scanner;

public class Matrix 
{
    int [][]arr1;
    int [][]arr2;
    int [][]arr3;
    int col, row;
    Scanner sc = new Scanner(System.in);
    void getArray()
    {
        System.out.println("Enter the size of array rows and columns:");
        row=sc.nextInt();
        col=sc.nextInt();
        arr1=new int[row][col];
        System.out.print("Enter the first matrix:");
        for(int i=0; i<row; i++)
       	{
            for(int j=0; j<col; j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        arr2=new int[row][col];
        System.out.print("Enter the second matrix:");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
		System.out.println("\nFirst Matrix");
	    for(int i=0; i<row; i++)
        {
			for(int j=0; j<col; j++)
          	{
                System.out.print(arr1[i][j]+" ");
         	}
			System.out.println();
     	}
		System.out.println("\nSecond Matrix");
	   	for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
               System.out.print(arr2[i][j]+" ");
            }
			System.out.println();
        }
    }
	
    void addition()
    {
		arr3=new int[row][col];
        for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("\nMatrix Addition");
        for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}
    }
	void subtraction()
    {
		arr3=new int[row][col];
        for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr3[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		System.out.println("\nMatrix Subtration");
        for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr3[i][j]+ " ");
			}
			System.out.println();
		}
    }
	void multiplication()
	{
		arr3=new int[row][col];
		for(int i=0; i<row; i++)
		{    
			for(int j=0; j<col; j++)
			{    
				arr3[i][j]=0;      
				for(int k=0; k<col; k++)      
				{      
					arr3[i][j]+=arr1[i][k]*arr2[k][j];      
				}  
			}
		}
		System.out.println("\nMatrix Multiplication");
		for(int i=0; i<row; i++)
		{    
			for(int j=0; j<col; j++)
			{       
				System.out.print(arr3[i][j]+ " ");     
			}
			System.out.println();  
		} 
	}
}
public class MatrixOperation
{
	public static void main(String []args)
    {
        Matrix M=new Matrix();
		M.getArray();
		M.addition();
		M.subtraction();
		M.multiplication();
    }
}

