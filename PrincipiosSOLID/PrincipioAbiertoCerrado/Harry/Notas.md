# Notas
Las entidades de software deben estar abiertas para la extensión, pero cerradas para la modificación. 

Bertrand Meyer lo introdujó en 1988. El tío Bob lo añadió como la O en SOLID en el 2003. Hoy en día es una herramienta en contra de los "cambios en cascada". 

# Enfoque de Meyer (Herencia)
Mecanismo: Subclases que heredan y sobreescriben
Acopplamiento: La subclase depende de la clase base concreta
Uso Actual: Menos Común

# Enfoqiue de Martin (Polimorfismo)
Mecanismo: Interfaces/clases abstractas + implementaciones intercambiables
Acopplamiento: El cliente depende solo de la abstracción
Uso Actual: El más usado en la práctica moderna

# OCP Estático
Momento de resolución: Compilación
Mecanismos tipicos: Génericos/templates, CRTP
Flexibilidad en producción: Requiere recompilar para cambiar

# OCP Dinámico
Momento de resolución: Ejecución
Mecanismos típicos: Interfaces + polimorfismo
Flexibilidad en producción: Se puede cambiar sin compilar

# Analogía del Omnitrix
El funcionamiento interno del omnitrix no está abierto a modificación. Sin embargo, sus habilidades se pueden expandir al escanear nuevos aliens. 
Los supremos heredan su versión base. 

OCP Dinámico: Skurd se adhiere a Ben 10, dándole habilidades de otros aliens. 
OCP Estático: El Biomnitrix combina el ADN de dos aliens en un solo híbrido. Esa combinación se elije y queda fija antes de transformarse. 

# ¿Cuándo aplicarlo?
Cuando se idenitifica un punto de variacón real, como reglas de negocio que cambian frecuentemente. No para casos excepcionales extremos (riesgo de sobreingeniería).

# Ventajas y Desventajas
Ventajas:
Mayor flexibilidadd
Menor riesgo de romper codigo probado
Favorece plugins
Facilita Unit testing

Desventajas:
Riesgo de sobreingeniería
Más clases e interfaces