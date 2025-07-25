package p650e5;

import p665f5.ITag;

/* renamed from: e5.b */
/* loaded from: classes6.dex */
public class BaseTagData<T extends ITag, B> {

    /* renamed from: a */
    private T f89757a;

    /* renamed from: b */
    private B f89758b;

    public BaseTagData(T t, B b) {
        this.f89757a = t;
        this.f89758b = b;
    }

    /* renamed from: a */
    public T m25499a() {
        return this.f89757a;
    }

    /* renamed from: b */
    public B m25498b() {
        return this.f89758b;
    }

    public String toString() {
        return "{tag=" + this.f89757a + ", value=" + this.f89758b + '}';
    }
}
