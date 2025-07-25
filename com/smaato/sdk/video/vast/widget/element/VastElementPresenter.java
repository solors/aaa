package com.smaato.sdk.video.vast.widget.element;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public interface VastElementPresenter {

    /* loaded from: classes7.dex */
    public interface Listener {
        void onRenderProcessGone();

        void onVastElementClicked(@Nullable String str);

        void onVastElementError(int i);

        void onVastElementRendered();
    }

    void attachView(@NonNull VastElementView vastElementView);

    void detachView();

    boolean isValidUrl(@NonNull String str);

    void logError(@NonNull VastElementException vastElementException);

    void onClicked(@Nullable String str);

    void onConfigurationChanged();

    void onContentLoaded();

    void onContentStartedToLoad();

    void onError(@NonNull VastElementException vastElementException);

    void onRenderProcessGone();

    void setListener(@Nullable Listener listener);
}
