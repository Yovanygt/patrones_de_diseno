# Patrones de Diseño en Java

Este repositorio contiene ejemplos de cuatro patrones de diseño fundamentales implementados en Java: **Decorator**, **Observer**, **Singleton**, y **Facade**. Los ejemplos están diseñados para ser fáciles de entender y muestran cómo se pueden aplicar estos patrones en escenarios de la vida real.

---

## Patrones de diseño implementados:

### 1. Decorator

**Descripción:**  
El patrón **Decorator** se utiliza para agregar dinámicamente responsabilidades adicionales a un objeto. Los decoradores proporcionan una alternativa flexible a la subclase para extender la funcionalidad. Este patrón es útil cuando queremos añadir funcionalidad a objetos de manera transparente y sin alterar su estructura básica.

**Ejemplo:**  
En este ejemplo, tenemos un sistema de café donde podemos agregar decoraciones como leche y azúcar a un café básico sin modificar la clase original.

```java
Cafe miCafe = new CafeBasico();
miCafe = new ConLeche(miCafe);  // Agregar leche
miCafe = new ConAzucar(miCafe);  // Agregar azúcar
System.out.println(miCafe.descripcion() + " $" + miCafe.costo());
```
```java
Café básico $10.0
Café básico, con leche $12.0
Café básico, con leche, con azúcar $13.5
```
### 2. Observer


**Descripción:** 
El patrón Observer se utiliza cuando un objeto (el "sujeto") necesita notificar a varios observadores sobre cambios en su estado. Los observadores reaccionan automáticamente a estos cambios sin que el sujeto necesite conocer sus detalles.

**Ejemplo:** 
Hemos creado un sistema meteorológico que notifica automáticamente a las pantallas de temperatura cuando la temperatura cambia.

```java
Clima clima = new Clima();
clima.agregar(new PantallaTemperatura());
clima.setTemperatura(25);  // Notifica a las pantallas
```
```java
Pantalla actualizada: 25 grados.
Pantalla actualizada: 30 grados.
```

### 3. Singleton

**Descripción:** 
Descripción:
El patrón Singleton asegura que una clase tenga solo una instancia en todo el sistema y proporciona un punto global de acceso a esa instancia. Es útil para manejar recursos que deben ser únicos, como una conexión a la base de datos.

**Ejemplo:** 

En el código, la clase Configuracion implementa este patrón para asegurarse de que solo haya una instancia.

```java
Configuracion config1 = Configuracion.getInstancia();
Configuracion config2 = Configuracion.getInstancia();
System.out.println(config1 == config2);  // Verifica que ambas referencias sean iguales
```

```java
Mostrando configuración
true

```

### 4. Facade

**Descripción:** 
El patrón Facade proporciona una interfaz simplificada para un sistema complejo. Agrupa varias clases o subsistemas en una sola interfaz que los clientes pueden usar sin preocuparse por los detalles de implementación.

**Ejemplo:** 
Se ha implementado un sistema de cine con subsistemas para la compra de entradas, comida y la selección de películas. La clase CineFacade oculta la complejidad y permite disfrutar de la experiencia de cine con un solo método.

```java
CineFacade cine = new CineFacade();
cine.disfrutarCine("Avatar 2", "VIP", "Combo de palomitas y refresco");
```

```java
Películas disponibles:
1. Avatar 2
2. Avengers: Endgame
3. Joker
Película seleccionada: Avatar 2
Entrada comprada: VIP
Comida comprada: Combo de palomitas y refresco
¡Disfruta tu película!
```

---
### Instrucciones de ejecución: 
Para ejecutar los ejemplos, puedes clonar este repositorio y ejecutar cada archivo individualmente en tu entorno de desarrollo preferido. Asegúrate de tener configurado Java en tu sistema.

