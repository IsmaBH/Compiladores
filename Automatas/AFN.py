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
		archivo.write('\n')
		archivo.writelines(self.AF)
		archivo.close()
	def agregar_transicion(self,inicio,fin,simbolo):
		#Metodo que agrega una transicion
		#al AFN cargado en memoria
		transicion = str(inicio)+'->'+str(fin)+','+simbolo+'\n'
		self.AF.append(transicion)
	def eliminar_transicion(self,inicio,fin,simbolo):
		#Metodo que elimina una transicion
		#al AFN cargado en memoria
		transicion = str(inicio)+'->'+str(fin)+','+simbolo+'\n'
		indice = self.AF.index(transicion)
		self.AF.pop(indice)
	def obtener_inicial(self):
		#Metodo que devuelve un entero con
		#el valor del estado incial
		#Este metodo busca el estado inicial en la lista
		#de estados iniciales que es un atributo de la clase
		#es necesario usar el metodo establecer_inicial
		#si es que se quiere modificar este valor
		e1 = int(self.inicial[0])
		return e1
	def obtener_finales(self):
		#Metodo que devuelve una lista con los estados
		#finales del AF, este valor se busca en la lista
		#que es atributo de la clase, por lo que es necesario
		#usar el metodo establecer_final si se quiere modificar
		ef = self.finales
		return ef
	def establecer_inicial(self,estado):
		#Metodo que dado un estado lo establece como
		#estado inicial en el AF cargado en memoria
		try:
			indice = self.AF.index(estado)
		except ValueError:
			print("El estado dado no existe")
		else:
			datos_e = re.findall("\d+",estado)
			self.inicial[0] = datos_e[0]
			n_inicial = self.AF.pop(indice)
			self.AF.insert(0,n_inicial)
	def establecer_final(self,estado):
		#Metodo que dado un estado lo añade a
		#la lista de estados finales del AF
		try:
			indice = self.AF.index(estado)
		except ValueError:
			print("El estado dado no existe")
		else:
			datos_e = re.findall("\d+",estado)
			self.finales.append(datos_e[0])
	def esAFN(self):
		#Metodo que verifica que el AF en memoria
		#sea un AFN, si esto se cumple devuelve True
		#de lo contrario devuelve False
		epsilon = 'E'
		contador = 0
		for i in range(len(self.AF)):
			if re.search(epsilon,self.AF[i]):
				for j in range(len(self.AF)):
					e = re.findall("\d+|\D+",self.AF[i])
					simbolo = e[3].strip(', \n')
					busqueda = e[0]+e[1]+str(j)+','+simbolo+'\n'
					repeticiones = self.AF.count(busqueda)
					if repeticiones >= 1:
						contador = contador + 1
				if contador >= 2:
					return True
		return False
	def esAFD(self):
		#Metodo que verifica que el AF en memoria
		#sea un AFD, si esto se cumple devuelve True
		#de lo contrario devuelve Flase
		epsilon = 'E'
		contador = 0
		for i in range(len(self.AF)):
			if re.search(epsilon,self.AF[i]):
				for j in range(len(self.AF)):
					e = re.findall("\d+|\D+",self.AF[i])
					simbolo = e[3].strip(', \n')
					busqueda = e[0]+e[1]+str(j)+','+simbolo+'\n'
					repeticiones = self.AF.count(busqueda)
					if repeticiones >= 1:
						contador = contador + 1
				if contador >= 2:
					return False
		return True
	def acepta(self,cadena):
		#Metodo que dado una cadena regresa un valor
		#de True o False dependiendo de si es aceptada
		#por el AF
		caracteres = re.findall(r".",cadena)
		for i in range(len(self.AF)):
			e = re.findall("\d+|\D+",self.AF[i])
			simbolo = e[3].strip(', \n')
			if ((simbolo == caracteres[0]) or (simbolo == 'E')):
				if self.finales.count(e[1]) == 1:
					return True
			else:
				caracteres.pop(0)
				if caracteres == []:
					return False
				continue
	def generar_cadena(self):
		#Metodo que regresa una cadena (String)
		#formada por el AFN
		pass