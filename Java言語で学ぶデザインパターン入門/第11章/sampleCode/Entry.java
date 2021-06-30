public abstract Entry{
    public abstract String getName;
    public abstract int getSize;
    public Entry add(Entry entry) throw FileTraetmentException{
        throw new FileTraetmentException();
    }
    public void printList() {
        printList("");
    }
    protected abstract void printList(String prefix);

    public String toString( {
        return getName() + " (" + getSize() + ")";
    }
}