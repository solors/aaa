package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.c0 */
/* loaded from: classes7.dex */
public class PropertyReference0Impl extends PropertyReference0 {
    public PropertyReference0Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    public Object get() {
        return getGetter().call(new Object[0]);
    }

    public PropertyReference0Impl(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
