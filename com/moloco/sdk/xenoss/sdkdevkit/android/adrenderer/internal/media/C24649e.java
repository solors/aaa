package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import android.content.Context;
import com.moloco.sdk.internal.AbstractC24405t;
import com.moloco.sdk.internal.C23993l;
import com.moloco.sdk.internal.MolocoLogger;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e */
/* loaded from: classes7.dex */
public final class C24649e implements InterfaceC24648d {
    @NotNull

    /* renamed from: a */
    public final Context f63680a;
    @NotNull

    /* renamed from: b */
    public final String f63681b;
    @NotNull

    /* renamed from: c */
    public final String f63682c;

    public C24649e(@NotNull Context appContext, @NotNull String cacheDir) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        this.f63680a = appContext;
        this.f63681b = cacheDir;
        this.f63682c = "MediaCacheLocationProviderImpl";
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.InterfaceC24648d
    @NotNull
    /* renamed from: a */
    public AbstractC24405t<File, C23993l> mo45967a() {
        try {
            File externalCacheDir = this.f63680a.getExternalCacheDir();
            if (externalCacheDir != null) {
                File file = new File(externalCacheDir, this.f63681b);
                file.mkdir();
                if (file.exists()) {
                    return new AbstractC24405t.C24407b(file);
                }
            }
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, this.f63682c, "Failed to create cache directory in external storage", null, false, 12, null);
            return new AbstractC24405t.C24406a(new C23993l("Failed to create cache directory in external storage", 102));
        } catch (IOException e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f63682c, "Failed to create cache directory in external storage", e, false, 8, null);
            return new AbstractC24405t.C24406a(new C23993l("Failed to create cache directory in external storage", 101));
        } catch (SecurityException e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f63682c, "Failed to create cache directory in external storage", e2, false, 8, null);
            return new AbstractC24405t.C24406a(new C23993l("Failed to create cache directory in external storage", 100));
        } catch (Exception e3) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f63682c, "Failed to create cache directory in external storage", e3, false, 8, null);
            return new AbstractC24405t.C24406a(new C23993l("Failed to create cache directory in external storage", 200));
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.InterfaceC24648d
    @NotNull
    /* renamed from: b */
    public AbstractC24405t<File, C23993l> mo45966b() {
        try {
            if (this.f63680a.getCacheDir() != null) {
                File file = new File(this.f63680a.getCacheDir(), this.f63681b);
                file.mkdir();
                if (file.exists()) {
                    MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.f63682c, "Able to write to internal storage cache directory", false, 4, null);
                    return new AbstractC24405t.C24407b(file);
                }
            }
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f63682c, "Failed to create cache directory in internal storage", null, false, 12, null);
            return new AbstractC24405t.C24406a(new C23993l("Failed to create cache directory in internal storage", 102));
        } catch (IOException e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f63682c, "Failed to create cache directory in external storage", e, false, 8, null);
            return new AbstractC24405t.C24406a(new C23993l("Failed to create cache directory in internal storage", 101));
        } catch (SecurityException e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f63682c, "Failed to create cache directory in external storage", e2, false, 8, null);
            return new AbstractC24405t.C24406a(new C23993l("Failed to create cache directory in internal storage", 100));
        } catch (Exception e3) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f63682c, "Failed to create cache directory in external storage", e3, false, 8, null);
            return new AbstractC24405t.C24406a(new C23993l("Failed to create cache directory in internal storage", 200));
        }
    }
}
