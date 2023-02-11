public class Shape {
    private String color = "red";
    private boolean filled = true;

    Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public String toString() {
        return String.format("Shape[color=%s,filled=%s]", this.color, this.filled);
    }

    public static class Circle extends Shape {
        private double radius = 1.0;

        Circle() {

        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return 3.14 * Math.pow(radius, 2);
        }

        public double getPerimeter() {
            return 2 * 3.14 * radius;
        }

        @Override
        public String toString() {
            return String.format("Circle[%s,radius=%s]", super.toString(), Double.toString(radius));
        }
    }

    public static class Rectangle extends Shape {

        private double width = 1.0;
        private double length = 1.0;

        Rectangle() {

        }

        Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getArea() {
            return width * length;
        }

        public double getPerimeter() {
            return 2 * (width + length);
        }

        @Override
        public String toString() {
            return String.format("Rectangle[%s,width=%s,length=%s]", super.toString(), Double.toString(width), Double.toString(length));
        }
    }

    public static class Square extends Rectangle {
        Square() {

        }

        Square(double side) {
            super(side, side);
        }

        Square(double side, String color, boolean filled) {
            super(side, side);
            super.setColor(color);
            super.setFilled(filled);
        }

        public double getSide() {
            return super.width;
        }

        @Override
        public void setWidth(double side) {
            super.width = side;
            super.length = side;
        }

        public void setLength(double side) {
            super.width = side;
            super.length = side;
        }

        @Override
        public String toString() {
            return String.format("Square[%s]", super.toString());
        }
    }
}
