package com.inmobi.media;

import java.io.File;

/* renamed from: com.inmobi.media.g3 */
/* loaded from: classes6.dex */
public final class C19282g3 {

    /* renamed from: a */
    public final String f48246a;

    /* renamed from: b */
    public final long[] f48247b;

    /* renamed from: c */
    public boolean f48248c;

    /* renamed from: d */
    public C19268f3 f48249d;

    /* renamed from: e */
    public final /* synthetic */ C19310i3 f48250e;

    public C19282g3(C19310i3 c19310i3, String str) {
        this.f48250e = c19310i3;
        this.f48246a = str;
        this.f48247b = new long[c19310i3.f48344h];
    }

    /* renamed from: a */
    public final File m60328a(int i) {
        File file = this.f48250e.f48337a;
        return new File(file, this.f48246a + "." + i);
    }

    /* renamed from: b */
    public final File m60327b(int i) {
        File file = this.f48250e.f48337a;
        return new File(file, this.f48246a + "." + i + ".tmp");
    }
}
