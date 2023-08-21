# *** função para calcular o factorial
# Obs: Factorial de 0 é igual a 1
def factorial(n):
    return 1 if (n == 0) else (n * factorial(n - 1))


# Leitura dos dados
numero = int(input("\n*** Digita um número:  "))

# Imprimindo o resultado
print(f"\n*** Factorial = {factorial(numero)}\n")
