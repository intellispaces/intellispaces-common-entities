package intellispaces.common.base.function.primitive;

@FunctionalInterface
public interface ObjectAndDoubleAndLongToDoubleFunction<T> {

  double apply(T arg1, double arg2, long arg3);
}
