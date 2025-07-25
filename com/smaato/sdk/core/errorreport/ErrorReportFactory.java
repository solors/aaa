package com.smaato.sdk.core.errorreport;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.remoteconfig.publisher.Param;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Lists;
import java.util.List;

/* loaded from: classes7.dex */
public final class ErrorReportFactory {
    @NonNull
    private final DataCollector dataCollector;

    public ErrorReportFactory(@NonNull DataCollector dataCollector) {
        this.dataCollector = (DataCollector) Objects.requireNonNull(dataCollector);
    }

    @NonNull
    private List<Param> createParams(@NonNull String str, @NonNull String str2, long j) {
        return Lists.m39343of(new Param.PublisherId(str2), new Param.Timestamp(Long.valueOf(j)), new Param.SdkVersion(), new Param.ConnectionType(this.dataCollector), new Param.SampleRate(100), new Param.ErrorType(str));
    }

    @NonNull
    public Report create(@NonNull String str, @NonNull String str2, long j) {
        return new Report(createParams(str, str2, j), 100);
    }
}
