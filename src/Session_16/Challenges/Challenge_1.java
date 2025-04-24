package Session_16.Challenges;

import java.awt.*;
import java.util.Objects;

public class Challenge_1 {
    static class Rectangle {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;

            Rectangle other = (Rectangle) obj;
            return width == other.width && height == other.height;
        }

        @Override
        public int hashCode() {
            return Objects.hash(width, height);
        }
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        Rectangle rect2 = new Rectangle(10, 20);
        Rectangle rect3 = new Rectangle(15, 25);

        System.out.println("rect1 equals rect2? " + rect1.equals(rect2)); // true
        System.out.println("rect1 hashCode == rect2 hashCode? " + (rect1.hashCode() == rect2.hashCode())); // true

        System.out.println("rect1 equals rect3? " + rect1.equals(rect3)); // false
        System.out.println("rect1 hashCode == rect3 hashCode? " + (rect1.hashCode() == rect3.hashCode())); // false
    }
}