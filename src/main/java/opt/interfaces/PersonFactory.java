package opt.interfaces;

import opt.Person;

/**
 * Created by Dell 1 on 15-5-12.
 */
public interface PersonFactory<P extends Person> {

    P create(String firstName, String lastName);

}
