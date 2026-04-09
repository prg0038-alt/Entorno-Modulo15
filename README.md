#MODELO 15

# Práctica: Pruebas Unitarias con JUnit 5 en VS Code

## Objetivo
Aprender a configurar un entorno de desarrollo para Java fuera de IntelliJ, utilizando **Visual Studio Code** y **Maven** para gestionar tests unitarios con **JUnit 5**.

---

## 1. Configuración del Proyecto
1. Abrir VS Code y pulsar `F1` (o `Ctrl+Shift+P`).
2. Buscar: `Java: Create Java Project`.
3. Elegir **Maven** y luego la opción `maven-archetype-quickstart`.
4. Seleccionar la última versión disponible.
5. Configurar:
   - **GroupId**: `entornos`
   - **ArtifactId**: `test-vscode`
6. Elegir carpeta de destino y pulsar `Enter` hasta que termine la creación del proyecto.

---

## 2. Configuración de JUnit 5
En el archivo `pom.xml`, dentro de `<dependencies>`, agregar:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency># Entorno-Modulo15
```
---

##3.Cacturas de pantalla 

<img width="833" height="436" alt="image" src="https://github.com/user-attachments/assets/ba78f2f3-daf0-4efa-8272-6f39e0649817" />

<img width="875" height="746" alt="image" src="https://github.com/user-attachments/assets/880cfddf-40b2-488a-8ed7-17b0a6cc1448" />

<img width="929" height="639" alt="image" src="https://github.com/user-attachments/assets/f06f8c65-6315-4dc2-aff2-bcc83be40dd4" />





