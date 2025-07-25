package com.mbridge.msdk.foundation.same.p440e;

/* renamed from: com.mbridge.msdk.foundation.same.e.a */
/* loaded from: classes6.dex */
public abstract class CommonTask implements Runnable {

    /* renamed from: id */
    public static long f56552id;
    public InterfaceC21976a mListener;
    public EnumC21977b mState = EnumC21977b.READY;

    /* compiled from: CommonTask.java */
    /* renamed from: com.mbridge.msdk.foundation.same.e.a$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC21976a {
        /* renamed from: a */
        void mo51275a(EnumC21977b enumC21977b);
    }

    /* compiled from: CommonTask.java */
    /* renamed from: com.mbridge.msdk.foundation.same.e.a$b */
    /* loaded from: classes6.dex */
    public enum EnumC21977b {
        READY,
        RUNNING,
        PAUSE,
        CANCEL,
        FINISH
    }

    public CommonTask() {
        f56552id++;
    }

    private void setState(EnumC21977b enumC21977b) {
        this.mState = enumC21977b;
        InterfaceC21976a interfaceC21976a = this.mListener;
        if (interfaceC21976a != null) {
            interfaceC21976a.mo51275a(enumC21977b);
        }
    }

    public final void cancel() {
        EnumC21977b enumC21977b = this.mState;
        EnumC21977b enumC21977b2 = EnumC21977b.CANCEL;
        if (enumC21977b != enumC21977b2) {
            setState(enumC21977b2);
            cancelTask();
        }
    }

    public abstract void cancelTask();

    public final long getId() {
        return f56552id;
    }

    public EnumC21977b getState() {
        return this.mState;
    }

    public abstract void pauseTask(boolean z);

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.mState == EnumC21977b.READY) {
                setState(EnumC21977b.RUNNING);
                runTask();
                setState(EnumC21977b.FINISH);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public abstract void runTask();

    public void setOnStateChangeListener(InterfaceC21976a interfaceC21976a) {
        this.mListener = interfaceC21976a;
    }

    public final void setPause(boolean z) {
        EnumC21977b enumC21977b = this.mState;
        EnumC21977b enumC21977b2 = EnumC21977b.PAUSE;
        if (enumC21977b != enumC21977b2 && enumC21977b != EnumC21977b.CANCEL && enumC21977b != EnumC21977b.FINISH) {
            if (z) {
                setState(enumC21977b2);
            } else {
                setState(EnumC21977b.RUNNING);
            }
            pauseTask(z);
        }
    }
}
