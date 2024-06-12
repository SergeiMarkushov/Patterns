ПАТТЕРН TEMPLATE METHOD (ШАБЛОННЫЙ МЕТОД)

Название и классификация паттерна
Шаблонный метод — паттерн поведения классов.

Назначение
Шаблонный метод определяет основу алгоритма и позволяет подклассам пере-
определить некоторые шаги алгоритма, не изменяя его структуру в целом.

Мотивация
Рассмотрим каркас приложения, в котором имеются классы Application
и Document. Класс Application отвечает за открытие существующих докумен-
тов, хранящихся во внешнем формате (например, в файле). Объект класса
Document представляет информацию документа после его прочтения из файла.
Приложения, построенные на базе этого каркаса, могут порождать подклассы
от классов Application и Document, отвечающие конкретным потребностям.


Структура
![teplateMethod](/images/teplateMethod.png)