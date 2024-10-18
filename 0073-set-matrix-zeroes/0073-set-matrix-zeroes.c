void setZeroes(int** matrix, int matrixSize, int* matrixColSize) {
     int i, j, k;
    int *rowZero = (int *)calloc(matrixSize, sizeof(int));
    int *colZero = (int *)calloc(matrixColSize[0], sizeof(int));

    // First pass to mark rows and columns that need to be zeroed, matrixColSize represents the number of columns in the first row of the matrix.
    for(i = 0; i < matrixSize; i++) {
        for(j = 0; j < matrixColSize[i]; j++) {
            if(matrix[i][j] == 0) {
                rowZero[i] = 1;
                colZero[j] = 1;
            }
        }
    }

    // Second pass to set zeros based on marks
    for(i = 0; i < matrixSize; i++) {
        for(j = 0; j < matrixColSize[i]; j++) {
            if(rowZero[i] == 1 || colZero[j] == 1) {
                matrix[i][j] = 0;
            }
        }
    }

    // Free allocated memory
    free(rowZero);
    free(colZero);

    // Print the matrix
    for(i = 0; i < matrixSize; i++) {
        for(j = 0; j < matrixColSize[i]; j++) {
            printf("%d ", matrix[i][j]);
        }
        printf(", ");
    }
}