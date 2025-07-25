package com.monetization.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.View$OnAttachStateChangeListenerC31355sg;
import com.yandex.mobile.ads.impl.ea2;
import com.yandex.mobile.ads.impl.fa2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public class CustomizableMediaView extends FrameLayout {
    @LayoutRes

    /* renamed from: f */
    private static final int f66548f = C29880R.C29885layout.monetization_ads_internal_outstream_controls_default;
    @LayoutRes

    /* renamed from: a */
    private int f66549a;

    /* renamed from: b */
    private int f66550b;

    /* renamed from: c */
    private int f66551c;
    @Nullable

    /* renamed from: d */
    private ea2 f66552d;
    @Nullable

    /* renamed from: e */
    private InterfaceC25610a f66553e;

    /* renamed from: com.monetization.ads.nativeads.CustomizableMediaView$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25610a {
        /* renamed from: a */
        void mo30933a(int i, int i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public CustomizableMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29880R.styleable.MonetizationAdsInternalMediaView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f66549a = obtainStyledAttributes.getResourceId(C29880R.styleable.f76506x71af5829, f66548f);
            this.f66552d = fa2.m34182a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        } else {
            this.f66549a = f66548f;
            this.f66552d = null;
        }
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC31355sg(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.monetization.ads.nativeads.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomizableMediaView.m44271b(CustomizableMediaView.this);
            }
        }));
    }

    /* renamed from: b */
    public static /* synthetic */ void m44271b(CustomizableMediaView customizableMediaView) {
        m44272a(customizableMediaView);
    }

    /* renamed from: a */
    public final void m44273a(int i) {
        this.f66549a = i;
    }

    public final int getHeightMeasureSpec() {
        return this.f66551c;
    }

    @Nullable
    public final InterfaceC25610a getOnSizeChangedListener$mobileads_externalRelease() {
        return this.f66553e;
    }

    public final int getVideoControlsLayoutId() {
        return this.f66549a;
    }

    @Nullable
    public final ea2 getVideoScaleType() {
        return this.f66552d;
    }

    public final int getWidthMeasureSpec() {
        return this.f66550b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f66550b = i;
        this.f66551c = i2;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        InterfaceC25610a interfaceC25610a = this.f66553e;
        if (interfaceC25610a != null) {
            interfaceC25610a.mo30933a(i, i2);
        }
    }

    public final void setOnSizeChangedListener$mobileads_externalRelease(@Nullable InterfaceC25610a interfaceC25610a) {
        this.f66553e = interfaceC25610a;
    }

    /* renamed from: a */
    public static final void m44272a(CustomizableMediaView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC25610a interfaceC25610a = this$0.f66553e;
        if (interfaceC25610a != null) {
            interfaceC25610a.mo30933a(this$0.getWidth(), this$0.getHeight());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizableMediaView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomizableMediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
