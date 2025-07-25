package com.smaato.sdk.core.network.interceptors;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.kpi.KpiDBHelper;
import com.smaato.sdk.core.network.Request;

/* loaded from: classes7.dex */
public class SomaKpiDataInterceptor extends KpiDataInterceptor {
    public SomaKpiDataInterceptor(@NonNull KpiDBHelper kpiDBHelper) {
        this.kpiDBHelper = kpiDBHelper;
    }

    @Override // com.smaato.sdk.core.network.interceptors.KpiDataInterceptor
    @Nullable
    protected String getAdSpaceId(Request request) {
        return request.uri().getQueryParameter("adspace");
    }
}
