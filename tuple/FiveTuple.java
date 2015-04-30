package util.tuple;

public class FiveTuple<A, B, C ,D, E> extends FourTuple<A, B, C ,D>{
	public final D d;
	public FiveTuple(A a, B b, C c, D d) {
		super(a, b, c, d);
		this.d = d;
	}

}
