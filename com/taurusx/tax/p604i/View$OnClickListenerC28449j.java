package com.taurusx.tax.p604i;

import android.media.MediaPlayer;
import android.view.View;
import com.iab.omid.library.taurusx.adsession.media.MediaEvents;
import com.taurusx.tax.C28154R;
import com.taurusx.tax.p618ui.TaxMediaView;

/* renamed from: com.taurusx.tax.i.j */
/* loaded from: classes7.dex */
public class View$OnClickListenerC28449j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ TaxMediaView f73876a;

    public View$OnClickListenerC28449j(TaxMediaView taxMediaView) {
        this.f73876a = taxMediaView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        TaxMediaView taxMediaView = this.f73876a;
        if (!taxMediaView.f74192n) {
            taxMediaView.f74197s = !taxMediaView.f74197s;
            TaxMediaView taxMediaView2 = this.f73876a;
            if (taxMediaView2.f74197s) {
                taxMediaView2.f74196r.setBackgroundResource(C28154R.C28156drawable.taurusx_inner_video_mute);
                MediaPlayer mediaPlayer = this.f73876a.f74200v;
                if (mediaPlayer != null) {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                    TaxMediaView taxMediaView3 = this.f73876a;
                    MediaEvents mediaEvents = taxMediaView3.f74204z;
                    if (mediaEvents != null && taxMediaView3.f74177A != null) {
                        mediaEvents.volumeChange(0.0f);
                    }
                    TaxMediaView.InterfaceC28588f interfaceC28588f = this.f73876a.f74194p;
                    if (interfaceC28588f != null) {
                        interfaceC28588f.mo37852b();
                        return;
                    }
                    return;
                }
                return;
            }
            taxMediaView2.f74196r.setBackgroundResource(C28154R.C28156drawable.taurusx_inner_video_no_mute);
            MediaPlayer mediaPlayer2 = this.f73876a.f74200v;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setVolume(1.0f, 1.0f);
                TaxMediaView taxMediaView4 = this.f73876a;
                MediaEvents mediaEvents2 = taxMediaView4.f74204z;
                if (mediaEvents2 != null && taxMediaView4.f74177A != null) {
                    mediaEvents2.volumeChange(1.0f);
                }
                TaxMediaView.InterfaceC28588f interfaceC28588f2 = this.f73876a.f74194p;
                if (interfaceC28588f2 != null) {
                    interfaceC28588f2.mo37855a();
                }
            }
        }
    }
}
