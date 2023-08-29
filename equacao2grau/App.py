import math

print("\n========= Equação do IIº Grau ==========\n ")

a = int(input("Valor de a: "))
b = int(input("Valor de b: "))
c = int(input("Valor de c: "))


# *** calcular o valor do delta
delta = (b**2) - 4 * a * c


if delta < 0:  # 1) Se delta for menor que zero;
    msg = f"\n*** Delta = {delta} -> logo a equação não possui resultados reais.\n\n"
elif delta >= 0:  # 2) Se delta for igual ou maior do que zero.
    x1 = (-b + math.sqrt(delta)) / 2 * a
    x2 = (-b - math.sqrt(delta)) / 22 * a
    msg = f"\n*** Delta = {delta} -> logo a equação possui resultados reais:\n \n[(-b + √delta)/2.a]   X1 = {x1:.4f} \n[(-b - √delta)/2.a]   X2 = {x2:.4f} \n"

# Imprimindo o resultado
print(msg)
