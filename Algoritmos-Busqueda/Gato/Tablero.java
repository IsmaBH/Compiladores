public class Tablero{
	//Atributos de la clase
	int[][] matrix;
	//Constructor de la clase
	public Tablero(int col,int row){
		this.matrix = new int[col][row];
	}
	//Metodos de la clase
	//Inicializacion
	public void initMatriz(){
		for (int i = 0; i < matrix.length ; i++ ) {
			for (int j = 0; j < matrix[i].length ; j++ ) {
				this.matrix[i][j] = 0;
			}
		}
	}
	//Corrimientos
	//Siguiente estado de la matriz(En desarrollo)
	public Matriz nextStat(Matriz mat, int num){
		for (int i = 0; i < matrix.length ; i++ ) {
			for (int j = 0; j < matrix[i].length ; j++ ) {
				matrix[]
			}
		}
	}
}