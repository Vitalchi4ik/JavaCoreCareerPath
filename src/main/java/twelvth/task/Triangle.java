package twelvth.task;

public class Triangle {
    Point a = new Point();
    Point b = new Point();
    Point c = new Point();

    Triangle(){
    }

    float firstSide = a.distance(b);
    float secondSide = a.distance(c);
    float thirdSide = b.distance(c);

    float perimeter() {
        return a.distance(b)+ a.distance(c) + b.distance(c);
    }

    float square() {
        float p = (firstSide + secondSide + thirdSide)/2;
        return (float) Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));
    }

    String type() {
        if((firstSide + secondSide)> thirdSide && (firstSide + thirdSide)> secondSide && (secondSide + thirdSide)> firstSide) {
            if (firstSide == secondSide && secondSide == thirdSide)
                return "equilateral";

            else if (firstSide == secondSide || secondSide == thirdSide)
                return "isosceles";

            else if (firstSide + secondSide == thirdSide)
                return "rectangular";
            else
                return "arbitrary";
        }
        else{
            return "triangle is not valid";
        }
    }
}
