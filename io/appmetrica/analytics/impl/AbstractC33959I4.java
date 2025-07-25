package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.I4 */
/* loaded from: classes9.dex */
public abstract class AbstractC33959I4 extends AbstractC34507ed {

    /* renamed from: f */
    public final Object f93008f;

    public AbstractC33959I4(int i, String str, Object obj, InterfaceC34867rn interfaceC34867rn, AbstractC34196S2 abstractC34196S2) {
        super(i, str, interfaceC34867rn, abstractC34196S2);
        this.f93008f = obj;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34507ed, io.appmetrica.analytics.impl.InterfaceC34490dn
    /* renamed from: a */
    public final void mo21787a(@NonNull C34463cn c34463cn) {
        if (m21781f()) {
            AbstractC34196S2 abstractC34196S2 = this.f94257d;
            int i = this.f94255b;
            C34517en mo21817a = abstractC34196S2.mo21817a(c34463cn, (C34517en) ((HashMap) c34463cn.f94127a.get(i)).get(this.f94254a), this);
            if (mo21817a != null) {
                mo21176a(mo21817a);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo21176a(@NonNull C34517en c34517en);

    @NonNull
    /* renamed from: g */
    public final Object m22554g() {
        return this.f93008f;
    }
}
