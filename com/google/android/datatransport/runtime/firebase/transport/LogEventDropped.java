package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes4.dex */
public final class LogEventDropped {

    /* renamed from: c */
    private static final LogEventDropped f31132c = new Builder().build();

    /* renamed from: a */
    private final long f31133a;

    /* renamed from: b */
    private final Reason f31134b;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private long f31135a = 0;

        /* renamed from: b */
        private Reason f31136b = Reason.REASON_UNKNOWN;

        Builder() {
        }

        public LogEventDropped build() {
            return new LogEventDropped(this.f31135a, this.f31136b);
        }

        public Builder setEventsDroppedCount(long j) {
            this.f31135a = j;
            return this;
        }

        public Builder setReason(Reason reason) {
            this.f31136b = reason;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: b */
        private final int f31138b;

        Reason(int i) {
            this.f31138b = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.f31138b;
        }
    }

    LogEventDropped(long j, Reason reason) {
        this.f31133a = j;
        this.f31134b = reason;
    }

    public static LogEventDropped getDefaultInstance() {
        return f31132c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getEventsDroppedCount() {
        return this.f31133a;
    }

    @Protobuf(tag = 3)
    public Reason getReason() {
        return this.f31134b;
    }
}
