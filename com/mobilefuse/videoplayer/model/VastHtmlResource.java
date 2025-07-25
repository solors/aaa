package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastHtmlResource implements VastBaseResource {
    @Nullable
    private final String content;
    @Nullable
    private final String htmlContent;
    @NotNull
    private final VastResourceType resourceType = VastResourceType.HTML;

    public VastHtmlResource(@Nullable String str) {
        this.htmlContent = str;
        this.content = str;
    }

    public static /* synthetic */ VastHtmlResource copy$default(VastHtmlResource vastHtmlResource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vastHtmlResource.htmlContent;
        }
        return vastHtmlResource.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.htmlContent;
    }

    @NotNull
    public final VastHtmlResource copy(@Nullable String str) {
        return new VastHtmlResource(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof VastHtmlResource) || !Intrinsics.m17075f(this.htmlContent, ((VastHtmlResource) obj).htmlContent)) {
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

    @Nullable
    public final String getHtmlContent() {
        return this.htmlContent;
    }

    @Override // com.mobilefuse.videoplayer.model.VastBaseResource
    @NotNull
    public VastResourceType getResourceType() {
        return this.resourceType;
    }

    public int hashCode() {
        String str = this.htmlContent;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "VastHtmlResource(htmlContent=" + this.htmlContent + ")";
    }
}
