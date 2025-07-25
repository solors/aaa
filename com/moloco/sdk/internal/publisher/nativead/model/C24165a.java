package com.moloco.sdk.internal.publisher.nativead.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.internal.publisher.nativead.model.a */
/* loaded from: classes7.dex */
public final class C24165a {
    @Nullable

    /* renamed from: a */
    public final String f62605a;
    @NotNull

    /* renamed from: b */
    public final List<AbstractC24166a> f62606b;
    @Nullable

    /* renamed from: c */
    public final C24172c f62607c;
    @NotNull

    /* renamed from: d */
    public final List<String> f62608d;
    @NotNull

    /* renamed from: e */
    public final List<C24171b> f62609e;
    @Nullable

    /* renamed from: f */
    public final String f62610f;

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC24166a {

        /* renamed from: a */
        public final int f62611a;

        /* renamed from: b */
        public final boolean f62612b;

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$a */
        /* loaded from: classes7.dex */
        public static final class C24167a extends AbstractC24166a {
            @Nullable

            /* renamed from: c */
            public final Integer f62613c;
            @Nullable

            /* renamed from: d */
            public final Integer f62614d;
            @NotNull

            /* renamed from: e */
            public final String f62615e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24167a(int i, boolean z, @Nullable Integer num, @Nullable Integer num2, @NotNull String value) {
                super(i, z, null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.f62613c = num;
                this.f62614d = num2;
                this.f62615e = value;
            }

            @NotNull
            /* renamed from: c */
            public final String m46846c() {
                return this.f62615e;
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$b */
        /* loaded from: classes7.dex */
        public static final class C24168b extends AbstractC24166a {
            @Nullable

            /* renamed from: c */
            public final Integer f62616c;
            @NotNull

            /* renamed from: d */
            public final String f62617d;
            @Nullable

            /* renamed from: e */
            public final Integer f62618e;
            @Nullable

            /* renamed from: f */
            public final Integer f62619f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24168b(int i, boolean z, @Nullable Integer num, @NotNull String url, @Nullable Integer num2, @Nullable Integer num3) {
                super(i, z, null);
                Intrinsics.checkNotNullParameter(url, "url");
                this.f62616c = num;
                this.f62617d = url;
                this.f62618e = num2;
                this.f62619f = num3;
            }

            @NotNull
            /* renamed from: c */
            public final String m46845c() {
                return this.f62617d;
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$c */
        /* loaded from: classes7.dex */
        public static final class C24169c extends AbstractC24166a {
            @NotNull

            /* renamed from: c */
            public final String f62620c;
            @Nullable

            /* renamed from: d */
            public final Integer f62621d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24169c(int i, boolean z, @NotNull String text, @Nullable Integer num) {
                super(i, z, null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.f62620c = text;
                this.f62621d = num;
            }

            @NotNull
            /* renamed from: c */
            public final String m46844c() {
                return this.f62620c;
            }
        }

        @StabilityInferred(parameters = 0)
        /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$a$d */
        /* loaded from: classes7.dex */
        public static final class C24170d extends AbstractC24166a {
            @NotNull

            /* renamed from: c */
            public final String f62622c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C24170d(int i, boolean z, @NotNull String vastTag) {
                super(i, z, null);
                Intrinsics.checkNotNullParameter(vastTag, "vastTag");
                this.f62622c = vastTag;
            }

            @NotNull
            /* renamed from: c */
            public final String m46843c() {
                return this.f62622c;
            }
        }

        public /* synthetic */ AbstractC24166a(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z);
        }

        /* renamed from: a */
        public final int m46848a() {
            return this.f62611a;
        }

        /* renamed from: b */
        public final boolean m46847b() {
            return this.f62612b;
        }

        public AbstractC24166a(int i, boolean z) {
            this.f62611a = i;
            this.f62612b = z;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$b */
    /* loaded from: classes7.dex */
    public static final class C24171b {

        /* renamed from: a */
        public final int f62623a;

        /* renamed from: b */
        public final int f62624b;
        @Nullable

        /* renamed from: c */
        public final String f62625c;

        public C24171b(int i, int i2, @Nullable String str) {
            this.f62623a = i;
            this.f62624b = i2;
            this.f62625c = str;
        }

        /* renamed from: a */
        public final int m46842a() {
            return this.f62623a;
        }

        /* renamed from: b */
        public final int m46841b() {
            return this.f62624b;
        }

        @Nullable
        /* renamed from: c */
        public final String m46840c() {
            return this.f62625c;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.model.a$c */
    /* loaded from: classes7.dex */
    public static final class C24172c {
        @NotNull

        /* renamed from: a */
        public final String f62626a;
        @NotNull

        /* renamed from: b */
        public final List<String> f62627b;
        @Nullable

        /* renamed from: c */
        public final String f62628c;

        public C24172c(@NotNull String url, @NotNull List<String> clickTrackerUrls, @Nullable String str) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(clickTrackerUrls, "clickTrackerUrls");
            this.f62626a = url;
            this.f62627b = clickTrackerUrls;
            this.f62628c = str;
        }

        @NotNull
        /* renamed from: a */
        public final List<String> m46839a() {
            return this.f62627b;
        }

        @NotNull
        /* renamed from: b */
        public final String m46838b() {
            return this.f62626a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C24165a(@Nullable String str, @NotNull List<? extends AbstractC24166a> assets, @Nullable C24172c c24172c, @NotNull List<String> impressionTrackerUrls, @NotNull List<C24171b> eventTrackers, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(impressionTrackerUrls, "impressionTrackerUrls");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        this.f62605a = str;
        this.f62606b = assets;
        this.f62607c = c24172c;
        this.f62608d = impressionTrackerUrls;
        this.f62609e = eventTrackers;
        this.f62610f = str2;
    }

    @NotNull
    /* renamed from: a */
    public final List<AbstractC24166a> m46852a() {
        return this.f62606b;
    }

    @NotNull
    /* renamed from: b */
    public final List<C24171b> m46851b() {
        return this.f62609e;
    }

    @NotNull
    /* renamed from: c */
    public final List<String> m46850c() {
        return this.f62608d;
    }

    @Nullable
    /* renamed from: d */
    public final C24172c m46849d() {
        return this.f62607c;
    }
}
