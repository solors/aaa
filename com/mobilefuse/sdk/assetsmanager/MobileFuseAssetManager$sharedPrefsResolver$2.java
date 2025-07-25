package com.mobilefuse.sdk.assetsmanager;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseAssetManager.kt */
@Metadata
/* loaded from: classes7.dex */
final class MobileFuseAssetManager$sharedPrefsResolver$2 extends Lambda implements Functions<AssetSharedPrefsResolver> {
    public static final MobileFuseAssetManager$sharedPrefsResolver$2 INSTANCE = new MobileFuseAssetManager$sharedPrefsResolver$2();

    MobileFuseAssetManager$sharedPrefsResolver$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final AssetSharedPrefsResolver invoke() {
        return new AssetSharedPrefsResolver();
    }
}
