package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.c */
/* loaded from: classes4.dex */
public final class C15110c {

    /* renamed from: a */
    public final File f29772a;

    /* renamed from: b */
    public final File f29773b;

    public C15110c(File file) {
        this.f29772a = file;
        this.f29773b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public final FileInputStream m77224a() {
        if (this.f29773b.exists()) {
            this.f29772a.delete();
            this.f29773b.renameTo(this.f29772a);
        }
        return new FileInputStream(this.f29772a);
    }

    /* renamed from: b */
    public final C15109b m77223b() {
        if (this.f29772a.exists()) {
            if (!this.f29773b.exists()) {
                if (!this.f29772a.renameTo(this.f29773b)) {
                    Log.w("AtomicFile", "Couldn't rename file " + this.f29772a + " to backup file " + this.f29773b);
                }
            } else {
                this.f29772a.delete();
            }
        }
        try {
            return new C15109b(this.f29772a);
        } catch (FileNotFoundException unused) {
            if (this.f29772a.getParentFile().mkdirs()) {
                try {
                    return new C15109b(this.f29772a);
                } catch (FileNotFoundException unused2) {
                    throw new IOException("Couldn't create " + this.f29772a);
                }
            }
            throw new IOException("Couldn't create directory " + this.f29772a);
        }
    }
}
