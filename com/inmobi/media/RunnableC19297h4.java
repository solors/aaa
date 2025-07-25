package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.h4 */
/* loaded from: classes6.dex */
public final class RunnableC19297h4 implements Runnable {

    /* renamed from: a */
    public final String f48287a;

    /* renamed from: b */
    public final ArrayList f48288b;

    /* renamed from: c */
    public final WeakReference f48289c;

    public RunnableC19297h4(C19311i4 impressionTracker) {
        Intrinsics.checkNotNullParameter(impressionTracker, "impressionTracker");
        this.f48287a = RunnableC19297h4.class.getSimpleName();
        this.f48288b = new ArrayList();
        this.f48289c = new WeakReference(impressionTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Intrinsics.m17074g(this.f48287a);
        C19311i4 c19311i4 = (C19311i4) this.f48289c.get();
        if (c19311i4 != null) {
            for (Map.Entry entry : c19311i4.f48353b.entrySet()) {
                View view = (View) entry.getKey();
                C19283g4 c19283g4 = (C19283g4) entry.getValue();
                Intrinsics.m17074g(this.f48287a);
                Objects.toString(c19283g4);
                if (SystemClock.uptimeMillis() - c19283g4.f48254d >= c19283g4.f48253c) {
                    Intrinsics.m17074g(this.f48287a);
                    c19311i4.f48359h.mo60359a(view, c19283g4.f48251a);
                    this.f48288b.add(view);
                }
            }
            Iterator it = this.f48288b.iterator();
            while (it.hasNext()) {
                c19311i4.m60246a((View) it.next());
            }
            this.f48288b.clear();
            if ((!c19311i4.f48353b.isEmpty()) && !c19311i4.f48356e.hasMessages(0)) {
                c19311i4.f48356e.postDelayed(c19311i4.f48357f, c19311i4.f48358g);
            }
        }
    }
}
