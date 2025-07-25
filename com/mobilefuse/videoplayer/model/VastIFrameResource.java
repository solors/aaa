package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastIFrameResource implements VastBaseResource {
    @Nullable
    private final String content;
    @NotNull
    private final VastResourceType resourceType = VastResourceType.IFRAME;
    @Nullable
    private final String url;

    public VastIFrameResource(@Nullable String str) {
        this.url = str;
        this.content = str;
    }

    public static /* synthetic */ VastIFrameResource copy$default(VastIFrameResource vastIFrameResource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vastIFrameResource.url;
        }
        return vastIFrameResource.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final VastIFrameResource copy(@Nullable String str) {
        return new VastIFrameResource(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof VastIFrameResource) || !Intrinsics.m17075f(this.url, ((VastIFrameResource) obj).url)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.mobilefuse.videoplayer.model.VastBaseResource
    @Nullable
    public String getContent() {
        return this.content;
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
        String str = this.url;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "VastIFrameResource(url=" + this.url + ")";
    }
}
