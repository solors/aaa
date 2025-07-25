package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.applovin.impl.bc */
/* loaded from: classes2.dex */
public class C4116bc {

    /* renamed from: a */
    public TextView f4987a;

    /* renamed from: b */
    public TextView f4988b;

    /* renamed from: c */
    public ImageView f4989c;

    /* renamed from: d */
    public ImageView f4990d;

    /* renamed from: e */
    private C4176cc f4991e;

    /* renamed from: f */
    private int f4992f;

    /* renamed from: a */
    public int m100478a() {
        return this.f4992f;
    }

    /* renamed from: b */
    public C4176cc m100475b() {
        return this.f4991e;
    }

    /* renamed from: a */
    public void m100477a(int i) {
        this.f4992f = i;
    }

    /* renamed from: a */
    public void m100476a(C4176cc c4176cc) {
        this.f4991e = c4176cc;
        this.f4987a.setText(c4176cc.mo93833k());
        this.f4987a.setTextColor(c4176cc.m100214l());
        if (this.f4988b != null) {
            if (!TextUtils.isEmpty(c4176cc.mo93106f())) {
                this.f4988b.setTypeface(null, 0);
                this.f4988b.setVisibility(0);
                this.f4988b.setText(c4176cc.mo93106f());
                this.f4988b.setTextColor(c4176cc.mo92900g());
                if (c4176cc.mo93105p()) {
                    this.f4988b.setTypeface(null, 1);
                }
            } else {
                this.f4988b.setVisibility(8);
            }
        }
        if (this.f4989c != null) {
            if (c4176cc.mo100217h() > 0) {
                this.f4989c.setImageResource(c4176cc.mo100217h());
                this.f4989c.setColorFilter(c4176cc.m100216i());
                this.f4989c.setVisibility(0);
            } else {
                this.f4989c.setVisibility(8);
            }
        }
        if (this.f4990d != null) {
            if (c4176cc.mo93835d() > 0) {
                this.f4990d.setImageResource(c4176cc.mo93835d());
                this.f4990d.setColorFilter(c4176cc.mo93834e());
                this.f4990d.setVisibility(0);
                return;
            }
            this.f4990d.setVisibility(8);
        }
    }
}
