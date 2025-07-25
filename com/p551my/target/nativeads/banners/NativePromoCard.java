package com.p551my.target.nativeads.banners;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.C25863k6;
import com.p551my.target.common.models.ImageData;

/* renamed from: com.my.target.nativeads.banners.NativePromoCard */
/* loaded from: classes7.dex */
public class NativePromoCard {
    @Nullable
    private final String ctaText;
    @Nullable
    private final String description;
    @Nullable
    private final String discount;
    @Nullable
    private final ImageData image;
    @Nullable
    private final String title;

    private NativePromoCard(@NonNull C25863k6 c25863k6) {
        if (!TextUtils.isEmpty(c25863k6.getTitle())) {
            this.title = c25863k6.getTitle();
        } else {
            this.title = null;
        }
        if (!TextUtils.isEmpty(c25863k6.getDescription())) {
            this.description = c25863k6.getDescription();
        } else {
            this.description = null;
        }
        if (!TextUtils.isEmpty(c25863k6.getCtaText())) {
            this.ctaText = c25863k6.getCtaText();
        } else {
            this.ctaText = null;
        }
        this.discount = c25863k6.getDiscount();
        this.image = c25863k6.getImage();
    }

    @NonNull
    public static NativePromoCard newCard(@NonNull C25863k6 c25863k6) {
        return new NativePromoCard(c25863k6);
    }

    @Nullable
    public String getCtaText() {
        return this.ctaText;
    }

    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Nullable
    public String getDiscount() {
        return this.discount;
    }

    @Nullable
    public ImageData getImage() {
        return this.image;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }
}
