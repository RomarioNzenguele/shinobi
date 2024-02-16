# Numeros primos
# condições: qualquer número maior do que 1 que possui apenas dois divisores

 
# Definindo o limite de verificação
limite = int(input('Definir limite:'))

for i in range(1,limite+1):
    contador = 0
    for j in range(1, limite+1):
        if(i % j == 0):
            contador +=1
    if contador == 2 & i > 1: print(i, end=' ')