public class Child {
    private String name;
    private int age;
    private Toy[] toys;

    public Child(String name, int age, Toy[] toys) {
        this.name = name;
        this.age = age;
        this.toys = toys != null ? deepCopyToys(toys) : new Toy[0];
    }

    public Child(Child other) {
        this.name = other.name;
        this.age = other.age;
        this.toys = deepCopyToys(other.toys);
    }

    // Deep copy helper
    private Toy[] deepCopyToys(Toy[] toys) {
        Toy[] copiedToys = new Toy[toys.length];
        for (int i = 0; i < toys.length; i++) {
            Toy t = toys[i];
            copiedToys[i] = new Toy(t.getToyID(), t.getToyName(), t.getToyQuantity(), t.getToyPrice());
        }
        return copiedToys;
    }

    // Getters and setters
    public String getChildName() { return name; }
    public void setChildName(String name) { this.name = name; }
    public int getChildAge() { return age; }
    public void setChildAge(int age) { this.age = age; }
    public Toy[] getChildToy() { return toys; }
    public void setChildToy(Toy[] toys) { this.toys = deepCopyToys(toys); }
    public int getNumberofToys() { return toys.length; }

    // Dispose of toys
    public void disposeToys() {
        toys = new Toy[0];
    }

    // Donate toys
    public void donate(Child other) {
        if (this != other && this.toys.length > 0) {
            Toy[] combinedToys = new Toy[other.toys.length + this.toys.length];
            System.arraycopy(other.toys, 0, combinedToys, 0, other.toys.length);
            System.arraycopy(this.toys, 0, combinedToys, other.toys.length, this.toys.length);
            other.setChildToy(combinedToys); // Assign combined toys to the other child
            this.disposeToys(); // Dispose the current child's toys
        }
    }

    @Override
    public String toString() {
        return String.format("Child [%s] of age <%d> has (%d) toys", name, age, toys.length);
    }
}
