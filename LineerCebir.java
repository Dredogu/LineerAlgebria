import java.util.Scanner;

public class LineerCebir {
	
	static int rows,columns;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
		
			System.out.println("1. Matrix addition - subtraction    2. Matrix transpose    3. Matrix product:   4. Exit");
			int response = scanner.nextInt();
			
			switch(response) {
				case 1: 
					matrixAddSub();
					break;
				case 2:
					matrixTranspose();
					break;
				case 3:
					matrixProduct();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("You made the wrong choice, please try again!!!");
					System.out.println();
			}
		
		}
		
	}
	
	public static void matrixAddSub() {
		
		System.out.println("Enter the row and column values ​​of the 2 matrices to be processed: ");
		rows = scanner.nextInt();
		columns = scanner.nextInt();
		
		int [][] A  = new int[rows][columns];
		int [][] B  = new int[rows][columns];
		
		System.out.println();
		System.out.println("1. Addition  2. subtraction: ");
		int response = scanner.nextInt();
		System.out.println();
		
		boolean a = true;
		
		if(response == 2) {
			a = false;
		}
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				
				System.out.print("A - "+(i+1)+""+(j+1)+": ");
				A[i][j] = scanner.nextInt();
				
			}
		
		}
		
		System.out.println();
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				
				System.out.print("B - "+(i+1)+""+(j+1)+": ");
				B[i][j] = scanner.nextInt();
				
			}
		
		}
		
		System.out.println("Transaction result:");
		System.out.println();
		
		for (int i = 0; i < rows; i++) {
			
			if(a) {
				
				for (int j = 0; j < columns; j++) {
					
					System.out.print(A[i][j]+B[i][j]+" ");
					
				}
			}
			
			else {
				
				for (int j = 0; j < columns; j++) {
					
					System.out.print(A[i][j]-B[i][j]+" ");
					
				}
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void matrixTranspose() {
		
		System.out.println("Enter the number of rows and columns of the Matrix to be transposed: ");
		rows = scanner.nextInt();
		columns = scanner.nextInt();
		
		int[][] A = new int[rows][columns];
		int[][] B = new int[columns][rows];
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				
				System.out.print("A - "+(i+1)+""+(j+1)+": ");
				A[i][j] = scanner.nextInt();
				
			}
		
		}
		
		System.out.println();
		
		System.out.println("Matrix transpose: ");
		
		System.out.println();
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < columns; j++) {
				
				System.out.print(A[i][j]+" ");
				B[j][i] = A[i][j];
				
			}
			
			System.out.println();

		}
		
		System.out.println();
		
		for (int i = 0; i < columns; i++) {
			
			for (int j = 0; j < rows; j++) {
				
				System.out.print(B[i][j]+" ");
				
			}
			
			System.out.println();
		}
	}
	
	public static void matrixProduct() {  // 4 * 2 x 2 * 4 = 4 * 4 ------ 2*4 x 4*2 = 2*2
		
		int[][] A,B;
		
		do {
			
			System.out.print("Enter the number of rows and columns of the 1st matrix: ");
			rows = scanner.nextInt();
			columns = scanner.nextInt();
			
			A = new int[rows][columns];
			
			System.out.print("Enter the number of rows and columns of the 2nd matrix:");
			rows = scanner.nextInt();
			columns = scanner.nextInt();
			
			B = new int[rows][columns];
			
			if(A[0].length != B.length) {
				
				System.out.println();
				System.out.println("The number of columns in the 1st matrix must be equal to the number of rows in the 2nd matrix!!! ");
				System.out.println("Please try again");
				System.out.println();
			}
			
		}while(A[0].length != B.length);
		
		for (int i = 0; i < A.length; i++) {
			
			for (int j = 0; j < A[i].length; j++) {
				
				System.out.print("A - "+(i+1)+""+(j+1)+": ");
				A[i][j] = scanner.nextInt();
				
			}
		
		}
		
		System.out.println();
		
		for (int i = 0; i < B.length; i++) {
			
			for (int j = 0; j < B[i].length; j++) {
				
				System.out.print("B - "+(i+1)+""+(j+1)+": ");
				B[i][j] = scanner.nextInt();
				
			}
		
		}
		
		System.out.println();
		
		System.out.println("Matrix product: ");
		
		System.out.println();
		
		int add = 0;
		
		for (int x = 0; x < A.length; x++) { // Number of rows of A
			
			for (int i = 0; i < B[0].length; i++) { //  Number of columns of B
				
				for (int j = 0; j < A[0].length; j++) { // Number of rows of B or A[0].length 4*2 * 2*4 = 2 s
					
					add += A[x][j]*B[j][i];
					
				}
				
				System.out.print(add+" ");
				add = 0;
				
			}
			
			System.out.println();
			
		}
		
	}
	
}
