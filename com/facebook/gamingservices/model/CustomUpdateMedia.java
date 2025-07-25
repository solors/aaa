package com.facebook.gamingservices.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: CustomUpdateContent.kt */
@Metadata
/* loaded from: classes3.dex */
public final class CustomUpdateMedia {
    @Nullable
    private final CustomUpdateMediaInfo gif;
    @Nullable
    private final CustomUpdateMediaInfo video;

    public CustomUpdateMedia() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CustomUpdateMedia copy$default(CustomUpdateMedia customUpdateMedia, CustomUpdateMediaInfo customUpdateMediaInfo, CustomUpdateMediaInfo customUpdateMediaInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            customUpdateMediaInfo = customUpdateMedia.gif;
        }
        if ((i & 2) != 0) {
            customUpdateMediaInfo2 = customUpdateMedia.video;
        }
        return customUpdateMedia.copy(customUpdateMediaInfo, customUpdateMediaInfo2);
    }

    @Nullable
    public final CustomUpdateMediaInfo component1() {
        return this.gif;
    }

    @Nullable
    public final CustomUpdateMediaInfo component2() {
        return this.video;
    }

    @NotNull
    public final CustomUpdateMedia copy(@Nullable CustomUpdateMediaInfo customUpdateMediaInfo, @Nullable CustomUpdateMediaInfo customUpdateMediaInfo2) {
        return new CustomUpdateMedia(customUpdateMediaInfo, customUpdateMediaInfo2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomUpdateMedia)) {
            return false;
        }
        CustomUpdateMedia customUpdateMedia = (CustomUpdateMedia) obj;
        if (Intrinsics.m17075f(this.gif, customUpdateMedia.gif) && Intrinsics.m17075f(this.video, customUpdateMedia.video)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final CustomUpdateMediaInfo getGif() {
        return this.gif;
    }

    @Nullable
    public final CustomUpdateMediaInfo getVideo() {
        return this.video;
    }

    public int hashCode() {
        int hashCode;
        CustomUpdateMediaInfo customUpdateMediaInfo = this.gif;
        int i = 0;
        if (customUpdateMediaInfo == null) {
            hashCode = 0;
        } else {
            hashCode = customUpdateMediaInfo.hashCode();
        }
        int i2 = hashCode * 31;
        CustomUpdateMediaInfo customUpdateMediaInfo2 = this.video;
        if (customUpdateMediaInfo2 != null) {
            i = customUpdateMediaInfo2.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        CustomUpdateMediaInfo customUpdateMediaInfo = this.gif;
        if (customUpdateMediaInfo != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", customUpdateMediaInfo.getUrl());
            jSONObject.put("gif", jSONObject2);
        }
        CustomUpdateMediaInfo customUpdateMediaInfo2 = this.video;
        if (customUpdateMediaInfo2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", customUpdateMediaInfo2.getUrl());
            jSONObject.put("video", jSONObject3);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "CustomUpdateMedia(gif=" + this.gif + ", video=" + this.video + ')';
    }

    public CustomUpdateMedia(@Nullable CustomUpdateMediaInfo customUpdateMediaInfo, @Nullable CustomUpdateMediaInfo customUpdateMediaInfo2) {
        this.gif = customUpdateMediaInfo;
        this.video = customUpdateMediaInfo2;
    }

    public /* synthetic */ CustomUpdateMedia(CustomUpdateMediaInfo customUpdateMediaInfo, CustomUpdateMediaInfo customUpdateMediaInfo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customUpdateMediaInfo, (i & 2) != 0 ? null : customUpdateMediaInfo2);
    }
}
