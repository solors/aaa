package com.iab.omid.library.appodeal.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.appodeal.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.appodeal.weakreference.C17925a;

/* renamed from: com.iab.omid.library.appodeal.internal.e */
/* loaded from: classes6.dex */
public class C17880e {

    /* renamed from: a */
    private final C17925a f45070a;

    /* renamed from: b */
    private final String f45071b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f45072c;

    /* renamed from: d */
    private final String f45073d;

    public C17880e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        this.f45070a = new C17925a(view);
        this.f45071b = view.getClass().getCanonicalName();
        this.f45072c = friendlyObstructionPurpose;
        this.f45073d = str;
    }

    /* renamed from: a */
    public String m64885a() {
        return this.f45073d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose m64884b() {
        return this.f45072c;
    }

    /* renamed from: c */
    public C17925a m64883c() {
        return this.f45070a;
    }

    /* renamed from: d */
    public String m64882d() {
        return this.f45071b;
    }
}
