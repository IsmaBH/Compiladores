#include "funciones.h"

int main(int argc, char const *argv[])
{
	int muro = 77; //Este es el numero ascii para la M
	int ps = 46; //Este es el numero ascii para el punto
	int pds = 48; //Este es el numero ascii para la diagonal (Fue random)
	int col = 11;
	int row = 13;
	int **matrixA = NULL;

	matrixA = Aparta_Matriz(col,row);
	Llena_Matriz(matrixA, row, col);
	Imprime_Matriz(matrixA, row, col);
	free(matrixA);
	matrixA = NULL;
	return 0;
}