package com.pubmatic.sdk.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OpenWrapSDKConfig.kt */
@Metadata
/* loaded from: classes7.dex */
public final class OpenWrapSDKConfig {
    @NotNull

    /* renamed from: a */
    private final String f70000a;
    @NotNull

    /* renamed from: b */
    private final List<Integer> f70001b;

    /* compiled from: OpenWrapSDKConfig.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final String f70002a;
        @NotNull

        /* renamed from: b */
        private final List<Integer> f70003b;

        public Builder(@NotNull String publisherId, @NotNull List<Integer> profileIds) {
            Intrinsics.checkNotNullParameter(publisherId, "publisherId");
            Intrinsics.checkNotNullParameter(profileIds, "profileIds");
            this.f70002a = publisherId;
            this.f70003b = profileIds;
        }

        @NotNull
        public final OpenWrapSDKConfig build() {
            return new OpenWrapSDKConfig(this.f70002a, this.f70003b, null);
        }
    }

    public /* synthetic */ OpenWrapSDKConfig(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    @NotNull
    public final List<Integer> getProfileIds() {
        return this.f70001b;
    }

    @NotNull
    public final String getPublisherId() {
        return this.f70000a;
    }

    private OpenWrapSDKConfig(String str, List<Integer> list) {
        this.f70000a = str;
        this.f70001b = list;
    }
}
