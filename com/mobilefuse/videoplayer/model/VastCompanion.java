package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.VastEventOwner;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastCompanion implements VastEventOwner {
    private final String adSlotId;
    private final String altText;
    private final String apiFramework;
    @Nullable
    private final Integer assetHeight;
    @Nullable
    private final Integer assetWidth;
    @Nullable
    private final VastClickThrough clickThrough;
    @NotNull
    private final Set<VastEvent> events;
    private final Integer expandedHeight;
    private final Integer expandedWidth;
    @Nullable
    private final Integer height;
    @Nullable

    /* renamed from: id */
    private final String f61731id;
    private final Integer pxratio;
    @Nullable
    private final String renderingMode;
    @Nullable
    private final VastBaseResource resource;
    @Nullable
    private final Integer width;

    public VastCompanion(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str2, @Nullable String str3, @Nullable Integer num7, @Nullable String str4, @Nullable String str5, @Nullable VastClickThrough vastClickThrough, @NotNull Set<VastEvent> events, @Nullable VastBaseResource vastBaseResource) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.f61731id = str;
        this.width = num;
        this.height = num2;
        this.assetWidth = num3;
        this.assetHeight = num4;
        this.expandedWidth = num5;
        this.expandedHeight = num6;
        this.apiFramework = str2;
        this.adSlotId = str3;
        this.pxratio = num7;
        this.renderingMode = str4;
        this.altText = str5;
        this.clickThrough = vastClickThrough;
        this.events = events;
        this.resource = vastBaseResource;
    }

    private final Integer component10() {
        return this.pxratio;
    }

    private final String component12() {
        return this.altText;
    }

    private final Integer component6() {
        return this.expandedWidth;
    }

    private final Integer component7() {
        return this.expandedHeight;
    }

    private final String component8() {
        return this.apiFramework;
    }

    private final String component9() {
        return this.adSlotId;
    }

    @Nullable
    public final String component1() {
        return this.f61731id;
    }

    @Nullable
    public final String component11() {
        return this.renderingMode;
    }

    @Nullable
    public final VastClickThrough component13() {
        return this.clickThrough;
    }

    @NotNull
    public final Set<VastEvent> component14() {
        return getEvents();
    }

    @Nullable
    public final VastBaseResource component15() {
        return this.resource;
    }

    @Nullable
    public final Integer component2() {
        return this.width;
    }

    @Nullable
    public final Integer component3() {
        return this.height;
    }

    @Nullable
    public final Integer component4() {
        return this.assetWidth;
    }

    @Nullable
    public final Integer component5() {
        return this.assetHeight;
    }

    @NotNull
    public final VastCompanion copy(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str2, @Nullable String str3, @Nullable Integer num7, @Nullable String str4, @Nullable String str5, @Nullable VastClickThrough vastClickThrough, @NotNull Set<VastEvent> events, @Nullable VastBaseResource vastBaseResource) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new VastCompanion(str, num, num2, num3, num4, num5, num6, str2, str3, num7, str4, str5, vastClickThrough, events, vastBaseResource);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastCompanion) {
                VastCompanion vastCompanion = (VastCompanion) obj;
                if (!Intrinsics.m17075f(this.f61731id, vastCompanion.f61731id) || !Intrinsics.m17075f(this.width, vastCompanion.width) || !Intrinsics.m17075f(this.height, vastCompanion.height) || !Intrinsics.m17075f(this.assetWidth, vastCompanion.assetWidth) || !Intrinsics.m17075f(this.assetHeight, vastCompanion.assetHeight) || !Intrinsics.m17075f(this.expandedWidth, vastCompanion.expandedWidth) || !Intrinsics.m17075f(this.expandedHeight, vastCompanion.expandedHeight) || !Intrinsics.m17075f(this.apiFramework, vastCompanion.apiFramework) || !Intrinsics.m17075f(this.adSlotId, vastCompanion.adSlotId) || !Intrinsics.m17075f(this.pxratio, vastCompanion.pxratio) || !Intrinsics.m17075f(this.renderingMode, vastCompanion.renderingMode) || !Intrinsics.m17075f(this.altText, vastCompanion.altText) || !Intrinsics.m17075f(this.clickThrough, vastCompanion.clickThrough) || !Intrinsics.m17075f(getEvents(), vastCompanion.getEvents()) || !Intrinsics.m17075f(this.resource, vastCompanion.resource)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final Integer getAssetHeight() {
        return this.assetHeight;
    }

    @Nullable
    public final Integer getAssetWidth() {
        return this.assetWidth;
    }

    @Nullable
    public final VastClickThrough getClickThrough() {
        return this.clickThrough;
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType);
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final String getId() {
        return this.f61731id;
    }

    @Nullable
    public final String getRenderingMode() {
        return this.renderingMode;
    }

    @Nullable
    public final VastBaseResource getResource() {
        return this.resource;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str = this.f61731id;
        int i15 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i16 = i * 31;
        Integer num = this.width;
        if (num != null) {
            i2 = num.hashCode();
        } else {
            i2 = 0;
        }
        int i17 = (i16 + i2) * 31;
        Integer num2 = this.height;
        if (num2 != null) {
            i3 = num2.hashCode();
        } else {
            i3 = 0;
        }
        int i18 = (i17 + i3) * 31;
        Integer num3 = this.assetWidth;
        if (num3 != null) {
            i4 = num3.hashCode();
        } else {
            i4 = 0;
        }
        int i19 = (i18 + i4) * 31;
        Integer num4 = this.assetHeight;
        if (num4 != null) {
            i5 = num4.hashCode();
        } else {
            i5 = 0;
        }
        int i20 = (i19 + i5) * 31;
        Integer num5 = this.expandedWidth;
        if (num5 != null) {
            i6 = num5.hashCode();
        } else {
            i6 = 0;
        }
        int i21 = (i20 + i6) * 31;
        Integer num6 = this.expandedHeight;
        if (num6 != null) {
            i7 = num6.hashCode();
        } else {
            i7 = 0;
        }
        int i22 = (i21 + i7) * 31;
        String str2 = this.apiFramework;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i23 = (i22 + i8) * 31;
        String str3 = this.adSlotId;
        if (str3 != null) {
            i9 = str3.hashCode();
        } else {
            i9 = 0;
        }
        int i24 = (i23 + i9) * 31;
        Integer num7 = this.pxratio;
        if (num7 != null) {
            i10 = num7.hashCode();
        } else {
            i10 = 0;
        }
        int i25 = (i24 + i10) * 31;
        String str4 = this.renderingMode;
        if (str4 != null) {
            i11 = str4.hashCode();
        } else {
            i11 = 0;
        }
        int i26 = (i25 + i11) * 31;
        String str5 = this.altText;
        if (str5 != null) {
            i12 = str5.hashCode();
        } else {
            i12 = 0;
        }
        int i27 = (i26 + i12) * 31;
        VastClickThrough vastClickThrough = this.clickThrough;
        if (vastClickThrough != null) {
            i13 = vastClickThrough.hashCode();
        } else {
            i13 = 0;
        }
        int i28 = (i27 + i13) * 31;
        Set<VastEvent> events = getEvents();
        if (events != null) {
            i14 = events.hashCode();
        } else {
            i14 = 0;
        }
        int i29 = (i28 + i14) * 31;
        VastBaseResource vastBaseResource = this.resource;
        if (vastBaseResource != null) {
            i15 = vastBaseResource.hashCode();
        }
        return i29 + i15;
    }

    @NotNull
    public String toString() {
        return "VastCompanion(id=" + this.f61731id + ", width=" + this.width + ", height=" + this.height + ", assetWidth=" + this.assetWidth + ", assetHeight=" + this.assetHeight + ", expandedWidth=" + this.expandedWidth + ", expandedHeight=" + this.expandedHeight + ", apiFramework=" + this.apiFramework + ", adSlotId=" + this.adSlotId + ", pxratio=" + this.pxratio + ", renderingMode=" + this.renderingMode + ", altText=" + this.altText + ", clickThrough=" + this.clickThrough + ", events=" + getEvents() + ", resource=" + this.resource + ")";
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType, str);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents() {
        return this.events;
    }
}
