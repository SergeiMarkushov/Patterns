# ПАТТЕРН `FACADE` (ФАСАД)

## Название и классификация паттерна
### Фасад — паттерн, структурирующий объекты.

## Назначение
### Предоставляет унифицированный интерфейс вместо набора интерфейсов некоторой подсистемы. Фасад определяет интерфейс более высокого уровня, который упрощает использование подсистемы.


## Применимость
### Основные условия для применения паттерна фасад:
- ### предоставление простого интерфейса к сложной подсистеме.
    ### Часто подсистемы усложняются по мере развития. Применение большинства паттернов приводит к тому, что в системе появляется множество мелких классов. Такую подсистему проще повторно использовать и настраивать под конкретные нужды, но вместе с тем применять подсистему тем клиентам, которым не нужно ее настраивать, становится труднее. Фасад предлагает некоторый вид системы по умолчанию, устраивающий большинство клиентов. И лишь те клиенты, которым нужны более широкие возможности настройки, могут напрямую обратиться к тому, что находится за фасадом;
- ### многочисленные зависимости между клиентами и классами реализации абстракции.
    ### Фасад позволяет отделить подсистему как от клиентов, так и от других подсистем, что, в свою очередь, способствует независимости подсистем и повышению уровня переносимости;
- ### требуется разложить подсистему на отдельные уровни. 
  ### Используйте фасад для определения точки входа на каждый уровень подсистемы. Если подсистемы зависят друг от друга, то зависимости можно упростить, разрешив подсистемам обмениваться информацией только через фасады.

## Структура
![facade](https://github.com/SergeiMarkushov/Patterns/blob/master/patterns/src/main/resources/images/facade.png)

## [ПРИМЕР](FacadePattern.java)