package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.p687v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: UniversalRequestTtlValidator.kt */
@Metadata
/* loaded from: classes7.dex */
public interface UniversalRequestTtlValidator {
    boolean invoke(@NotNull UniversalRequestOuterClass.UniversalRequest universalRequest, @NotNull RequestPolicy requestPolicy);
}
