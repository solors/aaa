package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KotlinVersion.kt */
@Metadata
/* loaded from: classes5.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    @NotNull
    public static final C37527a Companion = new C37527a(null);
    @NotNull
    public static final KotlinVersion CURRENT = C37528a.m17628a();

    /* compiled from: KotlinVersion.kt */
    @Metadata
    /* renamed from: kotlin.KotlinVersion$a */
    /* loaded from: classes5.dex */
    public static final class C37527a {
        private C37527a() {
        }

        public /* synthetic */ C37527a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KotlinVersion(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
        this.version = versionOf(i, i2, i3);
    }

    private final int versionOf(int i, int i2, int i3) {
        boolean z = false;
        if (new PrimitiveRanges(0, 255).m16968i(i) && new PrimitiveRanges(0, 255).m16968i(i2) && new PrimitiveRanges(0, 255).m16968i(i3)) {
            z = true;
        }
        if (z) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    public boolean equals(@Nullable Object obj) {
        KotlinVersion kotlinVersion;
        if (this == obj) {
            return true;
        }
        if (obj instanceof KotlinVersion) {
            kotlinVersion = (KotlinVersion) obj;
        } else {
            kotlinVersion = null;
        }
        if (kotlinVersion != null && this.version == kotlinVersion.version) {
            return true;
        }
        return false;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return this.version;
    }

    public final boolean isAtLeast(int i, int i2) {
        int i3 = this.major;
        return i3 > i || (i3 == i && this.minor >= i2);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        sb2.append(this.patch);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull KotlinVersion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.version - other.version;
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4;
        int i5 = this.major;
        return i5 > i || (i5 == i && ((i4 = this.minor) > i2 || (i4 == i2 && this.patch >= i3)));
    }

    public KotlinVersion(int i, int i2) {
        this(i, i2, 0);
    }
}
