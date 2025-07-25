package com.vungle.ads.internal.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.WorkerThread;
import com.iab.omid.library.vungle.Omid;
import com.pubmatic.sdk.omsdk.POBOMSDKUtil;
import com.vungle.ads.internal.util.C29518o;
import com.vungle.ads.internal.util.FileUtility;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.omsdk.c */
/* loaded from: classes7.dex */
public final class OMInjector {
    @NotNull
    public static final C29383a Companion = new C29383a(null);
    @NotNull
    private static final String OM_SDK_JS = "omsdk.js";
    @NotNull
    private static final String OM_SESSION_JS = "omsdk-session.js";
    @NotNull
    private final AtomicReference<Context> contextRef;
    @NotNull
    private final Handler uiHandler;

    /* compiled from: OMInjector.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.omsdk.c$a */
    /* loaded from: classes7.dex */
    public static final class C29383a {
        private C29383a() {
        }

        public /* synthetic */ C29383a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OMInjector(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.contextRef = new AtomicReference<>(context.getApplicationContext());
    }

    /* renamed from: init$lambda-0 */
    public static final void m110346init$lambda0(OMInjector this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (!Omid.isActive()) {
                Omid.activate(this$0.contextRef.get());
            }
        } catch (NoClassDefFoundError e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37467e(POBOMSDKUtil.TAG, "error: " + e.getLocalizedMessage());
        }
    }

    private final File writeToFile(String str, File file) throws IOException {
        FileWriter fileWriter;
        FileWriter fileWriter2 = null;
        try {
            fileWriter = new FileWriter(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileWriter.write(str);
            fileWriter.flush();
            FileUtility.INSTANCE.closeQuietly(fileWriter);
            return file;
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            FileUtility.INSTANCE.closeQuietly(fileWriter2);
            throw th;
        }
    }

    public final void init() {
        this.uiHandler.post(new Runnable() { // from class: com.vungle.ads.internal.omsdk.b
            {
                OMInjector.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                OMInjector.m110346init$lambda0(OMInjector.this);
            }
        });
    }

    @WorkerThread
    @NotNull
    public final List<File> injectJsFiles(@NotNull File dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        ArrayList arrayList = new ArrayList();
        Res res = Res.INSTANCE;
        arrayList.add(writeToFile(res.getOM_JS$vungle_ads_release(), new File(dir, OM_SDK_JS)));
        arrayList.add(writeToFile(res.getOM_SESSION_JS$vungle_ads_release(), new File(dir, OM_SESSION_JS)));
        return arrayList;
    }
}
