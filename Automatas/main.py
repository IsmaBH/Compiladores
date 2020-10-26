#Programa sencillo para probar las clases AFN y AFD
from AFN import AFN

#Instancia de la clase AFN
af1 = AFN()
#Rutas para los metodos de carga y guardado
ruta = '../Automatas/prueba.af'
ruta2 = '../Automatas/prueba2.af'
#Ejecución del metodo cargar
af1.cargar_desde(ruta)
#Se muestra que la carga fue exitosa en pantalla
print(af1.AF)
#Ejecución del metodo guardar
af1.guardar_en(ruta2)
#Ejecución del metodo agregar_transicion
af1.agregar_transicion(11,12,'E')
#Se muestra que se agrego la transicion
print(af1.AF)
#Ejecucion del metodo eliminar_transicion
af1.eliminar_transicion(10,11,'b')
#Mostramos que se elimino la penultima transicion
print(af1.AF)
#Ejecución del metodo obtener_inicial
e_inicial = af1.obtener_inicial()
#Lo mostramos en pantalla
print('El estado inicial es '+str(e_inicial))
#Ejecucion del metodo obtener_finales
e_finales = af1.obtener_finales()
#Los mostramos en pantalla
print('Los estados finales son: ')
for i in range(len(e_finales)):
	print(e_finales[i])
#Ejecucion del metodo establecer_inicial
#af1.establecer_inicial('2->3,E\n')
#comprobamos que los datos se modificaron correctamente
#print(af1.AF)
#e_inicial = af1.obtener_inicial()
#print('El nuevo estado inicial es '+str(e_inicial))
#Ejecucion del metodo establecer_final
af1.establecer_final('19->10,b\n')
#mostramos en pantalla la nueva lista de finales
e_finales = af1.obtener_finales()
print('Los estados finales son: ')
for i in range(len(e_finales)):
	print(e_finales[i])
#Ejecucion del metodo esAFN
print(af1.esAFN())
#Ejecucion del metodo esAFD
print(af1.esAFD())
#Ejecucion del metodo acepta
print(af1.acepta('aabb'))