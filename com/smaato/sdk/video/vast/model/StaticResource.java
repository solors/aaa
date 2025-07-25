package com.smaato.sdk.video.vast.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;
import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class StaticResource {
    public static final String CREATIVE_TYPE = "creativeType";
    public static final String NAME = "StaticResource";
    private static final Pattern PATTERN_IMAGE_MYME_TYPE = Pattern.compile("(image/[^\\s;]+)");
    @NonNull
    public final CreativeType creativeType;
    @NonNull
    public final String uri;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private CreativeType creativeType;
        @Nullable
        private String uri;

        @NonNull
        public StaticResource build() throws VastElementMissingException {
            CreativeType creativeType = this.creativeType;
            if (creativeType == null) {
                creativeType = CreativeType.UNKNOWN;
            }
            return new StaticResource((String) VastModels.requireNonNull(this.uri, "Cannot build StaticResource: uri is missing"), creativeType);
        }

        @NonNull
        public Builder setCreativeType(@Nullable CreativeType creativeType) {
            this.creativeType = creativeType;
            return this;
        }

        @NonNull
        public Builder setUri(@Nullable String str) {
            this.uri = str;
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public enum CreativeType {
        JAVASCRIPT,
        IMAGE,
        UNKNOWN;

        @Nullable
        public static CreativeType parse(@Nullable String str) {
            if (!TextUtils.isEmpty(str)) {
                if (StaticResource.PATTERN_IMAGE_MYME_TYPE.matcher(str.trim()).find()) {
                    return IMAGE;
                }
                if ("application/javascript".equalsIgnoreCase(str)) {
                    return JAVASCRIPT;
                }
                return null;
            }
            return null;
        }
    }

    private StaticResource(@NonNull String str, @NonNull CreativeType creativeType) {
        this.uri = (String) Objects.requireNonNull(str);
        this.creativeType = (CreativeType) Objects.requireNonNull(creativeType);
    }
}
