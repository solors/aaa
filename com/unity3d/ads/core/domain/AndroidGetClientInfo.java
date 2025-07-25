package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidGetClientInfo.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGetClientInfo implements GetClientInfo {
    @NotNull
    private final MediationRepository mediationRepository;
    @NotNull
    private final OmidManager omidManager;
    @NotNull
    private final ScarManager scarManager;
    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetClientInfo(@NotNull SessionRepository sessionRepository, @NotNull MediationRepository mediationRepository, @NotNull OmidManager omidManager, @NotNull ScarManager scarManager) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(mediationRepository, "mediationRepository");
        Intrinsics.checkNotNullParameter(omidManager, "omidManager");
        Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
        this.scarManager = scarManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super gatewayprotocol.p687v1.ClientInfoOuterClass.ClientInfo> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r1 = r0.L$2
            gatewayprotocol.v1.ClientInfoKt$Dsl r1 = (gatewayprotocol.p687v1.ClientInfoKt.Dsl) r1
            java.lang.Object r2 = r0.L$1
            gatewayprotocol.v1.ClientInfoKt$Dsl r2 = (gatewayprotocol.p687v1.ClientInfoKt.Dsl) r2
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.AndroidGetClientInfo r0 = (com.unity3d.ads.core.domain.AndroidGetClientInfo) r0
            p804nd.C38508r.m14539b(r7)
            goto Lb6
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3e:
            p804nd.C38508r.m14539b(r7)
            gatewayprotocol.v1.ClientInfoKt$Dsl$Companion r7 = gatewayprotocol.p687v1.ClientInfoKt.Dsl.Companion
            gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo$Builder r2 = gatewayprotocol.p687v1.ClientInfoOuterClass.ClientInfo.newBuilder()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            gatewayprotocol.v1.ClientInfoKt$Dsl r7 = r7._create(r2)
            r2 = 41302(0xa156, float:5.7876E-41)
            r7.setSdkVersion(r2)
            java.lang.String r2 = "4.13.2"
            r7.setSdkVersionName(r2)
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r6.sessionRepository
            java.lang.String r2 = r2.getGameId()
            if (r2 == 0) goto L66
            r7.setGameId(r2)
        L66:
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r6.sessionRepository
            boolean r2 = r2.isTestModeEnabled()
            r7.setTest(r2)
            gatewayprotocol.v1.ClientInfoOuterClass$Platform r2 = gatewayprotocol.p687v1.ClientInfoOuterClass.Platform.PLATFORM_ANDROID
            r7.setPlatform(r2)
            com.unity3d.ads.core.data.repository.MediationRepository r2 = r6.mediationRepository
            kotlin.jvm.functions.Function0 r2 = r2.getMediationProvider()
            java.lang.Object r2 = r2.invoke()
            gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r2 = (gatewayprotocol.p687v1.ClientInfoOuterClass.MediationProvider) r2
            r7.setMediationProvider(r2)
            com.unity3d.ads.core.data.repository.MediationRepository r2 = r6.mediationRepository
            java.lang.String r2 = r2.getName()
            if (r2 == 0) goto L96
            gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r4 = r7.getMediationProvider()
            gatewayprotocol.v1.ClientInfoOuterClass$MediationProvider r5 = gatewayprotocol.p687v1.ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM
            if (r4 != r5) goto L96
            r7.setCustomMediationName(r2)
        L96:
            com.unity3d.ads.core.data.repository.MediationRepository r2 = r6.mediationRepository
            java.lang.String r2 = r2.getVersion()
            if (r2 == 0) goto La1
            r7.setMediationVersion(r2)
        La1:
            com.unity3d.ads.core.data.manager.ScarManager r2 = r6.scarManager
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r0 = r2.getVersion(r0)
            if (r0 != r1) goto Lb2
            return r1
        Lb2:
            r1 = r7
            r2 = r1
            r7 = r0
            r0 = r6
        Lb6:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto Lbd
            r1.setScarVersionName(r7)
        Lbd:
            com.unity3d.ads.core.data.manager.OmidManager r7 = r0.omidManager
            java.lang.String r7 = r7.getVersion()
            r1.setOmidVersion(r7)
            java.lang.String r7 = "1"
            r1.setOmidPartnerVersion(r7)
            boolean r7 = com.unity3d.services.core.properties.MadeWithUnityDetector.isMadeWithUnity()
            if (r7 == 0) goto Ld4
            java.lang.String r7 = "Unity"
            goto Ld6
        Ld4:
            java.lang.String r7 = ""
        Ld6:
            r1.setSdkDevelopmentPlatform(r7)
            gatewayprotocol.v1.ClientInfoOuterClass$ClientInfo r7 = r2._build()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetClientInfo.invoke(kotlin.coroutines.d):java.lang.Object");
    }
}
