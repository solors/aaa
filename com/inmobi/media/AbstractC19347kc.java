package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.commons.core.configs.AdConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.kc */
/* loaded from: classes6.dex */
public abstract class AbstractC19347kc {

    /* renamed from: a */
    public final InterfaceC19432r f48455a;

    /* renamed from: b */
    public C19440r7 f48456b;

    /* renamed from: c */
    public WeakReference f48457c;

    /* renamed from: d */
    public final AdConfig f48458d;

    public AbstractC19347kc(InterfaceC19432r container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f48455a = container;
        this.f48458d = container.getAdConfig();
    }

    /* renamed from: a */
    public abstract View mo59998a(View view, ViewGroup viewGroup, boolean z);

    /* renamed from: a */
    public void mo60002a() {
        WeakReference weakReference = this.f48457c;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    /* renamed from: a */
    public abstract void mo60001a(byte b);

    /* renamed from: a */
    public abstract void mo60000a(Context context, byte b);

    /* renamed from: a */
    public abstract void mo59999a(View view);

    /* renamed from: a */
    public abstract void mo59997a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose);

    /* renamed from: a */
    public abstract void mo59996a(HashMap hashMap);

    /* renamed from: b */
    public View mo60089b() {
        WeakReference weakReference = this.f48457c;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: c */
    public C19440r7 mo60088c() {
        return this.f48456b;
    }

    /* renamed from: d */
    public View mo60045d() {
        return null;
    }

    /* renamed from: e */
    public abstract void mo59995e();
}
