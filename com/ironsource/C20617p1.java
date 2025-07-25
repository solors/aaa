package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.p1 */
/* loaded from: classes6.dex */
public final class C20617p1 {
    @NotNull

    /* renamed from: a */
    private final AbstractC20235l1 f52367a;
    @Nullable

    /* renamed from: b */
    private final LevelPlayAdInfo f52368b;

    public C20617p1(@NotNull AbstractC20235l1 adUnit, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f52367a = adUnit;
        this.f52368b = levelPlayAdInfo;
    }

    @NotNull
    /* renamed from: a */
    public final AbstractC20235l1 m55885a() {
        return this.f52367a;
    }

    @Nullable
    /* renamed from: b */
    public final LevelPlayAdInfo m55882b() {
        return this.f52368b;
    }

    @Nullable
    /* renamed from: c */
    public final LevelPlayAdInfo m55881c() {
        return this.f52368b;
    }

    @NotNull
    /* renamed from: d */
    public final AbstractC20235l1 m55880d() {
        return this.f52367a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20617p1)) {
            return false;
        }
        C20617p1 c20617p1 = (C20617p1) obj;
        if (Intrinsics.m17075f(this.f52367a, c20617p1.f52367a) && Intrinsics.m17075f(this.f52368b, c20617p1.f52368b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f52367a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.f52368b;
        if (levelPlayAdInfo == null) {
            hashCode = 0;
        } else {
            hashCode = levelPlayAdInfo.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f52367a + ", adInfo=" + this.f52368b + ')';
    }

    public /* synthetic */ C20617p1(AbstractC20235l1 abstractC20235l1, LevelPlayAdInfo levelPlayAdInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC20235l1, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    @NotNull
    /* renamed from: a */
    public final C20617p1 m55884a(@NotNull AbstractC20235l1 adUnit, @Nullable LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new C20617p1(adUnit, levelPlayAdInfo);
    }

    /* renamed from: a */
    public static /* synthetic */ C20617p1 m55883a(C20617p1 c20617p1, AbstractC20235l1 abstractC20235l1, LevelPlayAdInfo levelPlayAdInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC20235l1 = c20617p1.f52367a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c20617p1.f52368b;
        }
        return c20617p1.m55884a(abstractC20235l1, levelPlayAdInfo);
    }
}
