package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Z */
/* loaded from: classes9.dex */
public final class C34361Z implements InterfaceC33803Bm {

    /* renamed from: a */
    public final /* synthetic */ C34386a0 f93853a;

    public C34361Z(C34386a0 c34386a0) {
        this.f93853a = c34386a0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33803Bm
    @NotNull
    /* renamed from: a */
    public final Thread mo20706a() {
        return this.f93853a.f93902b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33803Bm
    @Nullable
    /* renamed from: b */
    public final StackTraceElement[] mo20705b() {
        C34386a0 c34386a0 = this.f93853a;
        return (StackTraceElement[]) c34386a0.f93901a.get(c34386a0.f93902b);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33803Bm
    @NotNull
    /* renamed from: c */
    public final Map<Thread, StackTraceElement[]> mo20704c() {
        return this.f93853a.f93901a;
    }
}
