package com.bytedance.sdk.openadsdk.core.p332WR;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.openadsdk.core.WR.IL */
/* loaded from: classes3.dex */
public class C8847IL {

    /* renamed from: bg */
    private static C8851bg f19540bg;

    /* renamed from: IL */
    private String f19541IL;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.core.WR.IL$bg */
    /* loaded from: classes3.dex */
    public static class C8849bg {

        /* renamed from: bg */
        private static final C8847IL f19542bg = new C8847IL();
    }

    /* renamed from: IL */
    public void m84692IL(String str) {
        C8851bg c8851bg;
        if (TextUtils.isEmpty(str) || (c8851bg = f19540bg) == null) {
            return;
        }
        c8851bg.m84671IL(str);
    }

    /* renamed from: bX */
    public boolean m84691bX() {
        C8851bg c8851bg = f19540bg;
        if (c8851bg == null) {
            return false;
        }
        return c8851bg.m84672IL();
    }

    /* renamed from: bg */
    public void m84688bg(String str) {
        C8851bg c8851bg;
        if (TextUtils.isEmpty(str) || (c8851bg = f19540bg) == null) {
            return;
        }
        c8851bg.m84662bg(str);
    }

    public String eqN() {
        String eqN;
        C8851bg c8851bg = f19540bg;
        if (c8851bg != null && (eqN = c8851bg.eqN()) != null) {
            return eqN;
        }
        return "";
    }

    /* renamed from: iR */
    public int m84685iR() {
        C8851bg c8851bg = f19540bg;
        if (c8851bg != null) {
            return c8851bg.m84658iR();
        }
        return 1;
    }

    public long ldr() {
        C8851bg c8851bg = f19540bg;
        if (c8851bg != null) {
            return c8851bg.ldr();
        }
        return 0L;
    }

    /* renamed from: zx */
    public String m84684zx() {
        C8851bg c8851bg = f19540bg;
        if (c8851bg != null) {
            return c8851bg.m84657zx();
        }
        return "";
    }

    private C8847IL() {
        this.f19541IL = null;
        f19540bg = new C8851bg();
    }

    /* renamed from: IL */
    public static C8847IL m84693IL() {
        return C8849bg.f19542bg;
    }

    /* renamed from: bg */
    public void m84690bg() {
        C8851bg c8851bg = f19540bg;
        if (c8851bg != null) {
            c8851bg.m84668bX();
        }
    }

    /* renamed from: bg */
    public void m84687bg(@NonNull String str, Map<String, Object> map) {
        C8851bg c8851bg = f19540bg;
        if (c8851bg != null) {
            c8851bg.m84661bg(str, map);
        }
    }

    /* renamed from: bg */
    public Map<String, String> m84686bg(String str, byte[] bArr) {
        C8851bg c8851bg = f19540bg;
        if (c8851bg != null) {
            return c8851bg.m84660bg(str, bArr);
        }
        return new HashMap();
    }

    /* renamed from: bg */
    public void m84689bg(MotionEvent motionEvent) {
        C8851bg c8851bg = f19540bg;
        if (c8851bg != null) {
            c8851bg.m84664bg(motionEvent);
        }
    }
}
