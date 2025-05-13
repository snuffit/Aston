package lesson_4.task_2;

interface Figure {

    double calculateArea();
    default double calculatePerimeter(){
        return 0;
    }

}
