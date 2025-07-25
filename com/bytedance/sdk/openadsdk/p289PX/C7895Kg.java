package com.bytedance.sdk.openadsdk.p289PX;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* renamed from: com.bytedance.sdk.openadsdk.PX.Kg */
/* loaded from: classes3.dex */
public class C7895Kg {

    /* renamed from: IL */
    private int f17239IL = -1;

    /* renamed from: bX */
    private boolean f17240bX = false;

    /* renamed from: bg */
    private final AudioManager f17241bg;

    public C7895Kg(Context context) {
        this.f17241bg = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* renamed from: IL */
    public boolean m87446IL() {
        if (!this.f17240bX) {
            return false;
        }
        this.f17240bX = false;
        return true;
    }

    /* renamed from: bg */
    public int m87445bg() {
        return this.f17239IL;
    }

    /* renamed from: bg */
    public void m87444bg(int i) {
        this.f17239IL = i;
    }

    /* renamed from: bg */
    public void m87442bg(boolean z) {
        m87441bg(z, false);
    }

    /* renamed from: bg */
    public void m87441bg(boolean z, boolean z2) {
        if (this.f17241bg == null) {
            return;
        }
        int i = 0;
        if (z) {
            int m82680iR = DeviceUtils.m82680iR();
            if (m82680iR != 0) {
                this.f17239IL = m82680iR;
            } else if (!z2) {
                return;
            }
            m87443bg(3, 0, 0);
            this.f17240bX = true;
            return;
        }
        int i2 = this.f17239IL;
        if (i2 == 0) {
            i2 = DeviceUtils.m82695WR() / 15;
        } else {
            if (i2 == -1) {
                if (!z2) {
                    return;
                }
                i2 = DeviceUtils.m82695WR() / 15;
            }
            this.f17239IL = -1;
            m87443bg(3, i2, i);
            this.f17240bX = true;
        }
        i = 1;
        this.f17239IL = -1;
        m87443bg(3, i2, i);
        this.f17240bX = true;
    }

    /* renamed from: bg */
    private void m87443bg(int i, int i2, int i3) {
        try {
            this.f17241bg.setStreamVolume(i, i2, i3);
        } catch (Throwable unused) {
        }
    }
}
