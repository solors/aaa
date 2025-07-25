package com.p551my.target.nativeads.banners;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.C26272z6;
import com.p551my.target.common.models.ImageData;

/* renamed from: com.my.target.nativeads.banners.NativeAppwallBanner */
/* loaded from: classes7.dex */
public class NativeAppwallBanner {
    private final boolean appInstalled;
    @Nullable
    private final ImageData bubbleIcon;
    @Nullable
    private final String bubbleId;
    @Nullable
    private final String bundleId;
    private final int coins;
    @Nullable
    private final ImageData coinsIcon;
    private final int coinsIconBgColor;
    private final int coinsIconTextColor;
    @Nullable
    private final ImageData crossNotifIcon;
    @NonNull
    private final String description;
    @Nullable
    private final ImageData gotoAppIcon;
    private boolean hasNotification;
    @Nullable
    private final ImageData icon;
    @NonNull

    /* renamed from: id */
    private final String f67399id;
    private final boolean isBanner;
    private final boolean isItemHighlight;
    private final boolean isMain;
    private final boolean isRequireCategoryHighlight;
    private final boolean isRequireWifi;
    private final boolean isSubItem;
    @Nullable
    private final ImageData itemHighlightIcon;
    @Nullable
    private final ImageData labelIcon;
    @Nullable
    private final String labelType;
    private final int mrgsId;
    @Nullable
    private final String paidType;
    private final float rating;
    @Nullable
    private final String status;
    @Nullable
    private final ImageData statusIcon;
    @NonNull
    private final String title;
    private final int votes;

    private NativeAppwallBanner(@NonNull C26272z6 c26272z6) {
        this.f67399id = c26272z6.getId();
        this.description = c26272z6.getDescription();
        this.title = c26272z6.getTitle();
        this.bubbleId = c26272z6.getBubbleId();
        this.labelType = c26272z6.getLabelType();
        this.status = c26272z6.getStatus();
        this.paidType = c26272z6.getPaidType();
        this.mrgsId = c26272z6.getMrgsId();
        this.coins = c26272z6.getCoins();
        this.coinsIconBgColor = c26272z6.getCoinsIconBgColor();
        this.coinsIconTextColor = c26272z6.getCoinsIconTextColor();
        this.votes = c26272z6.getVotes();
        this.rating = c26272z6.getRating();
        this.hasNotification = c26272z6.isHasNotification();
        this.isMain = c26272z6.isMain();
        this.isRequireCategoryHighlight = c26272z6.isRequireCategoryHighlight();
        this.isItemHighlight = c26272z6.isItemHighlight();
        this.isBanner = c26272z6.isBanner();
        this.isRequireWifi = c26272z6.isRequireWifi();
        this.isSubItem = c26272z6.isSubItem();
        this.appInstalled = c26272z6.isAppInstalled();
        this.icon = c26272z6.getIcon();
        this.coinsIcon = c26272z6.getCoinsIcon();
        this.labelIcon = c26272z6.getLabelIcon();
        this.gotoAppIcon = c26272z6.getGotoAppIcon();
        this.statusIcon = c26272z6.getStatusIcon();
        this.bubbleIcon = c26272z6.getBubbleIcon();
        this.itemHighlightIcon = c26272z6.getItemHighlightIcon();
        this.crossNotifIcon = c26272z6.getCrossNotifIcon();
        this.bundleId = c26272z6.getBundleId();
    }

    @NonNull
    public static NativeAppwallBanner newBanner(@NonNull C26272z6 c26272z6) {
        return new NativeAppwallBanner(c26272z6);
    }

    @Nullable
    public ImageData getBubbleIcon() {
        return this.bubbleIcon;
    }

    @Nullable
    public String getBubbleId() {
        return this.bubbleId;
    }

    @Nullable
    public String getBundleId() {
        return this.bundleId;
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

    @NonNull
    public String getDescription() {
        return this.description;
    }

    @Nullable
    public ImageData getGotoAppIcon() {
        return this.gotoAppIcon;
    }

    @Nullable
    public ImageData getIcon() {
        return this.icon;
    }

    @NonNull
    public String getId() {
        return this.f67399id;
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
    public String getPaidType() {
        return this.paidType;
    }

    public float getRating() {
        return this.rating;
    }

    @Nullable
    public String getStatus() {
        return this.status;
    }

    @Nullable
    public ImageData getStatusIcon() {
        return this.statusIcon;
    }

    @NonNull
    public String getTitle() {
        return this.title;
    }

    public int getVotes() {
        return this.votes;
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

    public void setHasNotification(boolean z) {
        this.hasNotification = z;
    }

    @NonNull
    public String toString() {
        return "NativeAppwallBanner{id='" + this.f67399id + "', description='" + this.description + "', title='" + this.title + "', bubbleId='" + this.bubbleId + "', labelType='" + this.labelType + "', status='" + this.status + "', paidType='" + this.paidType + "', bundleId='" + this.bundleId + "', mrgsId=" + this.mrgsId + ", coins=" + this.coins + ", coinsIconBgColor=" + this.coinsIconBgColor + ", coinsIconTextColor=" + this.coinsIconTextColor + ", votes=" + this.votes + ", rating=" + this.rating + ", isMain=" + this.isMain + ", isRequireCategoryHighlight=" + this.isRequireCategoryHighlight + ", isItemHighlight=" + this.isItemHighlight + ", isBanner=" + this.isBanner + ", isRequireWifi=" + this.isRequireWifi + ", isSubItem=" + this.isSubItem + ", appInstalled=" + this.appInstalled + ", icon=" + this.icon + ", coinsIcon=" + this.coinsIcon + ", labelIcon=" + this.labelIcon + ", gotoAppIcon=" + this.gotoAppIcon + ", statusIcon=" + this.statusIcon + ", bubbleIcon=" + this.bubbleIcon + ", itemHighlightIcon=" + this.itemHighlightIcon + ", crossNotifIcon=" + this.crossNotifIcon + ", hasNotification=" + this.hasNotification + '}';
    }
}
