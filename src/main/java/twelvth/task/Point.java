package twelvth.task;

public class Point {

    float x = (float) (Math.random() * (40.0f));
    float y = (float) (Math.random() * (40.0f));

    float distance(Point pointTo) {
        float xDist = x - pointTo.x;
        float yDist = y - pointTo.y;
        return (float) ((xDist*xDist) + (yDist*yDist));
    }
}
