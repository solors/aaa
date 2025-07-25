package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.b4 */
/* loaded from: classes7.dex */
public class C25655b4 extends AbstractC26054r3 {
    @Nullable
    private ImageData adIcon;
    @Nullable
    private String adIconClickLink;
    @Nullable
    private AbstractC26054r3 endCard;
    private int style;
    @Nullable
    private C25704d5 videoBanner;
    private boolean closeOnClick = true;
    private boolean videoRequired = false;
    @NonNull
    private final List<C26106t3> interstitialAdCards = new ArrayList();
    @NonNull
    private final C26065r8 promoStyleSettings = C26065r8.m43020l();

    private C25655b4() {
    }

    @NonNull
    public static C25655b4 newBanner() {
        return new C25655b4();
    }

    public void addInterstitialAdCard(@NonNull C26106t3 c26106t3) {
        this.interstitialAdCards.add(c26106t3);
    }

    @Nullable
    public ImageData getAdIcon() {
        return this.adIcon;
    }

    @Nullable
    public String getAdIconClickLink() {
        return this.adIconClickLink;
    }

    @Nullable
    public AbstractC26054r3 getEndCard() {
        return this.endCard;
    }

    @NonNull
    public List<C26106t3> getInterstitialAdCards() {
        return this.interstitialAdCards;
    }

    @NonNull
    public C26065r8 getPromoStyleSettings() {
        return this.promoStyleSettings;
    }

    public int getStyle() {
        return this.style;
    }

    @Nullable
    public C25704d5 getVideoBanner() {
        return this.videoBanner;
    }

    public boolean isCloseOnClick() {
        if (this.videoBanner != null) {
            return false;
        }
        return this.closeOnClick;
    }

    public boolean isVideoRequired() {
        return this.videoRequired;
    }

    public void setAdIcon(@Nullable ImageData imageData) {
        this.adIcon = imageData;
    }

    public void setAdIconClickLink(@Nullable String str) {
        this.adIconClickLink = str;
    }

    public void setCloseOnClick(boolean z) {
        this.closeOnClick = z;
    }

    public void setEndCard(@Nullable AbstractC26054r3 abstractC26054r3) {
        this.endCard = abstractC26054r3;
    }

    public void setStyle(int i) {
        this.style = i;
    }

    public void setVideoBanner(@Nullable C25704d5 c25704d5) {
        this.videoBanner = c25704d5;
    }

    public void setVideoRequired(boolean z) {
        this.videoRequired = z;
    }
}
