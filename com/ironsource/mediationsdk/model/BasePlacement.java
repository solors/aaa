package com.ironsource.mediationsdk.model;

import com.ironsource.C19721co;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public abstract class BasePlacement {

    /* renamed from: a */
    private final int f51691a;
    @NotNull

    /* renamed from: b */
    private final String f51692b;

    /* renamed from: c */
    private final boolean f51693c;
    @Nullable

    /* renamed from: d */
    private final C19721co f51694d;

    public BasePlacement(int i, @NotNull String placementName, boolean z, @Nullable C19721co c19721co) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f51691a = i;
        this.f51692b = placementName;
        this.f51693c = z;
        this.f51694d = c19721co;
    }

    @Nullable
    public final C19721co getPlacementAvailabilitySettings() {
        return this.f51694d;
    }

    public final int getPlacementId() {
        return this.f51691a;
    }

    @NotNull
    public final String getPlacementName() {
        return this.f51692b;
    }

    public final boolean isDefault() {
        return this.f51693c;
    }

    public final boolean isPlacementId(int i) {
        if (this.f51691a == i) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "placement name: " + this.f51692b;
    }

    public /* synthetic */ BasePlacement(int i, String str, boolean z, C19721co c19721co, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : c19721co);
    }
}
