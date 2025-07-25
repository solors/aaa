package com.mobilefuse.sdk.assetsmanager;

import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.network.client.HttpGetRequest;
import com.mobilefuse.sdk.p543rx.Flow;
import com.mobilefuse.sdk.p543rx.FlowKt;
import com.vungle.ads.internal.Constants;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1046xd.C44980k;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: MobileFuseAssetManagerService.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFuseAssetManagerService {
    @NotNull
    private final String ASSET_FOLDER_NAME = "mobilefusecdn/assets";
    @NotNull
    private final List<String> DEFAULT_ASSETS_LIST;

    public MobileFuseAssetManagerService() {
        List<String> m17163p;
        m17163p = C37563v.m17163p(Constants.AD_MRAID_JS_FILE_NAME, "vast.js", "vast_controls.html", "vast_static_resource.html", "ad_template.html", "ad_close_controls.html", "ad_close_controls.js", "close_button.js");
        this.DEFAULT_ASSETS_LIST = m17163p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveFile(byte[] bArr, String str) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            File file = new File(AppLifecycleHelper.getGlobalContext().getFilesDir(), this.ASSET_FOLDER_NAME);
            if (!file.exists()) {
                file.mkdirs();
            }
            C44980k.m1183j(new File(file, str), bArr);
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    @NotNull
    public final String getASSET_FOLDER_NAME() {
        return this.ASSET_FOLDER_NAME;
    }

    @NotNull
    public final Flow<Either<BaseError, MobileFuseAssetManifestResponse>> getAssetManifestJson(@NotNull HttpGetRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.flow(new C23474xd175c928(FlowKt.flow(new C23476x3c9f765(FlowKt.flow(new C23468xef746608(FlowKt.flow(new C23478xe17d4400(FlowKt.flow(new MobileFuseAssetManagerService$getAssetManifestJson$1(request)))), Schedulers.IO))))));
    }

    @NotNull
    public final List<String> getDEFAULT_ASSETS_LIST() {
        return this.DEFAULT_ASSETS_LIST;
    }

    @NotNull
    public final Flow<Boolean> resolveAssetPath(@NotNull String url, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return FlowKt.flow(new C23483xe8594410(FlowKt.flow(new C23471xef746609(FlowKt.flow(new MobileFuseAssetManagerService$resolveAssetPath$1(this, url, fileName)), Schedulers.IO))));
    }
}
