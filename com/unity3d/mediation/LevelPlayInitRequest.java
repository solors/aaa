package com.unity3d.mediation;

import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class LevelPlayInitRequest {
    @NotNull

    /* renamed from: a */
    private final String f74499a;
    @Nullable

    /* renamed from: b */
    private final String f74500b;
    @NotNull

    /* renamed from: c */
    private final List<LevelPlay.AdFormat> f74501c;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final String f74502a;
        @Nullable

        /* renamed from: b */
        private String f74503b;
        @Nullable

        /* renamed from: c */
        private List<? extends LevelPlay.AdFormat> f74504c;

        public Builder(@NotNull String appKey) {
            Intrinsics.checkNotNullParameter(appKey, "appKey");
            this.f74502a = appKey;
        }

        @NotNull
        public final LevelPlayInitRequest build() {
            String str = this.f74502a;
            String str2 = this.f74503b;
            List<? extends LevelPlay.AdFormat> list = this.f74504c;
            if (list == null) {
                list = C37563v.m17166m();
            }
            return new LevelPlayInitRequest(str, str2, list, null);
        }

        @NotNull
        public final String getAppKey() {
            return this.f74502a;
        }

        @NotNull
        public final Builder withLegacyAdFormats(@NotNull List<? extends LevelPlay.AdFormat> legacyAdFormats) {
            Intrinsics.checkNotNullParameter(legacyAdFormats, "legacyAdFormats");
            this.f74504c = legacyAdFormats;
            return this;
        }

        @NotNull
        public final Builder withUserId(@NotNull String userId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            this.f74503b = userId;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LevelPlayInitRequest(String str, String str2, List<? extends LevelPlay.AdFormat> list) {
        this.f74499a = str;
        this.f74500b = str2;
        this.f74501c = list;
    }

    @NotNull
    public final String getAppKey() {
        return this.f74499a;
    }

    @NotNull
    public final List<LevelPlay.AdFormat> getLegacyAdFormats() {
        return this.f74501c;
    }

    @Nullable
    public final String getUserId() {
        return this.f74500b;
    }

    public /* synthetic */ LevelPlayInitRequest(String str, String str2, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list);
    }
}
