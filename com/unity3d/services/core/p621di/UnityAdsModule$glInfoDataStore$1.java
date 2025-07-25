package com.unity3d.services.core.p621di;

import android.content.Context;
import com.unity3d.ads.core.extensions.ContextExtensions;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: UnityAdsModule.kt */
@Metadata
/* renamed from: com.unity3d.services.core.di.UnityAdsModule$glInfoDataStore$1 */
/* loaded from: classes7.dex */
final class UnityAdsModule$glInfoDataStore$1 extends Lambda implements Functions<File> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsModule$glInfoDataStore$1(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final File invoke() {
        return ContextExtensions.unityAdsDataStoreFile(this.$context, ServiceProvider.DATA_STORE_GL_INFO);
    }
}
