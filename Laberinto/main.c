#include "funciones.h"

int main(int argc, char const *argv[])
{
	int muro = 77; //Este es el numero ascii para la M
	int ps = 46; //Este es el numero ascii para el punto
	int pds = 48; //Este es el numero ascii para la diagonal (Fue random)
	int col = 11;
	int row = 13;
	int opcion;
	int **matrixA = NULL;
	//Esta parte prepara la matriz que sera el laberinto del agente
	matrixA = Aparta_Matriz(col,row);
	Llena_Matriz(matrixA, row, col);
	Imprime_Matriz(matrixA, row, col);
	//Aqui inicia el proceso del agente
	printf("¿Que ruta deberia tomar?\n");
	scanf("%d", &opcion);
	Recorrido(opcion, row, col, matrixA);
	free(matrixA);
	matrixA = NULL;
	return 0;
}