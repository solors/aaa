package com.smaato.sdk.video.vast.widget.element;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenter;

/* loaded from: classes7.dex */
public class NoOpVastElementPresenter implements VastElementPresenter {
    @Override // com.smaato.sdk.video.vast.widget.element.VastElementPresenter
    public boolean isValidUrl(@NonNull String str) {
        return false;
    }

    @Override // com.smaato.sdk.video.vast.widget.element.VastElementPresenter
    public void detachView() {
    }

    @Override // com.smaato.sdk.video.vast.widget.element.VastElementPresenter
    public void onConfigurationChanged() {
    }

    @Override // com.smaato.sdk.video.vast.widget.element.VastElementPresenter
    public void onContentLoaded() {
    }

    @Override // com.smaato.sdk.video.vast.widget.element.VastElementPresenter
    public void onContentStartedToLoad() {
    }

    @Override // com.smaato.sdk.video.vast.widget.element.VastElementPresenter
    public void onRenderProcessGone() {
    }

    @Override // com.smaato.sdk.video.vast.widget.element.VastElementPresenter
    public void attachView(@NonNull VastElementView vastElementView) {
    }

    @Override // com.smaato.sdk.video.vast.widget.element.VastElementPresenter
    public void logError(@NonNull VastElementException vastElementException) {
    }

    @Override // com.smaato.sdk.video.vast.widget.element.VastElementPresenter
    public void onClicked(@Nullable String str) {
    }

    @Override // com.smaato.sdk.video.vast.widget.element.VastElementPresenter
    public void onError(@NonNull VastElementException vastElementException) {
    }

    @Override // com.smaato.sdk.video.vast.widget.element.VastElementPresenter
    public void setListener(@Nullable VastElementPresenter.Listener listener) {
    }
}
