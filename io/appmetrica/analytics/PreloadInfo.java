package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class PreloadInfo {

    /* renamed from: a */
    private final String f92223a;

    /* renamed from: b */
    private final Map f92224b;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private final String f92225a;

        /* renamed from: b */
        private final HashMap f92226b;

        /* synthetic */ Builder(String str, int i) {
            this(str);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String str, String str2) {
            if (str != null && str2 != null) {
                this.f92226b.put(str, str2);
            }
            return this;
        }

        private Builder(String str) {
            this.f92225a = str;
            this.f92226b = new HashMap();
        }
    }

    /* synthetic */ PreloadInfo(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(String str) {
        return new Builder(str, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.f92224b;
    }

    public String getTrackingId() {
        return this.f92223a;
    }

    private PreloadInfo(Builder builder) {
        this.f92223a = builder.f92225a;
        this.f92224b = CollectionUtils.unmodifiableMapCopy(builder.f92226b);
    }
}
