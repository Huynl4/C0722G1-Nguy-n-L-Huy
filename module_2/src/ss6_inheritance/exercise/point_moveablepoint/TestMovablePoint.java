package ss6_inheritance.exercise.point_moveablepoint;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 3.0f, 4.0f);
        System.out.println(movablePoint);

        movablePoint = movablePoint.move();
        System.out.println(movablePoint);
    }
}
