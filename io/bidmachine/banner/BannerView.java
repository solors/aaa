package io.bidmachine.banner;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdView;
import io.bidmachine.ViewAdObject;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;

/* loaded from: classes9.dex */
public class BannerView extends AdView<BannerView, C35666a, BannerRequest, ViewAdObject<BannerRequest, UnifiedBannerAd, UnifiedBannerAdRequestParams>, BannerListener> {
    public BannerView(@NonNull Context context) {
        super(context);
    }

    public BannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.AdView
    public C35666a createAd(Context context) {
        return new C35666a(context);
    }

    public BannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
