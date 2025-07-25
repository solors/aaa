package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.mmadbridge.internal.f */
/* loaded from: classes6.dex */
public class C18300f {

    /* renamed from: b */
    private static final Pattern f45962b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C18299e> f45963a = new ArrayList();

    /* renamed from: b */
    private C18299e m63230b(View view) {
        for (C18299e c18299e : this.f45963a) {
            if (c18299e.m63237c().get() == view) {
                return c18299e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C18299e> m63235a() {
        return this.f45963a;
    }

    /* renamed from: c */
    public void m63229c(View view) {
        m63234a(view);
        C18299e m63230b = m63230b(view);
        if (m63230b != null) {
            this.f45963a.remove(m63230b);
        }
    }

    /* renamed from: a */
    private void m63234a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m63231b() {
        this.f45963a.clear();
    }

    /* renamed from: a */
    public void m63233a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m63234a(view);
        m63232a(str);
        if (m63230b(view) == null) {
            this.f45963a.add(new C18299e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m63232a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f45962b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
