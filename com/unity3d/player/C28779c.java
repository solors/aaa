package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.c */
/* loaded from: classes7.dex */
public class C28779c implements AssetPackStateUpdateListener {

    /* renamed from: a */
    private HashSet f74831a;

    /* renamed from: b */
    private Looper f74832b;

    /* renamed from: c */
    final /* synthetic */ C28786i f74833c;

    public C28779c(C28786i c28786i, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, Looper looper) {
        this.f74833c = c28786i;
        HashSet hashSet = new HashSet();
        this.f74831a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
        this.f74832b = looper;
    }

    public void onStateUpdate(Object obj) {
        C28786i c28786i;
        HashSet hashSet;
        HashSet hashSet2;
        Object obj2;
        AssetPackManager assetPackManager;
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                c28786i = C28786i.f74849d;
                synchronized (c28786i) {
                    hashSet = this.f74833c.f74851b;
                    hashSet.remove(assetPackState.name());
                    hashSet2 = this.f74833c.f74851b;
                    if (hashSet2.isEmpty()) {
                        C28786i c28786i2 = this.f74833c;
                        obj2 = c28786i2.f74852c;
                        if (obj2 instanceof C28779c) {
                            assetPackManager = c28786i2.f74850a;
                            assetPackManager.unregisterListener((C28779c) obj2);
                        }
                        this.f74833c.f74852c = null;
                    }
                }
            }
            if (this.f74831a.size() != 0) {
                new Handler(this.f74832b).post(new RunnableC28777b((Set) this.f74831a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
            }
        }
    }
}
