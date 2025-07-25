package com.inmobi.media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* renamed from: com.inmobi.media.f3 */
/* loaded from: classes6.dex */
public final class C19268f3 {

    /* renamed from: a */
    public final C19282g3 f48195a;

    /* renamed from: b */
    public final boolean[] f48196b;

    /* renamed from: c */
    public boolean f48197c;

    /* renamed from: d */
    public final /* synthetic */ C19310i3 f48198d;

    public C19268f3(C19310i3 c19310i3, C19282g3 c19282g3) {
        boolean[] zArr;
        this.f48198d = c19310i3;
        this.f48195a = c19282g3;
        if (c19282g3.f48248c) {
            zArr = null;
        } else {
            zArr = new boolean[c19310i3.f48344h];
        }
        this.f48196b = zArr;
    }

    /* renamed from: a */
    public final OutputStream m60361a(int i) {
        FileOutputStream fileOutputStream;
        C19254e3 c19254e3;
        synchronized (this.f48198d) {
            C19282g3 c19282g3 = this.f48195a;
            if (c19282g3.f48249d == this) {
                if (!c19282g3.f48248c) {
                    this.f48196b[i] = true;
                }
                File m60327b = c19282g3.m60327b(i);
                try {
                    fileOutputStream = new FileOutputStream(m60327b);
                } catch (FileNotFoundException unused) {
                    this.f48198d.f48337a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(m60327b);
                    } catch (FileNotFoundException unused2) {
                        return C19310i3.f48336q;
                    }
                }
                c19254e3 = new C19254e3(this, fileOutputStream);
            } else {
                throw new IllegalStateException();
            }
        }
        return c19254e3;
    }

    /* renamed from: a */
    public final void m60360a(String str, int i) {
        OutputStreamWriter outputStreamWriter;
        OutputStreamWriter outputStreamWriter2 = null;
        try {
            outputStreamWriter = new OutputStreamWriter(m60361a(i), AbstractC19128Ub.f47848b);
        } catch (Throwable th) {
            th = th;
        }
        try {
            outputStreamWriter.write(str);
            AbstractC19128Ub.m60638a(outputStreamWriter);
        } catch (Throwable th2) {
            th = th2;
            outputStreamWriter2 = outputStreamWriter;
            AbstractC19128Ub.m60638a(outputStreamWriter2);
            throw th;
        }
    }
}
