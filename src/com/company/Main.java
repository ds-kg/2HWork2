package com.company;

public class Main {
//    b)  Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние,
//    с отличающимися полями)+++
//    c)  Создать Интерфейс Printable с методом void print()+++
//    d)  Реализовать интерфейс Printable классами 2й, 3й и 4й,
//    переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.
//    e)  В классе Main создать возвращаемый метод createObject(String className),
//    который умеет создавать объекты класса 2й, 3й и 4й и после создания и задания свойств объекту
//    метод возвращает ссылку на объект (пульт). Можно использовать switch для того чтоб определить
//    какого типа нужно создать экземпляр объекта. Например если в параметре передается “2й” метод
//    должен создать объект именно этого типа.
//    f)  В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода
//    createObject, и распечатать по ним информацию методом print();

    public static void main(String[] args) {

        Printable[] print = {createObject("Mers"), createObject("BMW"), createObject("Mazda")};

//        for (int i = 0; i < print.length; i++) {
//            print[i].print();
//            }
        for (Printable printable:print) {
            printable.print();
        }
    }

    public static Cars createObject(String className) {

        switch (className) {
            case "Mers":
                Mers mers = new Mers("Mers", 2006, 4);
                return mers;
            case "BMW":
                BMW bmw = new BMW("BMW", 2005, 5);
                return bmw;
            case "Mazda":
                Mazda mazda = new Mazda("Mazda", 2006, 3);
                return mazda;
        }
        return null;
    }
}
