package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p687v1.ClientInfoOuterClass;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidMediationRepository.kt */
@Metadata
/* loaded from: classes7.dex */
final class AndroidMediationRepository$mediationProvider$1 extends Lambda implements Functions<ClientInfoOuterClass.MediationProvider> {
    final /* synthetic */ AndroidMediationRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMediationRepository$mediationProvider$1(AndroidMediationRepository androidMediationRepository) {
        super(0);
        this.this$0 = androidMediationRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final ClientInfoOuterClass.MediationProvider invoke() {
        boolean m16624M;
        boolean m16615y;
        boolean m16615y2;
        boolean m16615y3;
        ClientInfoOuterClass.MediationProvider mediationProvider;
        String name = this.this$0.getName();
        if (name != null) {
            m16624M = StringsJVM.m16624M(name, "AppLovinSdk_", false, 2, null);
            if (m16624M) {
                mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
            } else {
                m16615y = StringsJVM.m16615y(name, "AdMob", true);
                if (m16615y) {
                    mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_ADMOB;
                } else {
                    m16615y2 = StringsJVM.m16615y(name, "MAX", true);
                    if (m16615y2) {
                        mediationProvider = ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_MAX;
                    } else {
                        m16615y3 = StringsJVM.m16615y(name, "ironSource", true);
                        mediationProvider = m16615y3 ? ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_LEVELPLAY : ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM;
                    }
                }
            }
            if (mediationProvider != null) {
                return mediationProvider;
            }
        }
        return ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}
