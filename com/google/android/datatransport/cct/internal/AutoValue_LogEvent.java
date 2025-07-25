package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.LogEvent;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class AutoValue_LogEvent extends LogEvent {

    /* renamed from: a */
    private final long f30943a;

    /* renamed from: b */
    private final Integer f30944b;

    /* renamed from: c */
    private final long f30945c;

    /* renamed from: d */
    private final byte[] f30946d;

    /* renamed from: e */
    private final String f30947e;

    /* renamed from: f */
    private final long f30948f;

    /* renamed from: g */
    private final NetworkConnectionInfo f30949g;

    /* loaded from: classes4.dex */
    static final class Builder extends LogEvent.Builder {

        /* renamed from: a */
        private Long f30950a;

        /* renamed from: b */
        private Integer f30951b;

        /* renamed from: c */
        private Long f30952c;

        /* renamed from: d */
        private byte[] f30953d;

        /* renamed from: e */
        private String f30954e;

        /* renamed from: f */
        private Long f30955f;

        /* renamed from: g */
        private NetworkConnectionInfo f30956g;

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        /* renamed from: a */
        LogEvent.Builder mo76328a(@Nullable byte[] bArr) {
            this.f30953d = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        /* renamed from: b */
        LogEvent.Builder mo76327b(@Nullable String str) {
            this.f30954e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent build() {
            String str = "";
            if (this.f30950a == null) {
                str = " eventTimeMs";
            }
            if (this.f30952c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f30955f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new AutoValue_LogEvent(this.f30950a.longValue(), this.f30951b, this.f30952c.longValue(), this.f30953d, this.f30954e, this.f30955f.longValue(), this.f30956g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventCode(@Nullable Integer num) {
            this.f30951b = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventTimeMs(long j) {
            this.f30950a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setEventUptimeMs(long j) {
            this.f30952c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo networkConnectionInfo) {
            this.f30956g = networkConnectionInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogEvent.Builder
        public LogEvent.Builder setTimezoneOffsetSeconds(long j) {
            this.f30955f = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] sourceExtension;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogEvent)) {
            return false;
        }
        LogEvent logEvent = (LogEvent) obj;
        if (this.f30943a == logEvent.getEventTimeMs() && ((num = this.f30944b) != null ? num.equals(logEvent.getEventCode()) : logEvent.getEventCode() == null) && this.f30945c == logEvent.getEventUptimeMs()) {
            byte[] bArr = this.f30946d;
            if (logEvent instanceof AutoValue_LogEvent) {
                sourceExtension = ((AutoValue_LogEvent) logEvent).f30946d;
            } else {
                sourceExtension = logEvent.getSourceExtension();
            }
            if (Arrays.equals(bArr, sourceExtension) && ((str = this.f30947e) != null ? str.equals(logEvent.getSourceExtensionJsonProto3()) : logEvent.getSourceExtensionJsonProto3() == null) && this.f30948f == logEvent.getTimezoneOffsetSeconds()) {
                NetworkConnectionInfo networkConnectionInfo = this.f30949g;
                if (networkConnectionInfo == null) {
                    if (logEvent.getNetworkConnectionInfo() == null) {
                        return true;
                    }
                } else if (networkConnectionInfo.equals(logEvent.getNetworkConnectionInfo())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public Integer getEventCode() {
        return this.f30944b;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventTimeMs() {
        return this.f30943a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getEventUptimeMs() {
        return this.f30945c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public NetworkConnectionInfo getNetworkConnectionInfo() {
        return this.f30949g;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public byte[] getSourceExtension() {
        return this.f30946d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    @Nullable
    public String getSourceExtensionJsonProto3() {
        return this.f30947e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogEvent
    public long getTimezoneOffsetSeconds() {
        return this.f30948f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.f30943a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f30944b;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j2 = this.f30945c;
        int hashCode3 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f30946d)) * 1000003;
        String str = this.f30947e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j3 = this.f30948f;
        int i3 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        NetworkConnectionInfo networkConnectionInfo = this.f30949g;
        if (networkConnectionInfo != null) {
            i2 = networkConnectionInfo.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f30943a + ", eventCode=" + this.f30944b + ", eventUptimeMs=" + this.f30945c + ", sourceExtension=" + Arrays.toString(this.f30946d) + ", sourceExtensionJsonProto3=" + this.f30947e + ", timezoneOffsetSeconds=" + this.f30948f + ", networkConnectionInfo=" + this.f30949g + "}";
    }

    private AutoValue_LogEvent(long j, @Nullable Integer num, long j2, @Nullable byte[] bArr, @Nullable String str, long j3, @Nullable NetworkConnectionInfo networkConnectionInfo) {
        this.f30943a = j;
        this.f30944b = num;
        this.f30945c = j2;
        this.f30946d = bArr;
        this.f30947e = str;
        this.f30948f = j3;
        this.f30949g = networkConnectionInfo;
    }
}
