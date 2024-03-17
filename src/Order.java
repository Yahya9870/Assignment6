public class Order {
    private Child[] children = new Child[5];
    private int numChildren = 0;

    public void addChildtoOrder(Child child) {
        if (numChildren < children.length) {
            children[numChildren++] = child;
        }
    }

    public void removeChildfromOrder(Child child) {
        for (int i = 0; i < numChildren; i++) {
            if (children[i] == child) {
                System.arraycopy(children, i + 1, children, i, numChildren - i - 1);
                children[--numChildren] = null;
                break;
            }
        }
    }

    public int getNumofChilds() {
        return numChildren;
    }

    public Child[] getChilds() {
        Child[] activeChildren = new Child[numChildren];
        System.arraycopy(children, 0, activeChildren, 0, numChildren);
        return activeChildren;
    }

    @Override
    public String toString() {
        return "The order contains " + numChildren + " Childs";
    }
}
