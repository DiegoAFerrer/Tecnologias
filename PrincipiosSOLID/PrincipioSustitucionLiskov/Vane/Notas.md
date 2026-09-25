Barbara Liskov presenta la idea en 1987 de la sustitución en su keynote de OOPSLA. 

El principio:
Si una propiedad es verdadera para los objetos tipo T, también debe serlo para los objetos de cualquier subtipo S de T.

Donde el código espera un objeto de la calse base, debe póder recibir uno de una clase derivada sin errores ni comportamientos inesperados. 

Si se necesita comprobar el tipo concreto o lanzar NotSupportedException, se debe checar el diseño. 