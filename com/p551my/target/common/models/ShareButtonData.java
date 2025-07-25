package com.p551my.target.common.models;

import androidx.annotation.Nullable;

/* renamed from: com.my.target.common.models.ShareButtonData */
/* loaded from: classes7.dex */
public class ShareButtonData {
    @Nullable
    public String imageUrl;
    @Nullable
    public String name;
    @Nullable
    public String url;

    private ShareButtonData() {
    }

    public static ShareButtonData newData() {
        return new ShareButtonData();
    }

    @Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    @Nullable
    public String getUrl() {
        return this.url;
    }

    public void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public void setName(@Nullable String str) {
        this.name = str;
    }

    public void setUrl(@Nullable String str) {
        this.url = str;
    }
}
