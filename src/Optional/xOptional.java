package Optional;

import java.util.Optional;

public class xOptional {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("Fred");
        Cat myCat = optionalCat.orElse(new Cat("UNKOWN", 0));
        //Cat myCat2 = optionalCat.orElseGet(Lambda);
        //Cat myCat = optionalCat.orElseThrow();
        optionalCat.map(Cat::getAge)
                .orElse(0);


//        if (optionalCat.isPresent()) {
//            System.out.println(optionalCat.get().getAge());
//        }
//        else {
//            System.out.println(0);
//        }

    }
    private static  Optional<Cat> findCatByName (String name){
        Cat cat = new Cat(name, 3);

        //return Optional.empty();
        return Optional.ofNullable(cat);
    }
}
