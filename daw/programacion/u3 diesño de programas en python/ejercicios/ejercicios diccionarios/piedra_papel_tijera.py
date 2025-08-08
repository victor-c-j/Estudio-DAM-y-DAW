

#PIEDRA PAPEL TIJERA

#Dos jugadores
# Un jugador es la máquina
    #Elegir una opción aleatoria en secreto
        #opciones = ["PIEDRA", "PAPEL", "TIJERAS"]
        #numero_aleatorio(0,2)
        #Seleccionar la opción de la lista que coincida con el número aleatorio

#marcadores
#Hacer 3 rondas

#Comprobar quien ha ganado
#Cada jugador de manera oculta elije una de entre tres opciones
    #Piedra
    #Papel
    #Tijera

#Se muestra la opción elejida por ambos jugadores
#Se decide quién gana
    #Piedra > Tijera
    #Tijera > Papel
    #Papel > Piedra
    #Empate -> Ambos jugadores selecciones lo mismo



import random

#INICIALIZA LOS MARCADORES A 0 AL EMPEZAR EL JUEGO
marcador_jugador = 0 #esta variable sirve para reflejar el num de rondas que gana el jugador
marcador_maquina = 0 #esta sirve para saber cuantar rondas gana la máquina

ronda = 0

while marcador_jugador<2 and marcador_maquina<2:

    print("----------------------------RONDA ",ronda ,"-----------------------------")

    opciones = ["PIEDRA", "PAPEL", "TIJERAS"]
    num_aleatorio = random.randint(0,2)
    opcion_escogida = opciones[num_aleatorio]


    #Preguntar al jugador cuál es la suya
    print("Elije entre estas tres opciones por su número")
    print("0-> PIEDRA")
    print("1-> PAPEL")
    print("2-> TIJERAS")
    num_jugador = input("¿Qué número quieres?")
    opcion_jugador = ""

    if num_jugador == "0":
        opcion_jugador = "PIEDRA"
    elif num_jugador == "1":
        opcion_jugador = "PAPEL"
    elif num_jugador == "2":
        opcion_jugador = "TIJERAS"
    else:
        print("Opción no válida")


    if opcion_jugador == opcion_escogida:
        print("EMPATE")
    else:
        if opcion_jugador == "PIEDRA" and opcion_escogida =="TIJERAS" or opcion_jugador == "PAPEL" and opcion_escogida =="PIEDRA" or opcion_jugador =="TIJERAS" and opcion_escogida == "PAPEL":
            print("HAS GANADO JUGADOR")
            marcador_jugador +=1
        else:
            print("HA GANADO LA MÁQUINA")
            marcador_maquina +=1

    print("OPCION MAQUINA->", opcion_escogida)
    print("OPCION JUGADOR->", opcion_jugador)

    print("marcador_jugador->", marcador_jugador)
    print("marcador_maquina->", marcador_maquina)

    ronda +=1


#DEFINIR GANADOR
if marcador_maquina == marcador_jugador:
    print("----------------JUEGO EMPATADO--------------------")
else:
    if marcador_jugador > marcador_maquina:
        print("----------------GANA EL JUGADOR--------------------")
    else:
        print("----------------GANA LA MAQUINA--------------------")









