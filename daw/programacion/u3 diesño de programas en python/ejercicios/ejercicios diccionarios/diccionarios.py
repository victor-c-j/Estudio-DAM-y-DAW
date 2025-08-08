
variable = "Hola"
variable = 12

lista = [1,5, 67, 89]
lista_palabras = ["azul", "verde", "amarilla"]


lista_alumnos = ["Javi", "Maximo", "Lucía"]


alumno1 = {
    "nombre": "Javier",
    "apellidos": "Pacheco",
    "mail": "jpacheco@safareyes.es",
}

alumno2= {
    "nombre": "Iván",
    "apellidos": "Ramos",
    "mail": "iramos@safareyes.es",
}



lista_alumnos_clase = []


lista_alumnos_clase.append(alumno1)
lista_alumnos_clase.append(alumno2)

print(lista_alumnos_clase)


#Ejercio 1 -> Saca el nombre del alumno 1
#Acceder al valor de una clave del diccionario
#print(alumno1["nombre"])

print("-----------------------------------")

#Necesito saber los nombres de todos los alumnos
for elemento in lista_alumnos_clase:
    nombre = elemento["nombre"]
    print(nombre)

print("-----------------------------------")

#Necesito saber la información que tengo que pedirle a cada alumno
#diccionario.keys()
lista_claves = alumno1.keys()
for key in lista_claves:
    print(key)


print("-----------------------------------")

#Necesito saber toda la informacion que almaceno del alumno
#diccionario.values()
lista_valores = alumno1.values()
for valor in lista_valores:
    print(valor)



print("-----------------------------------")

#Añadir una clave y un valor nuevo al diccionario
#diccionario["nombre_clave"] = valor nuevo

alumno1["telefono"] = 685747897
print(alumno1)


print("-----------------------------------")

#Modificamos un valor de una clave en un mapa
#diccionario["nombre_clave_modificar"] = valor nuevo

alumno1["nombre"] = "Pepe"
print(alumno1)



print("-----------------------------------")
#Obtener el valor de una clave
#diccionario["clave"]
#diccionario.get("clave")
print(alumno1["mail"])
print(alumno1.get("mail"))



#Alumnos de mi clase
alumno_base = {
    "nombre": "",
    "apellidos": "",
    "mail": "",
    "telefono": "",
}

alumnos = []

for al in range(30):
    alumn = alumno_base.copy()
    alumn["nombre"] = "Pepe"
    alumn["apellidos"] = "Martín"
    alumn["mail"] = "pmartin@safareyes.es"
    alumn["telefono"] = 668577845
    print(alumn)







