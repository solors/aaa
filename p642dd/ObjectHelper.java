package p642dd;

import cd.BiPredicate;

/* renamed from: dd.a */
/* loaded from: classes9.dex */
public final class ObjectHelper {

    /* renamed from: a */
    static final BiPredicate<Object, Object> f89587a = new C32866a();

    /* compiled from: ObjectHelper.java */
    /* renamed from: dd.a$a */
    /* loaded from: classes9.dex */
    static final class C32866a implements BiPredicate<Object, Object> {
        C32866a() {
        }
    }

    /* renamed from: a */
    public static <T> T m25661a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: b */
    public static int m25660b(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
