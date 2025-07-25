package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class TimeWindow {

    /* renamed from: c */
    private static final TimeWindow f31149c = new Builder().build();

    /* renamed from: a */
    private final long f31150a;

    /* renamed from: b */
    private final long f31151b;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private long f31152a = 0;

        /* renamed from: b */
        private long f31153b = 0;

        Builder() {
        }

        public TimeWindow build() {
            return new TimeWindow(this.f31152a, this.f31153b);
        }

        public Builder setEndMs(long j) {
            this.f31153b = j;
            return this;
        }

        public Builder setStartMs(long j) {
            this.f31152a = j;
            return this;
        }
    }

    TimeWindow(long j, long j2) {
        this.f31150a = j;
        this.f31151b = j2;
    }

    public static TimeWindow getDefaultInstance() {
        return f31149c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    public long getEndMs() {
        return this.f31151b;
    }

    @Protobuf(tag = 1)
    public long getStartMs() {
        return this.f31150a;
    }
}
