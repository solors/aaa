package com.unity3d.ads.core.domain.p619om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonIsOMActivated.kt */
@Metadata
/* renamed from: com.unity3d.ads.core.domain.om.CommonIsOMActivated */
/* loaded from: classes7.dex */
public final class CommonIsOMActivated implements IsOMActivated {
    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonIsOMActivated(@NotNull OpenMeasurementRepository openMeasurementRepository) {
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.p619om.IsOMActivated
    public boolean invoke() {
        return this.openMeasurementRepository.isOMActive();
    }
}
