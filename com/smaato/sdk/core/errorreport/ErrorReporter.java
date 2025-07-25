package com.smaato.sdk.core.errorreport;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.Call;
import com.smaato.sdk.core.network.Callback;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.util.Objects;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class ErrorReporter {
    @NonNull
    private final HttpClient httpClient;
    @NonNull
    private final Logger logger;
    @NonNull
    private final String reportingUrl;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.smaato.sdk.core.errorreport.ErrorReporter$a */
    /* loaded from: classes7.dex */
    public class C27103a implements Callback {
        C27103a() {
        }

        @Override // com.smaato.sdk.core.network.Callback
        public void onFailure(@NonNull Call call, @NonNull Exception exc) {
            ErrorReporter.this.logger.error(LogDomain.UNIFIED_BIDDING, "Error report request failed: %s", exc);
        }

        @Override // com.smaato.sdk.core.network.Callback
        public void onResponse(@NonNull Call call, @NonNull Response response) {
            int responseCode = response.responseCode();
            if (responseCode >= 200 && responseCode < 300) {
                ErrorReporter.this.logger.debug(LogDomain.UNIFIED_BIDDING, "Error report request has been accepted by server", new Object[0]);
            } else {
                ErrorReporter.this.logger.error(LogDomain.UNIFIED_BIDDING, "Error report request has not been accepted, response code: %d", Integer.valueOf(responseCode));
            }
        }
    }

    public ErrorReporter(@NonNull Logger logger, @NonNull HttpClient httpClient, @NonNull String str) {
        this.logger = (Logger) Objects.requireNonNull(logger);
        HttpClient.Builder buildUpon = ((HttpClient) Objects.requireNonNull(httpClient)).buildUpon();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.httpClient = buildUpon.connectTimeout(15000L, timeUnit).readTimeout(15000L, timeUnit).build();
        this.reportingUrl = (String) Objects.requireNonNull(str);
    }

    private void send(@NonNull Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.reportingUrl).buildUpon();
        for (String str : map.keySet()) {
            buildUpon.appendQueryParameter(str, map.get(str));
        }
        this.httpClient.newCall(Request.get(buildUpon.toString())).enqueue(new C27103a());
    }

    public void report(@NonNull Report report) {
        if (report.canBeSent()) {
            send(report.toQuery());
        }
    }
}
