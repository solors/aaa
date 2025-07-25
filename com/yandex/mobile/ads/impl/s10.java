package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p758k9.DivTypefaceProvider;

/* loaded from: classes8.dex */
public final class s10 implements DivTypefaceProvider {
    @NotNull

    /* renamed from: a */
    private final Context f84980a;

    public s10(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84980a = context;
    }

    @Override // p758k9.DivTypefaceProvider
    @Nullable
    public final Typeface getBold() {
        Typeface m30442a;
        q90 m30114a = r90.m30114a(this.f84980a);
        if (m30114a == null || (m30442a = m30114a.m30442a()) == null) {
            return Typeface.DEFAULT_BOLD;
        }
        return m30442a;
    }

    @Override // p758k9.DivTypefaceProvider
    @Nullable
    public final Typeface getLight() {
        q90 m30114a = r90.m30114a(this.f84980a);
        if (m30114a != null) {
            return m30114a.m30441b();
        }
        return null;
    }

    @Override // p758k9.DivTypefaceProvider
    @Nullable
    public final Typeface getMedium() {
        q90 m30114a = r90.m30114a(this.f84980a);
        if (m30114a != null) {
            return m30114a.m30440c();
        }
        return null;
    }

    @Override // p758k9.DivTypefaceProvider
    @Nullable
    public final Typeface getRegular() {
        q90 m30114a = r90.m30114a(this.f84980a);
        if (m30114a != null) {
            return m30114a.m30439d();
        }
        return null;
    }

    @Override // p758k9.DivTypefaceProvider
    @androidx.annotation.Nullable
    @Deprecated
    public /* bridge */ /* synthetic */ Typeface getRegularLegacy() {
        return super.getRegularLegacy();
    }

    @Override // p758k9.DivTypefaceProvider
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ Typeface getTypefaceFor(int i) {
        return super.getTypefaceFor(i);
    }
}
