
/**
 * Write a description of class B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B implements Conjunto, Comparable<Conjunto>, Cloneable
{
    // instance variables - replace the example below with your own
    private Object objetos[];

    /**
     * Constructor for objects of class B
     */
    public B()
    {
        // initialise instance variables
        objetos = new Object[0];
    }

    /**
     * Añade objetos a la lista.
     */
    public void anadirElemento(Object o)
    {
        // Creamos una lista temporal, transpasamos todos los numeros con un
        // for, y añadimos el numero en la ultima posicion
        int tamanio = objetos.length;
        Object[] temporal = new Object[tamanio + 1];
        for(int i = 0; i < tamanio; i++)
        {
            temporal[i] = objetos[i];
        }
        temporal[tamanio] = o;
        // Por ultimo pasamos la lista temporal a lista
        objetos = temporal;
    }

    /**
     * Devuelve el numero de objetos de la lista.
     */
    public int getNumElementos()
    {
        return objetos.length;
    }

    /**
     * Muestra todos los objetos de la lista.
     */
    public void mostrar()
    {
        for(int i = 0; i < objetos.length; i++)
        {
            System.out.println(objetos[i].toString());
        }
    }

    /**
     * Compara el objeto con el introducido como parametro
     */
    @Override
    public int compareTo(Conjunto o)
    {
        int diferencia = o.getNumElementos() - this.getNumElementos();        
        return diferencia; 
    }

    /**
     * Crea una copia de la lista
     */
    @Override
    public Object clone()
    {
        B devolver = new B();
        Object[] temporal = objetos.clone();
        // Ahora los pasa a devolver
        for(int i = 0; i < temporal.length; i++)
        {
            devolver.anadirElemento(temporal[i]);
        }
        return devolver;
    }

    /**
     * Comprueba si el conjunto es igual a otro
     */
    @Override
    public boolean equals(Object o)
    {
        boolean iguales = true;
        if(o instanceof B)
        {
            B ob = (B)o;
            if(ob.getNumElementos() == this.getNumElementos())
            {
                // Deberia compararse ademas los objetos uno a uno entre si
            }
            else
            {
                iguales = false;
            }
        }
        else
        {
            iguales = false;
        }
        return iguales;
    }

    /**
     * Metodo HashCode
     */
    @Override
    public int hashCode()
    {
        int primo1 = 7;
        int primo2 = 13;
        return ((primo1*primo2) + getNumElementos());
    }
}
