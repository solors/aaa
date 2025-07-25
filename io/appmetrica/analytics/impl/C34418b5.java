package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.b5 */
/* loaded from: classes9.dex */
public final class C34418b5 {

    /* renamed from: a */
    public final CopyOnWriteArrayList f94010a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void m21955a(@NonNull InterfaceC34926u4 interfaceC34926u4) {
        this.f94010a.add(interfaceC34926u4);
    }

    /* renamed from: b */
    public final void m21954b(@NonNull InterfaceC34926u4 interfaceC34926u4) {
        this.f94010a.remove(interfaceC34926u4);
    }

    /* renamed from: a */
    public final List<InterfaceC34926u4> m21956a() {
        return this.f94010a;
    }
}
