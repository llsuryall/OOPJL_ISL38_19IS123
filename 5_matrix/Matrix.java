import java.util.Scanner;

public class Matrix{
	private int rows,cols;
	private int[][] ar;
	public Matrix(int rows,int cols){
		if(rows<=0 && cols<=0){
			rows=3;
			cols=3;
			System.out.println("Invalid dimensions for matrix....set to default 3x3");
		}
		this.rows=rows;
		this.cols=cols;
		ar=new int[rows][cols];
	}
	public void getInput(){		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements for matrix with dimensions "+this.rows+"x"+this.cols+" - ");
		for(int i=0;i<this.rows;i++){
			for(int j=0;j<this.cols;j++){
				this.ar[i][j]=sc.nextInt();
			}
		}
	}
	public static Matrix add(Matrix a,Matrix b){
		if(a!=null && b!=null){
			if(a.rows==b.rows && a.cols==b.cols){
				Matrix res=new Matrix(a.rows,a.cols);
				for(int i=0;i<a.rows;i++){
					for(int j=0;j<a.cols;j++){
						res.ar[i][j]=a.ar[i][j]+b.ar[i][j];
					}
				}
				return res;
			}
			else{
				System.out.println("Cannot add matrix with different dimensions!");
				return null;
			}			
		}
		else{
			System.out.println("Matrices are null!");
			return null;
		}
	}
	public static Matrix sub(Matrix a,Matrix b){
		if(a!=null && b!=null){
			if(a.rows==b.rows && a.cols==b.cols){
				Matrix res=new Matrix(a.rows,a.cols);
				for(int i=0;i<a.rows;i++){
					for(int j=0;j<a.cols;j++){
						res.ar[i][j]=a.ar[i][j]-b.ar[i][j];
					}
				}
				return res;
			}
			else{
				System.out.println("Cannot subtract matrix with different dimensions!");
				return null;
			}
		}
		else{
			System.out.println("Matrices are null!");
			return null;
		}
	}
	public static Matrix multiply(Matrix a, Matrix b){
		if(a!=null && b!=null){
			if(a.cols==b.rows){
				Matrix res=new Matrix(a.rows,b.cols);
				for(int i=0;i<a.rows;i++){
					for(int j=0;j<b.cols;j++){
						for(int k=0;k<a.cols;k++){
							res.ar[i][j]+=a.ar[i][k]*b.ar[k][j];
						}
					}
				}
				return res;
			}
			else{
				System.out.println("Dimension Error! Cannot Multiply matrices with this dimensions!");
				return null;
			}
		}
		else{
			System.out.println("Matrices are null!");
			return null;
		}
	}
	public String toString(){
		String res="";
		for(int i=0;i<this.rows;i++){
			for(int j=0;j<this.cols;j++){
				res+=this.ar[i][j]+" ";
			}
			res+="\n";
		}
		return res;
	}
}
