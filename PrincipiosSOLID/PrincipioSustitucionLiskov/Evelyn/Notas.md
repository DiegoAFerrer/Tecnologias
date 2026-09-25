Principio de Sustitución Liskov

Barbara Liskov es una científica de la computación profesora del MIT. 
Junto a Jeannette Wing desarrolló la idea de suptipado comportamental en 1994. 

Cualquier propiedad que pueda demostrarse sobre objetos del tipo supperior tambien debe mantenerse para objetos del subtipo. 

No exige más de lo que pedía el método original (precondiciones)

No entrega menos de lo que prometía el método original (postcondiciones)

No cambia el significado del método al sobrecargarlo.

El código cliente no necesita preguntar el tipo real del objeto para funcionar.

