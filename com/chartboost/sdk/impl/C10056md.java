package com.chartboost.sdk.impl;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.chartboost.sdk.impl.md */
/* loaded from: classes3.dex */
public class C10056md {

    /* renamed from: b */
    public static final Pattern f22639b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    public final List f22640a = new ArrayList();

    /* renamed from: a */
    public List m81055a() {
        return this.f22640a;
    }

    /* renamed from: b */
    public final C9936hd m81050b(View view) {
        for (C9936hd c9936hd : this.f22640a) {
            if (c9936hd.m81456c().get() == view) {
                return c9936hd;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m81054a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    /* renamed from: b */
    public void m81051b() {
        this.f22640a.clear();
    }

    /* renamed from: a */
    public void m81053a(View view, EnumC9955i5 enumC9955i5, String str) {
        m81054a(view);
        m81052a(str);
        if (m81050b(view) == null) {
            this.f22640a.add(new C9936hd(view, enumC9955i5, str));
        }
    }

    /* renamed from: a */
    public final void m81052a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f22639b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }
}
