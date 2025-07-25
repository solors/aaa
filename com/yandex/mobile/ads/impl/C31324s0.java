package com.yandex.mobile.ads.impl;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.MutableCollections;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.s0 */
/* loaded from: classes8.dex */
public final class C31324s0 {
    @NotNull

    /* renamed from: a */
    private final ArrayList f84967a;

    /* renamed from: com.yandex.mobile.ads.impl.s0$a */
    /* loaded from: classes8.dex */
    static final class C31325a extends Lambda implements Function1<WeakReference<Activity>, Boolean> {

        /* renamed from: b */
        public static final C31325a f84968b = new C31325a();

        C31325a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<Activity> weakReference) {
            boolean z;
            WeakReference<Activity> it = weakReference;
            Intrinsics.checkNotNullParameter(it, "it");
            Activity activity = it.get();
            if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C31324s0(@Nullable Activity activity) {
        ArrayList arrayList = new ArrayList();
        this.f84967a = arrayList;
        if (activity != null) {
            arrayList.add(new WeakReference(activity));
        }
    }

    /* renamed from: a */
    public final void m29889a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        synchronized (this) {
            ArrayList arrayList = this.f84967a;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.m17075f(((WeakReference) it.next()).get(), activity)) {
                        break;
                    }
                }
            }
            this.f84967a.add(new WeakReference(activity));
            Objects.toString(activity);
            um0.m28728a(new Object[0]);
            Unit unit = Unit.f99208a;
        }
    }

    /* renamed from: b */
    public final void m29888b(@NotNull Activity activity) {
        Object obj;
        Intrinsics.checkNotNullParameter(activity, "activity");
        synchronized (this) {
            Iterator it = this.f84967a.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.m17075f(((WeakReference) obj).get(), activity)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            WeakReference weakReference = (WeakReference) obj;
            if (weakReference != null) {
                this.f84967a.remove(weakReference);
                Objects.toString(activity);
                um0.m28728a(new Object[0]);
            }
            Unit unit = Unit.f99208a;
        }
    }

    @Nullable
    /* renamed from: a */
    public final Activity m29890a() {
        Object m17529r0;
        Activity activity;
        synchronized (this) {
            MutableCollections.m17614N(this.f84967a, C31325a.f84968b);
            m17529r0 = _Collections.m17529r0(this.f84967a);
            WeakReference weakReference = (WeakReference) m17529r0;
            activity = weakReference != null ? (Activity) weakReference.get() : null;
        }
        return activity;
    }
}
