public class spielfeld1 {

    public static void main(String[] args)
    {
        int breite=10;
        int laenge=10;
        int ausgabe=0;
        int i=0;

        while(i<laenge)
        {
            for(i = 0; i < laenge; i++)
            {
                for(int index=0; index<breite; index++)
                {
                    ausgabe=ausgabe+1;
                    System.out.print(ausgabe+" ");
                }
                ausgabe=i+1;
                System.out.println();
            }}
    }}
