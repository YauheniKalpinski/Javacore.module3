public enum SeasonsOfYear {
    WINTER("Cold", 90),
    SPRING("humid", 88),
    SUMMER("HOT", 90),
    AUTUMN("Rainy", 87);

    private String description;
    private int countOfDays;

    private  SeasonsOfYear(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() { return description; }
    public int getCountOfDays() { return countOfDays; }

    public static String returnNextSeason(String season) {
        SeasonsOfYear [] allSeasons  = SeasonsOfYear.values(); //массив всех объектов сезонов с полями
        for (SeasonsOfYear s: SeasonsOfYear.values()){
            if(s.name().equalsIgnoreCase(season.trim())){
                SeasonsOfYear currentSeason = SeasonsOfYear.valueOf(season.toUpperCase());//приводим string к enum
                int index = (currentSeason.ordinal() + 1) % allSeasons .length;//%4 потому что 4 элемента
                return allSeasons [index].name();
            }
        }
        return "Данного сезона не существует";
    }
}

