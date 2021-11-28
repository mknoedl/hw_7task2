public class Client {
    public static void main (String[] args) {
        OlympicsTeams taekwondo = new Taekwondo(5,0);
        OlympicsTeams waterpolo = new Waterpolo(10,1);
        OlympicsTeams artisticgym = new ArtisticGymnastics(3,1);
        WomensTeam chinawomen = new WomensTeam();
        chinawomen.addOlympicsTeams(taekwondo);
        chinawomen.addOlympicsTeams(waterpolo);
        chinawomen.addOlympicsTeams(artisticgym);
        OlympicsTeams shooting = new Shooting(6,2);
        MensTeam chinamen = new MensTeam();
        chinamen.addOlympicsTeams(shooting);
        ChinaTeam chinaTeam = new ChinaTeam();
        chinaTeam.addOlympicsTeams(chinawomen);
        chinaTeam.addOlympicsTeams(chinamen);
        AsiaTeam asiaTeam = new AsiaTeam();
        asiaTeam.addOlympicsTeams(chinaTeam);
        AfghanistanTeam afghanistanTeam = new AfghanistanTeam(7,3);
        asiaTeam.addOlympicsTeams(afghanistanTeam);
        AlpineSky alpineSky = new AlpineSky(6,4);
        Football football = new Football(30,3);
        SwimmingTeam swimmingTeam = new SwimmingTeam(17,9);
        WomensTeam italyWomen = new WomensTeam();
        italyWomen.addOlympicsTeams(alpineSky);
        MensTeam italyMen = new MensTeam();
        italyMen.addOlympicsTeams(football);
        italyMen.addOlympicsTeams(swimmingTeam);
        ItalyTeam italyTeam = new ItalyTeam();
        italyTeam.addOlympicsTeams(italyMen);
        italyTeam.addOlympicsTeams(italyWomen);
        EuropeTeam europeTeam = new EuropeTeam();
        europeTeam.addOlympicsTeams(italyTeam);

        System.out.println(chinaTeam.printTeamNameAndMembers());
        System.out.println(italyTeam.printTeamNameAndMedals());


    }
}
