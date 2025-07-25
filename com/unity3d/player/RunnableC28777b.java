package com.unity3d.player;

import java.util.Set;

/* renamed from: com.unity3d.player.b */
/* loaded from: classes7.dex */
class RunnableC28777b implements Runnable {

    /* renamed from: a */
    private Set f74824a;

    /* renamed from: b */
    private String f74825b;

    /* renamed from: c */
    private int f74826c;

    /* renamed from: d */
    private long f74827d;

    /* renamed from: e */
    private long f74828e;

    /* renamed from: f */
    private int f74829f;

    /* renamed from: g */
    private int f74830g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC28777b(Set set, String str, int i, long j, long j2, int i2, int i3) {
        this.f74824a = set;
        this.f74825b = str;
        this.f74826c = i;
        this.f74827d = j;
        this.f74828e = j2;
        this.f74829f = i2;
        this.f74830g = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback : this.f74824a) {
            iAssetPackManagerDownloadStatusCallback.onStatusUpdate(this.f74825b, this.f74826c, this.f74827d, this.f74828e, this.f74829f, this.f74830g);
        }
    }
}
