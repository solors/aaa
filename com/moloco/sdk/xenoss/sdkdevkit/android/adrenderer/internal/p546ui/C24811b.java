package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.C24435p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC24544a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25403a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b */
/* loaded from: classes7.dex */
public final class C24811b extends FrameLayout {
    @NotNull

    /* renamed from: a */
    public final InterfaceC24544a0 f64080a;

    /* renamed from: b */
    public final int f64081b;
    @NotNull

    /* renamed from: c */
    public final ImageButton f64082c;
    @Nullable

    /* renamed from: d */
    public Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit> f64083d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24811b(@NotNull InterfaceC24544a0 externalLinkHandler, @NotNull Context context) {
        this(externalLinkHandler, context, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public static final void m45654a(C24811b this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f64080a.mo46151a("https://www.moloco.com/privacy-policy");
    }

    @VisibleForTesting
    @NotNull
    public final ImageButton getAdButton() {
        return this.f64082c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            float f = getResources().getDisplayMetrics().density;
            int[] iArr = new int[2];
            this.f64082c.getLocationOnScreen(iArr);
            InterfaceC25403a.AbstractC25404a.C25407c c25407c = new InterfaceC25403a.AbstractC25404a.C25407c(InterfaceC25403a.AbstractC25404a.C25407c.EnumC25408a.AD_BADGE, new InterfaceC25403a.AbstractC25404a.C25411f(iArr[0] / f, iArr[1] / f), new InterfaceC25403a.AbstractC25404a.C25412g(this.f64082c.getWidth() / f, this.f64082c.getHeight() / f));
            Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit> function1 = this.f64083d;
            if (function1 != null) {
                function1.invoke(c25407c);
            }
        }
    }

    public final void setOnButtonRenderedListener(@NotNull Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f64083d = listener;
    }

    public final void setPrivacyUrl(@NotNull final String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f64082c.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C24811b.m45653a(C24811b.this, url, view);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24811b(@NotNull InterfaceC24544a0 externalLinkHandler, @NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(externalLinkHandler, context, attributeSet, 0, 8, null);
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public static final void m45653a(C24811b this$0, String url, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "$url");
        this$0.f64080a.mo46151a(url);
    }

    public /* synthetic */ C24811b(InterfaceC24544a0 interfaceC24544a0, Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC24544a0, context, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24811b(@NotNull InterfaceC24544a0 externalLinkHandler, @NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f64080a = externalLinkHandler;
        this.f64081b = 12;
        ImageButton imageButton = new ImageButton(context);
        imageButton.setLayoutParams(new FrameLayout.LayoutParams(C24814e.m45652a(12, context), C24814e.m45652a(12, context)));
        imageButton.setImageResource(C24435p.info_badge);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setClipToOutline(true);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C24811b.m45654a(C24811b.this, view);
            }
        });
        this.f64082c = imageButton;
        addView(imageButton);
    }
}
