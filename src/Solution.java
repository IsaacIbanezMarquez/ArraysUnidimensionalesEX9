


import java.util.Arrays;
import java.util.Scanner;





public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // 9. Implementa l'algorisme de la búsqueda binària o dicotòmica:
        //    S'utilitza quan el vector en el qual volem determinar l'existència d'un element està prèviament ordenat. Aquest algoritme redueix el temps de cerca considerablement, ja que disminueix exponencialment el nombre d'iteracions necessàries.
        //    Està altament recomanat per buscar a un vector de grans dimensions. Per exemple, en un contenint 50.000.000 elements, realitza com a màxim 26 comparacions (en el pitjor dels casos).
        //    Per implementar aquest algorisme es compara l'element a buscar amb un element qualsevol de l'array (normalment l'element central): si el valor d'aquest és més gran que el de l'element buscat es repeteix el procediment a la part de l'array que va des de l'inici de aquest fins l'element pres, en cas contrari es pren la part de l'array que va des de l'element pres fins al final. D'aquesta manera obtenim intervals cada vegada més petits, fins que s'obtingui un interval indivisible. Si l'element no es troba dins d'aquest últim llavors es dedueix que l'element buscat no es troba en tot l'array.
        int counter, num, item, array[], first, last, middle;

        // Llegeix el tamany del vector
        Scanner input = new Scanner(System.in);
        System.out.println("Número d'elements del vector: ");
        num = input.nextInt();

        array = new int[num];

        // Creem un vector ordenat d'enters aleatoris entre 0 i 100
        for (counter = 0; counter < num; counter++)
            array[counter] = (int)(Math.random()*100);
        Arrays.sort(array);
        for (counter = 0; counter < num; counter++)
            System.out.print("a[" + counter + "]=" + array[counter] + " ");

        System.out.println("\nEscriu el número que vols buscar [0-100]: ");
        item = input.nextInt();
        input.close();

        counter = 0; // Comptador d'iteracions
        first = 0;
        last = num - 1;

        while (first <= last)
        {
            counter++;
            middle = ((last - first) / 2) + first;
            //middle = (first + last)/2;
            System.out.println("middle = "  + middle);

            if (array[middle] == item)
            {
                System.out.println(item + " trobat a la posición " + middle);
                break;
            }
            else if (array[middle] < item)
                first = middle + 1;
            else
                last = middle - 1;
        }

        if (first > last)
            System.out.println(item + " no trobat");

        System.out.println("Número d'iteracions: " + counter);
    }
}
