package htsjdk.samtools.util;

/**
 * A simple tuple class.
 *
 * @author mccowan
 */
public class Tuple<A, B> {
    public final A a;
    public final B b;

    public Tuple(final A a, final B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        return a.hashCode() + 31 * b.hashCode();

    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tuple))
            return false;
        if (obj == this)
            return true;

        Tuple rhs = (Tuple) obj;
        return a.equals(rhs.a) && b.equals(rhs.b);
    }

    @Override
    public String toString() {
        return "[" + a.toString() + ", " + b.toString() + "]";
    }
}
