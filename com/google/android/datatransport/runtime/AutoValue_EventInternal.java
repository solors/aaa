package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Map;

/* loaded from: classes4.dex */
final class AutoValue_EventInternal extends EventInternal {

    /* renamed from: a */
    private final String f31008a;

    /* renamed from: b */
    private final Integer f31009b;

    /* renamed from: c */
    private final EncodedPayload f31010c;

    /* renamed from: d */
    private final long f31011d;

    /* renamed from: e */
    private final long f31012e;

    /* renamed from: f */
    private final Map<String, String> f31013f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends EventInternal.Builder {

        /* renamed from: a */
        private String f31014a;

        /* renamed from: b */
        private Integer f31015b;

        /* renamed from: c */
        private EncodedPayload f31016c;

        /* renamed from: d */
        private Long f31017d;

        /* renamed from: e */
        private Long f31018e;

        /* renamed from: f */
        private Map<String, String> f31019f;

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        /* renamed from: a */
        protected Map<String, String> mo76321a() {
            Map<String, String> map = this.f31019f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        /* renamed from: b */
        public EventInternal.Builder mo76320b(Map<String, String> map) {
            if (map != null) {
                this.f31019f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal build() {
            String str = "";
            if (this.f31014a == null) {
                str = " transportName";
            }
            if (this.f31016c == null) {
                str = str + " encodedPayload";
            }
            if (this.f31017d == null) {
                str = str + " eventMillis";
            }
            if (this.f31018e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f31019f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new AutoValue_EventInternal(this.f31014a, this.f31015b, this.f31016c, this.f31017d.longValue(), this.f31018e.longValue(), this.f31019f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setCode(Integer num) {
            this.f31015b = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEncodedPayload(EncodedPayload encodedPayload) {
            if (encodedPayload != null) {
                this.f31016c = encodedPayload;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setEventMillis(long j) {
            this.f31017d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setTransportName(String str) {
            if (str != null) {
                this.f31014a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // com.google.android.datatransport.runtime.EventInternal.Builder
        public EventInternal.Builder setUptimeMillis(long j) {
            this.f31018e = Long.valueOf(j);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.datatransport.runtime.EventInternal
    /* renamed from: a */
    public Map<String, String> mo76322a() {
        return this.f31013f;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInternal)) {
            return false;
        }
        EventInternal eventInternal = (EventInternal) obj;
        if (this.f31008a.equals(eventInternal.getTransportName()) && ((num = this.f31009b) != null ? num.equals(eventInternal.getCode()) : eventInternal.getCode() == null) && this.f31010c.equals(eventInternal.getEncodedPayload()) && this.f31011d == eventInternal.getEventMillis() && this.f31012e == eventInternal.getUptimeMillis() && this.f31013f.equals(eventInternal.mo76322a())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    @Nullable
    public Integer getCode() {
        return this.f31009b;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public EncodedPayload getEncodedPayload() {
        return this.f31010c;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getEventMillis() {
        return this.f31011d;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public String getTransportName() {
        return this.f31008a;
    }

    @Override // com.google.android.datatransport.runtime.EventInternal
    public long getUptimeMillis() {
        return this.f31012e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f31008a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f31009b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.f31011d;
        long j2 = this.f31012e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f31010c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f31013f.hashCode();
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f31008a + ", code=" + this.f31009b + ", encodedPayload=" + this.f31010c + ", eventMillis=" + this.f31011d + ", uptimeMillis=" + this.f31012e + ", autoMetadata=" + this.f31013f + "}";
    }

    private AutoValue_EventInternal(String str, @Nullable Integer num, EncodedPayload encodedPayload, long j, long j2, Map<String, String> map) {
        this.f31008a = str;
        this.f31009b = num;
        this.f31010c = encodedPayload;
        this.f31011d = j;
        this.f31012e = j2;
        this.f31013f = map;
    }
}
