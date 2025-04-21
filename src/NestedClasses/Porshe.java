package NestedClasses;

public class Porshe {
    private String model;

    public Porshe(String model){
        this.model = model;
    }

        public class Details{
            private String adress;
            private int horsePower;

            public Details(String adress, int horsePower){
                this.adress = adress;
                this.horsePower = horsePower;
            }

                public void Total(){
                System.out.println("The Porshe " + model + " with " + horsePower + " horsepower will be delivered to the " + adress + " adress." );
            }
        }
}
