package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastStaticResource implements VastBaseResource {
    @Nullable
    private final String content;
    @Nullable
    private final String creativeType;
    @NotNull
    private final VastResourceType resourceType = VastResourceType.STATIC;
    @Nullable
    private final String url;

    public VastStaticResource(@Nullable String str, @Nullable String str2) {
        this.creativeType = str;
        this.url = str2;
        this.content = str2;
    }

    public static /* synthetic */ VastStaticResource copy$default(VastStaticResource vastStaticResource, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vastStaticResource.creativeType;
        }
        if ((i & 2) != 0) {
            str2 = vastStaticResource.url;
        }
        return vastStaticResource.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.creativeType;
    }

    @Nullable
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final VastStaticResource copy(@Nullable String str, @Nullable String str2) {
        return new VastStaticResource(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastStaticResource) {
                VastStaticResource vastStaticResource = (VastStaticResource) obj;
                if (!Intrinsics.m17075f(this.creativeType, vastStaticResource.creativeType) || !Intrinsics.m17075f(this.url, vastStaticResource.url)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.mobilefuse.videoplayer.model.VastBaseResource
    @Nullable
    public String getContent() {
        return this.content;
    }

    @Nullable
    public final String getCreativeType() {
        return this.creativeType;
    }

    @Override // com.mobilefuse.videoplayer.model.VastBaseResource
    @NotNull
    public VastResourceType getResourceType() {
        return this.resourceType;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        String str = this.creativeType;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.url;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public String toString() {
        return "VastStaticResource(creativeType=" + this.creativeType + ", url=" + this.url + ")";
    }
}
