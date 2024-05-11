def sumar(x: float, y: float) -> float:
    return x + y

def restar(x: float, y: float) -> float:
    return x - y

def multiplicar(x: float, y: float) -> float:
    return x * y

def dividir(x: float, y: float) -> float:

    # Corrección al caso de prueba #6
    if y==0:
        return "No se puede dividir entre 0"
    return x / y

def potenciar(x: float, y: float) -> float:
    return x ** y

def calcular(operacion: str, numeros: list[float]) -> float | str:
    if len(numeros) != 2:
        return "¡Se necesitan 2 números para la Calculadora!"

    numero1, numero2 = numeros

    # Correción al caso de prueba #12
    if isinstance(numero1, str) or isinstance(numero2, str):
        return "Los valores ingresados deben ser números"
    
    if operacion == "+":
        return sumar(numero1, numero2)
    elif operacion == "-":
        return restar(numero1, numero2)
    elif operacion == "*":
        return multiplicar(numero1, numero2)
    elif operacion == "/":
        return dividir(numero1, numero2)
    elif operacion == "**":
        return potenciar(numero1, numero2)
    else:
        return "¡Operación inválida!"

    assert False

# Caso de Prueba #1.
assert calcular('+', [1, 5]) == 6

# Caso de Prueba #2.
assert calcular('-', [9, 8]) == 1

# Caso de Prueba #3
assert calcular('*', [10, 5]) == 50

# Caso de Prueba #4
assert calcular('**', [2, 5]) == 32

# Caso de Prueba #5
assert calcular('/', [10, 5]) == 2

# Caso de Prueba #6
assert calcular('/', [10, 0]) == "No se puede dividir entre 0"

# Caso de Prueba #7
assert calcular('+', [105.2, 53.8]) == 159

# Caso de Prueba #8
assert calcular('-', [10.5, -13.2]) == 23.7

# Caso de Prueba #9
assert calcular('*', [10.5, 0.5]) == 5.25

# Caso de Prueba #10
assert calcular('/', [97.25, 52.64]) == 1.847454407294833

# Caso de Prueba #11
assert calcular('**', [64, 0.5]) == 8

# Caso de Prueba #12
assert calcular('+', ["saludos", 5]) == "Los valores ingresados deben ser números"
assert calcular('-', [5, "saludos"]) == "Los valores ingresados deben ser números"

# Caso de Prueba #13
assert calcular('+', [115, 0]) == 115

# Caso de Prueba #14
assert calcular('*', [115, 0]) == 0

# Caso de Prueba #15
assert calcular('*', [115.25, 1]) == 115.25

# Caso de Prueba #16
assert calcular('**', [10, 1]) == 10

# Caso de Prueba #17
assert calcular('**', [115, 0]) == 1

# Caso de Prueba #18
assert calcular('**', [64, -0.5]) == 0.125

# Caso de Prueba #19
assert calcular('*/', [115, 0]) == "¡Operación inválida!"

# Caso de Prueba #20
assert calcular('+', [0]) == "¡Se necesitan 2 números para la Calculadora!"
