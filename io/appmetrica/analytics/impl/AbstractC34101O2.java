package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.appmetrica.analytics.impl.O2 */
/* loaded from: classes9.dex */
public abstract class AbstractC34101O2 {

    /* renamed from: a */
    public final AbstractC34232Te f93290a;

    /* renamed from: b */
    public final InterfaceC33816Ca f93291b;

    public AbstractC34101O2(AbstractC34232Te abstractC34232Te, InterfaceC33816Ca interfaceC33816Ca) {
        this.f93290a = abstractC34232Te;
        this.f93291b = interfaceC33816Ca;
    }

    /* renamed from: a */
    public final boolean m22389a(@NonNull C34247U5 c34247u5, @NonNull InterfaceC34077N2 interfaceC34077N2) {
        for (Object obj : ((C34250U8) this.f93290a.mo21486a(c34247u5.f93556d)).f93569a) {
            if (interfaceC34077N2.mo22296a(obj, c34247u5)) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting(otherwise = 5)
    /* renamed from: b */
    public final AbstractC34232Te m22388b() {
        return this.f93290a;
    }

    /* renamed from: a */
    public final InterfaceC33816Ca m22390a() {
        return this.f93291b;
    }
}
