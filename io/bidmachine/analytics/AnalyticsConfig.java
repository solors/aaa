package io.bidmachine.analytics;

import com.explorestack.protobuf.Struct;
import java.util.List;
import kotlin.Metadata;

@Metadata
/* loaded from: classes9.dex */
public final class AnalyticsConfig {

    /* renamed from: a */
    private final String f96251a;

    /* renamed from: b */
    private final List f96252b;

    /* renamed from: c */
    private final List f96253c;

    /* renamed from: d */
    private final String f96254d;

    /* renamed from: e */
    private final Struct f96255e;

    public AnalyticsConfig(String str, List<MonitorConfig> list, List<ReaderConfig> list2, String str2, Struct struct) {
        this.f96251a = str;
        this.f96252b = list;
        this.f96253c = list2;
        this.f96254d = str2;
        this.f96255e = struct;
    }

    public final String getBpk() {
        return this.f96254d;
    }

    public final Struct getExtras() {
        return this.f96255e;
    }

    public final List<MonitorConfig> getMonitorConfigList() {
        return this.f96252b;
    }

    public final List<ReaderConfig> getReaderConfigList() {
        return this.f96253c;
    }

    public final String getSessionId() {
        return this.f96251a;
    }
}
