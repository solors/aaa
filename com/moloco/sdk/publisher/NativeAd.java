package com.moloco.sdk.publisher;

import android.net.Uri;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public interface NativeAd extends AdLoad, Destroyable {

    @Metadata
    /* loaded from: classes7.dex */
    public interface Assets {
        @Nullable
        String getCallToActionText();

        @Nullable
        String getDescription();

        @Nullable
        Uri getIconUri();

        @Nullable
        Uri getMainImageUri();

        @Nullable
        View getMediaView();

        @Nullable
        Float getRating();

        @Nullable
        String getSponsorText();

        @Nullable
        String getTitle();
    }

    @Metadata
    /* loaded from: classes7.dex */
    public interface InteractionListener {
        void onGeneralClickHandled();

        void onImpressionHandled();
    }

    @Nullable
    Assets getAssets();

    @Nullable
    InteractionListener getInteractionListener();

    void handleGeneralAdClick();

    void handleImpression();

    void setInteractionListener(@Nullable InteractionListener interactionListener);
}
