package io.appmetrica.analytics.impl;

import com.ironsource.C21114v8;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections._Collections;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.q5 */
/* loaded from: classes9.dex */
public final class C34823q5 implements ModuleAdRevenueProcessor, ModuleAdRevenueProcessorsHolder {

    /* renamed from: a */
    public final ArrayList f95208a = new ArrayList();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @NotNull
    public final String getDescription() {
        String m17521z0;
        ArrayList arrayList = this.f95208a;
        m17521z0 = _Collections.m17521z0(arrayList, null, "Composite processor with " + this.f95208a.size() + " children: [", C21114v8.C21123i.f54139e, 0, null, C34796p5.f95150a, 25, null);
        return m17521z0;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(@NotNull Object... objArr) {
        Object obj;
        boolean z;
        ModuleAdRevenueProcessor moduleAdRevenueProcessor;
        boolean process;
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Processing Ad Revenue for " + Arrays.toString(objArr), new Object[0]);
        Iterator it = this.f95208a.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                try {
                    process = ((ModuleAdRevenueProcessor) obj).process(Arrays.copyOf(objArr, objArr.length));
                    if (!process) {
                        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
                    }
                } catch (Throwable th) {
                    LoggerStorage.getMainPublicOrAnonymousLogger().error(th, "Got exception from processor " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
                }
                if (process) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((ModuleAdRevenueProcessor) obj) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + getDescription() + " since processor for " + Arrays.toString(objArr) + " was not found", new Object[0]);
        }
        return z;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder
    public final void register(@NotNull ModuleAdRevenueProcessor moduleAdRevenueProcessor) {
        this.f95208a.add(moduleAdRevenueProcessor);
    }
}
