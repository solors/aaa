package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class ModuleEvent {

    /* renamed from: a */
    private final int f92207a;

    /* renamed from: b */
    private final String f92208b;

    /* renamed from: c */
    private final String f92209c;

    /* renamed from: d */
    private final int f92210d;

    /* renamed from: e */
    private final List f92211e;

    /* renamed from: f */
    private final List f92212f;

    /* renamed from: g */
    private final List f92213g;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private final int f92214a;

        /* renamed from: b */
        private String f92215b;

        /* renamed from: c */
        private String f92216c;

        /* renamed from: d */
        private int f92217d;

        /* renamed from: e */
        private HashMap f92218e;

        /* renamed from: f */
        private HashMap f92219f;

        /* renamed from: g */
        private HashMap f92220g;

        /* synthetic */ Builder(int i, int i2) {
            this(i);
        }

        public ModuleEvent build() {
            return new ModuleEvent(this, 0);
        }

        public Builder withAttributes(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f92220g = new HashMap(map);
            }
            return this;
        }

        public Builder withEnvironment(@Nullable Map<String, Object> map) {
            if (map != null) {
                this.f92218e = new HashMap(map);
            }
            return this;
        }

        public Builder withExtras(@Nullable Map<String, byte[]> map) {
            if (map != null) {
                this.f92219f = new HashMap(map);
            }
            return this;
        }

        public Builder withName(@Nullable String str) {
            this.f92215b = str;
            return this;
        }

        public Builder withServiceDataReporterType(int i) {
            this.f92217d = i;
            return this;
        }

        public Builder withValue(@Nullable String str) {
            this.f92216c = str;
            return this;
        }

        private Builder(int i) {
            this.f92217d = 1;
            this.f92214a = i;
        }
    }

    /* synthetic */ ModuleEvent(Builder builder, int i) {
        this(builder);
    }

    public static Builder newBuilder(int i) {
        return new Builder(i, 0);
    }

    @Nullable
    public Map<String, Object> getAttributes() {
        return CollectionUtils.getMapFromListOrNull(this.f92213g);
    }

    @Nullable
    public Map<String, Object> getEnvironment() {
        return CollectionUtils.getMapFromListOrNull(this.f92211e);
    }

    @Nullable
    public Map<String, byte[]> getExtras() {
        return CollectionUtils.getMapFromListOrNull(this.f92212f);
    }

    @Nullable
    public String getName() {
        return this.f92208b;
    }

    public int getServiceDataReporterType() {
        return this.f92210d;
    }

    public int getType() {
        return this.f92207a;
    }

    @Nullable
    public String getValue() {
        return this.f92209c;
    }

    @NonNull
    public String toString() {
        return "ModuleEvent{type=" + this.f92207a + ", name='" + this.f92208b + "', value='" + this.f92209c + "', serviceDataReporterType=" + this.f92210d + ", environment=" + this.f92211e + ", extras=" + this.f92212f + ", attributes=" + this.f92213g + '}';
    }

    private ModuleEvent(Builder builder) {
        this.f92207a = builder.f92214a;
        this.f92208b = builder.f92215b;
        this.f92209c = builder.f92216c;
        this.f92210d = builder.f92217d;
        this.f92211e = CollectionUtils.getListFromMap(builder.f92218e);
        this.f92212f = CollectionUtils.getListFromMap(builder.f92219f);
        this.f92213g = CollectionUtils.getListFromMap(builder.f92220g);
    }
}
