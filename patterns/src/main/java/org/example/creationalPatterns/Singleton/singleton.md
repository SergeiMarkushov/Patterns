# ПАТТЕРН `SINGLETON` (ОДИНОЧКА)

## Название и классификация паттерна
### Одиночка — паттерн, порождающий объекты.

## Назначение
### Гарантирует, что у класса существует только один экземпляр, и предоставляет к нему глобальную точку доступа.

## Применимость
### Основные условия для применения паттерна одиночка:
- ### должен существовать ровно один экземпляр некоторого класса, к которому может обратиться любой клиент через известную точку доступа;
- ### единственный экземпляр должен расширяться путем порождения подклассов, а клиенты должны иметь возможность работать с расширенным экземпляром без модификации своего кода.
## Структура
![singletone](https://github.com/SergeiMarkushov/Patterns/blob/master/patterns/src/main/resources/images/singleton.png)

## [Пример](SingletonApp.java)