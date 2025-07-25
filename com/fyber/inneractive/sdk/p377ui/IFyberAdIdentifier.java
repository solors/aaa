package com.fyber.inneractive.sdk.p377ui;

import android.view.View;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.config.global.features.C14355b;
import com.fyber.inneractive.sdk.config.global.features.EnumC14354a;

/* renamed from: com.fyber.inneractive.sdk.ui.IFyberAdIdentifier */
/* loaded from: classes4.dex */
public abstract class IFyberAdIdentifier {

    /* renamed from: a */
    public ClickListener f30527a;

    /* renamed from: b */
    public final int f30528b;

    /* renamed from: c */
    public final int f30529c;

    /* renamed from: d */
    public final int f30530d;

    /* renamed from: e */
    public final int f30531e;

    /* renamed from: f */
    public final int f30532f;

    /* renamed from: g */
    public final String f30533g;

    /* renamed from: h */
    public final String f30534h;

    /* renamed from: i */
    public final String f30535i;

    /* renamed from: j */
    public final boolean f30536j;

    /* renamed from: k */
    public Corner f30537k = Corner.BOTTOM_LEFT;

    /* renamed from: l */
    public final EnumC14354a f30538l;

    /* renamed from: com.fyber.inneractive.sdk.ui.IFyberAdIdentifier$ClickListener */
    /* loaded from: classes4.dex */
    public interface ClickListener {
        /* renamed from: a */
        void mo76540a();
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IFyberAdIdentifier$Corner */
    /* loaded from: classes4.dex */
    public enum Corner {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT
    }

    public IFyberAdIdentifier(C14388r c14388r) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f30528b = 0;
        this.f30529c = 0;
        this.f30530d = 0;
        this.f30531e = 0;
        this.f30532f = 0;
        this.f30533g = null;
        this.f30534h = "";
        this.f30535i = "";
        this.f30536j = false;
        this.f30538l = C14355b.f27196e;
        if (c14388r != null) {
            C14355b c14355b = (C14355b) c14388r.m77927a(C14355b.class);
            Integer mo77934a = c14355b.mo77934a("ad_identifier_text_size_w");
            if (mo77934a != null) {
                i = mo77934a.intValue();
            } else {
                i = 110;
            }
            this.f30528b = i;
            Integer mo77934a2 = c14355b.mo77934a("ad_identifier_text_size_h");
            if (mo77934a2 != null) {
                i2 = mo77934a2.intValue();
            } else {
                i2 = 18;
            }
            this.f30529c = i2;
            Integer mo77934a3 = c14355b.mo77934a("ad_identifier_image_size_w");
            if (mo77934a3 != null) {
                i3 = mo77934a3.intValue();
            } else {
                i3 = 18;
            }
            this.f30530d = i3;
            Integer mo77934a4 = c14355b.mo77934a("ad_identifier_image_size_h");
            this.f30531e = mo77934a4 != null ? mo77934a4.intValue() : 18;
            Integer mo77934a5 = c14355b.mo77934a("ad_identifier_text_size");
            if (mo77934a5 != null) {
                i4 = mo77934a5.intValue();
            } else {
                i4 = 8;
            }
            this.f30532f = i4;
            this.f30533g = c14355b.mo77933a("ad_identifier_tint_color", "#75DCDCDC");
            this.f30538l = c14355b.m77956d();
            this.f30534h = c14355b.mo77933a("ad_identifier_text", "Tap for more information");
            this.f30535i = c14355b.mo77933a("ad_identifier_icon_url", null);
            this.f30536j = true;
        }
    }

    /* renamed from: a */
    public abstract void mo76541a(View view);
}
