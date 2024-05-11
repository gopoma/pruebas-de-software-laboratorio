def sumar(x: float, y: float) -> float:
    return x + y

def restar(x: float, y: float) -> float:
    return x - y

def multiplicar(x: float, y: float) -> float:
    return x * y

def dividir(x: float, y: float) -> float:
    return x / y

def potenciar(x: float, y: float) -> float:
    return x ** y

def calcular(operacion: str, numeros: list[float]) -> float | str:
    if len(numeros) != 2:
        return "¡Se necesitan 2 números para la Calculadora!"
    
    numero1, numero2 = numeros
    
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

assert calcular("+", [1.5, 3]) == 4.5
assert calcular("-", [3, 10]) == -7
assert calcular("*", [3, 4]) == 12
assert calcular("/", [4.5, 3]) == 1.5
assert calcular("**", [2, 10]) == 1024
