import tester.*;

class ExamplesPhoneLists{
    Person mash, jack, paul, dama, james, vince, brenda, jeff, keysha, sharz;

    ILoPerson friends, family, work;

    void initialData() {
        this.mash = new Person("Mash", 1234);
        this.jack = new Person("Jack", 3456);
        this.paul = new Person("Paul", 6789);
        this.dama = new Person("Damaris", 1357);
        this.james = new Person("James", 12469);
        this.vince = new Person("Vincent", 7294);
        this.brenda = new Person("Brendah", 9345);
        this.jeff = new Person("Jeffrey", 8602);
        this.keysha = new Person("Keysha", 91302);
        this.sharz = new Person("Sharon", 8675309);

        this.friends = new ConsLoPerson(this.mash, new ConsLoPerson(this.vince,
                new ConsLoPerson(this.sharz, new ConsLoPerson(this.jack,
                        new ConsLoPerson(this.keysha, new MtLoPerson())))));

        this.family = new ConsLoPerson(this.mash, new ConsLoPerson(this.vince,
                new ConsLoPerson(this.jeff, new MtLoPerson())));

        this.work = new ConsLoPerson(this.jack, new ConsLoPerson(this.paul,
                new ConsLoPerson(this.brenda, new ConsLoPerson(this.james,
                        new ConsLoPerson(this.mash, new ConsLoPerson(this.dama,
                                new MtLoPerson()))))));
    }


    void testFindNumber(Tester t){
        this.initialData();
        t.checkExpect(this.work.contains("Jack"), true);
        t.checkExpect(this.friends.contains("Sharon"), true);
        t.checkExpect(this.family.contains("Jeffrey"), true);
        t.checkExpect(this.work.contains("Keysha"), false);
        t.checkExpect(this.friends.contains("Damaris"), false);
        t.checkExpect(this.family.contains("Paul"), false);
    }

    void testFindPhoneNumber(Tester t){
        this.initialData();
        t.checkExpect(this.friends.findPhoneNumber("Mash"), 1234);
        t.checkExpect(this.family.findPhoneNumber("Vincent"), 7294);
        t.checkExpect(this.work.findPhoneNumber("Brendah"), 9345);
    }

    void testChangePhoneNum(Tester t){
        this.initialData();
        t.checkExpect(this.keysha.phone, 91302);
        keysha.changeNum(51406);
        t.checkExpect(this.keysha.phone, 51406);
    }

    void testChangePhoneList(Tester t){
        this.initialData();
        t.checkExpect(this.friends.findPhoneNumber("Jack"), 3456);
        friends.changePhoneNumber("Jack", 228010);
        t.checkExpect(this.friends.findPhoneNumber("Jack"), 228010);
    }

    void testAliasing(Tester t){
    Person kim = new Person("Kim", 20256);
    Person kim2 = new Person("Kim", 20256);

    // alias kim3 to kim
    Person kim3 = kim;

    t.checkExpect(kim.samePerson(kim2), true);
    t.checkExpect(kim3.samePerson(kim), true);

    // modify kim3
    kim3.name = "Kylian";

    t.checkExpect(kim.samePerson(kim2), false);
    t.checkExpect(kim3.samePerson(kim), true);
    t.checkExpect(kim3.samePerson(kim2), false);
    }
}