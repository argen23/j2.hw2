package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----xiaomi----");
        createObject("Xiaomi").print();
        System.out.println("-----huawei----");
        createObject("Huawei").print();
        System.out.println("-----asus------");
        createObject("Asus").print();


    }
    public static Printable createObject(String className){
        Printable modelPh = null;

    switch(className){
        case "Xiaomi":
            modelPh = new Xiaomi("sony imx 686 ",4 , 4500 ,5);
            break;

        case "Huawei":
            modelPh = new Huawei("sony uwu", 6 , "chinese" ,334355);
            break;
        case "Asus":
            modelPh = new Asus("sony HD 4k",7, 2019," Россия ");
            break;
    }


        return modelPh;
    }

}
//    Доделать все пункты практического задания из презентации.
// b)  Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
// c)  Создать Интерфейс Printable с методом void print();
// d)  Реализовать интерфейс Printable классами 2й, 3й и 4й,
// переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.
// e)  В классе Main создать возвращаемый метод createObject(String className),
// который умеет создавать объекты класса 2й, 3й и 4й и после создания и задания свойств объекту
// метод возвращает ссылку на объект (пульт). Можно использовать switch для того чтоб определить
// какого типа нужно создать экземпляр объекта. Например если в параметре передается “2й” метод
// должен создать объект именно этого типа.
// f)  В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createOcject,
// и распечатать по ним информацию методом print()