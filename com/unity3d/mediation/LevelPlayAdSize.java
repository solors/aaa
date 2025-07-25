package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C20022h1;
import com.ironsource.C21248y2;
import com.ironsource.mediationsdk.C20410l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class LevelPlayAdSize {

    /* renamed from: f */
    private static final int f74483f = 320;

    /* renamed from: g */
    private static final int f74484g = 50;

    /* renamed from: h */
    private static final int f74485h = 320;

    /* renamed from: i */
    private static final int f74486i = 90;

    /* renamed from: j */
    private static final int f74487j = 300;

    /* renamed from: k */
    private static final int f74488k = 250;

    /* renamed from: m */
    private static final int f74490m = 90;

    /* renamed from: a */
    private int f74491a;

    /* renamed from: b */
    private int f74492b;
    @Nullable

    /* renamed from: c */
    private final String f74493c;

    /* renamed from: d */
    private final boolean f74494d;
    @Nullable

    /* renamed from: e */
    private final LevelPlayAdSize f74495e;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final LevelPlayAdSize BANNER = new LevelPlayAdSize(320, 50, C20410l.f51629a, false, null, 16, null);
    @NotNull
    public static final LevelPlayAdSize MEDIUM_RECTANGLE = new LevelPlayAdSize(300, 250, C20410l.f51635g, false, null, 16, null);

    /* renamed from: l */
    private static final int f74489l = 728;
    @NotNull
    public static final LevelPlayAdSize LEADERBOARD = new LevelPlayAdSize(f74489l, 90, C20410l.f51632d, false, null, 16, null);
    @NotNull
    public static final LevelPlayAdSize LARGE = new LevelPlayAdSize(320, 90, C20410l.f51630b, false, null, 16, null);

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ LevelPlayAdSize createAdaptiveAdSize$default(Companion companion, Context context, Integer num, int i, Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        @NotNull
        public final LevelPlayAdSize createAdSize$mediationsdk_release(@NotNull String adSize) {
            Intrinsics.checkNotNullParameter(adSize, "adSize");
            int hashCode = adSize.hashCode();
            if (hashCode != -96588539) {
                if (hashCode != 72205083) {
                    if (hashCode != 446888797) {
                        if (hashCode == 1951953708 && adSize.equals(C20410l.f51629a)) {
                            return LevelPlayAdSize.BANNER;
                        }
                    } else if (adSize.equals(C20410l.f51632d)) {
                        return LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (adSize.equals(C20410l.f51630b)) {
                    return LevelPlayAdSize.LARGE;
                }
            } else if (adSize.equals(C20410l.f51635g)) {
                return LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new IllegalArgumentException("Wrong Ad Size");
        }

        @Nullable
        public final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        @NotNull
        public final LevelPlayAdSize createCustomBanner(int i, int i2) {
            return createCustomSize(i, i2);
        }

        @NotNull
        public final LevelPlayAdSize createCustomSize(int i, int i2) {
            return new LevelPlayAdSize(i, i2, C20410l.f51634f, false, null, 16, null);
        }

        @Nullable
        public final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C21248y2(new C20022h1()).m54050a(context, num);
        }
    }

    public LevelPlayAdSize(int i, int i2, @Nullable String str, boolean z, @Nullable LevelPlayAdSize levelPlayAdSize) {
        this.f74491a = i;
        this.f74492b = i2;
        this.f74493c = str;
        this.f74494d = z;
        this.f74495e = levelPlayAdSize;
    }

    @Nullable
    public static final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context) {
        return Companion.createAdaptiveAdSize(context);
    }

    @NotNull
    public static final LevelPlayAdSize createCustomBanner(int i, int i2) {
        return Companion.createCustomBanner(i, i2);
    }

    @NotNull
    public static final LevelPlayAdSize createCustomSize(int i, int i2) {
        return Companion.createCustomSize(i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(LevelPlayAdSize.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
        if (this.f74491a == levelPlayAdSize.f74491a && this.f74492b == levelPlayAdSize.f74492b && Intrinsics.m17075f(this.f74493c, levelPlayAdSize.f74493c)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getDescription() {
        return String.valueOf(this.f74493c);
    }

    @Nullable
    public final LevelPlayAdSize getFallbackAdSize$mediationsdk_release() {
        return this.f74495e;
    }

    public final int getHeight() {
        return this.f74492b;
    }

    public final int getWidth() {
        return this.f74491a;
    }

    public int hashCode() {
        int i;
        int i2 = ((this.f74491a * 31) + this.f74492b) * 31;
        String str = this.f74493c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final boolean isAdaptive() {
        return this.f74494d;
    }

    @NotNull
    public String toString() {
        return this.f74493c + ' ' + this.f74491a + 'x' + this.f74492b;
    }

    public /* synthetic */ LevelPlayAdSize(int i, int i2, String str, boolean z, LevelPlayAdSize levelPlayAdSize, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : str, z, (i3 & 16) != 0 ? null : levelPlayAdSize);
    }

    @Nullable
    public static final LevelPlayAdSize createAdaptiveAdSize(@NotNull Context context, @Nullable Integer num) {
        return Companion.createAdaptiveAdSize(context, num);
    }
}
