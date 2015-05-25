package opt.interfaces;

/**
 * Created by Dell 1 on 15-5-12.
 */
public interface Formula {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }

}
