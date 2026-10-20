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
}