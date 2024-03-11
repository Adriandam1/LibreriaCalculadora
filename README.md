### Utiliza la app que calcula las cuatro operaciones básicas

## 1) Crea una rama nueva, que se llame "raices"

En el interfaz grafico de IntelliG click derecho en rama main -> New branch from 'main' y la llamo raices

## 2) Añade una nueva operación, que realize la raíz cuadrada o la raiz cúbica. El primer numero que mandamos es el radicando y el segundo el índice.
Crea una nueva static final raizcuadrada
Creo una nueva static final raizcubica
Creo una nueva static final raizcualquiera
Añado las opciones al switch case con el que realizo las operaciones
edito el texto de introducida de datos


## 3) Realiza varios commits según vayas avanzando en la programación
realizo los comits paso a paso

## 4) Mezcla con squash a la rama principal
En la interfaz grafica de IntelliG seccion "GIT"(abajo izquierda)
Nos situamos en la rama raices y: click derecho en main "merge raices into main".

## 5) Crea una nueva release y sube el nuevo jar con la nueva operación para que se pueda usar como una libreria.
Creacion de la release
git tag -a v1.0 -m 'my version 1.0'
uso git tag y compruebo que me sale la v1.0 correctamente

Creacion del jar:
en intelliG menu principal
    File -> Project Structure -> Artifacts ->
        le damos a + -> Jar -> From Modules with dependencies-> Seleccionamos Main class(cogemos el main)
        apply -> OK
en intelliG menu principal
    Build -> Build Artifacts -> Build
Ahora si nos vamos a la carpeta del projecto tendremos una carpeta out
    -> artifacts -> y dentro de la carpeta estara el .jar

## 6)¿Podrías hacer que calculara para cualquier tipo de índice, no solo raices cuadradas y cúbicas?
lo realizo en el punto2
