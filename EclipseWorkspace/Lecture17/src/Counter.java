import tester.*;

class Counter{
  int val;
  
  Counter(){
    this(0);
  }
  
  Counter(int initialVal){
    this.val = initialVal;
  }
  
  int get() {
    int ans = val;
    this.val = val + 1;
    return ans;
  }

  int set(){
    int ans = val;
    this.val = val + 2;
    return ans;
  }
}

class Counter2{
  int num;

  Counter2(){
    this(0);
  }

Counter2(int initial){
  this.num = initial;
}

int set(){
  int ans = num;
  this.num = num + 2;
  return ans;
}

}

class ExamplesCounter{
  ExamplesCounter(){}
  
  Counter counter1 = new Counter();
  Counter counter2 = new Counter(2);

  Counter2 count1 = new Counter2();
  Counter2 count2 = new Counter2(2);
  
  void testCounter(Tester t) {
      t.checkExpect(this.counter1.get(), 0);
      t.checkExpect(this.counter2.get(), 2);
      t.checkExpect(this.counter1.get() == counter1.get(), false);
      t.checkExpect(this.counter1.get() == counter2.get(), true);
      t.checkExpect(this.counter2.get() == counter1.get(), true);
      t.checkExpect(this.counter2.get() == counter2.get(), false);
      t.checkExpect(this.counter2.get() == counter1.get(), false);
  }

  void testCounter2(Tester t){
    t.checkExpect(this.count1.set(), 0);
    t.checkExpect(this.count2.set(), 2);
    t.checkExpect(this.count1.set() == count1.set(), false);
    t.checkExpect(this.count1.set(), 6);
    t.checkExpect(this.count2.set(), 4);
  }
}