package com.p551my.target;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.p551my.target.InterfaceC26180w;
import com.p551my.target.instreamads.InstreamAdPlayer;

/* renamed from: com.my.target.x2 */
/* loaded from: classes7.dex */
public class C26208x2 extends FrameLayout implements InstreamAdPlayer, InterfaceC26180w.InterfaceC26181a {

    /* renamed from: a */
    public final C26203x f68196a;

    /* renamed from: b */
    public boolean f68197b;

    /* renamed from: c */
    public InstreamAdPlayer.AdPlayerListener f68198c;

    /* renamed from: d */
    public int f68199d;

    /* renamed from: e */
    public int f68200e;

    /* renamed from: f */
    public boolean f68201f;

    /* renamed from: g */
    public boolean f68202g;

    /* renamed from: h */
    public InterfaceC26180w f68203h;

    public C26208x2(Context context) {
        this(context, null);
    }

    @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
    /* renamed from: a */
    public void mo42475a(float f, float f2) {
    }

    @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
    /* renamed from: d */
    public void mo42459d() {
        this.f68202g = true;
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f68198c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoPaused();
        }
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    public void destroy() {
        InterfaceC26180w interfaceC26180w = this.f68203h;
        if (interfaceC26180w != null) {
            interfaceC26180w.destroy();
        }
    }

