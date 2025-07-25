package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b */
/* loaded from: classes7.dex */
public final class C25318b {

    /* renamed from: a */
    public final boolean f65737a;

    /* renamed from: b */
    public final boolean f65738b;

    /* renamed from: c */
    public final boolean f65739c;

    public C25318b(boolean z, boolean z2, boolean z3) {
        this.f65737a = z;
        this.f65738b = z2;
        this.f65739c = z3;
    }

    /* renamed from: a */
    public final boolean m44773a() {
        return this.f65739c;
    }

    /* renamed from: b */
    public final boolean m44772b() {
        return this.f65737a;
    }

    /* renamed from: c */
    public final boolean m44771c() {
        return this.f65738b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25318b)) {
            return false;
        }
        C25318b c25318b = (C25318b) obj;
        if (this.f65737a == c25318b.f65737a && this.f65738b == c25318b.f65738b && this.f65739c == c25318b.f65739c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f65737a;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r2 = this.f65738b;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z2 = this.f65739c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i4 + i;
    }

    @NotNull
    public String toString() {
        return "PlayingState(isPlaying=" + this.f65737a + ", isVisible=" + this.f65738b + ", hasMore=" + this.f65739c + ')';
    }

    public /* synthetic */ C25318b(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }
}
