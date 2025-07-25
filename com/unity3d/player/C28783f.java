package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.f */
/* loaded from: classes7.dex */
public class C28783f implements OnCompleteListener {

    /* renamed from: a */
    private IAssetPackManagerDownloadStatusCallback f74838a;

    /* renamed from: b */
    private Looper f74839b = Looper.myLooper();

    /* renamed from: c */
    private String f74840c;

    public C28783f(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String str) {
        this.f74838a = iAssetPackManagerDownloadStatusCallback;
        this.f74840c = str;
    }

    /* renamed from: a */
    private void m37639a(String str, int i, int i2, long j) {
        long j2;
        if (i == 4) {
            j2 = j;
        } else {
            j2 = 0;
        }
        new Handler(this.f74839b).post(new RunnableC28777b(Collections.singleton(this.f74838a), str, i, j, j2, 0, i2));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int m37632a;
        C28786i c28786i;
        C28786i c28786i2;
        Object obj;
        HashSet hashSet;
        HashSet hashSet2;
        AssetPackManager assetPackManager;
        AssetPackManager assetPackManager2;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map packStates = assetPackStates.packStates();
            if (packStates.size() == 0) {
                return;
            }
            for (AssetPackState assetPackState : packStates.values()) {
                if (assetPackState.errorCode() == 0 && assetPackState.status() != 4 && assetPackState.status() != 5 && assetPackState.status() != 0) {
                    c28786i = C28786i.f74849d;
                    String name = assetPackState.name();
                    IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.f74838a;
                    Looper looper = this.f74839b;
                    c28786i.getClass();
                    c28786i2 = C28786i.f74849d;
                    synchronized (c28786i2) {
                        obj = c28786i.f74852c;
                        if (obj == null) {
                            C28779c c28779c = new C28779c(c28786i, iAssetPackManagerDownloadStatusCallback, looper);
                            assetPackManager2 = c28786i.f74850a;
                            assetPackManager2.registerListener(c28779c);
                            c28786i.f74852c = c28779c;
                        } else {
                            C28779c c28779c2 = (C28779c) obj;
                            synchronized (c28779c2) {
                                hashSet = c28779c2.f74831a;
                                hashSet.add(iAssetPackManagerDownloadStatusCallback);
                            }
                        }
                        hashSet2 = c28786i.f74851b;
                        hashSet2.add(name);
                        assetPackManager = c28786i.f74850a;
                        assetPackManager.fetch(Collections.singletonList(name));
                    }
                } else {
                    m37639a(assetPackState.name(), assetPackState.status(), assetPackState.errorCode(), assetPackStates.totalBytes());
                }
            }
        } catch (RuntimeExecutionException e) {
            String str = this.f74840c;
            m37632a = C28786i.m37632a((Throwable) e);
            m37639a(str, 0, m37632a, 0L);
        }
    }
}
