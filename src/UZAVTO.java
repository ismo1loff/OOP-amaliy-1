public class UZAVTO
{
    public static void main(String[] args)
    {
        Main gentra = new Main();
        gentra.Model("Jentra");
        gentra.Color("Qora");
        gentra.Karopkasi("Avtomat");
        gentra.Narxi("16 000 $");

        Main Nexia3 = new Main();
        Nexia3.Model("Model");
        Nexia3.Color("Oq");
        Nexia3.Karopkasi("Mexanika");
        Nexia3.Narxi("10 000 $");

        System.out.println(gentra.equals(Nexia3));
    }
}
