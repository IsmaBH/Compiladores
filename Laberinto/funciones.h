#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int **Aparta_Matriz (int col, int row);
void Llena_Matriz (int ** matriz, int row, int col);
void Imprime_Matriz(int **matriz, int row, int col);
int Sondea(int **matriz, int PS, int* x, int* y);
void Recorrido(int op, int row, int col, int **matriz);