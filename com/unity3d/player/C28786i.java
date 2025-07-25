package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: com.unity3d.player.i */
/* loaded from: classes7.dex */
class C28786i implements InterfaceC28797t {

    /* renamed from: d */
    private static C28786i f74849d;

    /* renamed from: a */
    private AssetPackManager f74850a;

    /* renamed from: b */
    private HashSet f74851b;

    /* renamed from: c */
    private Object f74852c;

    private C28786i(Context context) {
        if (f74849d == null) {
            this.f74850a = AssetPackManagerFactory.getInstance(context);
            this.f74851b = new HashSet();
            return;
        }
        throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static int m37632a(Throwable th) {
        while (!(th instanceof AssetPackException)) {
            th = th.getCause();
            if (th == null) {
                return -100;
            }
        }
        return ((AssetPackException) th).getErrorCode();
    }

    /* renamed from: b */
    public void m37627b(String str) {
        this.f74850a.removePack(str);
    }

    /* renamed from: a */
    public static InterfaceC28797t m37637a(Context context) {
        if (f74849d == null) {
            f74849d = new C28786i(context);
        }
        return f74849d;
    }

    /* renamed from: a */
    public String m37633a(String str) {
        AssetPackLocation packLocation = this.f74850a.getPackLocation(str);
        return packLocation == null ? "" : packLocation.assetsPath();
    }

    /* renamed from: a */
    public void m37638a(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.f74850a.showCellularDataConfirmation(activity).addOnSuccessListener(new C28782e(iAssetPackManagerMobileDataConfirmationCallback));
    }

    /* renamed from: a */
    public void m37634a(Object obj) {
        if (obj instanceof C28779c) {
            this.f74850a.unregisterListener((C28779c) obj);
        }
    }

    /* renamed from: a */
    public void m37631a(String[] strArr) {
        this.f74850a.cancel(Arrays.asList(strArr));
    }

    /* renamed from: a */
    public void m37630a(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        for (String str : strArr) {
            this.f74850a.getPackStates(Collections.singletonList(str)).addOnCompleteListener(new C28783f(iAssetPackManagerDownloadStatusCallback, str));
        }
    }

    /* renamed from: a */
    public void m37629a(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        this.f74850a.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C28785h(iAssetPackManagerStatusQueryCallback, strArr));
    }

    /* renamed from: a */
    public Object m37636a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        C28779c c28779c = new C28779c(this, iAssetPackManagerDownloadStatusCallback, Looper.myLooper());
        this.f74850a.registerListener(c28779c);
        return c28779c;
    }
}
