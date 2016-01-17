package htsjdk.samtools.util;

/**
 * Created by farjoun on 1/17/16.
 */
public class ComparableTuple<A extends Comparable<A>, B extends Comparable<B>> extends Tuple<A, B> implements Comparable<ComparableTuple<A, B>> {

    public ComparableTuple(final A a, final B b) {
        super(a, b);
    }

    @Override
    public int compareTo(final ComparableTuple<A, B> o) {
        int retval = a.compareTo(o.a);
        if (retval == 0) {
            retval = b.compareTo(o.b);
        }
        return retval;
    }
}
