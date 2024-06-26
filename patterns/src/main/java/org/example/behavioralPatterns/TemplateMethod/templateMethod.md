# ПАТТЕРН `TEMPLATE METHOD` (ШАБЛОННЫЙ МЕТОД)

## Название и классификация паттерна
### Шаблонный метод — паттерн поведения классов.

## Назначение
### Шаблонный метод определяет основу алгоритма и позволяет подклассам переопределить некоторые шаги алгоритма, не изменяя его структуру в целом.

## Применимость
### Основные условия для применения паттерна шаблонный метод:
- ### однократное использование инвариантных частей алгоритма, при этом реализация изменяющегося поведения остается на усмотрение подклассов;
    ### необходимость вычленить и локализовать в одном классе поведение, общее для всех подклассов, чтобы избежать дублирования кода. Это хороший пример техники «вынесения за скобки с целью обобщения», описанной в работе Уильяма Опдайка (William Opdyke) и Ральфа Джонсона (Ralph Johnson) [OJ93]. Сначала выявляются различия в существующем коде, которые затем выносятся в отдельные операции. В конечном итоге различающиеся фрагменты кода заменяются шаблонным методом, из которого вызываются новые операции;
- ### управление расширениями подклассов. Шаблонный метод можно определить так, что он будет вызывать операции-зацепки (hooks) — см. раздел «Результаты» — в определенных точках, разрешив тем самым расширение только в этих точках.

## Структура
![templateMethod](https://github.com/SergeiMarkushov/Patterns/blob/master/patterns/src/main/resources/images/templateMethod.png)

## [ПРИМЕР](TemplateMethodApp.java)