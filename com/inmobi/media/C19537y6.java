package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C19537y6;
import com.ironsource.C21114v8;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.y6 */
/* loaded from: classes6.dex */
public final class C19537y6 {

    /* renamed from: a */
    public final GestureDetector$OnGestureListenerC19100S9 f48929a;

    /* renamed from: b */
    public final InterfaceC18850A4 f48930b;

    /* renamed from: c */
    public C19369m6 f48931c;

    /* renamed from: d */
    public C19327j6 f48932d;

    /* renamed from: e */
    public C19327j6 f48933e;

    /* renamed from: f */
    public C19327j6 f48934f;

    public C19537y6(GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9, InterfaceC18850A4 interfaceC18850A4) {
        this.f48929a = gestureDetector$OnGestureListenerC19100S9;
        this.f48930b = interfaceC18850A4;
    }

    /* renamed from: a */
    public static final boolean m59546a(View view, MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: b */
    public static boolean m59543b() {
        AudioManager audioManager;
        Context m61068d = C18954Ha.m61068d();
        if (m61068d == null) {
            return false;
        }
        Object systemService = m61068d.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            audioManager = (AudioManager) systemService;
        } else {
            audioManager = null;
        }
        if (audioManager == null || !audioManager.isWiredHeadsetOn()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void m59544a(String url, Activity activity) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(activity, "activity");
        InterfaceC18850A4 interfaceC18850A4 = this.f48930b;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("MraidMediaProcessor", "doPlayMedia");
        }
        C19369m6 c19369m6 = new C19369m6(activity, this.f48930b);
        this.f48931c = c19369m6;
        c19369m6.setPlaybackData(url);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        C19369m6 c19369m62 = this.f48931c;
        if (c19369m62 != null) {
            c19369m62.setLayoutParams(layoutParams);
        }
        C19383n6 c19383n6 = new C19383n6(activity);
        c19383n6.setOnTouchListener(new View.OnTouchListener() { // from class: o3.k7
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C19537y6.m59546a(view, motionEvent);
            }
        });
        c19383n6.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        c19383n6.addView(this.f48931c);
        InterfaceC18850A4 interfaceC18850A42 = this.f48930b;
        if (interfaceC18850A42 != null) {
            ((C18864B4) interfaceC18850A42).m61259a("MraidMediaProcessor", "adding media view on top");
        }
        viewGroup.addView(c19383n6, new ViewGroup.LayoutParams(-1, -1));
        C19369m6 c19369m63 = this.f48931c;
        if (c19369m63 != null) {
            c19369m63.setViewContainer(c19383n6);
        }
        C19369m6 c19369m64 = this.f48931c;
        if (c19369m64 != null) {
            c19369m64.requestFocus();
        }
        C19369m6 c19369m65 = this.f48931c;
        if (c19369m65 != null) {
            c19369m65.setOnKeyListener(new View.OnKeyListener() { // from class: o3.l7
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return C19537y6.m59545a(C19537y6.this, view, i, keyEvent);
                }
            });
        }
        C19369m6 c19369m66 = this.f48931c;
        if (c19369m66 != null) {
            c19369m66.setListener(new C19523x6(this));
        }
        C19369m6 c19369m67 = this.f48931c;
        if (c19369m67 != null) {
            c19369m67.m60022a();
        }
    }

    /* renamed from: a */
    public static final boolean m59545a(C19537y6 this$0, View view, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (4 == i && keyEvent.getAction() == 0) {
            C19369m6 c19369m6 = this$0.f48931c;
            if (c19369m6 != null) {
                c19369m6.m60020b();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int m59547a() {
        AdConfig.RenderingConfig renderingConfig;
        InterfaceC18850A4 interfaceC18850A4 = this.f48930b;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("MraidMediaProcessor", C21114v8.C21123i.f54121P);
        }
        Context m61068d = C18954Ha.m61068d();
        if (m61068d == null) {
            return -1;
        }
        GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9 = this.f48929a;
        if (((gestureDetector$OnGestureListenerC19100S9 == null || (renderingConfig = gestureDetector$OnGestureListenerC19100S9.getRenderingConfig()) == null) ? false : renderingConfig.getEnablePubMuteControl()) && C18954Ha.m61057o()) {
            return 0;
        }
        Object systemService = m61068d.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }
}
