package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.impl.r12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class s12 implements InterfaceC31250r0 {

    /* renamed from: d */
    static final /* synthetic */ KProperty<Object>[] f84981d = {C30452ha.m33588a(s12.class, "contextReference", "getContextReference()Landroid/content/Context;", 0)};
    @NotNull

    /* renamed from: a */
    private final r12.InterfaceC31252a f84982a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30350g0 f84983b;
    @NotNull

    /* renamed from: c */
    private final xj1 f84984c;

    public s12(@NotNull Context context, @NotNull p51 trackingListener, @NotNull InterfaceC30350g0 activityBackgroundListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        Intrinsics.checkNotNullParameter(activityBackgroundListener, "activityBackgroundListener");
        this.f84982a = trackingListener;
        this.f84983b = activityBackgroundListener;
        this.f84984c = yj1.m26872a(context);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31250r0
    /* renamed from: a */
    public final void mo29884a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Context context = (Context) this.f84984c.getValue(this, f84981d[0]);
        if (context == null || !Intrinsics.m17075f(context, activity)) {
            return;
        }
        this.f84982a.mo30169b();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31250r0
    /* renamed from: b */
    public final void mo29882b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Context context = (Context) this.f84984c.getValue(this, f84981d[0]);
        if (context == null || !Intrinsics.m17075f(context, activity)) {
            return;
        }
        this.f84982a.mo30170a();
    }

    /* renamed from: a */
    public final void m29883a(@NotNull Context activityContext) {
        Intrinsics.checkNotNullParameter(activityContext, "activityContext");
        this.f84983b.mo33400b(activityContext, this);
    }

    /* renamed from: b */
    public final void m29881b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84983b.mo33406a(context, this);
    }
}
