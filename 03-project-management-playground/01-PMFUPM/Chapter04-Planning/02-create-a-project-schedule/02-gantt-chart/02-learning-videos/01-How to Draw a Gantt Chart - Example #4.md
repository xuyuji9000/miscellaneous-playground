Refer to this [video](https://www.youtube.com/watch?v=D9xNrD3APg4).

| Activity | Predecessor    | Duration  |
|----------|----------------|-----------|
| A        | -              | 2         |
| B        | -              | 3         |
| C        | -              | 1         |
| D        | A              | 2         |
| E        | B,C            | 4         |
| F        | D              | 1         |
| G        | D,E            | 3         |
| H        | F,G            | 5         |
| I        | G              | 3         |
| J        | E              | 2         |


``` mermaid
    gantt
        dateFormat  YYYY-MM-DD
        title Simple Project Gantt Chart

        section A section
        Task A           :a1        , 2024-03-01    ,           2d
        Task B           :b1        , 2024-03-01    ,           3d
        Task C           :c1        , 2024-03-01    ,           1d

        Task D           :d1        , after a1      ,           2d
        Task E           :e1        , after b1 c1   ,           4d
        Task F           :f1        , after d1      ,           1d
        Task G           :g1        , after d1 e1   ,           3d
        Task H           :h1        , after f1 g1   ,           5d
        Task I           :i1        , after g1      ,           3d
        Task J           :j1        , after e1      ,           2d
        
```
