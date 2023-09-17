import java.math.BigDecimal;

public class TiposDeDatos {

    /*TIPOS DE DATOS PRIMITIVOS*/
    /**
     * Estos tipos de datos primitivos son eficientes en cuanto a memoria y rendimiento, ya que
     * representan valores directamente en la memoria y no requieren la creación de objetos como
     * ocurre con las clases envoltorio (por ejemplo, Integer, Double, Boolean, etc.).
     * Cada uno de estos tipos tiene un tamaño fijo en memoria, lo que permite un control
     * preciso sobre el uso de recursos en una aplicación Java.
     */
    byte aByte; // Almacena enteros de 8 bits con signo. Su rango va desde -128 hasta 127.

    short aShort; // Almacena enteros de 16 bits con signo. Su rango va desde -32,768 hasta 32,767.

    int anInt; // Almacena enteros de 32 bits con signo. Su rango va desde -2^31 hasta 2^31 - 1.

    long aLong; // Almacena enteros de 64 bits con signo. Su rango va desde -2^63 hasta 2^63 - 1.

    float aFloat; // Almacena números de punto flotante de precisión simple de 32 bits. Puede representar números decimales con aproximadamente 7 dígitos de precisión.

    double aDouble; // Almacena números de punto flotante de precisión doble de 64 bits. Puede representar números decimales con aproximadamente 15 dígitos de precisión.

    char aChar; // Almacena un solo carácter Unicode de 16 bits. Se utiliza para representar caracteres individuales.

    boolean aBoolean; // Almacena valores verdadero (true) o falso (false). Se utiliza para representar valores lógicos.


    /*clases wraper*/

    /*
    *  Los tipos de datos envoltorios, también conocidos como clases envoltorios o wrapper classes, son clases en Java que se utilizan para
    *  encapsular y proporcionar funcionalidad adicional a los tipos de datos primitivos. Estas clases envoltorios
    *  son parte de la biblioteca estándar de Java (java.lang)*/

    Integer integer; //Envuelve el tipo de dato primitivo int. Proporciona métodos para realizar operaciones y conversiones con números enteros.

    Double bDouble; //Envuelve el tipo de dato primitivo double. Ofrece métodos para realizar operaciones y conversiones con números de punto flotante de precisión doble.

    Float bFloat; //Envuelve el tipo de dato primitivo float. Similar a Double, pero para números de punto flotante de precisión simple.

    Character character; //Envuelve el tipo de dato primitivo char. Se utiliza para representar caracteres individuales y proporciona métodos para trabajar con ellos.

    Boolean bBoolean; //Envuelve el tipo de dato primitivo boolean. Representa valores lógicos true o false y ofrece métodos para realizar operaciones lógicas.

    Byte bByte; //Envuelve el tipo de dato primitivo byte. Proporciona métodos para trabajar con números enteros de 8 bits con signo.

    Short bShort; //Envuelve el tipo de dato primitivo short. Similar a Byte, pero para números enteros de 16 bits con signo.

    BigDecimal bigDecimal; //es mas preciso al momento ejecutar oper mat


    ///567.990

}
