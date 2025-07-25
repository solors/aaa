package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastJavaScriptResource implements VastBaseVerificationResource {
    @Nullable
    private final VerificationApiFramework apiFramework;
    private final boolean isBrowserOptional;
    @NotNull
    private final VastVerificationResourceType resourceType = VastVerificationResourceType.JAVASCRIPT;
    @Nullable
    private final String uri;

    public VastJavaScriptResource(@Nullable String str, @Nullable VerificationApiFramework verificationApiFramework, boolean z) {
        this.uri = str;
        this.apiFramework = verificationApiFramework;
        this.isBrowserOptional = z;
    }

    public static /* synthetic */ VastJavaScriptResource copy$default(VastJavaScriptResource vastJavaScriptResource, String str, VerificationApiFramework verificationApiFramework, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vastJavaScriptResource.uri;
        }
        if ((i & 2) != 0) {
            verificationApiFramework = vastJavaScriptResource.apiFramework;
        }
        if ((i & 4) != 0) {
            z = vastJavaScriptResource.isBrowserOptional;
        }
        return vastJavaScriptResource.copy(str, verificationApiFramework, z);
    }

    @Nullable
    public final String component1() {
        return this.uri;
    }

    @Nullable
    public final VerificationApiFramework component2() {
        return this.apiFramework;
    }

    public final boolean component3() {
        return this.isBrowserOptional;
    }

    @NotNull
    public final VastJavaScriptResource copy(@Nullable String str, @Nullable VerificationApiFramework verificationApiFramework, boolean z) {
        return new VastJavaScriptResource(str, verificationApiFramework, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastJavaScriptResource) {
                VastJavaScriptResource vastJavaScriptResource = (VastJavaScriptResource) obj;
                if (!Intrinsics.m17075f(this.uri, vastJavaScriptResource.uri) || !Intrinsics.m17075f(this.apiFramework, vastJavaScriptResource.apiFramework) || this.isBrowserOptional != vastJavaScriptResource.isBrowserOptional) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final VerificationApiFramework getApiFramework() {
        return this.apiFramework;
    }

    @Override // com.mobilefuse.videoplayer.model.VastBaseVerificationResource
    @NotNull
    public VastVerificationResourceType getResourceType() {
        return this.resourceType;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i;
        String str = this.uri;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        VerificationApiFramework verificationApiFramework = this.apiFramework;
        if (verificationApiFramework != null) {
            i2 = verificationApiFramework.hashCode();
        }
        int i4 = (i3 + i2) * 31;
        boolean z = this.isBrowserOptional;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return i4 + i5;
    }

    public final boolean isBrowserOptional() {
        return this.isBrowserOptional;
    }

    @NotNull
    public String toString() {
        return "VastJavaScriptResource(uri=" + this.uri + ", apiFramework=" + this.apiFramework + ", isBrowserOptional=" + this.isBrowserOptional + ")";
    }
}
