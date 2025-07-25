package com.inmobi.media;

import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.M */
/* loaded from: classes6.dex */
public final class C19013M extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ C19026N f47454a;

    /* renamed from: b */
    public final /* synthetic */ AdQualityResult f47455b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19013M(C19026N c19026n, AdQualityResult adQualityResult) {
        super(1);
        this.f47454a = c19026n;
        this.f47455b = adQualityResult;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C19023M9 c19023m9;
        C19023M9 c19023m92;
        C18896D8 c18896d8 = (C18896D8) obj;
        if (EnumC19506w3.f48793d.equals(c18896d8)) {
            Intrinsics.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
            Intrinsics.checkNotNullParameter("no network... skipping cleanup", "message");
            Log.i("AdQualityBeaconExecutor", "no network... skipping cleanup");
        } else {
            Intrinsics.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
            Intrinsics.checkNotNullParameter("beacon hit completed... cleaning up", "message");
            Log.i("AdQualityBeaconExecutor", "beacon hit completed... cleaning up");
            if (c18896d8 == null) {
                WeakReference weakReference = (WeakReference) this.f47454a.f47535d.get(this.f47455b.getBeaconUrl());
                if (weakReference != null && (c19023m92 = (C19023M9) weakReference.get()) != null) {
                    c19023m92.f47517a.m60706b("window.mraidview.broadcastEvent('AdReportSuccess')");
                }
            } else {
                WeakReference weakReference2 = (WeakReference) this.f47454a.f47535d.get(this.f47455b.getBeaconUrl());
                if (weakReference2 != null && (c19023m9 = (C19023M9) weakReference2.get()) != null) {
                    c19023m9.f47517a.m60706b("window.mraidview.broadcastEvent('AdReportFailed')");
                }
            }
            C19026N c19026n = this.f47454a;
            AdQualityResult result = this.f47455b;
            c19026n.getClass();
            Intrinsics.checkNotNullParameter(result, "result");
            try {
                ScheduledExecutorService scheduledExecutorService = C19052P.f47602a;
                C19090S c19090s = (C19090S) AbstractC19541ya.f48937a.getValue();
                c19090s.getClass();
                Intrinsics.checkNotNullParameter(result, "result");
                Log.i("AdQualityDao", "de-queueing");
                c19090s.m59591a("image_location=?", new String[]{result.getImageLocation()});
                if (c19090s.f47672b != null) {
                    Log.i("AdQualityDao", "sending callback - dequeue");
                }
                if (result.getImageLocation().length() == 0) {
                    Intrinsics.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                    Intrinsics.checkNotNullParameter("no image to clear. clean up done.", "message");
                    Log.i("AdQualityBeaconExecutor", "no image to clear. clean up done.");
                } else {
                    File file = new File(result.getImageLocation());
                    Intrinsics.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                    Intrinsics.checkNotNullParameter("deleting file", "message");
                    Log.i("AdQualityBeaconExecutor", "deleting file");
                    String message = "delete file result - " + file.delete();
                    Intrinsics.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                    Intrinsics.checkNotNullParameter(message, "message");
                    Log.i("AdQualityBeaconExecutor", message);
                }
            } catch (Exception e) {
                Intrinsics.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
                Intrinsics.checkNotNullParameter("exception while cleanup", "message");
                Log.e("AdQualityBeaconExecutor", "exception while cleanup", e);
            }
        }
        return Unit.f99208a;
    }
}
