public class AfishaManager {
    
    private int maxNumberMovies = 10;
    private Movies[] items = new Movies[0];

    public AfishaManager() {}
    public AfishaManager(int limitNumberMovies) {
        this.maxNumberMovies = limitNumberMovies;
    }

    public void add(Movies film) {
        Movies[] addMovies = new Movies[items.length + 1];
        for(int i = 0; i < items.length; i++) {
            addMovies[i] = items[i];
        }
        addMovies[addMovies.length -1] = film;

    }

//    public String[] findAll() {
//
//    }
//
//    public String[] findLast() {
//
//    }
//{"Бладшот", "Вперёд", "Отель", "Игла", "Выживший", "По соображениям совести", "Пианист"};

}
