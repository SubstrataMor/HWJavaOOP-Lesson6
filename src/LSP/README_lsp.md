## L — Liskov Substitution Principle (Принцип подстановки Барбары Лисков)
`Если П является подтипом Т, то любые объекты типа Т, присутствующие в программе, 
могут заменяться объектами типа П без негативных последствий для функциональности программы.`

Требует возможности использования любых порожденных классов на месте родительских.
При этом они должны обладать тем же поведением, что и родительские классы,
без внесения изменений. Этот принцип гарантирует, что порожденный
класс не изменяет определения типа родительского и его поведение. 
