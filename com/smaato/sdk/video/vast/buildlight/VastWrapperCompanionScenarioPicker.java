package com.smaato.sdk.video.vast.buildlight;

/* loaded from: classes7.dex */
public class VastWrapperCompanionScenarioPicker {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.smaato.sdk.video.vast.model.VastCompanionScenario pickWrapperCompanionScenario(@androidx.annotation.NonNull com.smaato.sdk.video.vast.model.UniversalAdId r7, @androidx.annotation.NonNull java.util.List<com.smaato.sdk.video.vast.model.VastCompanionScenario> r8, @androidx.annotation.NonNull com.smaato.sdk.video.vast.buildlight.VastConfigurationSettings r9) {
        /*
            r6 = this;
            java.lang.String r0 = "Parameter universalAdId should not be null for VastWrapperCompanionScenarioPicker::pickWrapperCompanionScenario"
            com.smaato.sdk.core.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "Parameter wrapperVastCompanionScenarios should not be null for VastWrapperCompanionScenarioPicker::pickWrapperCompanionScenario"
            com.smaato.sdk.core.util.Objects.requireNonNull(r8, r0)
            java.lang.String r0 = "Parameter vastConfigurationSettings should not be null for VastWrapperCompanionScenarioPicker::pickWrapperCompanionScenario"
            com.smaato.sdk.core.util.Objects.requireNonNull(r9, r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L17
            r7 = 0
            return r7
        L17:
            com.smaato.sdk.video.vast.model.UniversalAdId r0 = com.smaato.sdk.video.vast.model.UniversalAdId.DEFAULT
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L25
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r8)
            goto L72
        L25:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r8.iterator()
        L33:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r2.next()
            com.smaato.sdk.video.vast.model.VastCompanionScenario r3 = (com.smaato.sdk.video.vast.model.VastCompanionScenario) r3
            com.smaato.sdk.video.vast.model.VastScenarioCreativeData r4 = r3.vastScenarioCreativeData
            com.smaato.sdk.video.vast.model.UniversalAdId r4 = r4.universalAdId
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L4d
            r0.add(r3)
            goto L33
        L4d:
            com.smaato.sdk.video.vast.model.VastScenarioCreativeData r4 = r3.vastScenarioCreativeData
            com.smaato.sdk.video.vast.model.UniversalAdId r4 = r4.universalAdId
            com.smaato.sdk.video.vast.model.UniversalAdId r5 = com.smaato.sdk.video.vast.model.UniversalAdId.DEFAULT
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L33
            r1.add(r3)
            goto L33
        L5d:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L71
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L6f
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r8)
            goto L72
        L6f:
            r7 = r1
            goto L72
        L71:
            r7 = r0
        L72:
            com.smaato.sdk.video.vast.buildlight.compare.SizeComparator r8 = new com.smaato.sdk.video.vast.buildlight.compare.SizeComparator
            r8.<init>(r9)
            java.util.Collections.sort(r7, r8)
            java.util.Iterator r8 = r7.iterator()
        L7e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L99
            java.lang.Object r9 = r8.next()
            com.smaato.sdk.video.vast.model.VastCompanionScenario r9 = (com.smaato.sdk.video.vast.model.VastCompanionScenario) r9
            com.smaato.sdk.video.vast.model.VastScenarioResourceData r0 = r9.resourceData
            com.smaato.sdk.video.vast.model.StaticResource r1 = r0.staticResources
            if (r1 != 0) goto L98
            java.lang.String r1 = r0.iFrameResources
            if (r1 != 0) goto L98
            java.lang.String r0 = r0.htmlResources
            if (r0 == 0) goto L7e
        L98:
            return r9
        L99:
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            com.smaato.sdk.video.vast.model.VastCompanionScenario r7 = (com.smaato.sdk.video.vast.model.VastCompanionScenario) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.buildlight.VastWrapperCompanionScenarioPicker.pickWrapperCompanionScenario(com.smaato.sdk.video.vast.model.UniversalAdId, java.util.List, com.smaato.sdk.video.vast.buildlight.VastConfigurationSettings):com.smaato.sdk.video.vast.model.VastCompanionScenario");
    }
}
