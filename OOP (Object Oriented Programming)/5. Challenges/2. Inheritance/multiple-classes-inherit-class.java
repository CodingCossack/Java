// Program where two classes inherit from a single class.

class Polygon {
    void display() {
        System.out.println("A Polygon is created");
    }
}

// inherit Rectangle and Triangle class from Polygon
class Rectangle extends Polygon {
    
}

class Triangle extends Polygon {
    
}

class Main {
    public static void main(String[] args) {
        
        // create object of both Rectangle and Triangle
        Rectangle rect = new Rectangle();
        Triangle trian = new Triangle();

        // access the method of Polygon using rect and trian
        rect.display();
        trian.display();
    }
}