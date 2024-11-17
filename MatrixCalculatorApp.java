import java.util.Scanner;

class MatrixOperations {
    Scanner sc = new Scanner(System.in);
    int[][] matrix; 

    void getMatrix() {
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        matrix = new int[rows][columns]; 

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }
void displayMatrix(int[][] resultMatrix) {
    if (matrix == null) {
        System.out.println("Matrix not initialized.");
        return;
    }

    System.out.println("Resultant Matrix:");
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}


 void addMatrices(int matrixA[][], int matrixB[][]) {
    if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
        System.out.println("Matrix addition is not possible. Matrices have different dimensions.");
        return;
    }

    int resultMatrix[][] = new int[matrixA.length][matrixA[0].length];

    for (int i = 0; i < matrixA.length; i++) {
        for (int j = 0; j < matrixA[0].length; j++) {
            resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
        }
    }

    System.out.println("Sum of Matrices:");
      for (int i = 0; i < matrixA.length; i++) {
        for (int j = 0; j < matrixA[0].length; j++) {
           System.out.print( resultMatrix[i][j]+" ");
        }
		System.out.println();
    }

}


    void subtractMatrices(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
        System.out.println("Matrix subtraction is not possible. Matrices have different dimensions.");
        return;
    }

    int resultMatrix[][] = new int[matrixA.length][matrixA[0].length];

    for (int i = 0; i < matrixA.length; i++) {
        for (int j = 0; j < matrixA[0].length; j++) {
            resultMatrix[i][j] = matrixA[i][j] - matrixB[i][j];
        }
    }

    System.out.println("Subtraction of Matrices:");
      for (int i = 0; i < matrixA.length; i++) {
        for (int j = 0; j < matrixA[0].length; j++) {
           System.out.print( resultMatrix[i][j]+" ");
        }
		System.out.println();
    }
    }

    void transposeMatrix(int[][] matrix) {
       int transpose[][] = new int[matrix[0].length][matrix.length];
	   for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
           transpose[j][i]=matrix[i][j] ;
        }
    }
	System.out.println("Transpose of Matrices:");
      for (int i = 0; i < matrix[0].length; i++) {
        for (int j = 0; j < matrix.length; j++) {
           System.out.print( transpose[i][j]+" ");
        }
		System.out.println();
    }
    }

     void inverseMatrix(int[][] matrix) {

double inverseMatrix[][] = new double[2][2];
inverseMatrix[0][0] = matrix[1][1] ;
inverseMatrix[0][1] = -matrix[0][1] ;
inverseMatrix[1][0] = -matrix[1][0] ;
inverseMatrix[1][1] = matrix[0][0];

System.out.println("Inverse of Matrix:");
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print(inverseMatrix[i][j] + " ");
    }
    System.out.println();
}

    }

    void multiplyMatrices(int[][] matrixA, int[][] matrixB) {
    int c[][] = new int[matrixA.length][matrixB[0].length];

    for (int i = 0; i < matrixA.length; i++) {
        for (int j = 0; j < matrixB[0].length; j++) {
            c[i][j] = 0;
            for (int k = 0; k < matrixA[0].length; k++) {
                c[i][j] += matrixA[i][k] * matrixB[k][j];
            }
        }
    }

    System.out.println("Multiplication of Matrix:");
    for (int i = 0; i < matrixA.length; i++) {
        for (int j = 0; j < matrixB[0].length; j++) {
            System.out.print(c[i][j] + " ");
        }
        System.out.println();
    }
}
   void determinant2x2Matrices(int[][] matrix) {
    double determinant = (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);

  
    System.out.println("Determinant of 2x2 Matrix:"+" "+determinant);
    

    }
	void determinant3x3Matrices(int[][] matrix) {
    double determinant = matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1]))
            - matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]))
            + matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0]));

    System.out.println("Determinant of 3x3 Matrix: " + determinant);
}

}





class MatrixCalculatorApp {
    public static void main(String args[]) {
        MatrixOperations objA = new MatrixOperations();
        MatrixOperations objB = new MatrixOperations();

        System.out.println("Enter details for Matrix A:");
        objA.getMatrix();

        System.out.println("Enter details for Matrix B:");
        objB.getMatrix();

       System.out.println("Matrix A:");
       objA.displayMatrix(objA.matrix);

        System.out.println("Matrix B:");
        objB.displayMatrix(objB.matrix);


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMatrix Operation Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Transpose");
            System.out.println("4. Inverse (only for 2x2 matrices)");
            System.out.println("5. Multiplication");
			System.out.println("6. Determinant");
            System.out.println("7. Exit");

            System.out.print("Enter your choice (1-7): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    objA.addMatrices(objA.matrix, objB.matrix);
                    break;
                case 2:
                    objA.subtractMatrices(objA.matrix, objB.matrix);
                    break;
                case 3:
					System.out.println("1. Transpose for Matrix A");
					System.out.println("2. Transpose for Matrix B");
					System.out.print("Enter your choice (1 or 2): ");
					int transposeChoice = sc.nextInt();

					switch (transposeChoice) {
						case 1:
							objA.transposeMatrix(objA.matrix);
							break;
						case 2:
							objA.transposeMatrix(objB.matrix);
							break;
						
				}
				break;

                case 4:
                    System.out.println("1. Inverse for Matrix A");
					System.out.println("2. Inverse for Matrix B");
					System.out.print("Enter your choice (1 or 2): ");
					int inverseChoice = sc.nextInt();

					switch (inverseChoice) {
						case 1:
							objA.inverseMatrix(objA.matrix);
							break;
						case 2:
							objA.inverseMatrix(objB.matrix);
							break;
						
                case 5:
                    objA.multiplyMatrices(objA.matrix, objB.matrix);
                    break;
                case 6:
                    System.out.print("Enter the matrix dimension (2 or 3): ");
                    int dimension = sc.nextInt();
                    if (dimension == 2) {
                        objA.determinant2x2Matrices(objA.matrix);
                    } else if (dimension == 3) {
                       objA.determinant3x3Matrices(objA.matrix);
                    } else {
                        System.out.println("Invalid dimension. Please enter 2 or 3.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default :
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}
}
