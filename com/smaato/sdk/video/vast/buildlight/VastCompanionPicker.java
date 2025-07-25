package com.smaato.sdk.video.vast.buildlight;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.buildlight.compare.SizeComparator;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.CompanionAds;
import com.smaato.sdk.video.vast.model.Creative;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public class VastCompanionPicker {
    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.smaato.sdk.video.vast.model.Companion pickCompanion(@androidx.annotation.NonNull com.smaato.sdk.video.vast.model.CompanionAds r2, @androidx.annotation.NonNull com.smaato.sdk.video.vast.buildlight.VastConfigurationSettings r3) {
        /*
            r1 = this;
            java.lang.String r0 = "Parameter companionAds should not be null for VastCompanionPicker::pickCompanion"
            com.smaato.sdk.core.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "Parameter vastConfigurationSettings should not be null for VastCompanionPicker::pickCompanion"
            com.smaato.sdk.core.util.Objects.requireNonNull(r3, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.smaato.sdk.video.vast.model.Companion> r2 = r2.companions
            r0.<init>(r2)
            com.smaato.sdk.video.vast.buildlight.compare.SizeComparator r2 = new com.smaato.sdk.video.vast.buildlight.compare.SizeComparator
            r2.<init>(r3)
            java.util.Collections.sort(r0, r2)
            java.util.Iterator r2 = r0.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            com.smaato.sdk.video.vast.model.Companion r3 = (com.smaato.sdk.video.vast.model.Companion) r3
            java.util.List<com.smaato.sdk.video.vast.model.StaticResource> r0 = r3.staticResources
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L43
            java.util.List<java.lang.String> r0 = r3.iFrameResources
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L43
            java.util.List<java.lang.String> r0 = r3.htmlResources
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            goto L43
        L42:
            r3 = 0
        L43:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.buildlight.VastCompanionPicker.pickCompanion(com.smaato.sdk.video.vast.model.CompanionAds, com.smaato.sdk.video.vast.buildlight.VastConfigurationSettings):com.smaato.sdk.video.vast.model.Companion");
    }

    @Nullable
    public Companion pickCompanion(@NonNull List<Creative> list, @NonNull VastConfigurationSettings vastConfigurationSettings) {
        Companion pickCompanion;
        Objects.requireNonNull(list, "Parameter creatives should not be null for VastCompanionPicker::pickCompanion");
        Objects.requireNonNull(vastConfigurationSettings, "Parameter vastConfigurationSettings should not be null for VastCompanionPicker::pickCompanion");
        ArrayList arrayList = new ArrayList();
        for (Creative creative : list) {
            CompanionAds companionAds = creative.companionAds;
            if (companionAds != null && (pickCompanion = pickCompanion(companionAds, vastConfigurationSettings)) != null) {
                arrayList.add(pickCompanion);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Collections.sort(arrayList, new SizeComparator(vastConfigurationSettings));
        return (Companion) arrayList.get(0);
    }
}
