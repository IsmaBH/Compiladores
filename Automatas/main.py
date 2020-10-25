#Programa sencillo para probar las clases AFN y AFD
from AFN import AFN

af1 = AFN()
ruta = '../Automatas/prueba.af'
ruta2 = '../Automatas/prueba2.af'
af1.cargar_desde(ruta)
print(af1.AF)
print(af1.inicial)
print(af1.finales)
af1.guardar_en(ruta2)