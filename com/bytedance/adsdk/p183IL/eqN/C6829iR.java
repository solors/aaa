package com.bytedance.adsdk.p183IL.eqN;

import android.util.Pair;
import com.bytedance.component.sdk.annotation.RestrictTo;
import com.bytedance.component.sdk.annotation.WorkerThread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.bytedance.adsdk.IL.eqN.iR */
/* loaded from: classes3.dex */
public class C6829iR {

    /* renamed from: bg */
    private final InterfaceC6831zx f14656bg;

    public C6829iR(InterfaceC6831zx interfaceC6831zx) {
        this.f14656bg = interfaceC6831zx;
    }

    /* renamed from: IL */
    private File m90751IL(String str) throws FileNotFoundException {
        File file = new File(m90750bg(), m90747bg(str, EnumC6826bX.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m90750bg(), m90747bg(str, EnumC6826bX.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: bg */
    public Pair<EnumC6826bX, InputStream> m90749bg(String str) {
        EnumC6826bX enumC6826bX;
        try {
            File m90751IL = m90751IL(str);
            if (m90751IL == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m90751IL);
            if (m90751IL.getAbsolutePath().endsWith(".zip")) {
                enumC6826bX = EnumC6826bX.ZIP;
            } else {
                enumC6826bX = EnumC6826bX.JSON;
            }
            m90751IL.getAbsolutePath();
            return new Pair<>(enumC6826bX, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public File m90746bg(String str, InputStream inputStream, EnumC6826bX enumC6826bX) throws IOException {
        File file = new File(m90750bg(), m90747bg(str, enumC6826bX, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m90748bg(String str, EnumC6826bX enumC6826bX) {
        File file = new File(m90750bg(), m90747bg(str, enumC6826bX, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        file2.toString();
        if (renameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    /* renamed from: bg */
    private File m90750bg() {
        File mo90579bg = this.f14656bg.mo90579bg();
        if (mo90579bg.isFile()) {
            mo90579bg.delete();
        }
        if (!mo90579bg.exists()) {
            mo90579bg.mkdirs();
        }
        return mo90579bg;
    }

    /* renamed from: bg */
    private static String m90747bg(String str, EnumC6826bX enumC6826bX, boolean z) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z ? enumC6826bX.m90756bg() : enumC6826bX.f14654bX);
        return sb2.toString();
    }
}
