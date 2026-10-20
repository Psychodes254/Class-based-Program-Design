interface ILoPerson{
    // Returns true if this list contains a person with the given name
    boolean contains(String name);

    // Finds the person in this list with the given name and returns their phone
    // number, or -1 if no such person is found
    int findPhoneNumber(String name);

    // Change the phone number for the person in this list with the given name
    void changePhoneNumber(String name, int phone);
}

class MtLoPerson implements ILoPerson{
    MtLoPerson(){}

    public boolean contains(String name){
        return false;
    }

    public int findPhoneNumber(String name){
        return -1;
    }

    public void changePhoneNumber(String name, int phone){
        return;
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

    public int findPhoneNumber(String name){
        if (this.first.name.equals(name)){
            return first.phone;
        }
        else{
            return this.rest.findPhoneNumber(name);
        }
    }

    public void changePhoneNumber(String name, int phone){
        if (this.first.name.equals(name)){
            this.first.changeNum(phone);
        }
        else{
            this.rest.changePhoneNumber(name, phone);
        }
    }
}