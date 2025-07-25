package io.appmetrica.analytics.impl;

import com.ironsource.C21114v8;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.W4 */
/* loaded from: classes9.dex */
public final class C34294W4 implements InterfaceC34344Y6 {

    /* renamed from: a */
    public final String f93632a;

    /* renamed from: b */
    public final String f93633b;

    public C34294W4(@NotNull C34391a5 c34391a5) {
        String m22021b;
        Object[] objArr = new Object[1];
        if (c34391a5.mo21825d()) {
            m22021b = C21114v8.C21122h.f54053Z;
        } else {
            m22021b = c34391a5.m22021b();
        }
        objArr[0] = m22021b;
        this.f93632a = String.format("component_%s.db", Arrays.copyOf(objArr, 1));
        this.f93633b = "db_metrica_" + c34391a5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34344Y6
    @NotNull
    /* renamed from: a */
    public final String mo20795a() {
        return this.f93633b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34344Y6
    @NotNull
    /* renamed from: b */
    public final String mo20794b() {
        return this.f93632a;
    }
}
