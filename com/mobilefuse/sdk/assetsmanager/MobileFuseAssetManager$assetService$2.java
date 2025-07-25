package com.mobilefuse.sdk.assetsmanager;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseAssetManager.kt */
@Metadata
/* loaded from: classes7.dex */
final class MobileFuseAssetManager$assetService$2 extends Lambda implements Functions<MobileFuseAssetManagerService> {
    public static final MobileFuseAssetManager$assetService$2 INSTANCE = new MobileFuseAssetManager$assetService$2();

    MobileFuseAssetManager$assetService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final MobileFuseAssetManagerService invoke() {
        return new MobileFuseAssetManagerService();
    }
}
