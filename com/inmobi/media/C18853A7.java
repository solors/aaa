package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.Unit;

/* renamed from: com.inmobi.media.A7 */
/* loaded from: classes6.dex */
public final class C18853A7 extends MediaPlayer {

    /* renamed from: d */
    public static final Object f47091d = new Object();

    /* renamed from: e */
    public static C18853A7 f47092e;

    /* renamed from: f */
    public static int f47093f;

    /* renamed from: a */
    public int f47094a;

    /* renamed from: b */
    public int f47095b;

    /* renamed from: c */
    public C18853A7 f47096c;

    /* renamed from: a */
    public final void m61271a() {
        if (3 == this.f47094a) {
            return;
        }
        synchronized (f47091d) {
            int i = f47093f;
            if (i < 5) {
                this.f47096c = f47092e;
                f47092e = this;
                f47093f = i + 1;
            }
            Unit unit = Unit.f99208a;
        }
    }
}
