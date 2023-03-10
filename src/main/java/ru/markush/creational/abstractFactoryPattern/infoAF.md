<h2> Абстрактная Фабрика </h2>
Идиома – фабрика, порождающая различные реализации объектов предопределенных интерфейсов.
Позволяет легко масштабировать вширь реализации связанных семейств классов при неизменной
логике клиентского кода.<br>
● Client – клиентский код, который использует исключительно интерфейсы, объявленные в
классах AbstractFactory и AbstractProduct.<br>
● AbstractFactory – объявляет интерфейс для операций, создающих абстрактные объекты
Продукты.<br>
● ConcreteFactory – конкретная фабрика, имплементирует операции создания конкретных
экземпляров классов объектов Продуктов.<br>
● AbstractProduct – абстрактный продукт, описывает интерфейс продукта, которым пользуется
клиент.<br>
● ConcreteProduct – конкретный продукт, конкретная реализация класса имплементирует
интерфейс AbstractProduct. Объекты этого класса создаются соответствующей реализацией
конкретной фабрики и клиенту не видны.<br>
<hr>
<h2>Достоинства, особенности</h2>
<hr>
● Открытая расширяемость при неизменном поведении клиентского кода.<br>
● Клиентский код не знает ничего о классах конкретной фабрики и конкретных продуктах, код
развязывается по зависимостям.<br>
● Конкретный объект фабричного класса обычно инстациируется в единственном экземпляре,
при этом часто используется паттерн Factory Method, в тоже время возможно
использование паттерна Singleton.<br>
● Право инстанциации конкретных классов продуктов остается за клиентским кодом – создает
только то, что потребно.<br>
<hr>
<h2>Недостатки</h2>
<hr>
● Жесткий нерасширяемый фабричный интерфейс и интерфейс продуктов. При модификации
интерфейса фабрики или продуктов изменения потребуется вносить во все, возможно,
многочисленные, реализации.<br>
