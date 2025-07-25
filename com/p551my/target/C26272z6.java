package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.common.models.ImageData;

/* renamed from: com.my.target.z6 */
/* loaded from: classes7.dex */
public class C26272z6 extends AbstractC25650b {
    private boolean appInstalled;
    @Nullable
    private ImageData bubbleIcon;
    @Nullable
    private String bubbleId;
    private int coins;
    @Nullable
    private ImageData coinsIcon;
    private int coinsIconBgColor = -552418;
    private int coinsIconTextColor = -1;
    @Nullable
    private ImageData crossNotifIcon;
    @Nullable
    private ImageData gotoAppIcon;
    private boolean hasNotification;
    private boolean isBanner;
    private boolean isItemHighlight;
    private boolean isMain;
    private boolean isRequireCategoryHighlight;
    private boolean isRequireWifi;
    private boolean isSubItem;
    @Nullable
    private ImageData itemHighlightIcon;
    @Nullable
    private ImageData labelIcon;
    @Nullable
    private String labelType;
    private int mrgsId;
    @Nullable
    private String status;
    @Nullable
    private ImageData statusIcon;

    private C26272z6() {
    }

    @NonNull
    public static C26272z6 newBanner() {
        return new C26272z6();
    }

    @Nullable
    public ImageData getBubbleIcon() {
        return this.bubbleIcon;
    }

    @Nullable
    public String getBubbleId() {
        return this.bubbleId;
    }

    public int getCoins() {
        return this.coins;
    }

    @Nullable
    public ImageData getCoinsIcon() {
        return this.coinsIcon;
    }

    public int getCoinsIconBgColor() {
        return this.coinsIconBgColor;
    }

    public int getCoinsIconTextColor() {
        return this.coinsIconTextColor;
    }

    @Nullable
    public ImageData getCrossNotifIcon() {
        return this.crossNotifIcon;
    }

    @Nullable
    public ImageData getGotoAppIcon() {
        return this.gotoAppIcon;
    }

    @Nullable
    public ImageData getItemHighlightIcon() {
        return this.itemHighlightIcon;
    }

    @Nullable
    public ImageData getLabelIcon() {
        return this.labelIcon;
    }

    @Nullable
    public String getLabelType() {
        return this.labelType;
    }

    public int getMrgsId() {
        return this.mrgsId;
    }

    @Nullable
    public String getStatus() {
        return this.status;
    }

    @Nullable
    public ImageData getStatusIcon() {
        return this.statusIcon;
    }

    public boolean isAppInstalled() {
        return this.appInstalled;
    }

    public boolean isBanner() {
        return this.isBanner;
    }

    public boolean isHasNotification() {
        return this.hasNotification;
    }

    public boolean isItemHighlight() {
        return this.isItemHighlight;
    }

    public boolean isMain() {
        return this.isMain;
    }

    public boolean isRequireCategoryHighlight() {
        return this.isRequireCategoryHighlight;
    }

    public boolean isRequireWifi() {
        return this.isRequireWifi;
    }

    public boolean isSubItem() {
        return this.isSubItem;
    }

    public void setAppInstalled(boolean z) {
        this.appInstalled = z;
    }

    public void setBanner(boolean z) {
        this.isBanner = z;
    }

    public void setBubbleIcon(@Nullable ImageData imageData) {
        this.bubbleIcon = imageData;
    }

    public void setBubbleId(@Nullable String str) {
        this.bubbleId = str;
    }

    public void setCoins(int i) {
        this.coins = i;
    }

    public void setCoinsIcon(@Nullable ImageData imageData) {
        this.coinsIcon = imageData;
    }

    public void setCoinsIconBgColor(int i) {
        this.coinsIconBgColor = i;
    }

    public void setCoinsIconTextColor(int i) {
        this.coinsIconTextColor = i;
    }

    public void setCrossNotifIcon(@Nullable ImageData imageData) {
        this.crossNotifIcon = imageData;
    }

    public void setGotoAppIcon(@Nullable ImageData imageData) {
        this.gotoAppIcon = imageData;
    }

    public void setHasNotification(boolean z) {
        this.hasNotification = z;
    }

    public void setItemHighlight(boolean z) {
        this.isItemHighlight = z;
    }

    public void setItemHighlightIcon(@Nullable ImageData imageData) {
        this.itemHighlightIcon = imageData;
    }

    public void setLabelIcon(@Nullable ImageData imageData) {
        this.labelIcon = imageData;
    }

    public void setLabelType(@Nullable String str) {
        this.labelType = str;
    }

    public void setMain(boolean z) {
        this.isMain = z;
    }

    public void setMrgsId(int i) {
        this.mrgsId = i;
    }

    public void setRequireCategoryHighlight(boolean z) {
        this.isRequireCategoryHighlight = z;
    }

    public void setRequireWifi(boolean z) {
        this.isRequireWifi = z;
    }

    public void setStatus(@Nullable String str) {
        this.status = str;
    }

    public void setStatusIcon(@Nullable ImageData imageData) {
        this.statusIcon = imageData;
    }

    public void setSubItem(boolean z) {
        this.isSubItem = z;
    }
}
