import java.util.ArrayList;

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A implements Conjunto, Comparable<Conjunto>, Cloneable
{
    private ArrayList<Object> list;

    /**
     * Constructor for objects of class Biblioteca
     */
    public A()
    {
        // initialise instance variables
        list = new ArrayList<>();
    }

    /**
     * Añade objetos a la lista.
     */
    public void anadirElemento(Object o)
    {
        list.add(o);
    }

    /**
     * Devuelve el numero de objetos de la lista.
     */
    public int getNumElementos()
    {
        return list.size();
    }

    /**
     * Muestra todos los objetos de la lista.
     */
    public void mostrar()
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
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
        A devolver = new A();
        ArrayList<Object> temp = new ArrayList<>(list);
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
        if(o instanceof A)
        {
            A ob = (A)o;
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