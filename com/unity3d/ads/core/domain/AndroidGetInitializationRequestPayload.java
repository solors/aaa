package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidGetInitializationRequestPayload.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;
    @NotNull
    private final GetClientInfo getClientInfo;
    @NotNull
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetInitializationRequestPayload(@NotNull GetClientInfo getClientInfo, @NotNull SessionRepository sessionRepository, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull LegacyUserConsentRepository legacyUserConsentRepository) {
        Intrinsics.checkNotNullParameter(getClientInfo, "getClientInfo");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(legacyUserConsentRepository, "legacyUserConsentRepository");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f2  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super gatewayprotocol.p687v1.InitializationRequestOuterClass.InitializationRequest> r24) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload.invoke(kotlin.coroutines.d):java.lang.Object");
    }
}
