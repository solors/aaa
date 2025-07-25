package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.d5 */
/* loaded from: classes7.dex */
public final class C25704d5 extends AbstractC25742f0 {
    @Nullable
    private AbstractC25730e5 mediaData;

    private C25704d5() {
    }

    @NonNull
    public static C25704d5 newAudioBanner() {
        return newBanner();
    }

    @NonNull
    public static <T extends AbstractC25730e5> C25704d5 newBanner() {
        return new C25704d5();
    }

    @NonNull
    public static C25704d5 newVideoBanner() {
        return newBanner();
    }

    @Override // com.p551my.target.AbstractC25650b
    public int getHeight() {
        AbstractC25730e5 abstractC25730e5 = this.mediaData;
        if (abstractC25730e5 != null) {
            return abstractC25730e5.getHeight();
        }
        return 0;
    }

    @Nullable
    public AbstractC25730e5 getMediaData() {
        return this.mediaData;
    }

    @Override // com.p551my.target.AbstractC25650b
    public int getWidth() {
        AbstractC25730e5 abstractC25730e5 = this.mediaData;
        if (abstractC25730e5 != null) {
            return abstractC25730e5.getWidth();
        }
        return 0;
    }

    public void setMediaData(@Nullable AbstractC25730e5 abstractC25730e5) {
        this.mediaData = abstractC25730e5;
    }
}
