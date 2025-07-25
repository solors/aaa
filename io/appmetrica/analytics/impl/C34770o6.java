package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.MutableCollections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.o6 */
/* loaded from: classes9.dex */
public final class C34770o6 implements InterfaceC33841Da {

    /* renamed from: a */
    public final CopyOnWriteArrayList f95080a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC33841Da
    /* renamed from: a */
    public final void mo21231a(@Nullable Throwable th, @NotNull C34217T c34217t) {
        Iterator it = this.f95080a.iterator();
        while (it.hasNext()) {
            ((InterfaceC33841Da) it.next()).mo21231a(th, c34217t);
        }
    }

    /* renamed from: a */
    public final void m21229a(@NotNull InterfaceC33841Da... interfaceC33841DaArr) {
        MutableCollections.m17622F(this.f95080a, interfaceC33841DaArr);
    }

    /* renamed from: a */
    public final void m21230a(@NotNull List<? extends InterfaceC33841Da> list) {
        this.f95080a.addAll(list);
    }

    /* renamed from: a */
    public final void m21232a() {
        this.f95080a.clear();
    }
}
