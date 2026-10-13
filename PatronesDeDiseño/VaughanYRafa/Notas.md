# Patrones de Diseño

Son modelos reutilizables para problemas recurrentes de diseño. Describen como organizar clases y objetos, sus responsabilidades y relaciones.

Ayudan a facilitar el mantenimiento y reutilización
Comunicar soluciones mediante un vocabulario común
Evaluar alternativas y sus consecuentias

Cada patrón debe elegirse según el problema y el contexto

La Gang of Four (conformada por Erich Gamma, Richard Helm, Ralph Johnson, John Vlissodes) publicaron Design Patterns en 1994 donde recompilaron 23 patrones de diseño. Definieron tres categorías:
Creacionales: Organizan como se crean los objetos y flexibilizan el proceso
Estructurales: Definen como combinar clases y objetos paara formar estructuras más grandes
De Comportamiento: Organizar como colaboran los objetos y como se distribuyen sus responsabilidades

# Singleton
Es un patrón creacional que controla la creación de instancias de una clase. Su característica principal es mantener una única instancia compartida


Características:
Un constructor privado para restringir la creación directa
Campo estático que conserva la instancia
Propiedad que permite acceder a ella

Ventajas y Limitaciones
Permite compartir una instancia
Mantiene estado
Crear la instancia de forma segura no garantiza operaciones seguras entre hilos

Se considera un antipatrón proquue introduce un estado global oculto y un alto acoplamiento, lo que dificulta las pruebas unitarias.