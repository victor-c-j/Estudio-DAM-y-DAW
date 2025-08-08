
def ejercicio_1():

    nombres = ["Luis", "Alba", "José Ignacio"]
    print(nombres[1])
    nombres.append("José Carlos")
    print(nombres)


# ejercicio_1()


def ejercicio_2():

    numeros = [1,2,3,4,5]
    numeros[2] = 10
    numeros.pop()
    print(numeros)

#ejercicio_2()



def ejercicio_3():

    numeros = []
    for i in range(1,11):
        print(i)
        numeros.append(i)


# ejercicio_3()



def ejercicio_4():

    numeros = [1,2,3,4,5,6,7,8,9,10]

    pares = []

    for num in numeros:
        if num % 2 == 0:
            pares.append(num)

    print(pares)

# ejercicio_4()


def ejercicio_5():

    numeros = [1,2,3,4,5]

    sum = 0

    for num in numeros:
        sum += num


    print(sum)



#ejercicio_5()



def ejercicio_6():
    matriz = [[1,2,3],[4,5,6],[7,8,9]]
    suma = 0

    for fila in matriz:
        for columna in fila:
            suma += columna

    print(suma)



# ejercicio_6()




def ejercicio_7(lista_numeros):

    #Suman todos lo elementos / Divide entre el numero de elementos
    total = 0

    for num in lista_numeros:
        total += num

    promedio = total / len(lista_numeros)

    # promedio = sum(lista_numeros)/len(lista_numeros)


    return promedio
# print(ejercicio_7([5,9,8,7]))



def ejercicio_8(lista_notas):

    num_aprobados = 0
    num_suspensos = 0

    for nota in lista_notas:
        if nota >=5:
            num_aprobados += 1
        else:
            num_suspensos +=1
    print("El número de aprobados es :" , num_aprobados)
    print("El número de suspensos es :", num_suspensos)

# ejercicio_8([9,6,7,2,3,9])








def ejercicio_9(lista_nombres):
    lista_nombres.sort()
    print(lista_nombres)

# ejercicio_9(["Zoraida", "Arturo", "Belén", "Carlos", "Cristina", "Manuel", "Leonor"])







def ejercicio_10():
    lista_palabras = ["amarillo", "rojo", "verde", "azul"]
    palabra = input("Di un palabra:")
    palabra = palabra.strip()
    palabra = palabra.lower()

    if palabra in lista_palabras:
        print("Tu palabra coincide")
    else:
        print("Tu palabra no coincide")

# ejercicio_10()



