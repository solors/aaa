package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.m1 */
/* loaded from: classes6.dex */
public final class C20303m1 {
    @NotNull

    /* renamed from: a */
    private final HashMap<String, C20181k2> f51081a = new HashMap<>();

    @Metadata
    /* renamed from: com.ironsource.m1$a */
    /* loaded from: classes6.dex */
    public enum EnumC20304a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    @NotNull
    /* renamed from: a */
    public final C20181k2 m57333a(@NotNull String adUnitId, @NotNull List<? extends NetworkSettings> providers, int i) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(providers, "providers");
        C20181k2 c20181k2 = this.f51081a.get(adUnitId);
        if (c20181k2 == null) {
            C20181k2 c20181k22 = new C20181k2(providers, i);
            this.f51081a.put(adUnitId, c20181k22);
            return c20181k22;
        }
        return c20181k2;
    }
}
