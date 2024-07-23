# PEN

- Pen is which can write
- Pen will have name, brand
- Pen can have Refill or Ink
- Some Pens can be Refillable.

```mermaid
    classDiagram

        class Pen {
            - String name
            - String brand
            - Pentype type
            - Refill refill
            - Ink ink
            - Nib nib
        }

        class Pentype {
            <<enumeration>>
            GEL,
            MARKER,
            FOUNTAIN,
            BALLPEN,

        }

```

- Here there are many problems, if we take fountain pen it doesn't have refill, and but it will have ink and nib.
- Whereas some pen has refill

so we solve by moving to child classes.

```mermaid

classDiagram

class Pen {
    <<abstract>>
    - String name
    - String brand
    - PenType pentype

    + void write()*
}

class BallPointPen {

    - Refill refill
    + void write()

}

class GelPen {
    - Refill refill
    + void write()

}

class FountainPen {
    - Ink ink
    -Nib nib

    + void write()
}


Pen <|-- GelPen
Pen <|-- BallPointPen
Pen <|-- FountainPen

class Refill{
    - Ink ink
    -Nib nib
}

class Ink {
    - InkType inktype
    - Color color
}

class Nib {
    -NibType nibtype
}


GelPen --o Refill
BallPointPen --o Refill
FountainPen --o Ink

Refill --* Nib
FountainPen --* Nib

```

- Here we are implementing write method in each type of pen, but some pens are having same implementing, we are duplicating code.

To solve this problem we use strategy design pattern

So here we can change the writin strategy at run time also.

```mermaid

classDiagram

class Pen {
    <<abstract>>
    - String name
    - String brand
    - PenType pentype
    - WritingStrategy writingstrategy

    + void write()*
}

class WritingStrategy {
    <<interface>>
    + void write()*
}

class SmoothWritingStrategy {
    + void write()
}

class DullWritingStrategy {
    + void write()
}

WritingStrategy  <|-- SmoothWritingStrategy
WritingStrategy  <|-- DullWritingStrategy
WritingStrategy o-- Pen

class BallPointPen {

    - Refill refill
    + void write()

}

class GelPen {
    - Refill refill
    + void write()

}

class FountainPen {
    - Ink ink
    -Nib nib

    + void write()
}


Pen <|-- GelPen
Pen <|-- BallPointPen
Pen <|-- FountainPen

class Refill{
    - Ink ink
    -Nib nib
}

class Ink {
    - InkType inktype
    - Color color
}

class Nib {
    -NibType nibtype
}


GelPen --o Refill
BallPointPen --o Refill
FountainPen --o Ink

Refill --* Nib
FountainPen --* Nib

```
