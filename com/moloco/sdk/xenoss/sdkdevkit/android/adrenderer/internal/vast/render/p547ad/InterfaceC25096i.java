package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p547ad;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.InterfaceC24725i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui.InterfaceC24832h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.InterfaceC25243d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.InterfaceC25127h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.InterfaceC25253e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.InterfaceC25301k;
import ge.StateFlow;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i */
/* loaded from: classes7.dex */
public interface InterfaceC25096i extends InterfaceC25243d, InterfaceC24832h {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC25097a {

        /* renamed from: a */
        public final boolean f65108a;

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$a */
        /* loaded from: classes7.dex */
        public static final class C25098a extends AbstractC25097a {
            @NotNull

            /* renamed from: b */
            public final InterfaceC25127h f65109b;

            /* renamed from: c */
            public final boolean f65110c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25098a(@NotNull InterfaceC25127h viewModel, boolean z) {
                super(z, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.f65109b = viewModel;
                this.f65110c = z;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p547ad.InterfaceC25096i.AbstractC25097a
            /* renamed from: a */
            public boolean mo45135a() {
                return this.f65110c;
            }

            @NotNull
            /* renamed from: b */
            public final InterfaceC25127h m45138b() {
                return this.f65109b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C25098a)) {
                    return false;
                }
                C25098a c25098a = (C25098a) obj;
                if (Intrinsics.m17075f(this.f65109b, c25098a.f65109b) && this.f65110c == c25098a.f65110c) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.f65109b.hashCode() * 31;
                boolean z = this.f65110c;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            @NotNull
            public String toString() {
                return "Companion(viewModel=" + this.f65109b + ", isLastAdPart=" + this.f65110c + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$b */
        /* loaded from: classes7.dex */
        public static final class C25099b extends AbstractC25097a {
            @NotNull

            /* renamed from: b */
            public final InterfaceC25253e f65111b;

            /* renamed from: c */
            public final boolean f65112c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25099b(@NotNull InterfaceC25253e viewModel, boolean z) {
                super(z, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.f65111b = viewModel;
                this.f65112c = z;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p547ad.InterfaceC25096i.AbstractC25097a
            /* renamed from: a */
            public boolean mo45135a() {
                return this.f65112c;
            }

            @NotNull
            /* renamed from: b */
            public final InterfaceC25253e m45137b() {
                return this.f65111b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C25099b)) {
                    return false;
                }
                C25099b c25099b = (C25099b) obj;
                if (Intrinsics.m17075f(this.f65111b, c25099b.f65111b) && this.f65112c == c25099b.f65112c) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.f65111b.hashCode() * 31;
                boolean z = this.f65112c;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            @NotNull
            public String toString() {
                return "DEC(viewModel=" + this.f65111b + ", isLastAdPart=" + this.f65112c + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$c */
        /* loaded from: classes7.dex */
        public static final class C25100c extends AbstractC25097a {
            @NotNull

            /* renamed from: b */
            public final InterfaceC25301k f65113b;

            /* renamed from: c */
            public final boolean f65114c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25100c(@NotNull InterfaceC25301k viewModel, boolean z) {
                super(z, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.f65113b = viewModel;
                this.f65114c = z;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p547ad.InterfaceC25096i.AbstractC25097a
            /* renamed from: a */
            public boolean mo45135a() {
                return this.f65114c;
            }

            @NotNull
            /* renamed from: b */
            public final InterfaceC25301k m45136b() {
                return this.f65113b;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C25100c)) {
                    return false;
                }
                C25100c c25100c = (C25100c) obj;
                if (Intrinsics.m17075f(this.f65113b, c25100c.f65113b) && this.f65114c == c25100c.f65114c) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.f65113b.hashCode() * 31;
                boolean z = this.f65114c;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            @NotNull
            public String toString() {
                return "Linear(viewModel=" + this.f65113b + ", isLastAdPart=" + this.f65114c + ')';
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$d */
        /* loaded from: classes7.dex */
        public static final class C25101d extends AbstractC25097a {
            @NotNull

            /* renamed from: b */
            public final InterfaceC24725i f65115b;

            /* renamed from: c */
            public final boolean f65116c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25101d(@NotNull InterfaceC24725i viewModel, boolean z) {
                super(z, null);
                Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                this.f65115b = viewModel;
                this.f65116c = z;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p547ad.InterfaceC25096i.AbstractC25097a
            /* renamed from: a */
            public boolean mo45135a() {
                return this.f65116c;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C25101d)) {
                    return false;
                }
                C25101d c25101d = (C25101d) obj;
                if (Intrinsics.m17075f(this.f65115b, c25101d.f65115b) && this.f65116c == c25101d.f65116c) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.f65115b.hashCode() * 31;
                boolean z = this.f65116c;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            @NotNull
            public String toString() {
                return "Mraid(viewModel=" + this.f65115b + ", isLastAdPart=" + this.f65116c + ')';
            }
        }

        public /* synthetic */ AbstractC25097a(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        /* renamed from: a */
        public boolean mo45135a() {
            return this.f65108a;
        }

        public AbstractC25097a(boolean z) {
            this.f65108a = z;
        }
    }

    /* renamed from: A */
    void mo45143A();

    /* renamed from: B */
    void mo45142B();

    @NotNull
    /* renamed from: j */
    StateFlow<AbstractC25097a> mo45141j();

    @NotNull
    /* renamed from: n */
    StateFlow<Boolean> mo45140n();

    /* renamed from: y */
    void mo45139y();
}
