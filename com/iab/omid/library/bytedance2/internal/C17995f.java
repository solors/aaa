package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.iab.omid.library.bytedance2.internal.f */
/* loaded from: classes6.dex */
public class C17995f {

    /* renamed from: b */
    private static final Pattern f45330b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final List<C17994e> f45331a = new ArrayList();

    /* renamed from: b */
    private C17994e m64409b(View view) {
        for (C17994e c17994e : this.f45331a) {
            if (c17994e.m64416c().get() == view) {
                return c17994e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C17994e> m64414a() {
        return this.f45331a;
    }

    /* renamed from: c */
    public void m64408c(View view) {
        m64413a(view);
        C17994e m64409b = m64409b(view);
        if (m64409b != null) {
            this.f45331a.remove(m64409b);
        }
    }

    /* renamed from: a */
    private void m64413a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m64410b() {
        this.f45331a.clear();
    }

    /* renamed from: a */
    public void m64412a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        m64413a(view);
        m64411a(str);
        if (m64409b(view) == null) {
            this.f45331a.add(new C17994e(view, friendlyObstructionPurpose, str));
        }
    }

    /* renamed from: a */
    private void m64411a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f45330b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
