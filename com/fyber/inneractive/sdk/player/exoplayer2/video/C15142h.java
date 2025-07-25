package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.h */
/* loaded from: classes4.dex */
public final class C15142h {

    /* renamed from: c */
    public final long f29896c;

    /* renamed from: d */
    public final long f29897d;

    /* renamed from: e */
    public long f29898e;

    /* renamed from: f */
    public long f29899f;

    /* renamed from: g */
    public long f29900g;

    /* renamed from: h */
    public boolean f29901h;

    /* renamed from: i */
    public long f29902i;

    /* renamed from: j */
    public long f29903j;

    /* renamed from: k */
    public long f29904k;

    /* renamed from: b */
    public final boolean f29895b = true;

    /* renamed from: a */
    public final Choreographer$FrameCallbackC15141g f29894a = Choreographer$FrameCallbackC15141g.f29889e;

    public C15142h() {
        long refreshRate = (long) (1.0E9d / ((WindowManager) IAConfigManager.f27060O.f27098v.m77924a().getSystemService("window")).getDefaultDisplay().getRefreshRate());
        this.f29896c = refreshRate;
        this.f29897d = (refreshRate * 80) / 100;
    }
}
