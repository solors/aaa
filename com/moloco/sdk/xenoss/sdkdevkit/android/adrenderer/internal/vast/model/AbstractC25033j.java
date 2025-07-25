package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j */
/* loaded from: classes7.dex */
public abstract class AbstractC25033j {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j$a */
    /* loaded from: classes7.dex */
    public static final class C25034a extends AbstractC25033j {
        @NotNull

        /* renamed from: a */
        public final List<C25030g> f64921a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25034a(@NotNull List<C25030g> companions) {
            super(null);
            Intrinsics.checkNotNullParameter(companions, "companions");
            this.f64921a = companions;
        }

        @NotNull
        /* renamed from: a */
        public final List<C25030g> m45254a() {
            return this.f64921a;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.j$b */
    /* loaded from: classes7.dex */
    public static final class C25035b extends AbstractC25033j {
        @NotNull

        /* renamed from: a */
        public final C25043r f64922a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25035b(@NotNull C25043r linear) {
            super(null);
            Intrinsics.checkNotNullParameter(linear, "linear");
            this.f64922a = linear;
        }

        @NotNull
        /* renamed from: a */
        public final C25043r m45253a() {
            return this.f64922a;
        }
    }

    public /* synthetic */ AbstractC25033j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC25033j() {
    }
}
