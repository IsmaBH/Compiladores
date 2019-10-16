#include "funciones.h"

int ** Aparta_Matriz (int col, int row)
{
  int i = 0;
  int **matriz;
  matriz = (int **)malloc(row*sizeof(int*));
	if (matriz == NULL)
	{
		perror("Hubo un error al reservar memoria");
	}
	/*Se inicia un movimiento en el arreglo para asignar memoria para las columnas de la matriz A*/
	for (int i = 0; i < row; ++i)
	{
		matriz[i] = (int*)malloc(col*sizeof(int));
		if (matriz[i] == NULL)
		{
			perror("Hubo un error al reservar memoria para las columnas");
		}
	}
  return matriz;
}
void Llena_Matriz (int ** matriz, int row, int col)
{
	int num, x, y;
	//Este ciclo nos ayudara a rellenar las casillas en blanco
	for(x = 0;x < row;x++) // esto nos movera por las filas
	{
		for(y = 0;y < col;y++) // esto nos movera por las columnas
		{
			matriz[x][y] = 1;
		}
	}
	//Este ciclo nos ayudara a poner las paredes en la matriz asi como el pds
	for(x = 0;x < row;x++) // esto nos movera por las filas
	{
		for(y = 0;y < col;y++) // esto nos movera por las columnas
		{
			if (x == 0 && y == 1)
			{
				matriz[x][y] = 48;
			}
			if ((x==0&&y==2)||(x==0&&y==8))
			{
				matriz[x][y] = 77;
			}
			if ((x==1&&y==3)||(x==1&&y==5)||(x==1&&y==8))
			{
				matriz[x][y] = 77;
			}
			if ((x==2&&y==0)||(x==2&&y==7)||(x==2&&y==10))
			{
				matriz[x][y] = 77;
			}
			if ((x==3&&y==0)||(x==3&&y==2))
			{
				matriz[x][y] = 77;
			}
			if ((x==5&&y==1)||(x==5&&y==2)||(x==5&&y==6)||(x==5&&y==9)||(x==5&&y==10))
			{
				matriz[x][y] = 77;
			}
			if ((x==7&&y==0)||(x==7&&y==4)||(x==7&&y==5)||(x==7&&y==8))
			{
				matriz[x][y] = 77;
			}
			if ((x==8&&y==0)||(x==8&&y==3)||(x==8&&y==6)||(x==8&&y==8))
			{
				matriz[x][y] = 77;
			}
			if (x==9&&y==10)
			{
				matriz[x][y] = 77;
			}
			if (x==10&&y==1)
			{
				matriz[x][y] = 77;
			}
			if ((x==11&&y==0)||(x==11&&y==4)||(x==11&&y==5)||(x==11&&y==9)||(x==11&&y==10))
			{
				matriz[x][y] = 77;
			}
		}
	}
	//Este ciclo nos ayudara a poner los ps
	for(x = 0;x < row;x++) // esto nos movera por las filas
	{
		for(y = 0;y < col;y++) // esto nos movera por las columnas
		{
			if (x==1&&y==0)
			{
				matriz[x][y] = 46;
			}
			if (x==2&&y==8)
			{
				matriz[x][y] = 46;
			}
			if (x==4&&y==0)
			{
				matriz[x][y] = 46;
			}
			if ((x==5&&y==0)||(x==5&&y==3))
			{
				matriz[x][y] = 46;
			}
			if ((x==6&&y==0)||(x==6&&y==8))
			{
				matriz[x][y] = 46;
			}
			if ((x==7&&y==3)||(x==7&&y==6))
			{
				matriz[x][y] = 46;
			}
			if ((x==9&&y==0)||(x==9&&y==8))
			{
				matriz[x][y] = 46;
			}
			if ((x==11&&y==3)||(x==11&&y==6)||(x==11&y==8))
			{
				matriz[x][y] = 46;
			}
		}
	}
}
void Imprime_Matriz(int **matriz, int row, int col)
{
	int x,y;
	puts("Matriz");
	puts("-------------");
	for(y = 0;y < row;y++)
	{
		for(x = 0;x < col;x++)
		{
			fprintf(stdout,"%d\t",matriz[y][x]);
		}
		puts("\n");
	}
}
int Sondea(int **matriz, int PS, int* x, int* y)
{
	int casilla;
	casilla = matriz[x][y];
	if (casilla != 77)
	{
		/* code */
	}
}
void Recorrido(int op, int row, int col, int **matriz)
{
	int x = 0, y = 0;
	int PS = 0;
	switch (op)
	{
		case 1:
			while(PS < 10)
			{
				PS = Sondea(matriz, PS, &x, &y);
			}
			break;
		case 2:
			//code
			break;
		case 3:
			//code
			break;
		case 4:
			//code
			break;
	}
}