package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@AutoValue
/* loaded from: classes4.dex */
public abstract class EventInternal {

    @AutoValue.Builder
    /* loaded from: classes4.dex */
    public static abstract class Builder {
        /* renamed from: a */
        protected abstract Map<String, String> mo76321a();

        public final Builder addMetadata(String str, String str2) {
            mo76321a().put(str, str2);
            return this;
        }

        /* renamed from: b */
        protected abstract Builder mo76320b(Map<String, String> map);

        public abstract EventInternal build();

        public abstract Builder setCode(Integer num);

        public abstract Builder setEncodedPayload(EncodedPayload encodedPayload);

        public abstract Builder setEventMillis(long j);

        public abstract Builder setTransportName(String str);

        public abstract Builder setUptimeMillis(long j);

        public final Builder addMetadata(String str, long j) {
            mo76321a().put(str, String.valueOf(j));
            return this;
        }

        public final Builder addMetadata(String str, int i) {
            mo76321a().put(str, String.valueOf(i));
            return this;
        }
    }

    public static Builder builder() {
        return new AutoValue_EventInternal.Builder().mo76320b(new HashMap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Map<String, String> mo76322a();

    public final String get(String str) {
        String str2 = mo76322a().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Nullable
    public abstract Integer getCode();

    public abstract EncodedPayload getEncodedPayload();

    public abstract long getEventMillis();

    public final int getInteger(String str) {
        String str2 = mo76322a().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long getLong(String str) {
        String str2 = mo76322a().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap(mo76322a());
    }

    public final String getOrDefault(String str, String str2) {
        String str3 = mo76322a().get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    @Deprecated
    public byte[] getPayload() {
        return getEncodedPayload().getBytes();
    }

    public abstract String getTransportName();

    public abstract long getUptimeMillis();

    public Builder toBuilder() {
        return new AutoValue_EventInternal.Builder().setTransportName(getTransportName()).setCode(getCode()).setEncodedPayload(getEncodedPayload()).setEventMillis(getEventMillis()).setUptimeMillis(getUptimeMillis()).mo76320b(new HashMap(mo76322a()));
    }
}
