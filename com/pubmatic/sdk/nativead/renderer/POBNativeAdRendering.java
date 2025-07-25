package com.pubmatic.sdk.nativead.renderer;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider;
import com.pubmatic.sdk.nativead.response.POBNativeAdResponse;
import com.pubmatic.sdk.nativead.views.POBNativeTemplateView;
import java.util.List;

/* loaded from: classes7.dex */
public interface POBNativeAdRendering {
    void destroy();

    void enableDsaIcon(boolean z);

    void registerView(@NonNull POBNativeAdResponse pOBNativeAdResponse, @NonNull View view, @NonNull List<View> list);

    void renderAd(@NonNull POBNativeAdResponse pOBNativeAdResponse, @NonNull POBNativeTemplateView pOBNativeTemplateView);

    void setAdRendererListener(@Nullable POBNativeRendererListener pOBNativeRendererListener);

    void setNativeMeasurementProvider(@Nullable POBNativeMeasurementProvider pOBNativeMeasurementProvider);
}
