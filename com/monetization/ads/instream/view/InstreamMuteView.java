package com.monetization.ads.instream.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.AttrRes;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.hd2;
import com.yandex.mobile.ads.impl.s01;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class InstreamMuteView extends ImageView implements s01 {
    @NotNull

    /* renamed from: a */
    private final hd2 f66445a;

    /* renamed from: b */
    private boolean f66446b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstreamMuteView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @SuppressLint({"CustomViewStyleable"})
    /* renamed from: a */
    private static hd2 m44291a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29880R.styleable.MonetizationAdsInternalInstreamMuteView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(C29880R.styleable.f76505xeb95fd33, C29880R.C29882drawable.monetization_ads_internal_ic_sound_on_default);
        int resourceId2 = obtainStyledAttributes.getResourceId(C29880R.styleable.f76504x8729a89b, C29880R.C29882drawable.monetization_ads_internal_ic_sound_off_default);
        obtainStyledAttributes.recycle();
        return new hd2(resourceId2, resourceId);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        Resources resources = getResources();
        if (isFocused()) {
            dimensionPixelSize = resources.getDimensionPixelSize(C29880R.dimen.monetization_instream_internal_mute_width);
            dimensionPixelSize2 = resources.getDimensionPixelSize(C29880R.dimen.monetization_instream_internal_mute_height);
        } else {
            dimensionPixelSize = resources.getDimensionPixelSize(C29880R.dimen.monetization_instream_internal_mute_width_v2);
            dimensionPixelSize2 = resources.getDimensionPixelSize(C29880R.dimen.monetization_instream_internal_mute_height_v2);
        }
        setMeasuredDimension(dimensionPixelSize, dimensionPixelSize2);
    }

    @Override // com.yandex.mobile.ads.impl.s01
    public void setMuted(boolean z) {
        this.f66446b = z;
        this.f66445a.m33573a(this, z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InstreamMuteView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ InstreamMuteView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstreamMuteView(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66445a = m44291a(context, attributeSet);
        m44292a();
    }

    /* renamed from: a */
    private final void m44292a() {
        setMuted(this.f66446b);
    }
}
