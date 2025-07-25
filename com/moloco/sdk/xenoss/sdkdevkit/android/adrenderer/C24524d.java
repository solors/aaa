package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui.C24849o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.C25341b;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25403a;
import ge.InterfaceC33421z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45255a;
import p1076zd.InterfaceC45274t;
import p804nd.UInt;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d */
/* loaded from: classes7.dex */
public final class C24524d {

    /* renamed from: a */
    public final int f63272a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC45274t<Context, WebView, Integer, InterfaceC33421z<Boolean>, Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit>, Functions<Unit>, InterfaceC25381r, C1059Dp, Boolean, View> f63273b;

    /* renamed from: c */
    public final int f63274c;
    @NotNull

    /* renamed from: d */
    public final Function2<Composer, Integer, InterfaceC45255a<BoxScope, Boolean, Boolean, Functions<Unit>, Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit>, Boolean, UInt, UInt, Composer, Integer, Unit>> f63275d;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d$a */
    /* loaded from: classes7.dex */
    public static final class C24525a extends Lambda implements Function2<Composer, Integer, InterfaceC45255a<? super BoxScope, ? super Boolean, ? super Boolean, ? super Functions<? extends Unit>, ? super Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Composer, ? super Integer, ? extends Unit>> {

        /* renamed from: g */
        public static final C24525a f63276g = new C24525a();

        public C24525a() {
            super(2);
        }

        @Composable
        @NotNull
        /* renamed from: a */
        public final InterfaceC45255a<BoxScope, Boolean, Boolean, Functions<Unit>, Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit>, Boolean, UInt, UInt, Composer, Integer, Unit> m46199a(@Nullable Composer composer, int i) {
            composer.startReplaceableGroup(478047689);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(478047689, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.AdWebViewOptions.<init>.<anonymous> (AdOptions.kt:20)");
            }
            InterfaceC45255a<BoxScope, Boolean, Boolean, Functions<Unit>, Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit>, Boolean, UInt, UInt, Composer, Integer, Unit> m45608b = C24849o.m45608b(null, null, 0L, 0L, 0L, null, null, null, composer, 0, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return m45608b;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ InterfaceC45255a<? super BoxScope, ? super Boolean, ? super Boolean, ? super Functions<? extends Unit>, ? super Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, ? extends Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Composer, ? super Integer, ? extends Unit> mo105910invoke(Composer composer, Integer num) {
            return m46199a(composer, num.intValue());
        }
    }

    public C24524d() {
        this(0, null, 0, null, 15, null);
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC45274t<Context, WebView, Integer, InterfaceC33421z<Boolean>, Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit>, Functions<Unit>, InterfaceC25381r, C1059Dp, Boolean, View> m46203a() {
        return this.f63273b;
    }

    /* renamed from: b */
    public final int m46202b() {
        return this.f63272a;
    }

    @NotNull
    /* renamed from: c */
    public final Function2<Composer, Integer, InterfaceC45255a<BoxScope, Boolean, Boolean, Functions<Unit>, Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit>, Boolean, UInt, UInt, Composer, Integer, Unit>> m46201c() {
        return this.f63275d;
    }

    /* renamed from: d */
    public final int m46200d() {
        return this.f63274c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C24524d(int i, @NotNull InterfaceC45274t<? super Context, ? super WebView, ? super Integer, ? super InterfaceC33421z<Boolean>, ? super Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit>, ? super Functions<Unit>, ? super InterfaceC25381r, ? super C1059Dp, ? super Boolean, ? extends View> adWebViewRenderer, int i2, @NotNull Function2<? super Composer, ? super Integer, ? extends InterfaceC45255a<? super BoxScope, ? super Boolean, ? super Boolean, ? super Functions<Unit>, ? super Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit>, ? super Boolean, ? super UInt, ? super UInt, ? super Composer, ? super Integer, Unit>> decClose) {
        Intrinsics.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        Intrinsics.checkNotNullParameter(decClose, "decClose");
        this.f63272a = i;
        this.f63273b = adWebViewRenderer;
        this.f63274c = i2;
        this.f63275d = decClose;
    }

    public /* synthetic */ C24524d(int i, InterfaceC45274t interfaceC45274t, int i2, Function2 function2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 5 : i, (i3 & 2) != 0 ? C25341b.m44707d(0L, null, 3, null) : interfaceC45274t, (i3 & 4) != 0 ? 5 : i2, (i3 & 8) != 0 ? C24525a.f63276g : function2);
    }
}
