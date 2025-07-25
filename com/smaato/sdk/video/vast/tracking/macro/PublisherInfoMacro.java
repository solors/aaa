package com.smaato.sdk.video.vast.tracking.macro;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Maps;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.video.vast.tracking.macro.e0 */
/* loaded from: classes7.dex */
public final class PublisherInfoMacro {
    @NonNull

    /* renamed from: a */
    private final DataCollector f72839a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PublisherInfoMacro(@NonNull DataCollector dataCollector) {
        this.f72839a = (DataCollector) Objects.requireNonNull(dataCollector);
    }

    @NonNull
    /* renamed from: a */
    private String m38711a() {
        String packageName = this.f72839a.getSystemInfo().getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return "-2";
        }
        return packageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public Map<String, String> m38710b() {
        return Maps.mapOf(Maps.entryOf("[DOMAIN]", "-1"), Maps.entryOf("[PAGEURL]", "-1"), Maps.entryOf("[APPBUNDLE]", m38711a()));
    }
}
