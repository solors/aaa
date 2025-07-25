package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.c2oc2o */
/* loaded from: classes8.dex */
public class C32448c2oc2o {
    public static final String c2oc2i = "ConcurrentAccessFile";
    private File coi222o222;
    private String coo2iico;

    public C32448c2oc2o(String str) {
        this.coo2iico = str;
        this.coi222o222 = new File(this.coo2iico);
    }

    public byte[] c2oc2i() {
        C32452cco22 c32452cco22 = new C32452cco22(this.coo2iico);
        try {
            try {
                if (c32452cco22.coo2iico()) {
                    return C32455cicc2iiccc.coo2iico((InputStream) new FileInputStream(this.coi222o222));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            c32452cco22.coi222o222();
            return new byte[0];
        } finally {
            c32452cco22.coi222o222();
        }
    }

    public boolean coi222o222() {
        return this.coi222o222.exists();
    }

    public void coo2iico(byte[] bArr) {
        FileOutputStream fileOutputStream;
        C32452cco22 c32452cco22 = new C32452cco22(this.coo2iico);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (c32452cco22.coo2iico()) {
                    fileOutputStream = new FileOutputStream(this.coi222o222);
                    try {
                        fileOutputStream.write(bArr);
                        fileOutputStream.flush();
                        fileOutputStream2 = fileOutputStream;
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        e.printStackTrace();
                        c32452cco22.coi222o222();
                        C32455cicc2iiccc.coo2iico(fileOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        c32452cco22.coi222o222();
                        C32455cicc2iiccc.coo2iico(fileOutputStream);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
            c32452cco22.coi222o222();
            C32455cicc2iiccc.coo2iico(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = fileOutputStream2;
        }
    }

    public void coo2iico() {
        C32452cco22 c32452cco22 = new C32452cco22(this.coo2iico);
        try {
            try {
                if (c32452cco22.coo2iico() && this.coi222o222.exists()) {
                    this.coi222o222.delete();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            c32452cco22.coi222o222();
        }
    }
}
