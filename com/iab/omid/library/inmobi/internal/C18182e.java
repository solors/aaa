package com.iab.omid.library.inmobi.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.weakreference.C18225a;

/* renamed from: com.iab.omid.library.inmobi.internal.e */
/* loaded from: classes6.dex */
public class C18182e {

    /* renamed from: a */
    private final C18225a f45704a;

    /* renamed from: b */
    private final String f45705b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f45706c;

    /* renamed from: d */
    private final String f45707d;

    public C18182e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f45704a = new C18225a(view);
        this.f45705b = view.getClass().getCanonicalName();
        this.f45706c = friendlyObstructionPurpose;
        this.f45707d = str;
    }

    /* renamed from: a */
    public String m63715a() {
        return this.f45707d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m63714b() {
        return this.f45706c;
    }

    /* renamed from: c */
    public C18225a m63713c() {
        return this.f45704a;
    }

    /* renamed from: d */
    public String m63712d() {
        return this.f45705b;
    }
}
