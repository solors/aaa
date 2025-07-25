package p802n9;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: n9.a */
/* loaded from: classes8.dex */
public final class DivPlayerPlaybackConfig {

    /* renamed from: a */
    private final boolean f101807a;

    /* renamed from: b */
    private final boolean f101808b;

    /* renamed from: c */
    private final boolean f101809c;
    @Nullable

    /* renamed from: d */
    private final JSONObject f101810d;

    public DivPlayerPlaybackConfig() {
        this(false, false, false, null, 15, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivPlayerPlaybackConfig)) {
            return false;
        }
        DivPlayerPlaybackConfig divPlayerPlaybackConfig = (DivPlayerPlaybackConfig) obj;
        if (this.f101807a == divPlayerPlaybackConfig.f101807a && this.f101808b == divPlayerPlaybackConfig.f101808b && this.f101809c == divPlayerPlaybackConfig.f101809c && Intrinsics.m17075f(this.f101810d, divPlayerPlaybackConfig.f101810d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        int hashCode;
        boolean z = this.f101807a;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r2 = this.f101808b;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z2 = this.f101809c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int i5 = (i4 + i) * 31;
        JSONObject jSONObject = this.f101810d;
        if (jSONObject == null) {
            hashCode = 0;
        } else {
            hashCode = jSONObject.hashCode();
        }
        return i5 + hashCode;
    }

    @NotNull
    public String toString() {
        return "DivPlayerPlaybackConfig(autoplay=" + this.f101807a + ", isMuted=" + this.f101808b + ", repeatable=" + this.f101809c + ", payload=" + this.f101810d + ')';
    }

    public DivPlayerPlaybackConfig(boolean z, boolean z2, boolean z3, @Nullable JSONObject jSONObject) {
        this.f101807a = z;
        this.f101808b = z2;
        this.f101809c = z3;
        this.f101810d = jSONObject;
    }

    public /* synthetic */ DivPlayerPlaybackConfig(boolean z, boolean z2, boolean z3, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : jSONObject);
    }
}
