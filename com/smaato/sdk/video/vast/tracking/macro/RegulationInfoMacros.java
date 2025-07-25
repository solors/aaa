package com.smaato.sdk.video.vast.tracking.macro;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.gdpr.SomaGdprData;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p574fi.Supplier;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.video.vast.tracking.macro.f0 */
/* loaded from: classes7.dex */
public final class RegulationInfoMacros {
    @NonNull

    /* renamed from: a */
    private final SomaGdprDataSource f72840a;
    @NonNull

    /* renamed from: b */
    private final DataCollector f72841b;
    @NonNull

    /* renamed from: c */
    private final InterfaceC27964a f72842c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegulationInfoMacros.java */
    /* renamed from: com.smaato.sdk.video.vast.tracking.macro.f0$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC27964a extends Supplier<Boolean> {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegulationInfoMacros(@NonNull SomaGdprDataSource somaGdprDataSource, @NonNull DataCollector dataCollector, @NonNull InterfaceC27964a interfaceC27964a) {
        this.f72840a = (SomaGdprDataSource) Objects.requireNonNull(somaGdprDataSource);
        this.f72841b = (DataCollector) Objects.requireNonNull(dataCollector);
        this.f72842c = (InterfaceC27964a) Objects.requireNonNull(interfaceC27964a);
    }

    @NonNull
    /* renamed from: a */
    private String m38709a(@NonNull SomaGdprData somaGdprData) {
        String consentString = somaGdprData.getConsentString();
        if (TextUtils.isEmpty(consentString)) {
            return "-2";
        }
        return consentString;
    }

    @NonNull
    /* renamed from: b */
    private String m38708b() {
        Boolean isGoogleLimitAdTrackingEnabled = this.f72841b.getSystemInfo().isGoogleLimitAdTrackingEnabled();
        if (isGoogleLimitAdTrackingEnabled == null) {
            return "-2";
        }
        if (isGoogleLimitAdTrackingEnabled.booleanValue()) {
            return "1";
        }
        return "0";
    }

    @NonNull
    /* renamed from: c */
    private String m38707c(@NonNull SomaGdprData somaGdprData) {
        ArrayList arrayList = new ArrayList();
        if (this.f72842c.get().booleanValue()) {
            arrayList.add("coppa");
        }
        Boolean isGdprEnabled = somaGdprData.isGdprEnabled();
        if (!somaGdprData.getConsentString().isEmpty() || (isGdprEnabled != null && isGdprEnabled.booleanValue())) {
            arrayList.add("gdpr");
        }
        if (arrayList.isEmpty()) {
            return "-2";
        }
        return Joiner.join(",", arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: d */
    public Map<String, String> m38706d() {
        SomaGdprData somaGdprData = this.f72840a.getSomaGdprData();
        return Maps.mapOf(Maps.entryOf("[LIMITADTRACKING]", m38708b()), Maps.entryOf("[REGULATIONS]", m38707c(somaGdprData)), Maps.entryOf("[GDPRCONSENT]", m38709a(somaGdprData)));
    }
}
