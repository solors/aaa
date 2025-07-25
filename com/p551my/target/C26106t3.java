package com.p551my.target;

import androidx.annotation.NonNull;

/* renamed from: com.my.target.t3 */
/* loaded from: classes7.dex */
public class C26106t3 extends AbstractC25650b {
    private boolean imageOnly;

    private C26106t3() {
        this.clickArea = C26205x0.f68170q;
    }

    @NonNull
    public static C26106t3 newCard(@NonNull AbstractC26054r3 abstractC26054r3) {
        C26106t3 c26106t3 = new C26106t3();
        c26106t3.f66623id = abstractC26054r3.f66623id;
        c26106t3.ctaText = abstractC26054r3.ctaText;
        c26106t3.navigationType = abstractC26054r3.navigationType;
        c26106t3.urlscheme = abstractC26054r3.urlscheme;
        c26106t3.bundleId = abstractC26054r3.bundleId;
        c26106t3.directLink = abstractC26054r3.directLink;
        c26106t3.openInBrowser = abstractC26054r3.openInBrowser;
        c26106t3.deeplink = abstractC26054r3.deeplink;
        c26106t3.clickArea = abstractC26054r3.clickArea;
        c26106t3.rating = abstractC26054r3.rating;
        c26106t3.votes = abstractC26054r3.votes;
        c26106t3.domain = abstractC26054r3.domain;
        c26106t3.category = abstractC26054r3.category;
        c26106t3.subCategory = abstractC26054r3.subCategory;
        return c26106t3;
    }

    public boolean isImageOnly() {
        return this.imageOnly;
    }

    public void setImageOnly(boolean z) {
        this.imageOnly = z;
    }
}
