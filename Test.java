import java.util.Random;

/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    /**
     * Constructor for objects of class Test
     */
    public Test()
    {
        Random rand = new Random();
        Conjunto objeto1 = generaConjunto(rand.nextInt(3));
        Conjunto objeto2 = generaConjunto(rand.nextInt(3));
        // Añade objetos aleatorios a ambos, entre 2 y 7
        int numObjetos1 = rand.nextInt(5) + 2;
        for(int i = 0; i < numObjetos1; i++)
        {
            objeto1.anadirElemento(generaObjeto(rand.nextInt(3)));
        }
        int numObjetos2 = rand.nextInt(5) + 2;
        for(int i = 0; i < numObjetos2; i++)
        {
            objeto2.anadirElemento(generaObjeto(rand.nextInt(3)));
        }

        // Compara los objetos
        System.out.println("Tamaño de objeto 1: " + objeto1.getNumElementos());
        System.out.println("Tamaño de objeto 2: " + objeto2.getNumElementos());
        System.out.println("Compara el objeto 1 con el objeto 2:");
        comparaObjetos(objeto1, objeto2);
        System.out.println("Clonamos el objeto 1:");
        clonaObjetos(objeto1);
        System.out.println("Clonamos el objeto 2:");
        clonaObjetos(objeto2);
    }

    public Conjunto generaConjunto(int aleatorio)
    {
        Conjunto objeto = null;
        switch(aleatorio)
        {
            case 0:
            objeto = new A();
            break;
            case 1:
            objeto = new B();
            break;
            case 2:
            objeto = new C();
            break;
        }
        return objeto;
    }

    public Object generaObjeto(int aleatorio)
    {
        Object objeto = null;
        switch(aleatorio)
        {
            case 0:
            objeto = new String("ea");
            break;
            case 1:
            objeto = new Integer(2);
            break;
            case 2:
            objeto = new Float(1F);
            break;
        }
        return objeto;
    }

    public void comparaObjetos(Conjunto objeto1, Conjunto objeto2)
    {
        int dif = 0;
        if(objeto1 instanceof A)
        {
            dif = ((A)objeto1).compareTo(objeto2);
        }
        else if(objeto1 instanceof B)
        {
            dif = ((B)objeto1).compareTo(objeto2);
        }
        else if (objeto1 instanceof C)
        {
            dif = ((C)objeto1).compareTo(objeto2);
        }
        if(dif > 0)
        {
            System.out.println("El objeto 2 es mayor.");
        }
        else if(dif < 0)
        {
            System.out.println("El objeto 1 es mayor.");
        }
        else
        {
            System.out.println("Los objetos son iguales de tamaño.");
        }
    }

    public void clonaObjetos(Conjunto objeto1)
    {
        if(objeto1 instanceof A)
        {
            System.out.println("El objeto y su clon no son el mismo objeto (objeto.clone() != objeto): " + (((A)objeto1).clone() != objeto1));
            System.out.println("El objeto y su clon son de la misma clase (objeto.clone().getClass() == objeto.getClass()): " + (((A)objeto1).clone().getClass() == objeto1.getClass()));
            System.out.println("El objeto y su clon son iguales (objeto.clone().equals(objeto)): " + (((A)objeto1).clone().equals(objeto1)));
        }
        else if(objeto1 instanceof B)
        {
            System.out.println("El objeto y su clon no son el mismo objeto (objeto.clone() != objeto): " + (((B)objeto1).clone() != objeto1));
            System.out.println("El objeto y su clon son de la misma clase (objeto.clone().getClass() == objeto.getClass()): " + (((B)objeto1).clone().getClass() == objeto1.getClass()));
            System.out.println("El objeto y su clon son iguales (objeto.clone().equals(objeto)): " + (((B)objeto1).clone().equals(objeto1)));
        }
        else if (objeto1 instanceof C)
        {
            System.out.println("El objeto y su clon no son el mismo objeto (objeto.clone() != objeto): " + (((C)objeto1).clone() != objeto1));
            System.out.println("El objeto y su clon son de la misma clase (objeto.clone().getClass() == objeto.getClass()): " + (((C)objeto1).clone().getClass() == objeto1.getClass()));
            System.out.println("El objeto y su clon son iguales (objeto.clone().equals(objeto)): " + (((C)objeto1).clone().equals(objeto1)));
        }

    }
}
