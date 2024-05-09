def clasificar_triangulo(lado1: float, lado2: float, lado3: float) -> str:
    """
    Esta función clasifica un triángulo según sus lados.
    Args:
    lado1: La longitud del primer lado.
    lado2: La longitud del segundo lado.
    lado3: La longitud del tercer lado.
    Returns:
    Un string que indica si el triángulo es escaleno,
   isósceles, equilátero o inválido.
    """

    # Verificar tipos
    if type(lado1) != float or type(lado2) != float or type(lado3) != float:
        return "Triángulo inválido"

    # Verificar si el triángulo es válido
    if lado1 + lado2 <= lado3 or lado1 + lado3 <= lado2 or lado2 + lado3 <= lado1:
        return "Triángulo inválido"
    
    # Clasificar el triángulo
    if lado1 == lado2 == lado3:
        return "Triángulo equilátero"
    elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
        return "Triángulo isósceles"
    else:
        return "Triángulo escaleno"

"""
# Solicitar al usuario la longitud de los lados
lado1 = int(input("Ingrese la longitud del primer lado: "))
lado2 = int(input("Ingrese la longitud del segundo lado:"))
lado3 = int(input("Ingrese la longitud del tercer lado: "))

# Clasificar el triángulo y mostrar el resultado
clasificacion = clasificar_triangulo(lado1, lado2, lado3)
print(f"El triángulo es: {clasificacion}")
"""

# Caso de Prueba #1
clasificacion1 = clasificar_triangulo(0, 0, 0)
print(f"[Caso de Prueba #1] El triángulo es: {clasificacion1}")

# Caso de Prueba #2
clasificacion2 = clasificar_triangulo(-3, -4, -5)
print(f"[Caso de Prueba #2] El triángulo es: {clasificacion2}")

# Caso de Prueba #3
clasificacion3 = clasificar_triangulo(-3.1416, -4.79, -5.49)
print(f"[Caso de Prueba #3] El triángulo es: {clasificacion3}")

# Caso de Prueba #4
clasificacion4 = clasificar_triangulo(10, 12, 80)
print(f"[Caso de Prueba #4] El triángulo es: {clasificacion4}")

# Caso de Prueba #5
clasificacion5 = clasificar_triangulo(1.2, 2.4, 3.6)
print(f"[Caso de Prueba #5] El triángulo es: {clasificacion5}")

# Caso de Prueba #6
clasificacion6 = clasificar_triangulo(10, 10, 10)
print(f"[Caso de Prueba #6] El triángulo es: {clasificacion6}")

# Caso de Prueba #7
clasificacion7 = clasificar_triangulo(12.5, 12.5, 12.5)
print(f"[Caso de Prueba #7] El triángulo es: {clasificacion7}")

# Caso de Prueba #8
clasificacion8 = clasificar_triangulo(11, 11, 9)
print(f"[Caso de Prueba #8] El triángulo es: {clasificacion8}")

# Caso de Prueba #9
clasificacion9 = clasificar_triangulo(11.5, 11.5, 9.5)
print(f"[Caso de Prueba #9] El triángulo es: {clasificacion9}")

# Caso de Prueba #10
clasificacion10 = clasificar_triangulo(3, 4, 5)
print(f"[Caso de Prueba #10] El triángulo es: {clasificacion10}")

# Caso de Prueba #11
clasificacion11 = clasificar_triangulo(3.5, 4.5, 5.5)
print(f"[Caso de Prueba #11] El triángulo es: {clasificacion11}")

# Caso de Prueba #12
clasificacion12 = clasificar_triangulo(2.71828, 3.1416, 2)
print(f"[Caso de Prueba #12] El triángulo es: {clasificacion12}")

# Caso de Prueba #13
clasificacion13 = clasificar_triangulo(2.71828, 3.1416, 79)
print(f"[Caso de Prueba #13] El triángulo es: {clasificacion13}")

# Caso de Prueba #14
clasificacion14 = clasificar_triangulo(1, 2, 3)
print(f"[Caso de Prueba #14] El triángulo es: {clasificacion14}")

# Caso de Prueba #15
clasificacion15 = clasificar_triangulo(79, "EPIS", [1, 2, 3])
print(f"[Caso de Prueba #15] El triángulo es: {clasificacion15}")
