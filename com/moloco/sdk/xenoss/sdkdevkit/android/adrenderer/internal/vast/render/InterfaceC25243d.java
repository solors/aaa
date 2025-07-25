package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import ge.StateFlow;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.UInt;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d */
/* loaded from: classes7.dex */
public interface InterfaceC25243d {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC25244a {

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d$a$a */
        /* loaded from: classes7.dex */
        public static final class C25245a extends AbstractC25244a {
            @NotNull

            /* renamed from: a */
            public static final C25245a f65536a = new C25245a();

            public C25245a() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d$a$b */
        /* loaded from: classes7.dex */
        public static final class C25246b extends AbstractC25244a {

            /* renamed from: a */
            public final int f65537a;

            public /* synthetic */ C25246b(int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(i);
            }

            /* renamed from: a */
            public final int m44930a() {
                return this.f65537a;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C25246b) && this.f65537a == ((C25246b) obj).f65537a) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return UInt.m14505e(this.f65537a);
            }

            @NotNull
            public String toString() {
                return "Countdown(seconds=" + ((Object) UInt.m14504f(this.f65537a)) + ')';
            }

            public C25246b(int i) {
                super(null);
                this.f65537a = i;
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d$a$c */
        /* loaded from: classes7.dex */
        public static final class C25247c extends AbstractC25244a {
            @NotNull

            /* renamed from: a */
            public static final C25247c f65538a = new C25247c();

            public C25247c() {
                super(null);
            }
        }

        public /* synthetic */ AbstractC25244a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public AbstractC25244a() {
        }
    }

    @NotNull
    /* renamed from: l */
    StateFlow<AbstractC25244a> mo44825l();
}
