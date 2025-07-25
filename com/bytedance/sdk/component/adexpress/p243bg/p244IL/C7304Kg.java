package com.bytedance.sdk.component.adexpress.p243bg.p244IL;

import com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7318bg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.ironsource.C20517nb;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.bg.IL.Kg */
/* loaded from: classes3.dex */
public class C7304Kg {

    /* renamed from: bg */
    private static C7318bg f15804bg;

    /* renamed from: IL */
    public static synchronized C7318bg m89225IL() {
        C7318bg c7318bg;
        synchronized (C7304Kg.class) {
            c7318bg = f15804bg;
        }
        return c7318bg;
    }

    /* renamed from: bX */
    public static void m89223bX() {
        AbstractC7305bX.m89210bg(C7312zx.m89174Kg(), m89225IL(), "temp_pkg_info.json");
    }

    /* renamed from: bg */
    public static void m89222bg() {
        FileInputStream fileInputStream;
        Throwable th;
        FileInputStream fileInputStream2 = null;
        try {
            File file = new File(C7312zx.m89174Kg(), "temp_pkg_info.json");
            Long valueOf = Long.valueOf(file.length());
            if (valueOf.longValue() > 0 && file.exists() && file.isFile()) {
                byte[] bArr = new byte[valueOf.intValue()];
                fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr);
                    C7318bg m89141bg = C7318bg.m89141bg(new JSONObject(new String(bArr, C20517nb.f52167N)));
                    if (m89141bg != null) {
                        f15804bg = m89141bg;
                        f15804bg.m89147bX();
                    }
                    fileInputStream2 = fileInputStream;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        C7741PX.m87871bg("Version", "version init error", th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th3;
                    }
                }
            }
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException unused3) {
                }
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
        }
    }

    public static void eqN() {
        AbstractC7305bX.m89218IL(C7312zx.m89174Kg(), m89225IL(), "temp_pkg_info.json");
        f15804bg = null;
    }

    /* renamed from: IL */
    public static boolean m89224IL(C7318bg c7318bg) {
        return AbstractC7305bX.m89216bX(m89225IL(), c7318bg);
    }

    /* renamed from: bg */
    public static synchronized void m89221bg(C7318bg c7318bg) {
        synchronized (C7304Kg.class) {
            if (c7318bg != null) {
                if (c7318bg.m89140iR()) {
                    f15804bg = c7318bg;
                }
            }
        }
    }

    /* renamed from: bg */
    public static boolean m89220bg(String str) {
        return AbstractC7305bX.m89211bg(m89225IL(), str);
    }
}
