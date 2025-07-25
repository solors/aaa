package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class StorageMetrics {

    /* renamed from: c */
    private static final StorageMetrics f31144c = new Builder().build();

    /* renamed from: a */
    private final long f31145a;

    /* renamed from: b */
    private final long f31146b;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private long f31147a = 0;

        /* renamed from: b */
        private long f31148b = 0;

        Builder() {
        }

        public StorageMetrics build() {
            return new StorageMetrics(this.f31147a, this.f31148b);
        }

        public Builder setCurrentCacheSizeBytes(long j) {
            this.f31147a = j;
            return this;
        }

        public Builder setMaxCacheSizeBytes(long j) {
            this.f31148b = j;
            return this;
        }
    }

    StorageMetrics(long j, long j2) {
        this.f31145a = j;
        this.f31146b = j2;
    }

    public static StorageMetrics getDefaultInstance() {
        return f31144c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getCurrentCacheSizeBytes() {
        return this.f31145a;
    }

    @Protobuf(tag = 2)
    public long getMaxCacheSizeBytes() {
        return this.f31146b;
    }
}
