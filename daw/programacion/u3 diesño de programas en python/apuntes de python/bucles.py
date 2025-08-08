

#BUCLES

lista = ["perro", "gato", "cerdo", "león", "tigre", "delfín", "rata"]


for animal in lista:
    if len(animal) == 4:
        print(animal)



for i in range(15,35):
    print(i)


def comprobar_contrasenya(contrasenya):
    caracteres_obligatorios = ".-*"
    contador_digitos = 0
    contador_caracter_especial = 0
    for letra in contrasenya:
        if letra.isdigit():
            contador_digitos += 1
        if letra in caracteres_obligatorios:
            contador_caracter_especial += 1

    if contador_digitos == 2 and len(contrasenya) >= 8 and contador_caracter_especial >= 1:
        print("Contraseña correcta")
    else:
        print("Contraseña incorrecta")

comprobar_contrasenya("pata-ta12")
comprobar_contrasenya("safa23pt-")
comprobar_contrasenya("alumno98-")
comprobar_contrasenya("contrasenyainsegura")
comprobar_contrasenya("12345698798465")



