package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.w3 */
/* loaded from: classes7.dex */
public class C26188w3 extends AbstractC26054r3 {
    private boolean forceMediaPlayback;
    @Nullable
    private String source;
    private float timeToReward;

    private C26188w3() {
    }

    @NonNull
    public static C26188w3 fromCompanion(@NonNull C25726e1 c25726e1) {
        C26188w3 newBanner = newBanner();
        newBanner.setId(c25726e1.getId());
        newBanner.setSource(c25726e1.getHtmlResource());
        newBanner.getStatHolder().m44005a(c25726e1.getStatHolder(), 0.0f);
        newBanner.trackingLink = c25726e1.trackingLink;
        return newBanner;
    }

    @NonNull
    public static C26188w3 newBanner() {
        return new C26188w3();
    }

    public boolean getForceMediaPlayback() {
        return this.forceMediaPlayback;
    }

    @Nullable
    public String getSource() {
        return this.source;
    }

    public float getTimeToReward() {
        return this.timeToReward;
    }

    public void setForceMediaPlayback(boolean z) {
        this.forceMediaPlayback = z;
    }

    public void setSource(@Nullable String str) {
        this.source = str;
    }

    public void setTimeToReward(float f) {
        this.timeToReward = f;
    }
}
