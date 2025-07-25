package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.common.models.ImageData;

/* renamed from: com.my.target.b */
/* loaded from: classes7.dex */
public abstract class AbstractC25650b {
    @Nullable
    protected C25669c adChoices;
    @Nullable
    protected String bundleId;
    @Nullable
    protected String ctaLink;
    @Nullable
    protected String ctaText;
    @Nullable
    protected String deeplink;
    protected float duration;
    protected int height;
    @Nullable
    protected ImageData icon;
    @Nullable
    protected ImageData image;
    @Nullable
    protected C26010p7 omData;
    @Nullable
    private String paidType;
    protected float rating;
    @Nullable
    protected String storeType;
    @Nullable
    protected String trackingLink;
    @Nullable
    protected String urlscheme;
    protected int votes;
    protected int width;
    @NonNull
    private final C25711da statHolder = C25711da.m43995c();
    @NonNull
    private final C26226xa viewability = C26226xa.m42424d();
    @NonNull
    protected String description = "";
    @NonNull
    protected String title = "";
    @NonNull
    protected String disclaimer = "";
    @NonNull
    protected String ageRestrictions = "";
    @NonNull
    protected String category = "";
    @NonNull
    protected String subCategory = "";
    @NonNull
    protected String domain = "";
    @NonNull
    protected String navigationType = "web";
    @NonNull
    protected String advertisingLabel = "";
    @NonNull
    protected C26205x0 clickArea = C26205x0.f68169p;
    protected boolean openInBrowser = false;
    protected boolean directLink = false;
    protected boolean appInWhiteList = false;
    protected int disclaimerType = 0;
    @NonNull
    protected String type = "";
    @NonNull

    /* renamed from: id */
    protected String f66623id = "";
    private boolean logErrors = true;

    @Nullable
    public C25669c getAdChoices() {
        return this.adChoices;
    }

    @NonNull
    public String getAdvertisingLabel() {
        return this.advertisingLabel;
    }

    @NonNull
    public String getAgeRestrictions() {
        return this.ageRestrictions;
    }

    @Nullable
    public String getBundleId() {
        return this.bundleId;
    }

    @NonNull
    public String getCategory() {
        return this.category;
    }

    @NonNull
    public C26205x0 getClickArea() {
        return this.clickArea;
    }

    @Nullable
    public String getCtaLink() {
        return this.ctaLink;
    }

    @NonNull
    public String getCtaText() {
        String str = this.ctaText;
        if (str == null) {
            if ("store".equals(this.navigationType)) {
                return "Install";
            }
            return "Visit";
        }
        return str;
    }

    @Nullable
    public String getDeeplink() {
        return this.deeplink;
    }

    @NonNull
    public String getDescription() {
        return this.description;
    }

    @NonNull
    public String getDisclaimer() {
        return this.disclaimer;
    }

    public int getDisclaimerType() {
        return this.disclaimerType;
    }

    @NonNull
    public String getDomain() {
        return this.domain;
    }

    public float getDuration() {
        return this.duration;
    }

    public int getHeight() {
        return this.height;
    }

    @Nullable
    public ImageData getIcon() {
        return this.icon;
    }

    @NonNull
    public String getId() {
        return this.f66623id;
    }

    @Nullable
    public ImageData getImage() {
        return this.image;
    }

    @NonNull
    public String getNavigationType() {
        return this.navigationType;
    }

    @Nullable
    public C26010p7 getOmData() {
        return this.omData;
    }

    @Nullable
    public String getPaidType() {
        return this.paidType;
    }

    public float getRating() {
        return this.rating;
    }

    @NonNull
    public C25711da getStatHolder() {
        return this.statHolder;
    }

    @Nullable
    public String getStoreType() {
        return this.storeType;
    }

    @NonNull
    public String getSubCategory() {
        return this.subCategory;
    }

    @NonNull
    public String getTitle() {
        return this.title;
    }

    @Nullable
    public String getTrackingLink() {
        return this.trackingLink;
    }

    @NonNull
    public String getType() {
        return this.type;
    }

    @Nullable
    public String getUrlscheme() {
        return this.urlscheme;
    }

    @NonNull
    public C26226xa getViewability() {
        return this.viewability;
    }

    public int getVotes() {
        return this.votes;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAppInWhiteList() {
        return this.appInWhiteList;
    }

    public boolean isDirectLink() {
        return this.directLink;
    }

    public boolean isLogErrors() {
        return this.logErrors;
    }

    public boolean isOpenInBrowser() {
        return this.openInBrowser;
    }

    public void setAdChoices(@Nullable C25669c c25669c) {
        this.adChoices = c25669c;
    }

    public void setAdvertisingLabel(@NonNull String str) {
        this.advertisingLabel = str;
    }

    public void setAgeRestrictions(@NonNull String str) {
        this.ageRestrictions = str;
    }

    public void setAppInWhiteList(boolean z) {
        this.appInWhiteList = z;
    }

    public void setBundleId(@Nullable String str) {
        this.bundleId = str;
    }

    public void setCategory(@NonNull String str) {
        this.category = str;
    }

    public void setClickArea(@NonNull C26205x0 c26205x0) {
        this.clickArea = c26205x0;
    }

    public void setCtaLink(@Nullable String str) {
        this.ctaLink = str;
    }

    public void setCtaText(@NonNull String str) {
        this.ctaText = str;
    }

    public void setDeeplink(@Nullable String str) {
        this.deeplink = str;
    }

    public void setDescription(@NonNull String str) {
        this.description = str;
    }

    public void setDirectLink(boolean z) {
        this.directLink = z;
    }

    public void setDisclaimer(@NonNull String str) {
        this.disclaimer = str;
    }

    public void setDisclaimerType(int i) {
        this.disclaimerType = i;
    }

    public void setDomain(@NonNull String str) {
        this.domain = str;
    }

    public void setDuration(float f) {
        this.duration = f;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIcon(@Nullable ImageData imageData) {
        this.icon = imageData;
    }

    public void setId(@NonNull String str) {
        this.f66623id = str;
    }

    public void setImage(@Nullable ImageData imageData) {
        this.image = imageData;
    }

    public void setLogErrors(boolean z) {
        this.logErrors = z;
    }

    public void setNavigationType(@NonNull String str) {
        this.navigationType = str;
    }

    public void setOmData(@Nullable C26010p7 c26010p7) {
        this.omData = c26010p7;
    }

    public void setOpenInBrowser(boolean z) {
        this.openInBrowser = z;
    }

    public void setPaidType(@Nullable String str) {
        this.paidType = str;
    }

    public void setRating(float f) {
        this.rating = f;
    }

    public void setStoreType(@Nullable String str) {
        this.storeType = str;
    }

    public void setSubCategory(@NonNull String str) {
        this.subCategory = str;
    }

    public void setTitle(@NonNull String str) {
        this.title = str;
    }

    public void setTrackingLink(@Nullable String str) {
        this.trackingLink = str;
    }

    public void setType(@NonNull String str) {
        this.type = str;
    }

    public void setUrlscheme(@Nullable String str) {
        this.urlscheme = str;
    }

    public void setVotes(int i) {
        this.votes = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
