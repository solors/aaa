package com.unity3d.ads.core.domain.p619om;

import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CommonGetOmData.kt */
@Metadata
/* renamed from: com.unity3d.ads.core.domain.om.CommonGetOmData */
/* loaded from: classes7.dex */
public final class CommonGetOmData implements GetOmData {
    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(@NotNull OpenMeasurementRepository openMeasurementRepository) {
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.p619om.GetOmData
    @Nullable
    public Object invoke(@NotNull Continuation<? super OMData> continuation) {
        return this.openMeasurementRepository.getOmData();
    }
}
