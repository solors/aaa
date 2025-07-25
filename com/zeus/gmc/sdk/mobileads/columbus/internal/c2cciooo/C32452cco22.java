package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.cco22 */
/* loaded from: classes8.dex */
public class C32452cco22 {
    private String c2oc2i;
    FileOutputStream coo2iico = null;
    FileLock coi222o222 = null;

    public C32452cco22(String str) {
        this.c2oc2i = str;
    }

    public void coi222o222() {
        FileLock fileLock = this.coi222o222;
        if (fileLock != null) {
            try {
                try {
                    fileLock.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } finally {
                this.coi222o222 = null;
            }
        }
        FileOutputStream fileOutputStream = this.coo2iico;
        if (fileOutputStream != null) {
            C32455cicc2iiccc.coo2iico(fileOutputStream);
            this.coo2iico = null;
        }
    }

    public boolean coo2iico() {
        coi222o222();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.c2oc2i), true);
            this.coo2iico = fileOutputStream;
            FileLock lock = fileOutputStream.getChannel().lock();
            this.coi222o222 = lock;
            if (lock == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
