package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.k6 */
/* loaded from: classes7.dex */
public class C25863k6 extends AbstractC25650b {
    @Nullable
    private String discount;

    private C25863k6() {
    }

    @NonNull
    public static C25863k6 newCard(@NonNull C25822i6 c25822i6) {
        C25863k6 c25863k6 = new C25863k6();
        c25863k6.ctaText = c25822i6.ctaText;
        c25863k6.navigationType = c25822i6.navigationType;
        c25863k6.urlscheme = c25822i6.urlscheme;
        c25863k6.bundleId = c25822i6.bundleId;
        c25863k6.directLink = c25822i6.directLink;
        c25863k6.openInBrowser = c25822i6.openInBrowser;
        c25863k6.deeplink = c25822i6.deeplink;
        c25863k6.clickArea = c25822i6.clickArea;
        c25863k6.rating = c25822i6.rating;
        c25863k6.votes = c25822i6.votes;
        c25863k6.domain = c25822i6.domain;
        c25863k6.category = c25822i6.category;
        c25863k6.subCategory = c25822i6.subCategory;
        return c25863k6;
    }

    @Nullable
    public String getDiscount() {
        return this.discount;
    }

    public void setDiscount(@Nullable String str) {
        this.discount = str;
    }
}
