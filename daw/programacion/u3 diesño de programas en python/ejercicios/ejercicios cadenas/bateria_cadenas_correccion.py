#EJERCICIO 1
def ejercicio_1():
    nombre_usuario = input("Escribe tu nombre:")
    print(nombre_usuario)

# ejercicio_1()


#EJERCICIO 2
def ejercicio_2_consola():
    texto = input("Escribe algo:")
    print(texto.upper())

def ejercicio_2_sin_consola(texto):
    print(texto.upper())


#EJERCICIO3
def ejercicio_3():
    texto = input("Escribe algo:")
    texto_usuario = "Tu palabra contiene {} aes. Contador -> {}"
    texto = texto.lower()
    texto = texto.replace("á", "a")
    contador = texto.count("a")
    print(texto_usuario.format(contador,contador))


# ejercicio_3()

#EJERCICIO4
def ejercicio_4(texto):
    print(texto[::-1])

# ejercicio_4("COLEGIO")


#EJERCICIO5
def ejercicio_5(texto):
    print(texto.replace(" ",""))

# ejercicio_5("   Esta semana hay liga intersemanal  ")

#EJERCICIO7
def ejercicio_6(texto):

    vocales = "aeiouAEUIOUáéíóúÁÉÍÓÚ"
    texto_final = ""

    for letra in texto:
        if letra in vocales:
            texto_final = texto_final + letra

    print(texto_final)



# ejercicio_6("mUerciélago")



#EJERCICIO 7
def ejercicio_7(texto):

    #contamos el número de espacios que tiene el texto y le sumamos 1
    contador_espacios = texto.count(" ") + 1
    print("Nuestro texto tiene " + str(contador_espacios) + " palabras")

# ejercicio_7("Esta semana hay champions y también europa league")


#EJERCICIO 8
def ejercicio_8(palabra):

    palabra_volteada = palabra[::-1]

    print("Palabra original:", palabra)
    print("Palabra volteada:", palabra_volteada)

    if palabra == palabra_volteada:
        print("Tu palabra es un palíndromo")
    else:
        print("No es palíndromo")

# ejercicio_8("reconocer")


def ejercicio9(palabra, letra1, letra2):

    print(palabra.replace(letra1, letra2))

def ejercicio9_interactivo():
    palabra = input("Dime una palabra:")
    letra1 = input("Dime que letra sustituyo:")
    letra2 = input("Por cúal letra sustituyo:")
    print("Tu palabra final es ", palabra.replace(letra1,letra2) )


# ejercicio9_interactivo()



def ejercicio10(texto):

    texto_final= ""

    for letra in texto:
        if letra.isalpha() or letra == " ":
            texto_final += letra

    print(texto_final)



ejercicio10("El miercoles 2 nos vamos de excursión")

