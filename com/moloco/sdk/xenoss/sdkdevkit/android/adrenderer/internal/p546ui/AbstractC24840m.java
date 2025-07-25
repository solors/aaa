package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui;

import androidx.compose.p015ui.graphics.Shape;
import androidx.compose.p015ui.graphics.painter.Painter;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m */
/* loaded from: classes7.dex */
public abstract class AbstractC24840m {

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$a */
    /* loaded from: classes7.dex */
    public static final class C24841a extends AbstractC24840m {

        /* renamed from: a */
        public final boolean f64176a;

        /* renamed from: b */
        public final int f64177b;

        /* renamed from: c */
        public final int f64178c;

        public /* synthetic */ C24841a(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, i, i2);
        }

        /* renamed from: a */
        public final int m45624a() {
            return this.f64178c;
        }

        /* renamed from: b */
        public final boolean m45623b() {
            return this.f64176a;
        }

        /* renamed from: c */
        public final int m45622c() {
            return this.f64177b;
        }

        public C24841a(boolean z, int i, int i2) {
            super(null);
            this.f64176a = z;
            this.f64177b = i;
            this.f64178c = i2;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$b */
    /* loaded from: classes7.dex */
    public static final class C24842b extends AbstractC24840m {
        @NotNull

        /* renamed from: a */
        public final Painter f64179a;
        @Nullable

        /* renamed from: b */
        public final String f64180b;

        /* renamed from: c */
        public final long f64181c;
        @NotNull

        /* renamed from: d */
        public final Shape f64182d;

        /* renamed from: e */
        public final long f64183e;

        public /* synthetic */ C24842b(Painter painter, String str, long j, Shape shape, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(painter, str, j, shape, j2);
        }

        /* renamed from: a */
        public final long m45621a() {
            return this.f64183e;
        }

        @NotNull
        /* renamed from: b */
        public final Shape m45620b() {
            return this.f64182d;
        }

        @Nullable
        /* renamed from: c */
        public final String m45619c() {
            return this.f64180b;
        }

        /* renamed from: d */
        public final long m45618d() {
            return this.f64181c;
        }

        @NotNull
        /* renamed from: e */
        public final Painter m45617e() {
            return this.f64179a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24842b(Painter painter, String str, long j, Shape backgroundShape, long j2) {
            super(null);
            Intrinsics.checkNotNullParameter(painter, "painter");
            Intrinsics.checkNotNullParameter(backgroundShape, "backgroundShape");
            this.f64179a = painter;
            this.f64180b = str;
            this.f64181c = j;
            this.f64182d = backgroundShape;
            this.f64183e = j2;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$c */
    /* loaded from: classes7.dex */
    public static final class C24843c extends AbstractC24840m {
        @NotNull

        /* renamed from: a */
        public final String f64184a;

        @NotNull
        /* renamed from: a */
        public final String m45616a() {
            return this.f64184a;
        }
    }

    public /* synthetic */ AbstractC24840m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public AbstractC24840m() {
    }
}
