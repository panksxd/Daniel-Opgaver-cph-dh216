public class Chance extends Field {
    private String options = "j";
    public Chance(int id, String label, int cost, int income) {
        super(id, label, cost, income);
    }
    @Override
    public String onLand(Player p){
        String s = super.onLand(p);
               s+= "\n Træk et kort fra bunken. (Tast J): ";

        return s;
    }
    //Todo:implementer denne metode sådan at der bliver trukket et kort fra bunken (se Task 2.b)
    @Override
    public String onAccept(Player p)
    {
        if(options.equalsIgnoreCase("j"))
        {
            ChanceCard c = Board.getChanceCard();
            if(c.udgift == 0)
            {
                p.pay(-c.getIndkomst());
                return c.getMsg();
            }
            else
            {
                p.pay(c.getUdgift());
                return c.getMsg();
            }

        }


        return "";
    }

}
