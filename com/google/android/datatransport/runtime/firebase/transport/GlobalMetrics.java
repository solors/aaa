package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class GlobalMetrics {

    /* renamed from: b */
    private static final GlobalMetrics f31129b = new Builder().build();

    /* renamed from: a */
    private final StorageMetrics f31130a;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private StorageMetrics f31131a = null;

        Builder() {
        }

        public GlobalMetrics build() {
            return new GlobalMetrics(this.f31131a);
        }

        public Builder setStorageMetrics(StorageMetrics storageMetrics) {
            this.f31131a = storageMetrics;
            return this;
        }
    }

    GlobalMetrics(StorageMetrics storageMetrics) {
        this.f31130a = storageMetrics;
    }

    public static GlobalMetrics getDefaultInstance() {
        return f31129b;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public StorageMetrics getStorageMetrics() {
        StorageMetrics storageMetrics = this.f31130a;
        if (storageMetrics == null) {
            return StorageMetrics.getDefaultInstance();
        }
        return storageMetrics;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "storageMetrics")
    public StorageMetrics getStorageMetricsInternal() {
        return this.f31130a;
    }
}
