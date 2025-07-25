package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.EnumC24587l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d */
/* loaded from: classes7.dex */
public abstract class AbstractC25279d {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d$a */
    /* loaded from: classes7.dex */
    public static final class C25280a extends AbstractC25279d {
        @NotNull

        /* renamed from: a */
        public static final C25280a f65636a = new C25280a();

        public C25280a() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d$b */
    /* loaded from: classes7.dex */
    public static final class C25281b extends AbstractC25279d {
        @NotNull

        /* renamed from: a */
        public static final C25281b f65637a = new C25281b();

        public C25281b() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d$c */
    /* loaded from: classes7.dex */
    public static final class C25282c extends AbstractC25279d {
        @NotNull

        /* renamed from: a */
        public static final C25282c f65638a = new C25282c();

        public C25282c() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d$d */
    /* loaded from: classes7.dex */
    public static final class C25283d extends AbstractC25279d {
        @NotNull

        /* renamed from: a */
        public final EnumC24587l f65639a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25283d(@NotNull EnumC24587l error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f65639a = error;
        }

        @NotNull
        /* renamed from: a */
        public final EnumC24587l m44858a() {
            return this.f65639a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C25283d) && this.f65639a == ((C25283d) obj).f65639a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f65639a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.f65639a + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d$e */
    /* loaded from: classes7.dex */
    public static final class C25284e extends AbstractC25279d {
        @NotNull

        /* renamed from: a */
        public static final C25284e f65640a = new C25284e();

        public C25284e() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC25279d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC25279d() {
    }
}
