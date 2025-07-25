package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* loaded from: classes4.dex */
public abstract class LibraryLoader {

    /* renamed from: a */
    private String[] f36097a;

    /* renamed from: b */
    private boolean f36098b;

    /* renamed from: c */
    private boolean f36099c;

    public LibraryLoader(String... strArr) {
        this.f36097a = strArr;
    }

    /* renamed from: a */
    protected abstract void m72616a(String str);

    public synchronized boolean isAvailable() {
        if (this.f36098b) {
            return this.f36099c;
        }
        this.f36098b = true;
        try {
            for (String str : this.f36097a) {
                m72616a(str);
            }
            this.f36099c = true;
        } catch (UnsatisfiedLinkError unused) {
            Log.m72602w("LibraryLoader", "Failed to load " + Arrays.toString(this.f36097a));
        }
        return this.f36099c;
    }

    public synchronized void setLibraries(String... strArr) {
        boolean z;
        if (!this.f36098b) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z, "Cannot set libraries after loading");
        this.f36097a = strArr;
    }
}
