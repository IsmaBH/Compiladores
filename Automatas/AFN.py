import re
class AFN:
	"""docstring for AFN"""
	def __init__(self):
		super(AFN, self).__init__()
		self.AF = []
		self.inicial = 0
		self.finales = []
	#Metodos de la la clase
	def cargar_desde(self,nombre):
		#Metodo que recibe la ruta de acceso
		#para el archivo .af y lo carga en memoria
		archivo = open(nombre,'r')
		for linea in archivo:
			self.AF.append(linea.strip('\n').split('->'))
		archivo.close()
		self.inicial = re.findall("\d+",self.AF[0][0])
		self.finales = re.findall("\d+",self.AF[1][0])
		self.AF.pop(1)
		self.AF.pop(0)
	def guardar_en(nombre):
		#Metodo que recibe la ruta de acceso
		#para la carpeta donde se guardara un .af
	def agregar_transicion(inicio,fin,simbolo):
		#Metodo que agrega una transición al AFN
		#cargado en memoria
	def eliminar_transicion(inicio,fin,simbolo):
		#Metodo que elimina una transicion al AFN
		#cargado en memoria
	def obtener_inicial():
		#Metodo que devuelve un entero con el valor
		#del estado inicial
	def obtener_finales():
		#Metodo que devuelve una lista
		#con los estados finales
	def establecer_inicial(estado):
		#Metodo que dado un estado
		#lo establece como inicial
	def establecer_final(estado):
		#Metodo que dado un estado
		#lo establece como inicial
	def esAFN():
		#Metodo que comprueba que regresa
		#True si es un AFN y False en 
		#Cualquier otro caso
	def esAFD():
		#Metodo que comprueba que regresa
		#True si es un AFD y False en 
		#Cualquier otro caso
	def acepta(cadena):
		#Metodo que regresa True o False
		#para una cadena dada si es o no
		#aceptada por el automata
	def generar_cadena():
		#Metodo que regresa una cadena(String)
		#formada por el AFN