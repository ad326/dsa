public class OOP1 {
    public static void main(String[] args) {
        Pen p1 = new Pen();  //Create object of Pen class

        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
        
    }
}

//Create Pen class
class Pen {                    
        private String color;
        private int tip;

        //Getter method
        String getColor() {
            return this.color;
        }

        int getTip() {
            return this.tip;
        }

        //Setter method
        void setColor(String newColor) {
            this.color = newColor;
        }

        void setTip(int tip) {
            this.tip = tip;
        }
}
