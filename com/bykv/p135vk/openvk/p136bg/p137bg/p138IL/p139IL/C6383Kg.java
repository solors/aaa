package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL;

import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p144bX.C6447bg;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.Kg */
/* loaded from: classes3.dex */
class C6383Kg {

    /* renamed from: bg */
    private final RandomAccessFile f13310bg;

    /* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.Kg$bg */
    /* loaded from: classes3.dex */
    static class C6384bg extends Exception {
        C6384bg(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6383Kg(File file, String str) throws C6384bg {
        try {
            this.f13310bg = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e) {
            throw new C6384bg(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m92067bg(long j) throws C6384bg {
        try {
            this.f13310bg.seek(j);
        } catch (IOException e) {
            throw new C6384bg(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m92065bg(byte[] bArr, int i, int i2) throws C6384bg {
        try {
            this.f13310bg.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C6384bg(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public int m92066bg(byte[] bArr) throws C6384bg {
        try {
            return this.f13310bg.read(bArr);
        } catch (IOException e) {
            throw new C6384bg(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m92068bg() {
        C6447bg.m91922bg(this.f13310bg);
    }
}
