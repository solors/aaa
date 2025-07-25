package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p547ad;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.InterfaceC24726j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.InterfaceC25110a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.InterfaceC25248a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.InterfaceC25278c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k */
/* loaded from: classes7.dex */
public abstract class AbstractC25103k {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$a */
    /* loaded from: classes7.dex */
    public static final class C25104a extends AbstractC25103k {
        @NotNull

        /* renamed from: a */
        public final InterfaceC25110a f65117a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25104a(@NotNull InterfaceC25110a companion) {
            super(null);
            Intrinsics.checkNotNullParameter(companion, "companion");
            this.f65117a = companion;
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC25110a m45133a() {
            return this.f65117a;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$b */
    /* loaded from: classes7.dex */
    public static final class C25105b extends AbstractC25103k {
        @NotNull

        /* renamed from: a */
        public final InterfaceC25248a f65118a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25105b(@NotNull InterfaceC25248a dec) {
            super(null);
            Intrinsics.checkNotNullParameter(dec, "dec");
            this.f65118a = dec;
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC25248a m45132a() {
            return this.f65118a;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$c */
    /* loaded from: classes7.dex */
    public static final class C25106c extends AbstractC25103k {
        @NotNull

        /* renamed from: a */
        public final InterfaceC25278c f65119a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25106c(@NotNull InterfaceC25278c linear) {
            super(null);
            Intrinsics.checkNotNullParameter(linear, "linear");
            this.f65119a = linear;
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC25278c m45131a() {
            return this.f65119a;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k$d */
    /* loaded from: classes7.dex */
    public static final class C25107d extends AbstractC25103k {
        @NotNull

        /* renamed from: a */
        public final InterfaceC24726j f65120a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25107d(@NotNull InterfaceC24726j mraid) {
            super(null);
            Intrinsics.checkNotNullParameter(mraid, "mraid");
            this.f65120a = mraid;
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC24726j m45130a() {
            return this.f65120a;
        }
    }

    public /* synthetic */ AbstractC25103k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC25103k() {
    }
}
