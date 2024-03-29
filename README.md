## ListDuplicate
Using a collection, double the word: Enter 5 words from the keyboard into the string list. The doubleValues method should double words according to the principle a, b, c -> a, a, b, b, c, c. Using the for loop, display the result on the screen, each value of a new line.
## Java Advanced  2. Collection Framework

## Завдання 2 
Використовуючи колекцію, підвійте слово:

1. Введіть із клавіатури 5 слів до списку рядків.

2. Метод doubleValues ​​повинен підвоювати слова за принципом a, b, c -> a, a, b, b, c, c.

3. Використовуючи цикл for виведіть результат на екран,

## Заметки

### IntStream

**IntStream** - это поток целых чисел (int) в Java. Он часто используется для генерации последовательности целых чисел и последующей обработки этой последовательности.
Он содержит множество методов для обработки данных, включая преобразование, фильтрацию, сортировку, агрегацию и другие операции. Некоторые из основных методов IntStream:

1. of(int... values) - создает IntStream из указанных значений
2. range(int startInclusive, int endExclusive) - создает IntStream из диапазона значений, начиная со startInclusive и заканчивая endExclusive
3. **iterate(int seed, IntUnaryOperator f)** - создает бесконечный IntStream, начиная со значения seed и применяя функцию f к предыдущему значению для получения следующего значения
4. filter(IntPredicate predicate) - фильтрует поток, оставляя только элементы, удовлетворяющие условию, заданному в предикате
5. map(IntUnaryOperator mapper) - применяет функцию mapper к каждому элементу потока и возвращает поток, содержащий результаты
6. **limit(long maxSize)** - ограничивает поток указанным максимальным количеством элементов
7. sorted() - сортирует элементы потока в естественном порядке
8. **forEach(IntConsumer action)** - выполняет заданное действие для каждого элемента потока
9. sum() - вычисляет сумму всех элементов потока
10. average() - вычисляет среднее значение всех элементов потока.

```
IntStream.iterate(0, i -> i + 2)
          .limit(dubbedList.size())
          .forEach(i -> dubbedList.add(i, dubbedList.get(i)));
```

Данный код создает бесконечный поток целых чисел, начиная с 0, каждый раз увеличивая его на 2. Затем он ограничивает размер потока до размера списка, который был задан.

Для каждого элемента потока выполняется лямбда-выражение, которое добавляет элемент в список по индексу i (начиная с 0), каждый раз увеличивая i на 2. Таким образом, элементы добавляются в четные индексы списка.

### Метод flatMap()

Метод **flatMap()** принимает функцию, которая преобразует каждый элемент исходного потока в другой поток, а затем объединяет все потоки в один общий поток. В результате, метод flatMap возвращает новый поток с тем же типом элементов, что и в потоке, который был возвращен функцией.

### Метод Stream.of()

Метод **Stream.of()** создает поток из переданных аргументов. В зависимости от количества аргументов, Stream.of может быть вызван в следующих форматах:

1. Stream.of(T t) - создает одноэлементный поток, содержащий элемент t.
2. Stream.of(T... values) - создает поток из переданных элементов. Этот метод принимает переменное количество аргументов, поэтому вы можете передавать любое количество элементов.

### Метод collect()

**collect()** - это метод в Java, используемый для сбора элементов из потока в коллекцию или другую структуру данных. Он является конечной операцией потока и используется для получения результата в виде списка, множества, массива или другой коллекции.

Основные методы collect():

1. **toList()**: собирает элементы потока в список
2. toSet(): собирает элементы потока в множество
3. toMap(): собирает элементы потока в карту с ключами и значениями, заданными в виде функций
4. toCollection(): собирает элементы потока в коллекцию, заданную в виде параметра
5. toConcurrentMap(): собирает элементы потока в параллельную карту с ключами и значениями, заданными в виде функций
6. toUnmodifiableList(): собирает элементы потока в неизменяемый список
7. toUnmodifiableSet(): собирает элементы потока в неизменяемое множество
8. toUnmodifiableMap(): собирает элементы потока в неизменяемую карту с ключами и значениями, заданными в виде функций

Кроме того, с помощью метода collect() можно определять свои собственные коллекторы.

```
list.stream()
    .flatMap(s -> Stream.of(s, s))
    .collect(Collectors.toList());
```
В этом коде:

1. Вызывается метод stream() на объекте List<String> list, который возвращает поток элементов списка.
2. Для каждого элемента потока создается новый поток Stream.of(s, s), в котором этот элемент повторяется дважды.
3. Созданные потоки объединяются в один поток с помощью метода flatMap.
4. Полученный поток элементов списка с дубликатами элементов собирается обратно в список с помощью метода collect и коллектора Collectors.toList().

Таким образом, метод flatMap применяется для раскрытия каждого элемента списка в два элемента-дубликата, после чего полученный поток объединяется в один. Результатом является список, содержащий удвоенные элементы из исходного списка.







