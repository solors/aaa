package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import gatewayprotocol.p687v1.TestDataKt;
import gatewayprotocol.p687v1.TestDataOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidTestDataInfo.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidTestDataInfo implements GetTestDataInfo {
    @NotNull
    private final AndroidManifestIntPropertyReader androidManifestIntPropertyReader;

    public AndroidTestDataInfo(@NotNull AndroidManifestIntPropertyReader androidManifestIntPropertyReader) {
        Intrinsics.checkNotNullParameter(androidManifestIntPropertyReader, "androidManifestIntPropertyReader");
        this.androidManifestIntPropertyReader = androidManifestIntPropertyReader;
    }

    @Override // com.unity3d.ads.core.domain.GetTestDataInfo
    @NotNull
    public TestDataOuterClass.TestData invoke() {
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder newBuilder = TestDataOuterClass.TestData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        TestDataKt.Dsl _create = companion._create(newBuilder);
        Integer propertyByName = this.androidManifestIntPropertyReader.getPropertyByName("ExchangeTestMode");
        if (propertyByName != null) {
            _create.setForceExchangeTestMode(propertyByName.intValue());
        }
        return _create._build();
    }
}
