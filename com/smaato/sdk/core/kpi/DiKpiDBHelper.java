package com.smaato.sdk.core.kpi;

import android.content.Context;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p569di.ClassFactory;
import com.smaato.sdk.core.p569di.DiConstructor;
import com.smaato.sdk.core.p569di.DiRegistry;
import com.smaato.sdk.core.util.p574fi.Consumer;

/* loaded from: classes7.dex */
public class DiKpiDBHelper {
    private DiKpiDBHelper() {
    }

    @NonNull
    public static DiRegistry createRegistry(final Context context, final boolean z) {
        return DiRegistry.m39638of(new Consumer() { // from class: com.smaato.sdk.core.kpi.c
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                DiKpiDBHelper.lambda$createRegistry$1(context, z, (DiRegistry) obj);
            }
        });
    }

    public static /* synthetic */ KpiDBHelper lambda$createRegistry$0(Context context, boolean z, DiConstructor diConstructor) {
        return new KpiDBHelper((Logger) diConstructor.get(Logger.class), context, z);
    }

    public static /* synthetic */ void lambda$createRegistry$1(final Context context, final boolean z, DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(KpiDBHelper.class, new ClassFactory() { // from class: com.smaato.sdk.core.kpi.b
            @Override // com.smaato.sdk.core.p569di.ClassFactory
            public final Object get(DiConstructor diConstructor) {
                KpiDBHelper lambda$createRegistry$0;
                lambda$createRegistry$0 = DiKpiDBHelper.lambda$createRegistry$0(context, z, diConstructor);
                return lambda$createRegistry$0;
            }
        });
    }
}
