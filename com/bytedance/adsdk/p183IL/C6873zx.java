package com.bytedance.adsdk.p183IL;

import android.content.Context;
import android.os.Trace;
import com.bytedance.adsdk.p183IL.eqN.C6824IL;
import com.bytedance.adsdk.p183IL.eqN.C6825Kg;
import com.bytedance.adsdk.p183IL.eqN.C6829iR;
import com.bytedance.adsdk.p183IL.eqN.InterfaceC6830ldr;
import com.bytedance.adsdk.p183IL.eqN.InterfaceC6831zx;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.io.File;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.bytedance.adsdk.IL.zx */
/* loaded from: classes3.dex */
public class C6873zx {

    /* renamed from: IL */
    private static boolean f14772IL = false;

    /* renamed from: Kg */
    private static int f14773Kg = 0;

    /* renamed from: PX */
    private static volatile C6829iR f14774PX = null;

    /* renamed from: VB */
    private static volatile C6825Kg f14775VB = null;

    /* renamed from: WR */
    private static InterfaceC6830ldr f14776WR = null;

    /* renamed from: bX */
    private static boolean f14777bX = true;

    /* renamed from: bg */
    public static boolean f14778bg = false;

    /* renamed from: eo */
    private static InterfaceC6831zx f14779eo = null;
    private static boolean eqN = true;

    /* renamed from: iR */
    private static int f14780iR;
    private static long[] ldr;

    /* renamed from: zx */
    private static String[] f14781zx;

    /* renamed from: IL */
    public static float m90583IL(String str) {
        int i = f14773Kg;
        if (i > 0) {
            f14773Kg = i - 1;
            return 0.0f;
        } else if (f14772IL) {
            int i2 = f14780iR - 1;
            f14780iR = i2;
            if (i2 != -1) {
                if (str.equals(f14781zx[i2])) {
                    Trace.endSection();
                    return ((float) (System.nanoTime() - ldr[f14780iR])) / 1000000.0f;
                }
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f14781zx[f14780iR] + ".");
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        } else {
            return 0.0f;
        }
    }

    /* renamed from: bg */
    public static void m90580bg(String str) {
        if (f14772IL) {
            int i = f14780iR;
            if (i == 20) {
                f14773Kg++;
                return;
            }
            f14781zx[i] = str;
            ldr[i] = System.nanoTime();
            Trace.beginSection(str);
            f14780iR++;
        }
    }

    /* renamed from: bg */
    public static C6825Kg m90581bg(Context context) {
        C6825Kg c6825Kg;
        C6825Kg c6825Kg2 = f14775VB;
        if (c6825Kg2 == null) {
            synchronized (C6825Kg.class) {
                c6825Kg = f14775VB;
                if (c6825Kg == null) {
                    C6829iR m90584IL = m90584IL(context);
                    InterfaceC6830ldr interfaceC6830ldr = f14776WR;
                    if (interfaceC6830ldr == null) {
                        interfaceC6830ldr = new C6824IL();
                    }
                    c6825Kg = new C6825Kg(m90584IL, interfaceC6830ldr);
                    f14775VB = c6825Kg;
                }
            }
            return c6825Kg;
        }
        return c6825Kg2;
    }

    /* renamed from: IL */
    public static C6829iR m90584IL(Context context) {
        C6829iR c6829iR;
        if (f14777bX) {
            final Context applicationContext = context.getApplicationContext();
            C6829iR c6829iR2 = f14774PX;
            if (c6829iR2 == null) {
                synchronized (C6829iR.class) {
                    c6829iR = f14774PX;
                    if (c6829iR == null) {
                        InterfaceC6831zx interfaceC6831zx = f14779eo;
                        if (interfaceC6831zx == null) {
                            interfaceC6831zx = new InterfaceC6831zx() { // from class: com.bytedance.adsdk.IL.zx.1
                                @Override // com.bytedance.adsdk.p183IL.eqN.InterfaceC6831zx
                                /* renamed from: bg */
                                public File mo90579bg() {
                                    return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                                }
                            };
                        }
                        c6829iR = new C6829iR(interfaceC6831zx);
                        f14774PX = c6829iR;
                    }
                }
                return c6829iR;
            }
            return c6829iR2;
        }
        return null;
    }

    /* renamed from: bg */
    public static boolean m90582bg() {
        return eqN;
    }
}
