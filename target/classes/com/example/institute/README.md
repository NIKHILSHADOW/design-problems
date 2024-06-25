# CODE INSTITUTE

- [Home](../../../../../../README.md)

## CONTENTS

- [CODE INSTITUTE](#code-institute)
  - [CONTENTS](#contents)
    - [version-1](#version-1)
      - [USECASE Diagram](#usecase-diagram)
      - [Class Diagram](#class-diagram)
      - [Schema Design](#schema-design)
    - [Version-2](#version-2)
      - [Usecase Diagram](#usecase-diagram-1)
      - [Class Diagram](#class-diagram-1)
      - [Schema Design](#schema-design-1)
    - [Version-3](#version-3)
      - [UseCase Diagram](#usecase-diagram-2)
      - [Class Diagram](#class-diagram-2)
      - [Schema Diagram](#schema-diagram)
    - [Version-4](#version-4)
      - [Class Diagram](#class-diagram-3)
      - [Schema Design](#schema-design-2)

### version-1

Following are the requirements of the Institute application:

- A **student** should be able to login with their **email address** and **password**.
- Students should be able to view their profile which includes their **name**, email address and **phone number**.

#### USECASE Diagram

![Institute-v1](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/NIKHILSHADOW/design-problems/master/src/main/java/com/example/institute/static/institute.iuml)

#### Class Diagram

```mermaid

    classDiagram

    class Student {
        - String name
        - String email
        - String phoneNumber
        - String password

        + login() boolean
        + viewProfile() StudentResponse
    }
```

#### Schema Design

```mermaid
erDiagram

    Students {
        id int PK
        name varchar(34)
        email varchar(45)
        password varchar(45)
        phonenumber varchar(45)
    }
```

### Version-2

- We will provide multiple courses as a part of the Institute application.
- Every student can enroll for a single course.
- Every course has a name.

#### Usecase Diagram

![Institute-v2](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/NIKHILSHADOW/design-problems/master/src/main/java/com/example/institute/static/institute-v2.iuml)

#### Class Diagram

```mermaid

    classDiagram

        class Student {
            - String name
            - String email
            - String password
            - String phoneNumber
            - Course course
        }

        class Course {
            - String name
        }


        Student "m" --o "1" Course

```

#### Schema Design

```mermaid
    erDiagram

        Students {
            id int PK
            name varchar(40)
            email varchar(40)
            phone varchar(40)
            password varchar(40)
            course_id int FK
        }

        Courses {
            id int PK
            name varchar(40)
        }
```

### Version-3

- Each student can enroll for exactly 4 courses

#### UseCase Diagram

![Institute-v2](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/NIKHILSHADOW/design-problems/master/src/main/java/com/example/institute/static/institute-v2.iuml)

#### Class Diagram

```mermaid

    classDiagram
        class Student {
            - int id
            - String name
            - String email
            - String password
            - String phone
            - Course[] course
        }

        class Course {
            - int id
            - String name
        }

        Student "m" --o "n" Course
```

#### Schema Diagram

```mermaid
    erDiagram

    Students {
        id int PK
        name varchar(40)
        email varchar(40)
        password varchar(40)
        phone varchar(15)
    }

    Courses {
        id int FK
        name varchar(30)
    }

    Student_Courses {
        id int PK
        Student_id int
        Course_id int
    }

```

### Version-4

- Institute will provide different **modules** for students to learn i.e. Data Structures, Algorithms, etc.
- Each **student** can enroll for **multiple modules**.
- Each **module** will have **multiple exams**.
- Each **exam** has a **name** and a **duration**.
- One **exam** can be part of **multiple modules**.
- For each **exam**, the **student** will be given a **score**.

#### Class Diagram

```mermaid
    classDiagram
        class Student {
            - String name
            - String email
            - String phone
            - String password
            - Module[] modules
        }

        class Module {
            - name String
            - Exam[] exams
        }

        class Exam {
            - name String
            - duration int
        }

        Student "m" --o "n" Module

        Module "m" --o "n" Exam


```

#### Schema Design

```mermaid

    erDiagram

    Students {
        id int PK
        name varchar(30)
        email varchar(30)
        password varchar(30)
        phone varchar(30)
    }

    Modules {
        id int Pk
        name varchar(30)
    }

    Exam {
        id int PK
        name varchar(30)
        duration int
    }

    Student_Module {
        id int PK
        student_id int
        module_id int
    }

    Module_Exam {
        id int PK
        module_id int
        student_id int
    }


    Student_Exam {
        id int Pk
        exam_id int
        student_id int
        module_id int
        score int
    }




```
