package Exercise1;//Базовый уровень (для зачета нужно сделать хотя бы 2 из 3)
//Задача №1
//Дано: у нас есть две модели машин - жигули и toyota. Каждая из этих машин умеет: начинать движение,
//останавливаться, включать фары. У жигули есть особенность: она ломается. У Exercise1.Toyota особенность: включает музыку
//Необходимо:
// 1.Создать абстрактный класс, который будет описывать общие действия этих машин (методы будут не абстрактные)
// 2.Создать два класса, которые будут наследоваться от абстрактного класса, и реализовывать особенности этих машин
// Методы должны просто печатать на экран действия машин (начал движение, включил музыку и тд.)
//Продвинутый уровень
//Задача №1
// Сделать задачу №1 из базовой.
// 1. Создать класс Exercise1.Exercise1.CarFactory, у которого есть два статических методы: создать жигули, создать toyota.
// 2. Создать 20 тойот, 20 жигулей с помощью Exercise1.Exercise1.CarFactory, положить их в один массив.
// 3. Пройтись по массиву, проверить к какому классу принадлежит машина, привести тип к классу машины
// и вызвать характерные для нее методы.

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        Exercise1();


    }

    public static void Exercise1() {
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(CarFactory.CreateToyota());
            list.add(CarFactory.CreateZhiguli());
        }
        for (Car car : list) {
            if (car instanceof Toyota){
                Toyota toyota=(Toyota) car;
                toyota.Music();
            } else if (car instanceof Zhiguli){
                Zhiguli zhiguli=(Zhiguli) car;
                zhiguli.Crash();
            }
        }
    }

}
