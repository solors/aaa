package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

/* loaded from: classes7.dex */
public class Icon {
    public static final String API_FRAMEWORK = "apiFramework";
    public static final String DURATION = "duration";
    public static final String HEIGHT = "height";
    public static final String HTML_RESOURCE = "HTMLResource";
    public static final String ICON_CLICKS = "IconClicks";
    public static final String ICON_VIEW_TRACKING = "IconViewTracking";
    public static final String I_FRAME_RESOURCE = "IFrameResource";
    public static final String NAME = "Icon";
    public static final String OFFSET = "offset";
    public static final String PROGRAM = "program";
    public static final String PX_RATIO = "pxratio";
    public static final String STATIC_RESOURCE = "StaticResource";
    public static final String WIDTH = "width";
    public static final String X_POSITION = "xPosition";
    public static final String Y_POSITION = "yPosition";
    @Nullable
    public final String apiFramework;
    @Nullable
    public final String duration;
    @Nullable
    public final Float height;
    @NonNull
    public final List<String> htmlResources;
    @NonNull
    public final List<String> iFrameResources;
    @Nullable
    public final IconClicks iconClicks;
    @NonNull
    public final List<String> iconViewTrackings;
    @Nullable
    public final String offset;
    @Nullable
    public final String program;
    @Nullable
    public final Float pxRatio;
    @NonNull
    public final List<StaticResource> staticResources;
    @Nullable
    public final Float width;
    @Nullable
    public final String xPosition;
    @Nullable
    public final String yPosition;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String apiFramework;
        @Nullable
        private String duration;
        @Nullable
        private Float height;
        @Nullable
        private List<String> htmlResources;
        @Nullable
        private List<String> iFrameResources;
        @Nullable
        private IconClicks iconClicks;
        @Nullable
        private List<String> iconViewTrackings;
        @Nullable
        private String offset;
        @Nullable
        private String program;
        @Nullable
        private Float pxRatio;
        @Nullable
        private List<StaticResource> staticResources;
        @Nullable
        private Float width;
        @Nullable
        private String xPosition;
        @Nullable
        private String yPosition;

        @NonNull
        public Icon build() {
            this.iconViewTrackings = VastModels.toImmutableList(this.iconViewTrackings);
            this.staticResources = VastModels.toImmutableList(this.staticResources);
            this.iFrameResources = VastModels.toImmutableList(this.iFrameResources);
            List<String> immutableList = VastModels.toImmutableList(this.htmlResources);
            this.htmlResources = immutableList;
            return new Icon(this.iconViewTrackings, this.staticResources, this.iFrameResources, immutableList, this.program, this.width, this.height, this.xPosition, this.yPosition, this.offset, this.duration, this.pxRatio, this.iconClicks, this.apiFramework);
        }

        @NonNull
        public Builder setApiFramework(@Nullable String str) {
            this.apiFramework = str;
            return this;
        }

        @NonNull
        public Builder setDuration(@Nullable String str) {
            this.duration = str;
            return this;
        }

        @NonNull
        public Builder setHeight(@Nullable Float f) {
            this.height = f;
            return this;
        }

        @NonNull
        public Builder setHtmlResources(@Nullable List<String> list) {
            this.htmlResources = list;
            return this;
        }

        @NonNull
        public Builder setIFrameResources(@Nullable List<String> list) {
            this.iFrameResources = list;
            return this;
        }

        @NonNull
        public Builder setIconClicks(@Nullable IconClicks iconClicks) {
            this.iconClicks = iconClicks;
            return this;
        }

        @NonNull
        public Builder setIconViewTrackings(@Nullable List<String> list) {
            this.iconViewTrackings = list;
            return this;
        }

        @NonNull
        public Builder setOffset(@Nullable String str) {
            this.offset = str;
            return this;
        }

        @NonNull
        public Builder setProgram(@Nullable String str) {
            this.program = str;
            return this;
        }

        @NonNull
        public Builder setPxRatio(@Nullable Float f) {
            this.pxRatio = f;
            return this;
        }

        @NonNull
        public Builder setStaticResources(@Nullable List<StaticResource> list) {
            this.staticResources = list;
            return this;
        }

        @NonNull
        public Builder setWidth(@Nullable Float f) {
            this.width = f;
            return this;
        }

        @NonNull
        public Builder setXPosition(@Nullable String str) {
            this.xPosition = str;
            return this;
        }

        @NonNull
        public Builder setYPosition(@Nullable String str) {
            this.yPosition = str;
            return this;
        }
    }

    Icon(@NonNull List<String> list, @NonNull List<StaticResource> list2, @NonNull List<String> list3, @NonNull List<String> list4, @Nullable String str, @Nullable Float f, @Nullable Float f2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Float f3, @Nullable IconClicks iconClicks, @Nullable String str6) {
        this.program = str;
        this.width = f;
        this.height = f2;
        this.xPosition = str2;
        this.yPosition = str3;
        this.offset = str4;
        this.duration = str5;
        this.pxRatio = f3;
        this.iconViewTrackings = list;
        this.iconClicks = iconClicks;
        this.staticResources = list2;
        this.iFrameResources = list3;
        this.htmlResources = list4;
        this.apiFramework = str6;
    }
}
