package com.unity3d.player;

/* renamed from: com.unity3d.player.d */
/* loaded from: classes7.dex */
class RunnableC28781d implements Runnable {

    /* renamed from: a */
    private IAssetPackManagerMobileDataConfirmationCallback f74834a;

    /* renamed from: b */
    private boolean f74835b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC28781d(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
        this.f74834a = iAssetPackManagerMobileDataConfirmationCallback;
        this.f74835b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f74834a.onMobileDataConfirmationResult(this.f74835b);
    }
}
