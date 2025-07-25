package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* loaded from: classes6.dex */
final class SubscriberMethod {

    /* renamed from: a */
    final Method f55943a;

    /* renamed from: b */
    final ThreadMode f55944b;

    /* renamed from: c */
    final Class<?> f55945c;

    /* renamed from: d */
    String f55946d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f55943a = method;
        this.f55944b = threadMode;
        this.f55945c = cls;
    }

    /* renamed from: a */
    private synchronized void m52959a() {
        if (this.f55946d == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f55943a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f55943a.getName());
            sb2.append('(');
            sb2.append(this.f55945c.getName());
            this.f55946d = sb2.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SubscriberMethod) {
            m52959a();
            return this.f55946d.equals(((SubscriberMethod) obj).f55946d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f55943a.hashCode();
    }
}
