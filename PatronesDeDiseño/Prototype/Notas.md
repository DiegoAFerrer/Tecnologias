1. Prototype: Interfaz qye declara la funcion de clonacion
2. Concrete prototype implementa la funcion de clonacion
3. Cliente Solicita la clonacion al Concrete Prototype.

Shallow Copy: Se copian los valores pero la referencias internas siguen apuntando a los mismos objetos
Deep Copy: Se copian los objetos internos también

Ventajas y Desventajas:
Evitar repetir procesos de inicializacion
Permite copiar objetos complejos

Desventajas: 
La clonacion puede ser complicada
Hay que decidir entre shallow y deep copy
Las referencias a otros objetos pueden provocar problemas inesperados

