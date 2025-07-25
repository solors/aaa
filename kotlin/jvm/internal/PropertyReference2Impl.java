package kotlin.jvm.internal;

/* renamed from: kotlin.jvm.internal.g0 */
/* loaded from: classes7.dex */
public class PropertyReference2Impl extends PropertyReference2 {
    public PropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    @Override // kotlin.reflect.KProperty2
    public Object get(Object obj, Object obj2) {
        return getGetter().call(obj, obj2);
    }
}
