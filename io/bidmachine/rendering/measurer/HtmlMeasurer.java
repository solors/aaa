package io.bidmachine.rendering.measurer;

import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.model.Error;

/* loaded from: classes9.dex */
public interface HtmlMeasurer extends Measurer<WebView> {
    @Override // io.bidmachine.rendering.measurer.Measurer
    /* synthetic */ void destroy(@Nullable Runnable runnable);

    @Override // io.bidmachine.rendering.measurer.Measurer
    /* synthetic */ void onClicked();

    @Override // io.bidmachine.rendering.measurer.Measurer
    /* synthetic */ void onError(@NonNull Error error);

    @Override // io.bidmachine.rendering.measurer.Measurer
    /* synthetic */ void onShown();

    @Override // 
    /* synthetic */ void onViewAddedToContainer(@NonNull WebView webView, @NonNull ViewGroup viewGroup);

    @Override // io.bidmachine.rendering.measurer.Measurer
    /* synthetic */ void onViewCreated(@NonNull WebView webView);

    @Override // 
    /* synthetic */ void onViewReady(@NonNull WebView webView);

    @NonNull
    String prepareCreativeForMeasure(@NonNull String str);
}
