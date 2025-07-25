package com.taurusx.tax.vast;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public class VastCompanionAdConfig implements Serializable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @SerializedName("width")
    @Expose

    /* renamed from: a */
    public final int f74297a;
    @SerializedName("height")
    @Expose

    /* renamed from: b */
    public final int f74298b;
    @SerializedName("resource")
    @Expose
    @NotNull

    /* renamed from: c */
    public final VastResource f74299c;
    @SerializedName("clickthrough_url")
    @Expose
    @Nullable

    /* renamed from: d */
    public final String f74300d;
    @SerializedName("click_trackers")
    @Expose
    @NotNull

    /* renamed from: e */
    public final List<VastTracker> f74301e;
    @SerializedName("impression_trackers")
    @Expose
    @NotNull

    /* renamed from: f */
    public final List<VastTracker> f74302f;
    @SerializedName("custom_cta_text")
    @Expose
    @Nullable

    /* renamed from: g */
    public final String f74303g;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public VastCompanionAdConfig(int i, int i2, @NotNull VastResource vastResource, @Nullable String str, @NotNull List<VastTracker> clickTrackers, @NotNull List<VastTracker> creativeViewTrackers, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(vastResource, "vastResource");
        Intrinsics.checkNotNullParameter(clickTrackers, "clickTrackers");
        Intrinsics.checkNotNullParameter(creativeViewTrackers, "creativeViewTrackers");
        this.f74297a = i;
        this.f74298b = i2;
        this.f74299c = vastResource;
        this.f74300d = str;
        this.f74301e = clickTrackers;
        this.f74302f = creativeViewTrackers;
        this.f74303g = str2;
    }

    public final void addClickTrackers(@NotNull Collection<? extends VastTracker> clickTrackers) {
        Intrinsics.checkNotNullParameter(clickTrackers, "clickTrackers");
        this.f74301e.addAll(clickTrackers);
    }

    public final void addCreativeViewTrackers(@NotNull Collection<? extends VastTracker> creativeViewTrackers) {
        Intrinsics.checkNotNullParameter(creativeViewTrackers, "creativeViewTrackers");
        this.f74302f.addAll(creativeViewTrackers);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VastCompanionAdConfig)) {
            return false;
        }
        VastCompanionAdConfig vastCompanionAdConfig = (VastCompanionAdConfig) obj;
        if (this.f74297a == vastCompanionAdConfig.f74297a && this.f74298b == vastCompanionAdConfig.f74298b && Intrinsics.m17075f(this.f74299c, vastCompanionAdConfig.f74299c) && Intrinsics.m17075f(this.f74300d, vastCompanionAdConfig.f74300d) && Intrinsics.m17075f(this.f74301e, vastCompanionAdConfig.f74301e) && Intrinsics.m17075f(this.f74302f, vastCompanionAdConfig.f74302f) && Intrinsics.m17075f(this.f74303g, vastCompanionAdConfig.f74303g)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getClickThroughUrl() {
        return this.f74300d;
    }

    @NotNull
    public final List<VastTracker> getClickTrackers() {
        return this.f74301e;
    }

    @NotNull
    public final List<VastTracker> getCreativeViewTrackers() {
        return this.f74302f;
    }

    @Nullable
    public final String getCustomCtaText() {
        return this.f74303g;
    }

    public final int getHeight() {
        return this.f74298b;
    }

    @NotNull
    public final VastResource getVastResource() {
        return this.f74299c;
    }

    public final int getWidth() {
        return this.f74297a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.f74297a * 31) + this.f74298b) * 31) + this.f74299c.hashCode()) * 31;
        String str = this.f74300d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.f74301e.hashCode()) * 31) + this.f74302f.hashCode()) * 31;
        String str2 = this.f74303g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public String toString() {
        return "VastCompanionAdConfig(width=" + this.f74297a + ", height=" + this.f74298b + ", vastResource=" + this.f74299c + ", clickThroughUrl=" + ((Object) this.f74300d) + ", clickTrackers=" + this.f74301e + ", creativeViewTrackers=" + this.f74302f + ", customCtaText=" + ((Object) this.f74303g) + ')';
    }
}
