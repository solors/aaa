package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* renamed from: kotlin.jvm.internal.f0 */
/* loaded from: classes7.dex */
public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    public PropertyReference2() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    protected KCallable computeReflected() {
        return Reflection.m17035i(this);
    }

    @Override // kotlin.reflect.KProperty2
    public Object getDelegate(Object obj, Object obj2) {
        return ((KProperty2) getReflected()).getDelegate(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty2, kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public Object mo105910invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    public PropertyReference2(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }
}
