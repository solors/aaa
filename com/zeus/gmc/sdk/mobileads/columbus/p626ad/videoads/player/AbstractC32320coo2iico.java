package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cc2o22co2c.InterfaceC32509coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.coo2iico */
/* loaded from: classes8.dex */
public abstract class AbstractC32320coo2iico extends FrameLayout {
    private static final String c2oc2o = "AbsPlayerController";
    private C32321coo2iico c2oc2i;
    protected boolean cioccoiococ;
    private Timer coi222o222;
    protected InterfaceC32509coi222o222 coo2iico;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.coo2iico$coo2iico */
    /* loaded from: classes8.dex */
    public static class C32321coo2iico extends TimerTask {
        WeakReference<AbstractC32320coo2iico> coo2iico;

        /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.coo2iico$coo2iico$coo2iico */
        /* loaded from: classes8.dex */
        class RunnableC32322coo2iico implements Runnable {
            final /* synthetic */ AbstractC32320coo2iico coo2iico;

            RunnableC32322coo2iico(AbstractC32320coo2iico abstractC32320coo2iico) {
                this.coo2iico = abstractC32320coo2iico;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.coo2iico.coiio2();
            }
        }

        C32321coo2iico(AbstractC32320coo2iico abstractC32320coo2iico) {
            this.coo2iico = new WeakReference<>(abstractC32320coo2iico);
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC32320coo2iico abstractC32320coo2iico = this.coo2iico.get();
            if (abstractC32320coo2iico == null) {
                MLog.m25889e(AbstractC32320coo2iico.c2oc2o, "updateProgress: controller is null, return");
            } else {
                abstractC32320coo2iico.post(new RunnableC32322coo2iico(abstractC32320coo2iico));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC32320coo2iico(Context context) {
        super(context);
        this.cioccoiococ = true;
    }

    public abstract void c2oc2i();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void c2oc2i(int i);

    protected abstract void c2oc2o();

    public boolean cco22() {
        return this.cioccoiococ;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ccoc2oic() {
        coi222o222();
        if (this.coi222o222 == null) {
            this.coi222o222 = new Timer();
        }
        if (this.c2oc2i == null) {
            this.c2oc2i = new C32321coo2iico(this);
        }
        this.coi222o222.schedule(this.c2oc2i, 0L, 1000L);
    }

    protected abstract void cicc2iiccc();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void cicic();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void cioccoiococ();

    /* JADX INFO: Access modifiers changed from: protected */
    public void coi222o222() {
        Timer timer = this.coi222o222;
        if (timer != null) {
            timer.cancel();
            this.coi222o222 = null;
        }
        C32321coo2iico c32321coo2iico = this.c2oc2i;
        if (c32321coo2iico != null) {
            c32321coo2iico.cancel();
            this.c2oc2i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void coi222o222(int i);

    protected void coiic() {
        InterfaceC32509coi222o222 interfaceC32509coi222o222 = this.coo2iico;
        if (interfaceC32509coi222o222 == null) {
            return;
        }
        interfaceC32509coi222o222.c22o22co22i();
    }

    protected abstract void coiio2();

    protected void coo2iico(ViewGroup viewGroup) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void coo2iico(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public int getAppOrientation() {
        return 1;
    }

    public void setColumbusVideoPlayer(InterfaceC32509coi222o222 interfaceC32509coi222o222) {
        this.coo2iico = interfaceC32509coi222o222;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void setContext(Context context);

    public abstract void setLearnMoreText(String str);

    public void setMuted(boolean z) {
        this.cioccoiococ = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void coo2iico(ViewGroup viewGroup, int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void coo2iico(float f, float f2) {
        MediaPlayer mediaPlayer;
        InterfaceC32509coi222o222 interfaceC32509coi222o222 = this.coo2iico;
        if (interfaceC32509coi222o222 == null || (mediaPlayer = interfaceC32509coi222o222.getMediaPlayer()) == null) {
            return;
        }
        mediaPlayer.setVolume(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void coo2iico() {
        InterfaceC32509coi222o222 interfaceC32509coi222o222 = this.coo2iico;
        if (interfaceC32509coi222o222 == null) {
            return;
        }
        interfaceC32509coi222o222.cc2iiooocc2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c2oicci2() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cii2c2() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ciii2coi2() {
    }
}
