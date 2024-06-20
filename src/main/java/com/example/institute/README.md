# CODE INSTITUTE

- [Home](../../../../../../README.md)

## CONTENTS

- [CODE INSTITUTE](#code-institute)
  - [CONTENTS](#contents)
    - [version-1](#version-1)
      - [USECASE Diagram](#usecase-diagram)
      - [Class Diagram](#class-diagram)
      - [Schema Design](#schema-design)

### version-1

Following are the requirements of the Institute application:

• A **student** should be able to login with their **email address** and **password**.
• Students should be able to view their profile which includes their **name**, email address and **phone number**.

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
