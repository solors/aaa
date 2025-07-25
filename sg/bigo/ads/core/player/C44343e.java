package sg.bigo.ads.core.player;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.api.core.C43545a;
import sg.bigo.ads.common.p906aa.C43588b;
import sg.bigo.ads.common.p907ab.C43593a;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.core.player.p973b.C44333b;

/* renamed from: sg.bigo.ads.core.player.e */
/* loaded from: classes10.dex */
public final class C44343e implements C43545a.InterfaceC43547a, C43588b.InterfaceC43591a {

    /* renamed from: a */
    public boolean f116460a;
    @NonNull

    /* renamed from: b */
    final Handler f116461b;

    /* renamed from: c */
    private final ArrayList<WeakReference<View>> f116462c;

    /* renamed from: d */
    private final Runnable f116463d;

    /* renamed from: sg.bigo.ads.core.player.e$a */
    /* loaded from: classes10.dex */
    public static class C44345a {

        /* renamed from: a */
        private static final C44343e f116465a = new C44343e((byte) 0);

        /* renamed from: a */
        public static /* synthetic */ C44343e m3284a() {
            return f116465a;
        }
    }

    private C44343e() {
        this.f116460a = false;
        this.f116461b = new Handler(Looper.getMainLooper());
        this.f116462c = new ArrayList<>();
        this.f116463d = new Runnable() { // from class: sg.bigo.ads.core.player.e.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!C44343e.this.m3287c()) {
                    return;
                }
                C44343e.this.f116461b.postDelayed(this, 500L);
            }
        };
        final C43545a m5422a = C43545a.m5422a();
        C43727d.m5107a(2, new Runnable() { // from class: sg.bigo.ads.api.core.a.1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Iterator it = m5422a.f114069b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        InterfaceC43547a interfaceC43547a = (InterfaceC43547a) ((WeakReference) it.next()).get();
                        if (interfaceC43547a != null && interfaceC43547a == this) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    m5422a.f114069b.add(new WeakReference(this));
                }
            }
        }, 1L);
    }

    /* renamed from: d */
    private synchronized void m3286d() {
        m3285e();
        C43782a.m5010a(0, 3, "VideoPlayerManager", "startCheckTask called");
        this.f116461b.post(this.f116463d);
    }

    /* renamed from: e */
    private synchronized void m3285e() {
        C43782a.m5010a(0, 3, "VideoPlayerManager", "removeCheckTask called");
        this.f116461b.removeCallbacksAndMessages(null);
        m3287c();
    }

    @Override // sg.bigo.ads.api.core.C43545a.InterfaceC43547a
    /* renamed from: a */
    public final void mo3292a() {
        m3286d();
        C43782a.m5010a(0, 3, "VideoPlayerManager", "onActivityResumed");
    }

    @Override // sg.bigo.ads.api.core.C43545a.InterfaceC43547a
    /* renamed from: b */
    public final void mo3289b() {
        C43782a.m5010a(0, 3, "VideoPlayerManager", "onActivityPaused");
        m3285e();
    }

    /* renamed from: c */
    final synchronized boolean m3287c() {
        boolean z;
        C44333b c44333b;
        int playStatus;
        Rect rect;
        if (this.f116462c.isEmpty()) {
            return false;
        }
        Context context = C43617a.f114190a;
        if (context != null && C43588b.m5352a()) {
            z = true;
        } else {
            z = false;
        }
        Iterator<WeakReference<View>> it = this.f116462c.iterator();
        View view = null;
        int i = 0;
        while (it.hasNext()) {
            View view2 = it.next().get();
            if (!(view2 instanceof C44333b)) {
                it.remove();
                C43782a.m5010a(0, 3, "VideoPlayerManager", "playView is recycled, remove it");
            } else {
                if (context == null) {
                    context = view2.getContext();
                }
                float f = 0.0f;
                if (C43593a.m5331a(view2, new Rect())) {
                    float height = view2.getHeight() * 1.0f * view2.getWidth();
                    float height2 = rect.height() * 1.0f * rect.width();
                    if (height <= 0.0f) {
                        C43782a.m5010a(0, 3, "ImpressionChecker", "adView is not visible, width or height is 0");
                    } else {
                        f = height2 / height;
                    }
                }
                int i2 = (int) (100.0f * f);
                if (i2 >= i && i2 >= 50 && z) {
                    if (i2 == i) {
                        ((C44333b) view).m3325i();
                    } else {
                        i = i2;
                    }
                    view = view2;
                }
                ((C44333b) view2).m3325i();
            }
        }
        if (view != null && (playStatus = (c44333b = (C44333b) view).getPlayStatus()) != 2 && playStatus != 5 && playStatus != 0) {
            c44333b.m3327h();
        }
        return z;
    }

    /* synthetic */ C44343e(byte b) {
        this();
    }

    @Override // sg.bigo.ads.common.p906aa.C43588b.InterfaceC43591a
    /* renamed from: a */
    public final void mo3291a(int i) {
        if (i == 1) {
            m3286d();
        }
    }

    /* renamed from: b */
    public final synchronized void m3288b(@NonNull C44333b c44333b) {
        Iterator<WeakReference<View>> it = this.f116462c.iterator();
        while (it.hasNext()) {
            View view = it.next().get();
            if (view != null) {
                if (view == c44333b) {
                    ((C44333b) view).m3325i();
                }
            }
            it.remove();
        }
        C43782a.m5010a(0, 3, "VideoPlayerManager", "unregister player, size = " + this.f116462c.size());
        if (this.f116462c.isEmpty()) {
            m3285e();
        }
    }

    /* renamed from: a */
    public final synchronized void m3290a(@NonNull C44333b c44333b) {
        boolean z;
        Iterator<WeakReference<View>> it = this.f116462c.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            View view = it.next().get();
            if (view == null) {
                it.remove();
            } else if (view == c44333b) {
                z = true;
                break;
            }
        }
        if (z) {
            C43782a.m5007b("VideoPlayerManager", "register playerView exist already");
            return;
        }
        this.f116462c.add(new WeakReference<>(c44333b));
        C43782a.m5010a(0, 3, "VideoPlayerManager", "register playerView, size = " + this.f116462c.size());
        m3286d();
        if (!this.f116460a) {
            this.f116460a = true;
            C43588b.m5348a(this);
        }
    }
}
