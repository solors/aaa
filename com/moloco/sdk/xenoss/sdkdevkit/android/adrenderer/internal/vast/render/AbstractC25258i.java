package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i */
/* loaded from: classes7.dex */
public abstract class AbstractC25258i {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i$a */
    /* loaded from: classes7.dex */
    public static final class C25259a extends AbstractC25258i {

        /* renamed from: a */
        public final long f65595a;

        public C25259a(long j) {
            super(null);
            this.f65595a = j;
        }

        /* renamed from: a */
        public final long m44880a() {
            return this.f65595a;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i$b */
    /* loaded from: classes7.dex */
    public static final class C25260b extends AbstractC25258i {
        @NotNull

        /* renamed from: a */
        public static final C25260b f65596a = new C25260b();

        public C25260b() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i$c */
    /* loaded from: classes7.dex */
    public static final class C25261c extends AbstractC25258i {

        /* renamed from: a */
        public final long f65597a;

        /* renamed from: b */
        public final long f65598b;

        public C25261c(long j, long j2) {
            super(null);
            this.f65597a = j;
            this.f65598b = j2;
        }

        /* renamed from: a */
        public final long m44879a() {
            return this.f65597a;
        }

        /* renamed from: b */
        public final long m44878b() {
            return this.f65598b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25261c)) {
                return false;
            }
            C25261c c25261c = (C25261c) obj;
            if (this.f65597a == c25261c.f65597a && this.f65598b == c25261c.f65598b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Long.hashCode(this.f65597a) * 31) + Long.hashCode(this.f65598b);
        }

        @NotNull
        public String toString() {
            return "Position(currentPositionMillis=" + this.f65597a + ", totalDurationMillis=" + this.f65598b + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i$d */
    /* loaded from: classes7.dex */
    public static final class C25262d extends AbstractC25258i {

        /* renamed from: a */
        public final long f65599a;

        public C25262d(long j) {
            super(null);
            this.f65599a = j;
        }

        /* renamed from: a */
        public final long m44877a() {
            return this.f65599a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C25262d) && this.f65599a == ((C25262d) obj).f65599a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Long.hashCode(this.f65599a);
        }

        @NotNull
        public String toString() {
            return "Preparing(totalDurationMillis=" + this.f65599a + ')';
        }
    }

    public /* synthetic */ AbstractC25258i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC25258i() {
    }
}
