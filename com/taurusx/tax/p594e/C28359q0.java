package com.taurusx.tax.p594e;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.mraid.MraidVideoPlayerActivity;
import com.taurusx.tax.p594e.AbstractC28330e;

/* renamed from: com.taurusx.tax.e.q0 */
/* loaded from: classes7.dex */
public class C28359q0 extends AbstractC28330e {

    /* renamed from: com.taurusx.tax.e.q0$a */
    /* loaded from: classes7.dex */
    public class C28360a implements MediaPlayer.OnCompletionListener {

        /* renamed from: a */
        public final /* synthetic */ AbstractC28330e.InterfaceC28331a f73619a;

        public C28360a(C28359q0 c28359q0, AbstractC28330e.InterfaceC28331a interfaceC28331a) {
            this.f73619a = interfaceC28331a;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            AbstractC28330e.InterfaceC28331a interfaceC28331a = this.f73619a;
            if (interfaceC28331a != null) {
                MraidVideoPlayerActivity mraidVideoPlayerActivity = (MraidVideoPlayerActivity) interfaceC28331a;
                mraidVideoPlayerActivity.f73557a.setVisibility(0);
                mraidVideoPlayerActivity.finish();
            }
        }
    }

    /* renamed from: com.taurusx.tax.e.q0$b */
    /* loaded from: classes7.dex */
    public class C28361b implements MediaPlayer.OnErrorListener {

        /* renamed from: a */
        public final /* synthetic */ AbstractC28330e.InterfaceC28331a f73620a;

        public C28361b(C28359q0 c28359q0, AbstractC28330e.InterfaceC28331a interfaceC28331a) {
            this.f73620a = interfaceC28331a;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            AbstractC28330e.InterfaceC28331a interfaceC28331a = this.f73620a;
            if (interfaceC28331a != null) {
                MraidVideoPlayerActivity mraidVideoPlayerActivity = (MraidVideoPlayerActivity) interfaceC28331a;
                LogUtil.m37905d("videoError", "Error: video can not be played.");
                mraidVideoPlayerActivity.f73557a.setVisibility(0);
                mraidVideoPlayerActivity.sendBroadcast(new Intent("com.taurusx.action.interstitial.fail"));
            }
            return false;
        }
    }

    public C28359q0(Context context, Intent intent, AbstractC28330e.InterfaceC28331a interfaceC28331a) {
        super(context);
        setOnCompletionListener(new C28360a(this, interfaceC28331a));
        setOnErrorListener(new C28361b(this, interfaceC28331a));
        setVideoPath(intent.getStringExtra("video_url"));
    }
}
