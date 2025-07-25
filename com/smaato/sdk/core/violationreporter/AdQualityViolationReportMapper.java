package com.smaato.sdk.core.violationreporter;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.HeaderUtils;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.violationreporter.Report;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.core.violationreporter.a */
/* loaded from: classes7.dex */
public final class AdQualityViolationReportMapper {
    @NonNull

    /* renamed from: a */
    private final Logger f71979a;
    @NonNull

    /* renamed from: b */
    private final HeaderUtils f71980b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdQualityViolationReportMapper(@NonNull Logger logger, @NonNull HeaderUtils headerUtils) {
        this.f71979a = (Logger) Objects.requireNonNull(logger);
        this.f71980b = (HeaderUtils) Objects.requireNonNull(headerUtils);
    }

    /* renamed from: c */
    private String m39318c() {
        return "invldssid_" + ((int) ((Math.random() * 90000.0d) + 10000.0d)) + "_" + ((int) ((Math.random() * 90.0d) + 10.0d)) + "_" + ((int) ((Math.random() * 9000.0d) + 1000.0d)) + "_" + ((int) ((Math.random() * 9000.0d) + 1000.0d)) + "_" + ((int) ((Math.random() * 9000000.0d) + 1000000.0d));
    }

    /* renamed from: a */
    public Report m39320a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<String> list, long j, String str11, String str12) {
        String str13;
        Report.Builder timestamp = Report.m39322a().setType(str).setSessionId(str11).setOriginalUrl(str7).setViolatedUrl(str6).setTimestamp(String.valueOf(j));
        if (str12 == null) {
            str13 = "";
        } else {
            str13 = str12;
        }
        return timestamp.setSci(str13).setPublisher(str2).setAdSpace(str3).setApiVersion("").setBundleId(str4).setRedirectUrl(str8).setClickUrl(str9).setAdMarkup(str10).setTraceUrls(list).setError("").setPlatform("android").setSdkVersion(str5).setApiKey("").setCreativeId("").setAsnId("0").build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public Report m39319b(@NonNull String str, @NonNull Map<String, List<String>> map, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull String str8, @NonNull String str9, @NonNull String str10, @NonNull List<String> list, long j) {
        String extractHeaderMultiValue = this.f71980b.extractHeaderMultiValue(map, "X-SMT-SessionId");
        if (extractHeaderMultiValue == null) {
            this.f71979a.warning(LogDomain.CORE, "header %s is not found in SOMA response", "X-SMT-SessionId");
            extractHeaderMultiValue = m39318c();
        }
        String str11 = extractHeaderMultiValue;
        String extractHeaderMultiValue2 = this.f71980b.extractHeaderMultiValue(map, "SCI");
        if (extractHeaderMultiValue2 == null) {
            this.f71979a.warning(LogDomain.CORE, "header %s is not found in SOMA response", "SCI");
        }
        return m39320a(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, j, str11, extractHeaderMultiValue2);
    }
}
