import re
import pickle
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
			self.AF.append(linea)
		archivo.close()
		self.inicial = re.findall("\d+",self.AF[0])
		self.finales = re.findall("\d+",self.AF[1])
		self.AF.pop(1)
		self.AF.pop(0)
	def guardar_en(self,nombre):
		#Metodo que recibe la ruta de acceso
		#para la carpeta donde se guardara un .af
		archivo = open(nombre,'w')
		archivo.write('inicial:'+self.inicial[0]+'\n')
		archivo.write('finales:')
		archivo.close()
		archivo = open(nombre,'a')
		archivo.writelines(self.finales)
		archivo.writelines(self.AF)
		archivo.close()
	def agregar_transicion(self,inicio,final,simbolo):
		#Metodo que agrega una transicion
		#al AFN cargado en memoria
		pass