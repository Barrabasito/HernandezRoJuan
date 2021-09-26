#*¿Alguien me escucha?*
>Cuando el Usuario opera sobre la interfaz, algo debera suceder.
>Para ello deberá programar manejadores de eventos (escuchadores)

**Componente**----->evento ocurrido------>**Escuchador**----->**Método(respuesta al evento)**

*Ejemplos de escuchadores*

* **WindowsListener** : Escuchador de ventanas.
* **ActionListener** :Escuhador de botones y otros componentes simples.
  
#*La espera activa*
• Una vez que la interfaz gráfica se ha “pintado” en la
pantalla…
• ¡…la aplicación queda a la espera, sin ejecutar
ningún código!

![Face Logo](https://www.lawebdelprogramador.com/usr/189000/189815/5637443e07111-calculadora-en-java.png)

Cuando se acciona sobre
la interfaz, el escuchador
correspondiente se
despierta.

#*¿Y traducido a código?*  
**import java.awt.event.*;** -->*Paquete que contiene los escuchadores*
**public class Escuchador implements ActionListener {**--->Los escuchadores suelen ser interfaces
**public void actionPerformed (ActionEvent e) {**--->Método que se despierta automáticamente
**System.out.println("Dentro del escuchador");**
**}**
**}**

#*¿Quién escucha a quién?*
• Si tengo múltiples componentes gráficos…
• …y puedo crear tantos escuchadores como
quiera…
• ¿Quién escucha a quién?
• Habremos de asociar, explícitamente, los
escuchadores a los componentes.
• Las posibles combinaciones son múltiples:
• Varios escuchadores asociados a un mismo
componente.
• Un escuchador asociado a varios componentes.

#*¿Cómo realizar la asociación?*
**import javax.swing.*;**
**public class Ejemplo2 extends JFrame {**
**JButton miBoton = new JButton ("Púlsame");**
**Escuchador miEscuchador = new Escuchador();**--->Creamos una instancia del escuchador que corresponda
**public Ejemplo2 () {**
**getContentPane().add(miBoton);**
**miBoton.addActionListener(miEscuchador);**--->Asociamos el escuchador al componente
**}**
**public static void main (String[] arg) {**
**Ejemplo2 ventana = new Ejemplo2();**
**ventana.setSize(200, 200);**
**ventana.setVisible(true);**
**}**
**}**

#¿Qué parte del escuchador se despierta?*
• Los escuchadores tienen diferentes métodos para
escuchar los distintos eventos.
• Java invoca automáticamente el método oportuno,
dependiendo del evento.
• El cuerpo de dichos métodos lo programaremos
nosotros, pudiendo invocar desde él a otros
métodos.
• Cuando el método termina su ejecución el
programa vuelve a quedarse a la espera de nuevos
eventos.
• Estos métodos reciben un objeto evento como
argumento.

**Ejemplo:**
**WindowListener**

>Entre los métodos que ofrece están:
• void windowClosing (WindowEvent evt)
• void windowOpened (WindowEvent evt)
• void windowClosed (WindowEvent evt)
• void windowIconified (WindowEvent evt)
• void windowDeiconified (WindowEvent evt)
• void windowActivated (WindowEvent evt)
• void windowDeactivated (WindowEvent evt)

#*¿Puedo saber más cosas sobre los eventos?*
• El evento que reciben como
argumento los métodos de los
escuchadores lo pasa Java
automáticamente.
• “Preguntando” a ese objeto
evento puedo averiguar más
cosas sobre lo que realmente
ocurrió.
• Preguntar, como siempre, supone
invocar los distintos métodos del
objeto evento.

*Ejemplo*

**import java.awt.event.*;**
**public class Escuchador implements ActionListener {**
**public void actionPerformed (ActionEvent e) {**--->Argumento que pasa Java automáticamente
**String fuente = e.getActionCommand();**-->Devuelve la etiqueta del componente sobre el que se produjo el evento 
**System.out.println("Botón que produjo el evento: " + fuente);**
**}**
**}**

#*Programación orientada a eventos*

• Todo lo visto no es más que un caso particular de
una técnica de programación muy importante y
extendida: la Programación Orientada a Eventos.
• En un programa todo está bien planeado: se sabe a
priori cuándo va a ocurrir…
• …¿Cómo tener en cuenta entonces aquellos
sucesos del mundo exterior que no sabemos con
certeza cuándo ocurrirán?
• ¿Cuándo se abrirá esa puerta?
• ¿Cuándo llegará a hervir el agua?
• ¿Cuándo pulsará el usuario tal botón?
• Los programas tienen mecanismos que les
permiten reaccionar (“despertar”) cuando ocurren
determinados eventos en el mundo exterior.

#*Organización del código*

• Todo lo visto se rige por los principios de la OO ya
conocidos…
• …por lo tanto todo lo que conocemos hasta la
fecha es perfectamente válido aquí.
• Lo único que hemos visto son nuevas piezas del
mecano…
• …que pueden mezclarse entre sí y con el resto de
piezas de la forma en que nos parezca oportuno.
• Ejemplos:
• Poner los escuchadores en clases independientes.
• Poner los escuchadores como clases internas.
• Que los propios componentes gráficos actúen como
escuchadores.
• Escuchadores asociados a más de un elemento
gráfico.

#*Adaptadores*

• Algunas interfaces de escuchadores tienen muchos
métodos…
• …que habremos de implementar en su totalidad
(son interfaces).
• Los adaptadores son clases que implementan de
serie todos los métodos de un escuchador
determinado.
• Como son clases, basta con heredarlas y reescribir
los métodos que necesitemos.
• Para cada interfaz Listener, hay una clase Adapter:
• **WindowListener** -> WindowAdapter
• **KeyListener** -> KeyAdapter
• **MouseListener** -> MouseAdapter