productos = {
    'M001': ['Alimento Premium', 'comida', 'DogPlus', 10, True, False],
    'M002': ['Arena Aglomerante', 'higiene', 'CatClean', 8, False, False],
    'M003': ['Snack Dental', 'snack', 'BiteJoy', 1, True, True],
    'M004': ['Shampoo Suave', 'higiene', 'PetCare', 0.5, False, True],
    'M005': ['Correa Nylon', 'accesorio', 'WalkPro', 0.3, True, False],
    'M006': ['Cama Mediana', 'accesorio', 'CozyPet', 2, False, False],
} 

stock = stock = {
    'M001': [32990, 12],
    'M002': [9990, 0],
    'M003': [5490, 25],
    'M004': [7990, 5],
    'M005': [11990, 7],
    'M006': [24990, 3],
}

def buscar_codigo(codigo):
    if codigo in stock:
        return True
    else:
        return False


def mostrar_menu():
    print("""
========== MENÚ PRINCIPAL ==========
1. Unidades por categoría
2. Búsqueda de productos por rango de precio
3. Actualizar precio de producto
4. Agregar producto
5. Eliminar producto
6. Salir
=====================================
          """)
    
def unidades_categoria(categoria):
    categoria = input("Ingrese una categoria (Higiene | Comida | Snack | Accesorio): ").strip().lower()
    if categoria in productos:
        print(stock)[1] #se me olvido como hacer esto. . .
    else:
        print("No existe categoria")

def busqueda_precio(p_min, p_max):
    a = True
    while a:
        try:
            p_min = int(input("Ingrese el precio minimo: "))
            p_max = int(input("Ingrese el precio maximo: "))
            if p_min >= 0 and p_max >= 0:
                for p_min, p_max in stock:
                    print("--- Productos encontrados ---")
                    print(f"Nombre:",[productos]["Nombre"])
                    print(f"Precio:",[stock]["Precio"]) 
                a = False
            else:
                print("Error: debe ser un numero mayor a 0.")
        except ValueError:
            print("Error: debe ser un numero entero.")

def actualizar_precio(codigo, nuevo_precio):
    try:
        codigo = int(input("Ingrese el codigo: "))
        if buscar_codigo(codigo):
            nuevo_precio("Ingrese nuevo precio: ")
            nuevo_precio["Precio"]
    except ValueError:
        print("Error: codigo invalido.")

def codigo(producto):
    codigo = int(input("Ingrese el codigo: ")).strip()
    if codigo in productos and codigo in stock:
        print("Error: codigo ya existe.")
        return False
    return True

def nombre(producto):
    nombre = input("Ingrese el nombre: ").strip().lower()
    return True

def categoria(producto):
    categoria = input("Ingrese la categoria").strip().lower()
    return True

def marca(producto):
    marca = input("Ingrese la marca: ").strip().lower()
    return True

def peso_kg(producto):
    peso_kg = float(input("Ingrese el peso (en kg): ")).isdigit()
    if peso_kg < 0:
        return False
    return True

def importado(producto):
    es_importado = input("Es importado? (s/n): ").lower()
    if es_importado == "s":
        return True
    else:
        es_importado == "n"
        return False

def cachorro(producto):
    cachorro = input("Es para cachorro? (s/n): ").lower()
    if cachorro == "s":
        return True
    else:
        cachorro == "n"
        return False

def precio(producto):
    precio = int(input("Ingrese el precio: ")).isdigit()
    if precio > 0:
        return True
    return False

def unidades(producto):
    unidades = int(input("Ingrese las unidades: ")).isdigit()
    if unidades >= 0:
        return True
    return False

def agregar_producto(codigo,nombre,categoria,marca,peso_kg,es_importado,cachorro,peso,unidades):
    codigo(productos)
    nombre(productos)
    categoria(productos)
    marca(productos)
    peso_kg(productos)
    es_importado(productos)
    cachorro(productos)
    peso(productos)

def main():
    opcion = 0
    while opcion != 6:
        mostrar_menu()
        opcion = int(input("Ingrese opcion: "))
        match opcion:
                case 1:
                    unidades_categoria(categoria)
                case 2:
                    busqueda_precio()
                case 3:
                    actualizar_precio()
                case 4:
                    agregar_producto()

main()
