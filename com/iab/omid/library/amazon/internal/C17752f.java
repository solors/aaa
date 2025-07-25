package com.iab.omid.library.amazon.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.amazon.internal.f */
/* loaded from: classes6.dex */
public class C17752f {

    /* renamed from: b */
    private static final Pattern f44816b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C17751e> f44817a = new ArrayList();

    /* renamed from: b */
    private C17751e m65358b(View view) {
        for (C17751e c17751e : this.f44817a) {
            if (c17751e.m65365c().get() == view) {
                return c17751e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C17751e> m65363a() {
        return this.f44817a;
    }

    /* renamed from: c */
    public void m65357c(View view) {
        m65362a(view);
        C17751e m65358b = m65358b(view);
        if (m65358b != null) {
            this.f44817a.remove(m65358b);
        }
    }

    /* renamed from: a */
    private void m65362a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m65359b() {
        this.f44817a.clear();
    }

    /* renamed from: a */
    public void m65361a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m65362a(view);
        m65360a(str);
        if (m65358b(view) == null) {
            this.f44817a.add(new C17751e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m65360a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f44816b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
