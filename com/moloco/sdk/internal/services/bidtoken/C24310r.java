package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.r */
/* loaded from: classes7.dex */
public final class C24310r implements InterfaceC24311s {
    @Override // com.moloco.sdk.internal.services.bidtoken.InterfaceC24311s
    @NotNull
    public MolocoPrivacy.PrivacySettings getPrivacy() {
        return MolocoPrivacy.INSTANCE.getPrivacySettings();
    }
}
