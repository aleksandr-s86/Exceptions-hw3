package hw3.Preparing;


import hw3.FileWorks.WriteInFileException;

import static hw3.FileWorks.FileWorks.printAll;
import static hw3.InputWorks.InputString.*;




public class Main {
    //    Иванов Порфирий Кузьмич 09876789 m 23.08.1899;
// Сараев Иван Иванович 88765543 m 14.12.1997
//    Козодоева Мария Сергеевна 88765543 f 14.12.1997
// Иванов Андрей Сидорович 09876789 m 23.08.1899
//    Шубина Наталья Викторовна 2345678 f 13.01.1984

    public static void main(String[] args) throws WriteInFileException {
        InputAb();
        if (more) {
            printAll(abonentArrayList);
        }
    }
}
