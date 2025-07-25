package com.taurusx.tax.p604i;

import android.media.MediaPlayer;
import android.os.Handler;
import com.taurusx.tax.p618ui.TaxMediaView;

/* renamed from: com.taurusx.tax.i.k */
/* loaded from: classes7.dex */
public class RunnableC28450k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TaxMediaView f73877a;

    public RunnableC28450k(TaxMediaView taxMediaView) {
        this.f73877a = taxMediaView;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaPlayer mediaPlayer;
        TaxMediaView taxMediaView;
        Handler handler;
        while (true) {
            TaxMediaView taxMediaView2 = this.f73877a;
            if (taxMediaView2.f74190l) {
                if (!taxMediaView2.f74192n && (mediaPlayer = taxMediaView2.f74200v) != null && mediaPlayer.isPlaying() && (handler = (taxMediaView = this.f73877a).f74195q) != null) {
                    handler.sendEmptyMessage(taxMediaView.f74200v.getCurrentPosition());
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } else {
                return;
            }
        }
    }
}
