package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.my.target.e1 */
/* loaded from: classes7.dex */
public class C25726e1 extends AbstractC25650b {
    @Nullable
    private String adSlotId;
    @Nullable
    private String apiFramework;
    private int assetHeight;
    private int assetWidth;
    private int expandedHeight;
    private int expandedWidth;
    @Nullable
    private String htmlResource;
    @Nullable
    private String iframeResource;
    @Nullable
    private String required;
    @Nullable
    private String staticResource;

    private C25726e1() {
        this.type = "companion";
    }

    @NonNull
    public static C25726e1 newBanner() {
        return new C25726e1();
    }

    @Nullable
    public String getAdSlotID() {
        return this.adSlotId;
    }

    @Nullable
    public String getApiFramework() {
        return this.apiFramework;
    }

    public int getAssetHeight() {
        return this.assetHeight;
    }

    public int getAssetWidth() {
        return this.assetWidth;
    }

    public int getExpandedHeight() {
        return this.expandedHeight;
    }

    public int getExpandedWidth() {
        return this.expandedWidth;
    }

    @Nullable
    public String getHtmlResource() {
        return this.htmlResource;
    }

    @Nullable
    public String getIframeResource() {
        return this.iframeResource;
    }

    @Nullable
    public String getRequired() {
        return this.required;
    }

    @Nullable
    public String getStaticResource() {
        return this.staticResource;
    }

    public void setAdSlotID(@Nullable String str) {
        this.adSlotId = str;
    }

    public void setApiFramework(@Nullable String str) {
        this.apiFramework = str;
    }

    public void setAssetHeight(int i) {
        this.assetHeight = i;
    }

    public void setAssetWidth(int i) {
        this.assetWidth = i;
    }

    public void setExpandedHeight(int i) {
        this.expandedHeight = i;
    }

    public void setExpandedWidth(int i) {
        this.expandedWidth = i;
    }

    public void setHtmlResource(@Nullable String str) {
        this.htmlResource = str;
    }

    public void setIframeResource(@Nullable String str) {
        this.iframeResource = str;
    }

    public void setRequired(@Nullable String str) {
        this.required = str;
    }

    public void setStaticResource(@Nullable String str) {
        this.staticResource = str;
    }
}
