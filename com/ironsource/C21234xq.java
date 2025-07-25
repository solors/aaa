package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.xq */
/* loaded from: classes6.dex */
public final class C21234xq implements InterfaceC20206kg {
    @Override // com.ironsource.InterfaceC20206kg
    /* renamed from: a */
    public void mo54098a(@NotNull Context context, @NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.saveIntToSharedPrefs(context, key, i);
    }

    @Override // com.ironsource.InterfaceC20206kg
    /* renamed from: b */
    public int mo54096b(@NotNull Context context, @NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.getIntFromSharedPrefs(context, key, i);
    }

    @Override // com.ironsource.InterfaceC20206kg
    /* renamed from: a */
    public void mo54097a(@NotNull Context context, @NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        IronSourceUtils.saveLongToSharedPrefs(context, key, j);
    }

    @Override // com.ironsource.InterfaceC20206kg
    /* renamed from: b */
    public long mo54095b(@NotNull Context context, @NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        return IronSourceUtils.getLongFromSharedPrefs(context, key, j);
    }
}
