package com.yandex.mobile.ads.instream;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class InstreamAdRequestConfiguration {
    @NotNull

    /* renamed from: a */
    private final String f89180a;
    @NotNull

    /* renamed from: b */
    private final String f89181b;
    @Nullable

    /* renamed from: c */
    private final Map<String, String> f89182c;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final String f89183a;
        @NotNull

        /* renamed from: b */
        private String f89184b;
        @Nullable

        /* renamed from: c */
        private Map<String, String> f89185c;

        public Builder(@NotNull String pageId) {
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            this.f89183a = pageId;
            this.f89184b = "0";
        }

        @NotNull
        public final InstreamAdRequestConfiguration build() {
            return new InstreamAdRequestConfiguration(this.f89184b, this.f89183a, this.f89185c, null);
        }

        @NotNull
        public final Builder setCategoryId(@Nullable String str) {
            if (str == null) {
                str = "0";
            }
            if (str.length() != 0) {
                this.f89184b = str;
                return this;
            }
            throw new IllegalArgumentException("Passed categoryId is empty");
        }

        @NotNull
        public final Builder setParameters(@Nullable Map<String, String> map) {
            if (map == null) {
                map = C37559r0.m17284j();
            }
            this.f89185c = map;
            return this;
        }
    }

    public /* synthetic */ InstreamAdRequestConfiguration(String str, String str2, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map);
    }

    @NotNull
    public final String getCategoryId() {
        return this.f89180a;
    }

    @NotNull
    public final String getPageId() {
        return this.f89181b;
    }

    @Nullable
    public final Map<String, String> getParameters() {
        return this.f89182c;
    }

    private InstreamAdRequestConfiguration(String str, String str2, Map<String, String> map) {
        this.f89180a = str;
        this.f89181b = str2;
        this.f89182c = map;
    }
}
