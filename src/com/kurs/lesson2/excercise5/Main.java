package src.com.kurs.lesson2.excercise5;

public class Main {
    /*
     * Ok to masz graczy ktorzy graja w turniejach. Turniej ma nazwe i miesiac.
     * Gracz ma imie i nazwisko.
     *
     * 
     * 1) chcemy przechowywac dla kazdego gracza jakie pozycje zajmowal w jakim
     * turnieju
     * 
     * 2) tak samo punkty jakie zdobyl z dnaego turnieju
     * 
     * 3) znajdz gracsa ktory byl najlepeszt w turniejach o danej nazwie, jesli nie
     * ma to rzuc wyjatkiem
     * 
     * 4) znajdz gracza ktory zodbyl najwiecej 1 miejsc ze wszystkich turniejow
     * 
     * 5) znajdz gracza ktory ma najwyzsyz ranking z turrniejow ale nigdycnie mial 1
     * miejsca
     */
    public static void main(String[] args) {
        Tournament tournament1=new Tournament("Puchar1", MONTH.FEBRUARY);
        Tournament tournament2=new Tournament("Puchar2", MONTH.MARCH);

        Player player1=new Player("John", "Doe");
        Player player2=new Player("Peter", "Bubu");

        player1.addResult(tournament1, 2, 20);
        player1.addResult(tournament2, 1, 30);
        player2.addResult(tournament1, 1, 30);
        player2.addResult(tournament2, 3, 10);
    }
}
