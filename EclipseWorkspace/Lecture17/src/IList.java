interface IList<T> {};

class MtList<T> implements IList<T>{
    MtList(){};
}

class ConsList<T> implements IList<T>{
    T first;
    IList<T> rest;

    ConsList(T first, IList<T> rest){
        this.first = first;
        this.rest = rest;
    }
}
