import java.util.Scanner;

class matrix_impl{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Note: Format <rows> <cols>");
		System.out.print("Enter the dimension of matrix 1 - ");
		int rows=sc.nextInt(),cols=sc.nextInt();
		Matrix mat1=new Matrix(rows,cols);
		mat1.getInput();
		System.out.print("Enter the dimension of matrix 2 - ");
		rows=sc.nextInt();cols=sc.nextInt();
		Matrix mat2=new Matrix(rows,cols);
		mat2.getInput();
		System.out.println("");
		System.out.println("Matrix 1-");
		System.out.println(mat1);
		System.out.println("Matrix 2-");
		System.out.println(mat2);
		Matrix res=Matrix.add(mat1,mat2);
		if(res!=null){
			System.out.print("Matrix 1 + Matrix 2 = \n"+res);
		}
		res=Matrix.sub(mat1,mat2);
		if(res!=null){
			System.out.print("Matrix 1 - Matrix 2 = \n"+res);
		}
		res=Matrix.multiply(mat1,mat2);
		if(res!=null){
			System.out.print("Matrix 1 x Matrix 2 = \n"+res);
		}
	}
}
