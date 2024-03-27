public class Dog extends Animal {
    private int tailLength;

    public Dog(String name, String breed, int age, int tailLength) {
        super(name, breed, age);
        this.tailLength = tailLength;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    @Override
    public void makeSound() {
//        super.makeSound();
        System.out.println("Woof Woof");
    }
}
