package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* loaded from: classes4.dex */
final class AutoValue_LogRequest extends LogRequest {

    /* renamed from: a */
    private final long f30957a;

    /* renamed from: b */
    private final long f30958b;

    /* renamed from: c */
    private final ClientInfo f30959c;

    /* renamed from: d */
    private final Integer f30960d;

    /* renamed from: e */
    private final String f30961e;

    /* renamed from: f */
    private final List<LogEvent> f30962f;

    /* renamed from: g */
    private final QosTier f30963g;

    /* loaded from: classes4.dex */
    static final class Builder extends LogRequest.Builder {

        /* renamed from: a */
        private Long f30964a;

        /* renamed from: b */
        private Long f30965b;

        /* renamed from: c */
        private ClientInfo f30966c;

        /* renamed from: d */
        private Integer f30967d;

        /* renamed from: e */
        private String f30968e;

        /* renamed from: f */
        private List<LogEvent> f30969f;

        /* renamed from: g */
        private QosTier f30970g;

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: a */
        LogRequest.Builder mo76326a(@Nullable Integer num) {
            this.f30967d = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        /* renamed from: b */
        LogRequest.Builder mo76325b(@Nullable String str) {
            this.f30968e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest build() {
            String str = "";
            if (this.f30964a == null) {
                str = " requestTimeMs";
            }
            if (this.f30965b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new AutoValue_LogRequest(this.f30964a.longValue(), this.f30965b.longValue(), this.f30966c, this.f30967d, this.f30968e, this.f30969f, this.f30970g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setClientInfo(@Nullable ClientInfo clientInfo) {
            this.f30966c = clientInfo;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setLogEvents(@Nullable List<LogEvent> list) {
            this.f30969f = list;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setQosTier(@Nullable QosTier qosTier) {
            this.f30970g = qosTier;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setRequestTimeMs(long j) {
            this.f30964a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.LogRequest.Builder
        public LogRequest.Builder setRequestUptimeMs(long j) {
            this.f30965b = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<LogEvent> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRequest)) {
            return false;
        }
        LogRequest logRequest = (LogRequest) obj;
        if (this.f30957a == logRequest.getRequestTimeMs() && this.f30958b == logRequest.getRequestUptimeMs() && ((clientInfo = this.f30959c) != null ? clientInfo.equals(logRequest.getClientInfo()) : logRequest.getClientInfo() == null) && ((num = this.f30960d) != null ? num.equals(logRequest.getLogSource()) : logRequest.getLogSource() == null) && ((str = this.f30961e) != null ? str.equals(logRequest.getLogSourceName()) : logRequest.getLogSourceName() == null) && ((list = this.f30962f) != null ? list.equals(logRequest.getLogEvents()) : logRequest.getLogEvents() == null)) {
            QosTier qosTier = this.f30963g;
            if (qosTier == null) {
                if (logRequest.getQosTier() == null) {
                    return true;
                }
            } else if (qosTier.equals(logRequest.getQosTier())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public ClientInfo getClientInfo() {
        return this.f30959c;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    @Encodable.Field(name = "logEvent")
    public List<LogEvent> getLogEvents() {
        return this.f30962f;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public Integer getLogSource() {
        return this.f30960d;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public String getLogSourceName() {
        return this.f30961e;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    @Nullable
    public QosTier getQosTier() {
        return this.f30963g;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public long getRequestTimeMs() {
        return this.f30957a;
    }

    @Override // com.google.android.datatransport.cct.internal.LogRequest
    public long getRequestUptimeMs() {
        return this.f30958b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.f30957a;
        long j2 = this.f30958b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        ClientInfo clientInfo = this.f30959c;
        int i2 = 0;
        if (clientInfo == null) {
            hashCode = 0;
        } else {
            hashCode = clientInfo.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        Integer num = this.f30960d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str = this.f30961e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        List<LogEvent> list = this.f30962f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        QosTier qosTier = this.f30963g;
        if (qosTier != null) {
            i2 = qosTier.hashCode();
        }
        return i6 ^ i2;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f30957a + ", requestUptimeMs=" + this.f30958b + ", clientInfo=" + this.f30959c + ", logSource=" + this.f30960d + ", logSourceName=" + this.f30961e + ", logEvents=" + this.f30962f + ", qosTier=" + this.f30963g + "}";
    }

    private AutoValue_LogRequest(long j, long j2, @Nullable ClientInfo clientInfo, @Nullable Integer num, @Nullable String str, @Nullable List<LogEvent> list, @Nullable QosTier qosTier) {
        this.f30957a = j;
        this.f30958b = j2;
        this.f30959c = clientInfo;
        this.f30960d = num;
        this.f30961e = str;
        this.f30962f = list;
        this.f30963g = qosTier;
    }
}
