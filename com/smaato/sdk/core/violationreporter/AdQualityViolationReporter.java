package com.smaato.sdk.core.violationreporter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes7.dex */
public final class AdQualityViolationReporter {
    @NonNull
    private final AdQualityViolationReportMapper adQualityViolationReportMapper;
    @NonNull
    private final Logger logger;
    @NonNull
    private final String reportingApiUrl;
    @NonNull
    private final SimpleHttpClient simpleHttpClient;

    public AdQualityViolationReporter(@NonNull Logger logger, @NonNull SimpleHttpClient simpleHttpClient, @NonNull AdQualityViolationReportMapper adQualityViolationReportMapper, @NonNull String str) {
        this.logger = logger;
        this.simpleHttpClient = simpleHttpClient;
        this.adQualityViolationReportMapper = (AdQualityViolationReportMapper) Objects.requireNonNull(adQualityViolationReportMapper);
        this.reportingApiUrl = (String) Objects.requireNonNull(str);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39328a(AdQualityViolationReporter adQualityViolationReporter, String str) {
        adQualityViolationReporter.lambda$send$0(str);
    }

    public /* synthetic */ void lambda$send$0(String str) {
        this.simpleHttpClient.sendDataAndForget(this.reportingApiUrl, str);
    }

    private void send(@NonNull Report report) {
        try {
            final String jSONObject = report.m39321v().toString();
            this.logger.debug(LogDomain.CORE, "going to send: %s", jSONObject);
            Threads.runOnBackgroundThread(new Runnable() { // from class: t7.a
                @Override // java.lang.Runnable
                public final void run() {
                    AdQualityViolationReporter.m39328a(AdQualityViolationReporter.this, jSONObject);
                }
            });
        } catch (JSONException e) {
            this.logger.error(LogDomain.CORE, e, "Error while sending violation report", new Object[0]);
        }
    }

    public void reportAdTrackerViolation(@NonNull String str, @NonNull Map<String, List<String>> map, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull List<String> list) {
        try {
            send(this.adQualityViolationReportMapper.m39319b(str, map, str2, str3, str4, str5, str6, str7, !str7.isEmpty() ? "" : str6, "", "", list, System.currentTimeMillis()));
        } catch (Exception e) {
            this.logger.error(LogDomain.CORE, "failed to create ad quality violation report", e);
        }
    }

    public void reportImageLoadingAdViolation(@NonNull ImageAdLoadingViolationException imageAdLoadingViolationException) {
        String str;
        try {
            AdQualityViolationReportMapper adQualityViolationReportMapper = this.adQualityViolationReportMapper;
            String str2 = imageAdLoadingViolationException.adQualityViolationType;
            Map<String, List<String>> map = imageAdLoadingViolationException.responseHeaders;
            String str3 = imageAdLoadingViolationException.publisherId;
            String str4 = imageAdLoadingViolationException.adSpaceId;
            String str5 = imageAdLoadingViolationException.bundle;
            String str6 = imageAdLoadingViolationException.client;
            String str7 = imageAdLoadingViolationException.violatedUrl;
            String str8 = imageAdLoadingViolationException.originalUrl;
            if (str8.equals(str7)) {
                str = "";
            } else {
                str = imageAdLoadingViolationException.violatedUrl;
            }
            send(adQualityViolationReportMapper.m39319b(str2, map, str3, str4, str5, str6, str7, str8, str, imageAdLoadingViolationException.clickUrl, "", imageAdLoadingViolationException.clickTrackingUrls, System.currentTimeMillis()));
        } catch (Exception e) {
            this.logger.error(LogDomain.CORE, "failed to create ad quality violation report for image ad", e);
        }
    }

    public void reportRichMediaAdViolation(@NonNull String str, @NonNull Map<String, List<String>> map, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @Nullable String str6, @NonNull String str7, @NonNull List<String> list) {
        send(this.adQualityViolationReportMapper.m39319b(str, map, str2, str3, str4, str5, str6 == null ? "" : str6, "", "", "", str7, list, System.currentTimeMillis()));
    }

    public void reportRichMediaAdViolation(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @Nullable String str6, @NonNull String str7, @NonNull List<String> list, @NonNull String str8, @Nullable String str9) {
        send(this.adQualityViolationReportMapper.m39320a(str, str2, str3, str4, str5, str6 == null ? "" : str6, "", "", "", str7, list, System.currentTimeMillis(), str8, str9));
    }

    public void reportAdTrackerViolation(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull String str7, @NonNull List<String> list, @NonNull String str8, @Nullable String str9) {
        try {
            send(this.adQualityViolationReportMapper.m39320a(str, str2, str3, str4, str5, str6, str7, !str7.isEmpty() ? "" : str6, "", "", list, System.currentTimeMillis(), str8, str9));
        } catch (Exception e) {
            this.logger.error(LogDomain.CORE, "failed to create ad quality violation report", e);
        }
    }
}
