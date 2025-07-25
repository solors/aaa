package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.i6 */
/* loaded from: classes7.dex */
public class C25822i6 extends AbstractC25650b {
    @Nullable
    private C25911m6 content;
    @Nullable
    private ImageData ctcIcon;
    @Nullable
    private C25704d5 videoBanner;
    @NonNull
    private final List<C25863k6> nativeAdCards = new ArrayList();
    @NonNull
    private String ctcText = "Try to play";

    private C25822i6() {
    }

    @NonNull
    public static C25822i6 newBanner() {
        return new C25822i6();
    }

    public void addNativeAdCard(@NonNull C25863k6 c25863k6) {
        this.nativeAdCards.add(c25863k6);
    }

    @Nullable
    public C25911m6 getContent() {
        return this.content;
    }

    @Nullable
    public ImageData getCtcIcon() {
        return this.ctcIcon;
    }

    @NonNull
    public String getCtcText() {
        return this.ctcText;
    }

    @NonNull
    public List<C25863k6> getNativeAdCards() {
        return new ArrayList(this.nativeAdCards);
    }

    @Nullable
    public C25704d5 getVideoBanner() {
        return this.videoBanner;
    }

    public void setContent(@Nullable C25911m6 c25911m6) {
        this.content = c25911m6;
    }

    public void setCtcIcon(@Nullable ImageData imageData) {
        this.ctcIcon = imageData;
    }

    public void setCtcText(@NonNull String str) {
        this.ctcText = str;
    }

    public void setVideoBanner(@Nullable C25704d5 c25704d5) {
        this.videoBanner = c25704d5;
    }
}
