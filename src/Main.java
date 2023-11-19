public class Animals {
    private String name;
    private int age;

    // Конструктор
    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Перевантажений метод toString()
    @Override
    public String toString() {
        return "Тварина: " + name + ", Вік: " + age + " років";
    }

    public static void main(String[] args) {
        // Створюємо об'єкт класу Animals
        Animals cat = new Animals("Кіт", 3);

        // Виводимо інформацію про тварину за допомогою методу toString()
        System.out.println(cat.toString());
    }
}