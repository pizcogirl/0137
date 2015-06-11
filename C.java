import java.util.TreeMap;

/**
 * Write a description of class C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class C implements Conjunto, Comparable<Conjunto>, Cloneable
{
    // instance variables - replace the example below with your own
    private TreeMap<Integer, Object> objetos;
    // Contador para las keys del mapa
    private int numeracion;

    /**
     * Constructor for objects of class C
     */
    public C()
    {
        // initialise instance variables
        objetos = new TreeMap();
        numeracion = 0;
    }

    /**
     * Añade objetos a la lista.
     */
    public void anadirElemento(Object o)
    {
        objetos.put(numeracion, o);
        numeracion++;
    }

    /**
     * Devuelve el numero de objetos de la lista.
     */
    public int getNumElementos()
    {
        return objetos.size();
    }

    /**
     * Muestra todos los objetos de la lista.
     */
    public void mostrar()
    {
        for(int i = 0; i < objetos.size(); i++)
        {
            System.out.println(objetos.get(i).toString());
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
        C devolver = new C();
        TreeMap<Integer, Object> temp = new TreeMap<>(objetos);
        for(int i = 0; i < temp.size(); i++)
        {
            devolver.anadirElemento(temp.get(i));
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
        if(o instanceof C)
        {
            C ob = (C)o;
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
