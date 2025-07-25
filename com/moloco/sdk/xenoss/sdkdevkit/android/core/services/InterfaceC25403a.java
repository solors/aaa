package com.moloco.sdk.xenoss.sdkdevkit.android.core.services;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a */
/* loaded from: classes7.dex */
public interface InterfaceC25403a {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC25404a {

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$a */
        /* loaded from: classes7.dex */
        public static final class C25405a extends AbstractC25404a {
            @NotNull

            /* renamed from: a */
            public static final C25405a f65968a = new C25405a();

            public C25405a() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$b */
        /* loaded from: classes7.dex */
        public static final class C25406b extends AbstractC25404a {

            /* renamed from: a */
            public final long f65969a;

            public C25406b(long j) {
                super(null);
                this.f65969a = j;
            }

            /* renamed from: a */
            public final long m44612a() {
                return this.f65969a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C25406b) && this.f65969a == ((C25406b) obj).f65969a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Long.hashCode(this.f65969a);
            }

            @NotNull
            public String toString() {
                return "AppForeground(lastBgTimestamp=" + this.f65969a + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c */
        /* loaded from: classes7.dex */
        public static final class C25407c {
            @NotNull

            /* renamed from: a */
            public final EnumC25408a f65970a;
            @NotNull

            /* renamed from: b */
            public final C25411f f65971b;
            @NotNull

            /* renamed from: c */
            public final C25412g f65972c;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$c$a */
            /* loaded from: classes7.dex */
            public enum EnumC25408a {
                NONE,
                CLOSE,
                SKIP,
                SKIP_DEC,
                MUTE,
                UNMUTE,
                CTA,
                REPLAY,
                AD_BADGE
            }

            public C25407c(@NotNull EnumC25408a buttonType, @NotNull C25411f position, @NotNull C25412g size) {
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                Intrinsics.checkNotNullParameter(position, "position");
                Intrinsics.checkNotNullParameter(size, "size");
                this.f65970a = buttonType;
                this.f65971b = position;
                this.f65972c = size;
            }

            /* renamed from: b */
            public static /* synthetic */ C25407c m44610b(C25407c c25407c, EnumC25408a enumC25408a, C25411f c25411f, C25412g c25412g, int i, Object obj) {
                if ((i & 1) != 0) {
                    enumC25408a = c25407c.f65970a;
                }
                if ((i & 2) != 0) {
                    c25411f = c25407c.f65971b;
                }
                if ((i & 4) != 0) {
                    c25412g = c25407c.f65972c;
                }
                return c25407c.m44611a(enumC25408a, c25411f, c25412g);
            }

            @NotNull
            /* renamed from: a */
            public final C25407c m44611a(@NotNull EnumC25408a buttonType, @NotNull C25411f position, @NotNull C25412g size) {
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                Intrinsics.checkNotNullParameter(position, "position");
                Intrinsics.checkNotNullParameter(size, "size");
                return new C25407c(buttonType, position, size);
            }

            @NotNull
            /* renamed from: c */
            public final EnumC25408a m44609c() {
                return this.f65970a;
            }

            @NotNull
            /* renamed from: d */
            public final C25411f m44608d() {
                return this.f65971b;
            }

            @NotNull
            /* renamed from: e */
            public final C25412g m44607e() {
                return this.f65972c;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C25407c)) {
                    return false;
                }
                C25407c c25407c = (C25407c) obj;
                if (this.f65970a == c25407c.f65970a && Intrinsics.m17075f(this.f65971b, c25407c.f65971b) && Intrinsics.m17075f(this.f65972c, c25407c.f65972c)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (((this.f65970a.hashCode() * 31) + this.f65971b.hashCode()) * 31) + this.f65972c.hashCode();
            }

            @NotNull
            public String toString() {
                return "Button(buttonType=" + this.f65970a + ", position=" + this.f65971b + ", size=" + this.f65972c + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$e */
        /* loaded from: classes7.dex */
        public static final class C25410e extends AbstractC25404a {
            @NotNull

            /* renamed from: a */
            public static final C25410e f65987a = new C25410e();

            public C25410e() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$f */
        /* loaded from: classes7.dex */
        public static final class C25411f {

            /* renamed from: a */
            public final float f65988a;

            /* renamed from: b */
            public final float f65989b;

            public C25411f(float f, float f2) {
                this.f65988a = f;
                this.f65989b = f2;
            }

            /* renamed from: a */
            public final float m44601a() {
                return this.f65988a;
            }

            /* renamed from: b */
            public final float m44600b() {
                return this.f65989b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C25411f)) {
                    return false;
                }
                C25411f c25411f = (C25411f) obj;
                if (Float.compare(this.f65988a, c25411f.f65988a) == 0 && Float.compare(this.f65989b, c25411f.f65989b) == 0) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (Float.hashCode(this.f65988a) * 31) + Float.hashCode(this.f65989b);
            }

            @NotNull
            public String toString() {
                return "Position(topLeftXDp=" + this.f65988a + ", topLeftYDp=" + this.f65989b + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$g */
        /* loaded from: classes7.dex */
        public static final class C25412g {

            /* renamed from: a */
            public final float f65990a;

            /* renamed from: b */
            public final float f65991b;

            public C25412g(float f, float f2) {
                this.f65990a = f;
                this.f65991b = f2;
            }

            /* renamed from: a */
            public final float m44599a() {
                return this.f65991b;
            }

            /* renamed from: b */
            public final float m44598b() {
                return this.f65990a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C25412g)) {
                    return false;
                }
                C25412g c25412g = (C25412g) obj;
                if (Float.compare(this.f65990a, c25412g.f65990a) == 0 && Float.compare(this.f65991b, c25412g.f65991b) == 0) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (Float.hashCode(this.f65990a) * 31) + Float.hashCode(this.f65991b);
            }

            @NotNull
            public String toString() {
                return "Size(widthDp=" + this.f65990a + ", heightDp=" + this.f65991b + ')';
            }
        }

        public /* synthetic */ AbstractC25404a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a$a$d */
        /* loaded from: classes7.dex */
        public static final class C25409d extends AbstractC25404a {
            @NotNull

            /* renamed from: a */
            public final C25411f f65983a;
            @Nullable

            /* renamed from: b */
            public final C25411f f65984b;
            @Nullable

            /* renamed from: c */
            public final C25412g f65985c;
            @NotNull

            /* renamed from: d */
            public final List<C25407c> f65986d;

            public /* synthetic */ C25409d(C25411f c25411f, C25411f c25411f2, C25412g c25412g, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(c25411f, (i & 2) != 0 ? null : c25411f2, (i & 4) != 0 ? null : c25412g, (i & 8) != 0 ? C37563v.m17166m() : list);
            }

            @NotNull
            /* renamed from: a */
            public final List<C25407c> m44605a() {
                return this.f65986d;
            }

            @NotNull
            /* renamed from: b */
            public final C25411f m44604b() {
                return this.f65983a;
            }

            @Nullable
            /* renamed from: c */
            public final C25411f m44603c() {
                return this.f65984b;
            }

            @Nullable
            /* renamed from: d */
            public final C25412g m44602d() {
                return this.f65985c;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25409d(@NotNull C25411f clickPosition, @Nullable C25411f c25411f, @Nullable C25412g c25412g, @NotNull List<C25407c> buttonLayout) {
                super(null);
                Intrinsics.checkNotNullParameter(clickPosition, "clickPosition");
                Intrinsics.checkNotNullParameter(buttonLayout, "buttonLayout");
                this.f65983a = clickPosition;
                this.f65984b = c25411f;
                this.f65985c = c25412g;
                this.f65986d = buttonLayout;
            }
        }

        public AbstractC25404a() {
        }
    }

    @Nullable
    /* renamed from: a */
    Object mo44613a(long j, @NotNull AbstractC25404a abstractC25404a, @NotNull String str, @NotNull Continuation<? super String> continuation);
}
