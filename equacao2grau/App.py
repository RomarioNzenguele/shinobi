"""
      ------------------- Fórmula
            delta = b*b - 4*a*c
            x1 = (- b + √delta)/2*a
            x2 = (- b - √delta)/2*a
"""
import math

print("\n========= Equação do IIº Grau ==========\n ")

a = int(input("a: "))
b = int(input("b: "))
c = int(input("c: "))

delta = pow(b, 2) - 4 * a * c
dmsg = "\n*** Delta = " + "({}^2) - 4*{}*{} = ".format(str(b), str(a), str(c))

# 1) Se delta for menor que zero;
if delta < 0:
    msg = dmsg + "{} < 0 \n\n -> logo a equação não possui resultados reais.\n\n".format(str(delta))
elif delta >= 0:  # 2) Se delta for igual ou maior do que zero.
    x1 = (-b + math.sqrt(delta)) / (2 * a)
    x2 = (-b - math.sqrt(delta)) / (2 * a)
    msg = dmsg + "{} > 0 \n\n -> logo a equação possui resultados reais: \n [(-b + √delta)/2.a]   X1 = {} \n [(-b - √delta)/2.a]   X2 = {}\n\n".format(
            str(delta), str(x1), str(x2))

# Imprimindo o resultado
print(msg)
