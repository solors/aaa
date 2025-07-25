package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.io */
/* loaded from: classes6.dex */
public final class C20110io {
    @NotNull

    /* renamed from: a */
    private final String f50624a;
    @NotNull

    /* renamed from: b */
    private final LevelPlay.AdFormat f50625b;

    public C20110io(@NotNull String placementName, @NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f50624a = placementName;
        this.f50625b = adFormat;
    }

    @NotNull
    /* renamed from: a */
    public final String m57960a() {
        return this.f50624a + '_' + this.f50625b;
    }
}
