package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.InterfaceC24576c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b */
/* loaded from: classes7.dex */
public abstract class AbstractC25111b {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b$a */
    /* loaded from: classes7.dex */
    public static final class C25112a extends AbstractC25111b {
        @NotNull

        /* renamed from: a */
        public static final C25112a f65127a = new C25112a();

        public C25112a() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b$b */
    /* loaded from: classes7.dex */
    public static final class C25113b extends AbstractC25111b {
        @NotNull

        /* renamed from: a */
        public static final C25113b f65128a = new C25113b();

        public C25113b() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b$c */
    /* loaded from: classes7.dex */
    public static final class C25114c extends AbstractC25111b {
        @NotNull

        /* renamed from: a */
        public final InterfaceC24576c f65129a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25114c(@NotNull InterfaceC24576c error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f65129a = error;
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC24576c m45123a() {
            return this.f65129a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C25114c) && Intrinsics.m17075f(this.f65129a, ((C25114c) obj).f65129a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f65129a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(error=" + this.f65129a + ')';
        }
    }

    public /* synthetic */ AbstractC25111b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC25111b() {
    }
}
