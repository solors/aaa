package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class LogSourceMetrics {

    /* renamed from: c */
    private static final LogSourceMetrics f31139c = new Builder().build();

    /* renamed from: a */
    private final String f31140a;

    /* renamed from: b */
    private final List<LogEventDropped> f31141b;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private String f31142a = "";

        /* renamed from: b */
        private List<LogEventDropped> f31143b = new ArrayList();

        Builder() {
        }

        public Builder addLogEventDropped(LogEventDropped logEventDropped) {
            this.f31143b.add(logEventDropped);
            return this;
        }

        public LogSourceMetrics build() {
            return new LogSourceMetrics(this.f31142a, Collections.unmodifiableList(this.f31143b));
        }

        public Builder setLogEventDroppedList(List<LogEventDropped> list) {
            this.f31143b = list;
            return this;
        }

        public Builder setLogSource(String str) {
            this.f31142a = str;
            return this;
        }
    }

    LogSourceMetrics(String str, List<LogEventDropped> list) {
        this.f31140a = str;
        this.f31141b = list;
    }

    public static LogSourceMetrics getDefaultInstance() {
        return f31139c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logEventDropped")
    public List<LogEventDropped> getLogEventDroppedList() {
        return this.f31141b;
    }

    @Protobuf(tag = 1)
    public String getLogSource() {
        return this.f31140a;
    }
}
