package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.common.models.ImageData;
import com.p551my.target.common.models.ShareButtonData;
import java.util.ArrayList;

/* renamed from: com.my.target.f0 */
/* loaded from: classes7.dex */
public abstract class AbstractC25742f0 extends AbstractC25650b {
    @Nullable
    private String adText;
    @Nullable
    private ImageData preview;
    @NonNull
    private final ArrayList<C25726e1> companionBanners = new ArrayList<>();
    @NonNull
    private final ArrayList<ShareButtonData> shareButtonDatas = new ArrayList<>();
    @Nullable
    private C25845j9 shoppableBanner = null;
    @Nullable
    private C25802h9 shoppableAdsData = null;
    @NonNull
    private String closeActionText = "Close";
    @NonNull
    private String replayActionText = "Replay";
    @NonNull
    private String closeDelayActionText = "Ad can be skipped after %ds";
    private boolean autoMute = false;
    private boolean autoPlay = true;
    private boolean hasCtaButton = true;
    private boolean allowReplay = true;
    private boolean showPlayerControls = true;
    private boolean allowClose = true;
    private boolean allowSeek = false;
    private boolean allowSkip = false;
    private boolean allowTrackChange = false;
    private boolean allowPause = true;
    private float allowCloseDelay = 0.0f;
    private float point = -1.0f;
    private float pointP = -1.0f;
    private int mediaSectionType = 0;

    public void addCompanion(@NonNull C25726e1 c25726e1) {
        this.companionBanners.add(c25726e1);
    }

    public void addShareButtonData(@NonNull ShareButtonData shareButtonData) {
        this.shareButtonDatas.add(shareButtonData);
    }

    @Nullable
    public String getAdText() {
        return this.adText;
    }

    public float getAllowCloseDelay() {
        return this.allowCloseDelay;
    }

    @NonNull
    public String getCloseActionText() {
        return this.closeActionText;
    }

    @NonNull
    public String getCloseDelayActionText() {
        return this.closeDelayActionText;
    }

    @NonNull
    public ArrayList<C25726e1> getCompanionBanners() {
        return new ArrayList<>(this.companionBanners);
    }

    public int getMediaSectionType() {
        return this.mediaSectionType;
    }

    public float getPoint() {
        return this.point;
    }

    public float getPointP() {
        return this.pointP;
    }

    @Nullable
    public ImageData getPreview() {
        return this.preview;
    }

    @NonNull
    public String getReplayActionText() {
        return this.replayActionText;
    }

    @NonNull
    public ArrayList<ShareButtonData> getShareButtonDatas() {
        return new ArrayList<>(this.shareButtonDatas);
    }

    @Nullable
    public C25802h9 getShoppableAdsData() {
        return this.shoppableAdsData;
    }

    @Nullable
    public C25845j9 getShoppableBanner() {
        return this.shoppableBanner;
    }

    public boolean isAllowClose() {
        return this.allowClose;
    }

    public boolean isAllowPause() {
        return this.allowPause;
    }

    public boolean isAllowReplay() {
        return this.allowReplay;
    }

    public boolean isAllowSeek() {
        return this.allowSeek;
    }

    public boolean isAllowSkip() {
        return this.allowSkip;
    }

    public boolean isAllowTrackChange() {
        return this.allowTrackChange;
    }

    public boolean isAutoMute() {
        return this.autoMute;
    }

    public boolean isAutoPlay() {
        return this.autoPlay;
    }

    public boolean isHasCtaButton() {
        return this.hasCtaButton;
    }

    public boolean isShowPlayerControls() {
        return this.showPlayerControls;
    }

    public void setAdText(@Nullable String str) {
        this.adText = str;
    }

    public void setAllowClose(boolean z) {
        this.allowClose = z;
    }

    public void setAllowCloseDelay(float f) {
        this.allowCloseDelay = f;
    }

    public void setAllowPause(boolean z) {
        this.allowPause = z;
    }

    public void setAllowReplay(boolean z) {
        this.allowReplay = z;
    }

    public void setAllowSeek(boolean z) {
        this.allowSeek = z;
    }

    public void setAllowSkip(boolean z) {
        this.allowSkip = z;
    }

    public void setAllowTrackChange(boolean z) {
        this.allowTrackChange = z;
    }

    public void setAutoMute(boolean z) {
        this.autoMute = z;
    }

    public void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public void setCloseActionText(@NonNull String str) {
        this.closeActionText = str;
    }

    public void setCloseDelayActionText(@NonNull String str) {
        this.closeDelayActionText = str;
    }

    public void setHasCtaButton(boolean z) {
        this.hasCtaButton = z;
    }

    public void setMediaSectionType(int i) {
        this.mediaSectionType = i;
    }

    public void setPoint(float f) {
        this.point = f;
    }

    public void setPointP(float f) {
        this.pointP = f;
    }

    public void setPreview(@Nullable ImageData imageData) {
        this.preview = imageData;
    }

    public void setReplayActionText(@NonNull String str) {
        this.replayActionText = str;
    }

    public void setShoppableAdsData(@Nullable C25802h9 c25802h9) {
        this.shoppableAdsData = c25802h9;
    }

    public void setShoppableBanner(@Nullable C25845j9 c25845j9) {
        this.shoppableBanner = c25845j9;
    }

    public void setShowPlayerControls(boolean z) {
        this.showPlayerControls = z;
    }
}
