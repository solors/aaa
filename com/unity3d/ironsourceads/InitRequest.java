package com.unity3d.ironsourceads;

import com.unity3d.ironsourceads.IronSourceAds;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class InitRequest {
    @NotNull

    /* renamed from: a */
    private final String f74423a;
    @NotNull

    /* renamed from: b */
    private final List<IronSourceAds.AdFormat> f74424b;
    @NotNull

    /* renamed from: c */
    private final LogLevel f74425c;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final String f74426a;
        @Nullable

        /* renamed from: b */
        private List<? extends IronSourceAds.AdFormat> f74427b;
        @Nullable

        /* renamed from: c */
        private LogLevel f74428c;

        public Builder(@NotNull String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.f74426a = appKey;
        }

        @NotNull
        public final InitRequest build() {
            String str = this.f74426a;
            List<? extends IronSourceAds.AdFormat> list = this.f74427b;
            if (list == null) {
                list = C37563v.m17166m();
            }
            LogLevel logLevel = this.f74428c;
            if (logLevel == null) {
                logLevel = LogLevel.NONE;
            }
            return new InitRequest(str, list, logLevel, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.f74426a;
        }

        @NotNull
        public final Builder withLegacyAdFormats(@NotNull List<? extends IronSourceAds.AdFormat> legacyAdFormats) {
            Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.f74427b = legacyAdFormats;
            return this;
        }

        @NotNull
        public final Builder withLogLevel(@NotNull LogLevel logLevel) {
            Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            this.f74428c = logLevel;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InitRequest(String str, List<? extends IronSourceAds.AdFormat> list, LogLevel logLevel) {
        this.f74423a = str;
        this.f74424b = list;
        this.f74425c = logLevel;
    }

    @NotNull
    public final String getAppKey() {
        return this.f74423a;
    }

    @NotNull
    public final List<IronSourceAds.AdFormat> getLegacyAdFormats() {
        return this.f74424b;
    }

    @NotNull
    public final LogLevel getLogLevel() {
        return this.f74425c;
    }

    public /* synthetic */ InitRequest(String str, List list, LogLevel logLevel, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, logLevel);
    }
}
