package com.pubmatic.sdk.webrendering.p566ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$drawable;
import com.pubmatic.sdk.webrendering.R$id;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: POBAdViewContainer.kt */
@Metadata
/* renamed from: com.pubmatic.sdk.webrendering.ui.POBAdViewContainer */
/* loaded from: classes7.dex */
public final class POBAdViewContainer extends FrameLayout {
    @NotNull

    /* renamed from: a */
    private final Context f71248a;
    @NotNull

    /* renamed from: b */
    private final POBWebView f71249b;
    @Nullable

    /* renamed from: c */
    private ImageButton f71250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public POBAdViewContainer(@NotNull Context context, @NotNull POBWebView adView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adView, "adView");
        this.f71248a = context;
        this.f71249b = adView;
        addView(adView);
    }

    public final void addDsaIcon(boolean z, boolean z2, @Nullable View.OnClickListener onClickListener) {
        boolean z3;
        if (z && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        ImageButton createDsaInfoIconButton = POBUIUtil.createDsaInfoIconButton(this.f71248a, R$id.pob_dsa_info_btn, R$drawable.pob_dsa_info_icon, z, z3);
        this.f71250c = createDsaInfoIconButton;
        if (createDsaInfoIconButton != null) {
            createDsaInfoIconButton.setOnClickListener(onClickListener);
        }
        addView(this.f71250c);
    }

    @NotNull
    public final POBWebView getAdView() {
        return this.f71249b;
    }

    @Nullable
    public final ImageButton getDsaIcon() {
        return this.f71250c;
    }

    public final void resizeDsaIcon(boolean z) {
        ImageButton imageButton = this.f71250c;
        if (imageButton != null) {
            POBUIUtil.resizeDsaInfoBtn(this.f71248a, imageButton, z);
        }
    }

    public final void setDsaIcon(@Nullable ImageButton imageButton) {
        this.f71250c = imageButton;
    }
}
