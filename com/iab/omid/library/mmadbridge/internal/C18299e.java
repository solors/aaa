package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.weakreference.C18344a;

/* renamed from: com.iab.omid.library.mmadbridge.internal.e */
/* loaded from: classes6.dex */
public class C18299e {

    /* renamed from: a */
    private final C18344a f45958a;

    /* renamed from: b */
    private final String f45959b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f45960c;

    /* renamed from: d */
    private final String f45961d;

    public C18299e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f45958a = new C18344a(view);
        this.f45959b = view.getClass().getCanonicalName();
        this.f45960c = friendlyObstructionPurpose;
        this.f45961d = str;
    }

    /* renamed from: a */
    public String m63239a() {
        return this.f45961d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m63238b() {
        return this.f45960c;
    }

    /* renamed from: c */
    public C18344a m63237c() {
        return this.f45958a;
    }

    /* renamed from: d */
    public String m63236d() {
        return this.f45959b;
    }
}
