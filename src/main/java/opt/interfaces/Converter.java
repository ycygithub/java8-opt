package opt.interfaces;

/**
 * Created by Dell 1 on 15-5-12.
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
