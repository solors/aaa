package com.bytedance.sdk.component.adexpress.eqN;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.InterfaceC7323bX;
import com.bytedance.sdk.component.utils.C7741PX;

/* renamed from: com.bytedance.sdk.component.adexpress.eqN.bg */
/* loaded from: classes3.dex */
public class C7492bg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.renderscript.BaseObj] */
    /* JADX WARN: Type inference failed for: r4v6, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /* renamed from: bg */
    public static Bitmap m88670bg(Context context, Bitmap bitmap, int i) {
        RenderScript renderScript;
        Allocation allocation;
        ?? r4;
        Allocation allocation2;
        InterfaceC7323bX m89119bX;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (C7487eqN.m88685IL() && i2 < 26) {
                try {
                    InterfaceC7323bX m89119bX2 = C7324bg.m89118bg().m89119bX();
                    if (m89119bX2 != null) {
                        m89119bX2.xxp();
                    }
                } catch (Throwable th) {
                    C7741PX.m87873bg("BlurUtils", "blur destroy" + th.getMessage());
                }
                return null;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.2f), Math.round(bitmap.getHeight() * 0.2f), false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
            renderScript = RenderScript.create(context);
            if (renderScript == null) {
                try {
                    InterfaceC7323bX m89119bX3 = C7324bg.m89118bg().m89119bX();
                    if (m89119bX3 != null && m89119bX3.xxp() && renderScript != null) {
                        RenderScript.releaseAllContexts();
                    }
                } catch (Throwable th2) {
                    C7741PX.m87873bg("BlurUtils", "blur destroy" + th2.getMessage());
                }
                return null;
            }
            try {
                r4 = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
                try {
                    allocation = Allocation.createFromBitmap(renderScript, createScaledBitmap);
                    try {
                        allocation2 = Allocation.createFromBitmap(renderScript, createBitmap);
                    } catch (Throwable th3) {
                        th = th3;
                        allocation2 = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    allocation = null;
                    allocation2 = null;
                }
                try {
                    r4.setRadius(i);
                    r4.setInput(allocation);
                    r4.forEach(allocation2);
                    allocation2.copyTo(createBitmap);
                    try {
                        InterfaceC7323bX m89119bX4 = C7324bg.m89118bg().m89119bX();
                        if (m89119bX4 != null && m89119bX4.xxp()) {
                            RenderScript.releaseAllContexts();
                            if (allocation != null) {
                                allocation.destroy();
                            }
                            allocation2.destroy();
                            r4.destroy();
                        }
                    } catch (Throwable th5) {
                        C7741PX.m87873bg("BlurUtils", "blur destroy" + th5.getMessage());
                    }
                    return createBitmap;
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        C7741PX.m87873bg("BlurUtils", "blue has occur exception" + th.getMessage());
                        try {
                            m89119bX = C7324bg.m89118bg().m89119bX();
                            return m89119bX == null ? null : null;
                        } catch (Throwable th7) {
                            C7741PX.m87873bg("BlurUtils", "blur destroy" + th7.getMessage());
                            return null;
                        }
                    } catch (Throwable th8) {
                        try {
                            InterfaceC7323bX m89119bX5 = C7324bg.m89118bg().m89119bX();
                            if (m89119bX5 != null && m89119bX5.xxp()) {
                                if (renderScript != null) {
                                    RenderScript.releaseAllContexts();
                                }
                                if (allocation != null) {
                                    allocation.destroy();
                                }
                                if (allocation2 != null) {
                                    allocation2.destroy();
                                }
                                if (r4 != 0) {
                                    r4.destroy();
                                }
                            }
                        } catch (Throwable th9) {
                            C7741PX.m87873bg("BlurUtils", "blur destroy" + th9.getMessage());
                        }
                        throw th8;
                    }
                }
            } catch (Throwable th10) {
                th = th10;
                allocation = null;
                r4 = allocation;
                allocation2 = r4;
                C7741PX.m87873bg("BlurUtils", "blue has occur exception" + th.getMessage());
                m89119bX = C7324bg.m89118bg().m89119bX();
                if (m89119bX == null && m89119bX.xxp()) {
                    if (renderScript != null) {
                        RenderScript.releaseAllContexts();
                    }
                    if (allocation != null) {
                        allocation.destroy();
                    }
                    if (allocation2 != null) {
                        allocation2.destroy();
                    }
                    if (r4 == 0) {
                        return null;
                    }
                    r4.destroy();
                    return null;
                }
            }
        } catch (Throwable th11) {
            th = th11;
            renderScript = null;
            allocation = null;
        }
    }
}
