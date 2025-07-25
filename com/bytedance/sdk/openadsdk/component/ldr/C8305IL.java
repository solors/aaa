package com.bytedance.sdk.openadsdk.component.ldr;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.component.p305Kg.C8247bg;

/* renamed from: com.bytedance.sdk.openadsdk.component.ldr.IL */
/* loaded from: classes3.dex */
public class C8305IL implements Handler.Callback {

    /* renamed from: IL */
    private final C8247bg f18182IL;

    /* renamed from: bX */
    private InterfaceC8306bg f18183bX;

    /* renamed from: iR */
    private boolean f18185iR;

    /* renamed from: bg */
    private Handler f18184bg = new Handler(Looper.myLooper(), this);
    private int eqN = 0;

    /* renamed from: zx */
    private int f18186zx = 5;
    private int ldr = 0;

    public C8305IL(C8247bg c8247bg) {
        this.f18182IL = c8247bg;
    }

    /* renamed from: IL */
    public void m86588IL(int i) {
        this.ldr = i;
    }

    /* renamed from: bX */
    public void m86587bX() {
        if (this.f18184bg != null) {
            Message obtain = Message.obtain();
            obtain.what = 100;
            obtain.arg1 = this.eqN;
            this.f18184bg.sendMessage(obtain);
        }
    }

    /* renamed from: bg */
    public void m86583bg(int i) {
        this.eqN = i;
        int i2 = this.f18186zx - i;
        this.f18182IL.m86699bg(i2);
        if (i <= 0) {
            InterfaceC8306bg interfaceC8306bg = this.f18183bX;
            if (interfaceC8306bg != null && !this.f18185iR) {
                interfaceC8306bg.mo86577IL();
                this.f18185iR = true;
            }
            i = 0;
        }
        boolean z = i2 >= this.ldr;
        InterfaceC8306bg interfaceC8306bg2 = this.f18183bX;
        if (interfaceC8306bg2 != null) {
            interfaceC8306bg2.mo86575bg(i, i2, z);
        }
    }

    public void eqN() {
        Handler handler = this.f18184bg;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.f18184bg != null) {
            int i = message.arg1;
            m86583bg(i);
            if (i > 0) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i - 1;
                this.f18184bg.sendMessageDelayed(obtain, 1000L);
            }
        }
        return true;
    }

    /* renamed from: zx */
    public void m86580zx() {
        this.f18184bg.removeCallbacksAndMessages(null);
        this.f18184bg = null;
    }

    /* renamed from: IL */
    public void m86589IL() {
        Handler handler = this.f18184bg;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.f18186zx, 0));
        }
    }

    /* renamed from: bg */
    public void m86584bg(float f) {
        int i = (int) f;
        this.f18186zx = i;
        if (i <= 0) {
            this.f18186zx = 5;
        }
    }

    /* renamed from: bg */
    public void m86582bg(InterfaceC8306bg interfaceC8306bg) {
        this.f18183bX = interfaceC8306bg;
    }

    /* renamed from: bg */
    public int m86586bg() {
        return this.ldr;
    }
}
