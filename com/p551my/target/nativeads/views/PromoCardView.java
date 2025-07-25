package com.p551my.target.nativeads.views;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.nativeads.views.PromoCardView */
/* loaded from: classes7.dex */
public interface PromoCardView {

    /* renamed from: com.my.target.nativeads.views.PromoCardView$Card */
    /* loaded from: classes7.dex */
    public static abstract class Card {
        @Nullable
        public String getCtaButtonText() {
            return null;
        }

        @Nullable
        public String getDescription() {
            return null;
        }

        @Nullable
        public String getDiscountText() {
            return null;
        }

        @Nullable
        public String getTitle() {
            return null;
        }
    }

    @NonNull
    MediaAdView getMediaAdView();

    @NonNull
    View getView();

    void setCard(@NonNull Card card);

    void setCtaOnClickListener(@Nullable View.OnClickListener onClickListener);
}
