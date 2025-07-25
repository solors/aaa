package com.unity3d.player;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: com.unity3d.player.e */
/* loaded from: classes7.dex */
class C28782e implements OnSuccessListener {

    /* renamed from: a */
    private IAssetPackManagerMobileDataConfirmationCallback f74836a;

    /* renamed from: b */
    private Looper f74837b = Looper.myLooper();

    public C28782e(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.f74836a = iAssetPackManagerMobileDataConfirmationCallback;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        if (this.f74836a != null) {
            Handler handler = new Handler(this.f74837b);
            IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback = this.f74836a;
            if (num.intValue() == -1) {
                z = true;
            } else {
                z = false;
            }
            handler.post(new RunnableC28781d(iAssetPackManagerMobileDataConfirmationCallback, z));
        }
    }
}
