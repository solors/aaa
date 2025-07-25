package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlayAdSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.c6 */
/* loaded from: classes6.dex */
public final class C19681c6 extends C19610b1 {
    @NotNull

    /* renamed from: f */
    private final LevelPlayAdSize f49409f;
    @Nullable

    /* renamed from: g */
    private final Boolean f49410g;
    @Nullable

    /* renamed from: h */
    private final Long f49411h;

    public C19681c6() {
        this("", null, null, null, null, null, 62, null);
    }

    @NotNull
    /* renamed from: g */
    public final LevelPlayAdSize m59191g() {
        return this.f49409f;
    }

    @Nullable
    /* renamed from: h */
    public final Boolean m59190h() {
        return this.f49410g;
    }

    @Nullable
    /* renamed from: i */
    public final Long m59189i() {
        return this.f49411h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19681c6(@NotNull String adUnitId, @Nullable Placement placement, @NotNull LevelPlayAdSize adSize, @Nullable Boolean bool, @Nullable Long l, @Nullable C21046ts c21046ts) {
        super(IronSource.AD_UNIT.BANNER, adUnitId, placement, c21046ts);
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        this.f49409f = adSize;
        this.f49410g = bool;
        this.f49411h = l;
    }

    public /* synthetic */ C19681c6(String str, Placement placement, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l, C21046ts c21046ts, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : placement, (i & 4) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : l, (i & 32) == 0 ? c21046ts : null);
    }
}
