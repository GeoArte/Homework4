public class Main
{
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 ()
    {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18)
        {
            System.out.println("    Если возраст человека равен " + age + ", то возраст совершеннолетия наступил.");
        }
        else
        {
            System.out.println("    Если возраст человека равен " + age + ", то возраст совершеннолетия не наступил.");
        }
    }

    public static void task2 ()
    {
        System.out.println("Задача 2");
        int temperature = 10;
        if (temperature < 5)
        {
            System.out.println("    На улице холодно, нужно надеть шапку");
        }
        else
        {
            System.out.println("    Сегодня тепло, можно идти без шапки");
        }
    }
    public static void task3 ()
    {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60)
        {
            System.out.println("    Если скорость " + speed + ", то придется заплатить штраф");
        }
        else
        {
            System.out.println("    Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4 ()
    {
        System.out.println("Задача 4");
        int age = 21;
        if (age < 2)
        {
            System.out.println("    Некоректное значение");
        }
        else
        {
            if (age < 6)
            {
                System.out.println("    Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
            }
            else
            {
                if (age < 18)
                {
                    System.out.println("    Если возраст человека равен " + age + ", то ему нужно ходить в школу");
                }
                else
                {
                    if (age < 24)
                    {
                        System.out.println("    Если возраст человека равен " + age + ", то ему нужно ходить в университет");
                    }
                    else
                    {
                        System.out.println("    Если возраст человека равен " + age + ", то ему нужно ходить на работу");
                    }
                }
            }
        }
    }
    public static void task5 ()
    {
        System.out.println("Задача 5");
        int age = 14;
        if (age < 5)
        {
            System.out.println("    Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        else
        {
            if (age < 14)
            {
                System.out.println("    Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении");
            }
            else
            {
                System.out.println("    Если возраст ребенка равен " + age + ", то ему можно кататься без сопровождения взрослого");
            }
        }
    }
    public static void task6 ()
    {
        System.out.println("Задача 6");
        int passengers = 145;
        if (passengers < 60)
        {
            System.out.println("    Если пассажиров " + passengers + ", то есть свободные сидячие места");
        }
        else
        {
            if (passengers < 102)
            {
                System.out.println("    Если пассажиров " + passengers + ", то свободных сидячих мест нет, но есть свободные стоячие места");
            }
            else
            {
                System.out.println("    Если пассажиров " + passengers + ", то свободных мест нет");
            }
        }
    }
    public static void task7 ()
    {
        System.out.println("Задача 7");
        int one = 65;
        int two = 34;
        int three = 136;
        if (one > two)
        {
            if (one > three)
            {
                System.out.println("    Первое число наибольшее");
            }
            else
            {
                System.out.println("    Третье число наибольшее");
            }
        }
        else
        {
            if (two > three)
            {
                System.out.println("    Второе число наибольшее");
            }
            else
            {
                System.out.println("    Третье число наибольшее");
            }
        }
    }
}

