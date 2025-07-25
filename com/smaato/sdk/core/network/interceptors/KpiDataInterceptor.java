package com.smaato.sdk.core.network.interceptors;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.kpi.KpiDBHelper;
import com.smaato.sdk.core.kpi.KpiData;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class KpiDataInterceptor implements Interceptor {
    @NonNull
    protected KpiDBHelper kpiDBHelper;

    private void fillKpiData(Uri.Builder builder, String str) {
        KpiData kpiValuesForAdSpace = this.kpiDBHelper.getKpiValuesForAdSpace(str);
        if (kpiValuesForAdSpace != null) {
            builder.appendQueryParameter("asfr", kpiValuesForAdSpace.getRollingFillRatePerAdSpace());
            builder.appendQueryParameter("appfr", kpiValuesForAdSpace.getTotalFillRate());
            builder.appendQueryParameter("totalreq", kpiValuesForAdSpace.getTotalAdRequests());
            builder.appendQueryParameter("session_depth", kpiValuesForAdSpace.getSessionDepthPerAdSpace());
        }
    }

    @Nullable
    protected abstract String getAdSpaceId(Request request);

    @Override // com.smaato.sdk.core.network.Interceptor
    @NonNull
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        boolean z;
        Request request = chain.request();
        Uri.Builder buildUpon = request.uri().buildUpon();
        String adSpaceId = getAdSpaceId(request);
        if (adSpaceId != null) {
            fillKpiData(buildUpon, adSpaceId);
            this.kpiDBHelper.incrementAdRequestCount(adSpaceId);
            try {
                Response proceed = chain.proceed(request.buildUpon().uri(buildUpon.build()).build());
                KpiDBHelper kpiDBHelper = this.kpiDBHelper;
                if (proceed.responseCode() == 200) {
                    z = true;
                } else {
                    z = false;
                }
                kpiDBHelper.updateFillAndFillRate(adSpaceId, z);
                return proceed;
            } catch (Exception e) {
                this.kpiDBHelper.updateFillAndFillRate(adSpaceId, false);
                throw e;
            }
        }
        throw new IllegalArgumentException("adspace id is null");
    }
}
