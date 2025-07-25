package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.kc */
/* loaded from: classes6.dex */
public final class C20201kc implements InterfaceC20105ij {
    @NotNull

    /* renamed from: a */
    private final RunnableC19851er f50842a;

    /* renamed from: b */
    private long f50843b;

    public C20201kc(@NotNull InterfaceC20798sd applicationLifecycleService, @NotNull RunnableC19851er task) {
        Intrinsics.checkNotNullParameter(applicationLifecycleService, "applicationLifecycleService");
        Intrinsics.checkNotNullParameter(task, "task");
        this.f50842a = task;
        applicationLifecycleService.mo54142a(this);
        m57650f();
    }

    /* renamed from: e */
    private final long m57651e() {
        return System.currentTimeMillis() - this.f50843b;
    }

    /* renamed from: f */
    private final void m57650f() {
        this.f50843b = System.currentTimeMillis();
    }

    @Override // com.ironsource.InterfaceC20105ij
    /* renamed from: b */
    public void mo55607b() {
        this.f50842a.m58751a(Long.valueOf(m57651e()));
        this.f50842a.run();
    }

    @Override // com.ironsource.InterfaceC20105ij
    /* renamed from: c */
    public void mo55606c() {
        m57650f();
    }

    @Override // com.ironsource.InterfaceC20105ij
    /* renamed from: a */
    public void mo55609a() {
    }

    @Override // com.ironsource.InterfaceC20105ij
    /* renamed from: d */
    public void mo55605d() {
    }
}
