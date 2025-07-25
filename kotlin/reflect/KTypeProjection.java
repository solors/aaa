package kotlin.reflect;

import androidx.webkit.ProxyConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: KTypeProjection.kt */
@Metadata
/* loaded from: classes7.dex */
public final class KTypeProjection {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final KTypeProjection star = new KTypeProjection(null, null);
    @Nullable
    private final KType type;
    @Nullable
    private final KVariance variance;

    /* compiled from: KTypeProjection.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.f99367IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KTypeProjection(@Nullable KVariance kVariance, @Nullable KType kType) {
        boolean z;
        boolean z2;
        String str;
        this.variance = kVariance;
        this.type = kType;
        if (kVariance == null) {
            z = true;
        } else {
            z = false;
        }
        if (kType == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z == z2)) {
            if (kVariance == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + kVariance + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @NotNull
    public static final KTypeProjection contravariant(@NotNull KType kType) {
        return Companion.contravariant(kType);
    }

    public static /* synthetic */ KTypeProjection copy$default(KTypeProjection kTypeProjection, KVariance kVariance, KType kType, int i, Object obj) {
        if ((i & 1) != 0) {
            kVariance = kTypeProjection.variance;
        }
        if ((i & 2) != 0) {
            kType = kTypeProjection.type;
        }
        return kTypeProjection.copy(kVariance, kType);
    }

    @NotNull
    public static final KTypeProjection covariant(@NotNull KType kType) {
        return Companion.covariant(kType);
    }

    @NotNull
    public static final KTypeProjection invariant(@NotNull KType kType) {
        return Companion.invariant(kType);
    }

    @Nullable
    public final KVariance component1() {
        return this.variance;
    }

    @Nullable
    public final KType component2() {
        return this.type;
    }

    @NotNull
    public final KTypeProjection copy(@Nullable KVariance kVariance, @Nullable KType kType) {
        return new KTypeProjection(kVariance, kType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) obj;
        if (this.variance == kTypeProjection.variance && Intrinsics.m17075f(this.type, kTypeProjection.type)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final KType getType() {
        return this.type;
    }

    @Nullable
    public final KVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        int hashCode;
        KVariance kVariance = this.variance;
        int i = 0;
        if (kVariance == null) {
            hashCode = 0;
        } else {
            hashCode = kVariance.hashCode();
        }
        int i2 = hashCode * 31;
        KType kType = this.type;
        if (kType != null) {
            i = kType.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public String toString() {
        int i;
        KVariance kVariance = this.variance;
        if (kVariance == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[kVariance.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "out " + this.type;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return "in " + this.type;
            }
            return String.valueOf(this.type);
        }
        return ProxyConfig.MATCH_ALL_SCHEMES;
    }

    /* compiled from: KTypeProjection.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KTypeProjection contravariant(@NotNull KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(KVariance.f99367IN, type);
        }

        @NotNull
        public final KTypeProjection covariant(@NotNull KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(KVariance.OUT, type);
        }

        @NotNull
        public final KTypeProjection getSTAR() {
            return KTypeProjection.star;
        }

        @NotNull
        public final KTypeProjection invariant(@NotNull KType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new KTypeProjection(KVariance.INVARIANT, type);
        }

        public static /* synthetic */ void getStar$annotations() {
        }
    }
}
