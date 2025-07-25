package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c */
/* loaded from: classes7.dex */
public abstract class AbstractC25024c {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c$a */
    /* loaded from: classes7.dex */
    public static final class C25025a extends AbstractC25024c {
        @NotNull

        /* renamed from: a */
        public final C25042q f64893a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25025a(@NotNull C25042q inline) {
            super(null);
            Intrinsics.checkNotNullParameter(inline, "inline");
            this.f64893a = inline;
        }

        @NotNull
        /* renamed from: a */
        public final C25042q m45271a() {
            return this.f64893a;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c$b */
    /* loaded from: classes7.dex */
    public static final class C25026b extends AbstractC25024c {
        @NotNull

        /* renamed from: a */
        public final C25027d f64894a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25026b(@NotNull C25027d wrapper) {
            super(null);
            Intrinsics.checkNotNullParameter(wrapper, "wrapper");
            this.f64894a = wrapper;
        }

        @NotNull
        /* renamed from: a */
        public final C25027d m45270a() {
            return this.f64894a;
        }
    }

    public /* synthetic */ AbstractC25024c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC25024c() {
    }
}
