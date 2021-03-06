package org.jamruby.mruby;

public class RHash extends RObject {
	public RHash(long ptr) {
		super(ptr);
	}
	
	public KHashIv iv() {
		return new KHashIv(n_getIv(nativeObject()));
	}
	
	public KHashHt ht() {
		return new KHashHt(n_getHt(nativeObject()));
	}
	
	public static void put(State state, Value hash, Value key, Value value) {
		n_hashSet(state.nativeObject(), hash, key, value);
	}
	
	public static Value get(State state, Value hash, Value key) {
		return n_hashGet(state.nativeObject(), hash, key);
	}
	
	private static native long n_getIv(long self);
	private static native long n_getHt(long self);
	
	private static native void n_hashSet(long mrb, Value hash, Value key, Value value);
	private static native Value n_hashGet(long mrb, Value hash, Value key);
}
