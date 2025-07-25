package com.p551my.target;

import androidx.annotation.NonNull;

/* renamed from: com.my.target.m6 */
/* loaded from: classes7.dex */
public class C25911m6 extends AbstractC25650b {
    @NonNull
    private final String source;

    private C25911m6(@NonNull String str) {
        this.source = str;
    }

    public static C25911m6 newContent(@NonNull C25822i6 c25822i6, @NonNull String str) {
        C25911m6 c25911m6 = new C25911m6(str);
        c25911m6.f66623id = c25822i6.f66623id;
        c25911m6.trackingLink = c25822i6.trackingLink;
        c25911m6.deeplink = c25822i6.deeplink;
        c25911m6.urlscheme = c25822i6.urlscheme;
        c25911m6.bundleId = c25822i6.bundleId;
        c25911m6.navigationType = c25822i6.navigationType;
        c25911m6.directLink = c25822i6.directLink;
        c25911m6.openInBrowser = c25822i6.openInBrowser;
        return c25911m6;
    }

    @NonNull
    public String getSource() {
        return this.source;
    }
}
