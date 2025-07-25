package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.unity3d.player.I */
/* loaded from: classes7.dex */
public class C28708I extends FrameLayout {

    /* renamed from: a */
    private C28775a f74540a;

    /* renamed from: b */
    private UnityPlayer f74541b;

    /* renamed from: c */
    private C28800w f74542c;

    public C28708I(Context context, UnityPlayer unityPlayer) {
        super(context);
        int i;
        this.f74542c = new C28800w(context);
        this.f74541b = unityPlayer;
        C28775a c28775a = new C28775a(context, unityPlayer);
        this.f74540a = c28775a;
        c28775a.setId(context.getResources().getIdentifier("unitySurfaceView", "id", context.getPackageName()));
        if (m37742a()) {
            this.f74540a.getHolder().setFormat(-3);
            this.f74540a.setZOrderOnTop(true);
            i = 0;
        } else {
            this.f74540a.getHolder().setFormat(-1);
            i = ViewCompat.MEASURED_STATE_MASK;
        }
        setBackgroundColor(i);
        this.f74540a.getHolder().addCallback(new SurfaceHolder$CallbackC28705H(this));
        this.f74540a.setFocusable(true);
        this.f74540a.setFocusableInTouchMode(true);
        this.f74540a.setContentDescription(m37740a(context));
        addView(this.f74540a, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    /* renamed from: a */
    private String m37740a(Context context) {
        return context.getResources().getString(context.getResources().getIdentifier("game_view_content_description", "string", context.getPackageName()));
    }

    /* renamed from: b */
    public void m37738b() {
        C28800w c28800w = this.f74542c;
        UnityPlayer unityPlayer = this.f74541b;
        PixelCopy$OnPixelCopyFinishedListenerC28799v pixelCopy$OnPixelCopyFinishedListenerC28799v = c28800w.f74901b;
        if (pixelCopy$OnPixelCopyFinishedListenerC28799v != null && pixelCopy$OnPixelCopyFinishedListenerC28799v.getParent() != null) {
            unityPlayer.removeView(c28800w.f74901b);
        }
        this.f74542c.f74901b = null;
    }

    /* renamed from: c */
    public boolean m37736c() {
        C28775a c28775a = this.f74540a;
        return c28775a != null && c28775a.m37642a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m37741a(float f) {
        this.f74540a.m37641a(f);
    }

    /* renamed from: a */
    private boolean m37742a() {
        Activity activity = UnityPlayer.currentActivity;
        if (activity == null) {
            return false;
        }
        TypedArray obtainStyledAttributes = activity.getTheme().obtainStyledAttributes(new int[]{16842840});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