    @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
    /* renamed from: f */
    public void mo42456f() {
        if (this.f68202g) {
            InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f68198c;
            if (adPlayerListener != null) {
                adPlayerListener.onAdVideoResumed();
            }
            this.f68202g = false;
        }
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    @Nullable
    public InstreamAdPlayer.AdPlayerListener getAdPlayerListener() {
        return this.f68198c;
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    public float getAdVideoDuration() {
        InterfaceC26180w interfaceC26180w = this.f68203h;
        if (interfaceC26180w != null) {
            return interfaceC26180w.getDuration();
        }
        return 0.0f;
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    public float getAdVideoPosition() {
        InterfaceC26180w interfaceC26180w = this.f68203h;
        if (interfaceC26180w != null) {
            return ((float) interfaceC26180w.mo42631j()) / 1000.0f;
        }
        return 0.0f;
    }

    @VisibleForTesting
    public int getPlaceholderHeight() {
        return this.f68200e;
    }

    @VisibleForTesting
    public int getPlaceholderWidth() {
        return this.f68199d;
    }

    @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
    /* renamed from: k */
    public void mo42453k() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f68198c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoStopped();
        }
    }

    @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
    /* renamed from: o */
    public void mo42450o() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener;
        if (!this.f68201f && (adPlayerListener = this.f68198c) != null) {
            adPlayerListener.onAdVideoStarted();
            this.f68201f = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        if (r9 > r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
        if (r9 > r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
        if (r9 > r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0061, code lost:
        r3 = java.lang.Math.round(r1 / r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
        if (r9 > r3) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0078, code lost:
        r1 = java.lang.Math.round(r3 * r8);
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r2 = android.view.View.MeasureSpec.getMode(r9)
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L15
            r0 = r4
        L15:
            if (r2 != 0) goto L18
            r2 = r4
        L18:
            int r5 = r7.f68200e
            if (r5 == 0) goto L8d
            int r6 = r7.f68199d
            if (r6 != 0) goto L22
            goto L8d
        L22:
            float r8 = (float) r6
            float r9 = (float) r5
            float r8 = r8 / r9
            if (r3 == 0) goto L2b
            float r9 = (float) r1
            float r5 = (float) r3
            float r9 = r9 / r5
            goto L2c
        L2b:
            r9 = 0
        L2c:
            r5 = 1073741824(0x40000000, float:2.0)
            if (r0 != r5) goto L33
            if (r2 != r5) goto L33
            goto L81
        L33:
            if (r0 != r4) goto L53
            if (r2 != r4) goto L53
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 >= 0) goto L46
            float r9 = (float) r3
            float r9 = r9 * r8
            int r9 = java.lang.Math.round(r9)
            if (r1 <= 0) goto L68
            if (r9 <= r1) goto L68
            goto L61
        L46:
            float r9 = (float) r1
            float r9 = r9 / r8
            int r9 = java.lang.Math.round(r9)
            if (r3 <= 0) goto L51
            if (r9 <= r3) goto L51
            goto L78
        L51:
            r3 = r9
            goto L81
        L53:
            if (r0 != r4) goto L6a
            if (r2 != r5) goto L6a
            float r9 = (float) r3
            float r9 = r9 * r8
            int r9 = java.lang.Math.round(r9)
            if (r1 <= 0) goto L68
            if (r9 <= r1) goto L68
        L61:
            float r9 = (float) r1
            float r9 = r9 / r8
            int r3 = java.lang.Math.round(r9)
            goto L81
        L68:
            r1 = r9
            goto L81
        L6a:
            if (r0 != r5) goto L7f
            if (r2 != r4) goto L7f
            float r9 = (float) r1
            float r9 = r9 / r8
            int r9 = java.lang.Math.round(r9)
            if (r3 <= 0) goto L51
            if (r9 <= r3) goto L51
        L78:
            float r9 = (float) r3
            float r9 = r9 * r8
            int r1 = java.lang.Math.round(r9)
            goto L81
        L7f:
            r1 = 0
            r3 = r1
        L81:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            super.onMeasure(r8, r9)
            return
        L8d:
            super.onMeasure(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C26208x2.onMeasure(int, int):void");
    }

    @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
    public void onVideoCompleted() {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f68198c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoCompleted();
        }
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    public void pauseAdVideo() {
        InterfaceC26180w interfaceC26180w = this.f68203h;
        if (interfaceC26180w != null) {
            interfaceC26180w.pause();
        }
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    public void playAdVideo(Uri uri, int i, int i2) {
        this.f68199d = i;
        this.f68200e = i2;
        this.f68201f = false;
        if (this.f68203h == null) {
            InterfaceC26180w m43796a = AbstractC25795h5.m43796a(this.f68197b, getContext());
            this.f68203h = m43796a;
            m43796a.mo42641a(this);
        }
        this.f68196a.m42549a(i, i2);
        this.f68203h.mo42642a(uri, this.f68196a);
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    public void resumeAdVideo() {
        InterfaceC26180w interfaceC26180w = this.f68203h;
        if (interfaceC26180w != null) {
            interfaceC26180w.mo42644a();
        }
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    public void setAdPlayerListener(@Nullable InstreamAdPlayer.AdPlayerListener adPlayerListener) {
        this.f68198c = adPlayerListener;
    }

    public void setUseExoPlayer(boolean z) {
        this.f68197b = z;
    }

    @VisibleForTesting
    public void setVideoPlayer(@Nullable C25996p1 c25996p1) {
        this.f68203h = c25996p1;
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    public void setVolume(float f) {
        InterfaceC26180w interfaceC26180w = this.f68203h;
        if (interfaceC26180w != null) {
            interfaceC26180w.setVolume(f);
        }
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    public void stopAdVideo() {
        InterfaceC26180w interfaceC26180w = this.f68203h;
        if (interfaceC26180w != null) {
            interfaceC26180w.stop();
        }
    }

    public C26208x2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
    /* renamed from: a */
    public void mo42466a(String str) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f68198c;
        if (adPlayerListener != null) {
            adPlayerListener.onAdVideoError(str);
        }
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    public void playAdVideo(Uri uri, int i, int i2, float f) {
        playAdVideo(uri, i, i2);
        InterfaceC26180w interfaceC26180w = this.f68203h;
        if (interfaceC26180w != null) {
            interfaceC26180w.seekTo(f * 1000.0f);
        }
    }

    public C26208x2(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, new C26203x(context));
    }

    @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
    /* renamed from: a */
    public void mo42476a(float f) {
        InstreamAdPlayer.AdPlayerListener adPlayerListener = this.f68198c;
        if (adPlayerListener != null) {
            adPlayerListener.onVolumeChanged(f);
        }
    }

    public C26208x2(Context context, AttributeSet attributeSet, int i, C26203x c26203x) {
        super(context, attributeSet, i);
        this.f68197b = true;
        this.f68196a = c26203x;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        addView(c26203x, layoutParams);
    }

    @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
    /* renamed from: e */
    public void mo42457e() {
    }

    @Override // com.p551my.target.instreamads.InstreamAdPlayer
    @NonNull
    public View getView() {
        return this;
    }

    @Override // com.p551my.target.InterfaceC26180w.InterfaceC26181a
    /* renamed from: m */
    public void mo42451m() {
    }
}
