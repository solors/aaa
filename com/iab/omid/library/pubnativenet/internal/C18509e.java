package com.iab.omid.library.pubnativenet.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubnativenet.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.pubnativenet.weakreference.C18554a;

/* renamed from: com.iab.omid.library.pubnativenet.internal.e */
/* loaded from: classes6.dex */
public class C18509e {

    /* renamed from: a */
    private final C18554a f46363a;

    /* renamed from: b */
    private final String f46364b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f46365c;

    /* renamed from: d */
    private final String f46366d;

    public C18509e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f46363a = new C18554a(view);
        this.f46364b = view.getClass().getCanonicalName();
        this.f46365c = friendlyObstructionPurpose;
        this.f46366d = str;
    }

    /* renamed from: a */
    public String m62480a() {
        return this.f46366d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m62479b() {
        return this.f46365c;
    }

    /* renamed from: c */
    public C18554a m62478c() {
        return this.f46363a;
    }

    /* renamed from: d */
    public String m62477d() {
        return this.f46364b;
    }
}
