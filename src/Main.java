public class Main {

    public static void main(String[] args) {
        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik) */
        /*
        int i = 1000;
        i = 1000;
        System.out.println("\n");
        do {
            System.out.print("\nLiczba: " + i);

            if (i % 91 == 0)
            {
                System.out.println(" jest podzielna przez 91");
            }
        }
        while (--i > 0);
    }
        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        /* a) */

        /*
        int[] tab1 = {6, 9, 5, 100, 88};
        int a = 0;
        while (i < 5)
        {
            System.out.println("i " + a + ": " + tab1[a]);
            ++a;
        }
        */

        /* b) */

        /*
        {
            double[] tab2 = {2.20, 5.1, 7, 10, 0.5};
            int a = 0;
            while (a < 5) {
                System.out.println("liczba " + a + ": " + tab2[a]);
                ++a;
            }
        }
        \*



        /* c) */

        /*
            {
            String[] tab3 = {"Kamil", "Basia", "Dominik", "Ludwiga", "Beata"};
            int a = 0;
            while (a < 5) {
                System.out.println("Imie " + a + ": " + tab3[a]);
                ++a;
            }
        \*


        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
      /*

      while (true)
      {
      System.out.println("halo");
      }

      */

        /*

       while (false)
       {
       System.out.println("halo");
        }

        */


        }
    }
}