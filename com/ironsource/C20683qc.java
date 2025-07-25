package com.ironsource;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.qc */
/* loaded from: classes6.dex */
public final class C20683qc implements InterfaceC19863f0 {
    @NotNull

    /* renamed from: a */
    private final Activity f52541a;

    public C20683qc(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f52541a = activity;
    }

    @Override // com.ironsource.InterfaceC19863f0
    /* renamed from: a */
    public void mo55655a(@NotNull C20579oc fullscreenAdInstance) {
        Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.m56021a(this.f52541a);
    }
}
