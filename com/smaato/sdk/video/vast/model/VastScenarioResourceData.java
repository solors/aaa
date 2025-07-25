package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;

/* loaded from: classes7.dex */
public final class VastScenarioResourceData {
    @Nullable
    public final String htmlResources;
    @Nullable
    public final String iFrameResources;
    @Nullable
    public final StaticResource staticResources;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String htmlResources;
        @Nullable
        private String iFrameResources;
        @Nullable
        private StaticResource staticResources;

        @NonNull
        public VastScenarioResourceData build(boolean z) throws VastElementMissingException {
            if (!z && this.staticResources == null && this.iFrameResources == null && this.htmlResources == null) {
                throw new VastElementMissingException("Cannot build VastScenarioResourceData: staticResources, iFrameResources and htmlResources are missing");
            }
            return new VastScenarioResourceData(this.staticResources, this.iFrameResources, this.htmlResources);
        }

        @NonNull
        public Builder setHtmlResources(@Nullable String str) {
            this.htmlResources = str;
            return this;
        }

        @NonNull
        public Builder setIFrameResources(@Nullable String str) {
            this.iFrameResources = str;
            return this;
        }

        @NonNull
        public Builder setStaticResource(@Nullable StaticResource staticResource) {
            this.staticResources = staticResource;
            return this;
        }
    }

    private VastScenarioResourceData(@Nullable StaticResource staticResource, @Nullable String str, @Nullable String str2) {
        this.staticResources = staticResource;
        this.iFrameResources = str;
        this.htmlResources = str2;
    }
}
