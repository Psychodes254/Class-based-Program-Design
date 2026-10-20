interface ILoPerson{
    // Returns true if this list contains a person with the given name
    boolean contains(String name);
}

class MtLoPerson implements ILoPerson{
    MtLoPerson(){}

    public boolean contains(String name){
        return false;
    }
}

class ConsLoPerson implements ILoPerson{
    Person first;
    ILoPerson rest;

    ConsLoPerson(Person first, ILoPerson rest){
        this.first = first;
        this.rest = rest;
    }

    public boolean contains(String name) {
        return this.first.name.equals(name) || this.rest.contains(name);
    }
}