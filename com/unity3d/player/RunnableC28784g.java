package com.unity3d.player;

/* renamed from: com.unity3d.player.g */
/* loaded from: classes7.dex */
class RunnableC28784g implements Runnable {

    /* renamed from: a */
    private IAssetPackManagerStatusQueryCallback f74841a;

    /* renamed from: b */
    private long f74842b;

    /* renamed from: c */
    private String[] f74843c;

    /* renamed from: d */
    private int[] f74844d;

    /* renamed from: e */
    private int[] f74845e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC28784g(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, long j, String[] strArr, int[] iArr, int[] iArr2) {
        this.f74841a = iAssetPackManagerStatusQueryCallback;
        this.f74842b = j;
        this.f74843c = strArr;
        this.f74844d = iArr;
        this.f74845e = iArr2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f74841a.onStatusResult(this.f74842b, this.f74843c, this.f74844d, this.f74845e);
    }
}
