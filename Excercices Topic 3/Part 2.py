#Segunda parte:
#Crear una clase coche.
#Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
#Una función que incremente el número de puertas que tiene el coche.
#Crear un objeto miCoche en el main y añadirle una puerta.
#Mostrar el número de puertas que tiene el objeto.
class Coche(object):
	
	numPuertas = int;

	def __init__(self, numPuertas):
		self.numPuertas = numPuertas;

	def aumentarPuertas(self, num):
		self.numPuertas += num;

if __name__ == '__main__':
	#Definimos el número de puertas como 3 y creamos el objeto
	miCoche =  Coche(3);
	#Aumentamos una puerta
	miCoche.aumentarPuertas(1);
	#Imprimimos y confirmamos
	print(miCoche.numPuertas);	
