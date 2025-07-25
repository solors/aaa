package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.h */
/* loaded from: classes7.dex */
public class C28785h implements OnCompleteListener {

    /* renamed from: a */
    private IAssetPackManagerStatusQueryCallback f74846a;

    /* renamed from: b */
    private Looper f74847b = Looper.myLooper();

    /* renamed from: c */
    private String[] f74848c;

    public C28785h(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, String[] strArr) {
        this.f74846a = iAssetPackManagerStatusQueryCallback;
        this.f74848c = strArr;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        String[] strArr;
        int m37632a;
        int m37632a2;
        if (this.f74846a == null) {
            return;
        }
        int i = 0;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map packStates = assetPackStates.packStates();
            int size = packStates.size();
            String[] strArr2 = new String[size];
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (AssetPackState assetPackState : packStates.values()) {
                strArr2[i] = assetPackState.name();
                iArr[i] = assetPackState.status();
                iArr2[i] = assetPackState.errorCode();
                i++;
            }
            new Handler(this.f74847b).post(new RunnableC28784g(this.f74846a, assetPackStates.totalBytes(), strArr2, iArr, iArr2));
        } catch (RuntimeExecutionException e) {
            String message = e.getMessage();
            for (String str : this.f74848c) {
                if (message.contains(str)) {
                    m37632a2 = C28786i.m37632a((Throwable) e);
                    new Handler(this.f74847b).post(new RunnableC28784g(this.f74846a, 0L, new String[]{str}, new int[]{0}, new int[]{m37632a2}));
                    return;
                }
            }
            String[] strArr3 = this.f74848c;
            int[] iArr3 = new int[strArr3.length];
            int[] iArr4 = new int[strArr3.length];
            for (int i2 = 0; i2 < this.f74848c.length; i2++) {
                iArr3[i2] = 0;
                m37632a = C28786i.m37632a((Throwable) e);
                iArr4[i2] = m37632a;
            }
            new Handler(this.f74847b).post(new RunnableC28784g(this.f74846a, 0L, this.f74848c, iArr3, iArr4));
        }
    }
}
