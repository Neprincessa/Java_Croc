## Задача 2

Вы разрабатываете небольшое приложение по аннотированию (разметке) изображений с целью последующего использования этой разметки для обучения моделей computer vision. В этом приложении пользователь может выделять области на изображении с помщью прямоугольников и окружностей и подписывать их произвольным текстом.
Прямоугольники определяются координатами левого нижнего и правого верхнего углов, а окружности - координатами центра и радиусом. Вся разметка для изображения представляется массивом Annotation[].
Определен класс Annotation для представления данных разметки (подпись + фигура) и классы Figure, BoundingBox, Circle для задания размеченных областей.

Есть возможность перемещать уже размеченные области. Для поддержки новой функциональности внесено несколько изменений: 

1) выбор аннотации по координатам точки (x, y);

В массиве аннотаций требуется найти первую, фигура которой содержит точку с заданными координатами.

Annotation findByPoint(Annotation[] annotations, int x, int y) {
  // ...
}

2) перемещение фигуры выбранной аннотации на смещение (dx, dy);

В рамках этого изменения реализован интерфейс

public interface Moveable {
  
  void move(int dx, int dy);
}
