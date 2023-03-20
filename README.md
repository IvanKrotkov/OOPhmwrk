# Задание первого семинара
*Реализовать класс товар с дальнейшими классами - наследниками*
* Общий класс продукт - [url](Seminar1/Product.java)
    * Класс продуктов питания [url](Seminar1/Food.java)
        * Класс хлеб
        * Класс яйца
    * Класс напитков [url](Seminar1/Beverages.java)
        * Молоко
        * Лимонад
    * Предметы гигены [url](Seminar1/HygieneItems.java)
        * Маски
        * Туалетная бумага
    * Товары для детей [url](Seminar1/ChildrensGoods.java)
      * Подгузники
      * Соска
* Результат [url](Seminar1/Programm.java)
# Задание второго семинара
>*Реализация классов животных и составления из них зоопарка в рамках ООП*
1. Основные классы -[url](Seminar2/GeneralClass)
   1. Класс животные - [url](Seminar2/GeneralClass/Animal.java)
   2. Класс птицы - [url](Seminar2/GeneralClass/Bird.java)
   3. Класс домашних животных - [url](Seminar2/GeneralClass/Pet.java)
   4. Класс диких животных - [url](Seminar2/GeneralClass/WildAnimal.java)
   5. Класс зоопарк - [url](Seminar2/GeneralClass/Zoo.java)
   6. Также сюда включил интерфейс менюшки - [url](Seminar2/GeneralClass/ConsoleMenu.java) 
2. Классы наследники - [url](Seminar2/DescendantClasses)
   1. Класс кошки - [url](Seminar2/DescendantClasses/Cat.java)
   2. Класс курица - [url](Seminar2/DescendantClasses/Chicken.java)
   3. Класс собака - [url](Seminar2/DescendantClasses/Dog.java)
   4. Класс аист - [url](Seminar2/DescendantClasses/Stork.java)
   5. Класс тигр - [url](Seminar2/DescendantClasses/Tiger.java)
   6. Класс волк - [url](Seminar2/DescendantClasses/Wolf.java)
3. Результат - [url](Seminar2/Programm.java)
# Задание третьего семинара 
>*Написать программу с геометрическими фигурами*
1. Основные классы - [GeneralClasses](Seminar3/GeneralClasses)
   * Общий класс фигур - [Figure](Seminar3/GeneralClasses/Figure.java)
   * Клас, для объединения фигур - [Geometry](Seminar3/GeneralClasses/Geometry.java)
   
   | **Сюда ещё можно отнести класс прямоугольников, поскольку от него наследуется
        квадрат, но всё же отнёс его к классу наследнику** |
2. Классы наследники - [DescendantClasses](Seminar3/DescendantClasses)
   * Класс окружность - [Cicrle](Seminar3/DescendantClasses/Circle.java)
   * Класс прямоугольник - [Rectangle](Seminar3/DescendantClasses/Rectangle.java)
   * Класс квадрат - [Square](Seminar3/DescendantClasses/Square.java)
   * Класс треугольники - [Triangle](Seminar3/DescendantClasses/Triangle.java)
3. Файл [Program](Seminar3/Program.java) в котором проверял работоспособность кода.

# Задание четвёртого семинара
>*Реализовать функционал для динамических массивов*
1. Класс для тестирования и интерфейс исключений - [AssistantsClass](Seminar4/AssistantsClass)
   * Интерфейс - [Exception](Seminar4/AssistantsClass/Exception.java)
   * Класс - [Worker](Seminar4/AssistantsClass/Worker.java)
2. Сам класс массивов - [GeneralClass](Seminar4/GeneralClass)
   * Класс - [Work](Seminar4/GeneralClass/Work.java)
3. Файл [Program](Seminar4/Program.java) в котором проверял работоспособность кода.
# Задание пятого семинара
>*Создать информационную систему позволяющую работать с cтудентами вуза*
1. Структура приложения - [Infrastructure](Seminar5/Infrasructure)
   * Всё что касается предметов и их оценивания - [Attestation](Seminar5/Infrasructure/Attestation)
     * Класс предметов - [Subjects](Seminar5/Infrasructure/Attestation/Subjects.java)
     * Класс расписания (список предметов и методы) - [Schedule](Seminar5/Infrasructure/Attestation/Schedule.java)
   * Работа с исключениями - [Exception](Seminar5/Infrasructure/Exception)
     * Исключение при выдаче диплома - [ExceptionIssuingDiploma](Seminar5/Infrasructure/Exception/ExceptionIssuingDiploma.java)
     * Исключение связанное с оцениванием предмета (задумывается, что преподаватель, 
не имеющий специализации по данному предмету не может его оценить) - [ExceptionAttestations](Seminar5/Infrasructure/Exception/ExceptionAttestations.java)
     * Исключение получения ученика или учителя из группы или рабочего коллектива соответственно - [ExceptionGettingHuman](Seminar5/Infrasructure/Exception/ExceptionGettingHuman.java)
   * Всё что относится к человеку - [People](Seminar5/Infrasructure/People)
     * Абстрактный класс человека, от которого наследуются преподаватели и студенты - [Human](Seminar5/Infrasructure/People/Human.java)
     * Класс студента - [Student](Seminar5/Infrasructure/People/Student.java)
     * Класс для группы ВУЗа (Учебная группа, рабочий коллектив преподавателей) - [StudyGroup](Seminar5/Infrasructure/People/StudyGroup.java)
     * Класс преподаватели - [Teacher](Seminar5/Infrasructure/People/Teacher.java)
   * Отдельный класс индетификатор, для предоставления ID - [Identificate](Seminar5/Infrasructure/Identificate.java) 
2. Ядро программы - [Core](Seminar5/Core)
    * Модель - [Model](Seminar5/Core/Model.java)
    * Вьюер - [View](Seminar5/Core/View.java)
    * Презентер - [Presenter](Seminar5/Core/Presenter.java)
3. Всё что относится к клиенту - [Client](Seminar5/Client)
   * Активация системы - [App](Seminar5/Client/App.java)
   * Запуск системы - [Programm](Seminar5/Client/Program.java)