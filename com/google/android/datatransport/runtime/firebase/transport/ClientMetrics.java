package com.google.android.datatransport.runtime.firebase.transport;

import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ClientMetrics {

    /* renamed from: e */
    private static final ClientMetrics f31120e = new Builder().build();

    /* renamed from: a */
    private final TimeWindow f31121a;

    /* renamed from: b */
    private final List<LogSourceMetrics> f31122b;

    /* renamed from: c */
    private final GlobalMetrics f31123c;

    /* renamed from: d */
    private final String f31124d;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private TimeWindow f31125a = null;

        /* renamed from: b */
        private List<LogSourceMetrics> f31126b = new ArrayList();

        /* renamed from: c */
        private GlobalMetrics f31127c = null;

        /* renamed from: d */
        private String f31128d = "";

        Builder() {
        }

        public Builder addLogSourceMetrics(LogSourceMetrics logSourceMetrics) {
            this.f31126b.add(logSourceMetrics);
            return this;
        }

        public ClientMetrics build() {
            return new ClientMetrics(this.f31125a, Collections.unmodifiableList(this.f31126b), this.f31127c, this.f31128d);
        }

        public Builder setAppNamespace(String str) {
            this.f31128d = str;
            return this;
        }

        public Builder setGlobalMetrics(GlobalMetrics globalMetrics) {
            this.f31127c = globalMetrics;
            return this;
        }

        public Builder setLogSourceMetricsList(List<LogSourceMetrics> list) {
            this.f31126b = list;
            return this;
        }

        public Builder setWindow(TimeWindow timeWindow) {
            this.f31125a = timeWindow;
            return this;
        }
    }

    ClientMetrics(TimeWindow timeWindow, List<LogSourceMetrics> list, GlobalMetrics globalMetrics, String str) {
        this.f31121a = timeWindow;
        this.f31122b = list;
        this.f31123c = globalMetrics;
        this.f31124d = str;
    }

    public static ClientMetrics getDefaultInstance() {
        return f31120e;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 4)
    public String getAppNamespace() {
        return this.f31124d;
    }

    @Encodable.Ignore
    public GlobalMetrics getGlobalMetrics() {
        GlobalMetrics globalMetrics = this.f31123c;
        if (globalMetrics == null) {
            return GlobalMetrics.getDefaultInstance();
        }
        return globalMetrics;
    }

    @Protobuf(tag = 3)
    @Encodable.Field(name = "globalMetrics")
    public GlobalMetrics getGlobalMetricsInternal() {
        return this.f31123c;
    }

    @Protobuf(tag = 2)
    @Encodable.Field(name = "logSourceMetrics")
    public List<LogSourceMetrics> getLogSourceMetricsList() {
        return this.f31122b;
    }

    @Encodable.Ignore
    public TimeWindow getWindow() {
        TimeWindow timeWindow = this.f31121a;
        if (timeWindow == null) {
            return TimeWindow.getDefaultInstance();
        }
        return timeWindow;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "window")
    public TimeWindow getWindowInternal() {
        return this.f31121a;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        ProtoEncoderDoNotUse.encode(this, outputStream);
    }
}
