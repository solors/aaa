package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.id1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.zi */
/* loaded from: classes8.dex */
public abstract class AbstractC31994zi<T> implements id1.InterfaceC30548b, InterfaceC30957nn {
    @NotNull

    /* renamed from: a */
    private final Context f88924a;
    @NotNull

    /* renamed from: b */
    private final C30149d8<T> f88925b;
    @NotNull

    /* renamed from: c */
    private final id1 f88926c;

    public /* synthetic */ AbstractC31994zi(Context context, C30149d8 c30149d8) {
        this(context, c30149d8, id1.f80423h.m33296a(context));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30957nn
    /* renamed from: a */
    public final synchronized boolean mo26159a() {
        return false;
    }

    /* renamed from: b */
    public abstract void mo26158b();

    /* renamed from: c */
    public void mo26157c() {
        mo26158b();
        getClass().toString();
        um0.m28725d(new Object[0]);
    }

    @NotNull
    /* renamed from: d */
    public final C30149d8<T> m26156d() {
        return this.f88925b;
    }

    @NotNull
    /* renamed from: e */
    public final Context m26155e() {
        return this.f88924a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean m26154f() {
        return !this.f88926c.m33300b();
    }

    /* renamed from: g */
    public final void m26153g() {
        getClass().toString();
        um0.m28725d(new Object[0]);
        this.f88926c.m33302a(this);
    }

    /* renamed from: h */
    public final void m26152h() {
        getClass().toString();
        um0.m28725d(new Object[0]);
        this.f88926c.m33299b(this);
    }

    protected AbstractC31994zi(@NotNull Context context, @NotNull C30149d8<T> adResponse, @NotNull id1 phoneStateTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(phoneStateTracker, "phoneStateTracker");
        this.f88924a = context;
        this.f88925b = adResponse;
        this.f88926c = phoneStateTracker;
    }
}
