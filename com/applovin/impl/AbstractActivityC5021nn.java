package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.C5280rn;
import com.applovin.impl.sdk.C5416j;
import com.applovin.sdk.C6200R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.nn */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC5021nn extends AbstractActivityC5263re {

    /* renamed from: a */
    private C5416j f8627a;

    /* renamed from: b */
    private AbstractView$OnClickListenerC4251dc f8628b;

    /* renamed from: com.applovin.impl.nn$a */
    /* loaded from: classes2.dex */
    class C5022a extends AbstractView$OnClickListenerC4251dc {

        /* renamed from: f */
        final /* synthetic */ ArrayList f8629f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f8630g;

        /* renamed from: h */
        final /* synthetic */ boolean f8631h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5022a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z) {
            super(context);
            this.f8629f = arrayList;
            this.f8630g = arrayList2;
            this.f8631h = z;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: b */
        protected int mo92914b() {
            return EnumC5023b.values().length;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: c */
        protected List mo92913c(int i) {
            if (i == EnumC5023b.TC_NETWORKS.ordinal()) {
                return this.f8629f;
            }
            return this.f8630g;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: d */
        protected int mo92911d(int i) {
            if (i == EnumC5023b.TC_NETWORKS.ordinal()) {
                return this.f8629f.size();
            }
            return this.f8630g.size();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: e */
        protected C4176cc mo92909e(int i) {
            String str;
            if (i == EnumC5023b.TC_NETWORKS.ordinal()) {
                return new C4398fj("TCF VENDORS (TC STRING)");
            }
            if (this.f8631h) {
                str = "ATP NETWORKS (AC STRING)";
            } else {
                str = "APPLOVIN PRIVACY SETTING";
            }
            return new C4398fj(str);
        }
    }

    /* renamed from: com.applovin.impl.nn$b */
    /* loaded from: classes2.dex */
    private enum EnumC5023b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    /* renamed from: a */
    private C4176cc m96929a(String str, String str2) {
        return C4176cc.m100221a().m100198d(str).m100200c(str2).m100211a();
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f8627a;
    }

    public void initialize(C5416j c5416j) {
        this.f8627a = c5416j;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String m101057a = AbstractC3987a4.m101061b().m101057a(this);
        boolean m96270b = c5416j.m95079j0().m96270b();
        if (!m96270b) {
            arrayList2.add(m96929a("Has User Consent", m101057a));
        }
        for (C5280rn c5280rn : c5416j.m95079j0().m96257i()) {
            Boolean m95808a = c5280rn.m95808a();
            if (m95808a != null) {
                if (c5280rn.m95802f() == C5280rn.EnumC5281a.TCF_VENDOR) {
                    arrayList.add(m96929a(c5280rn.m95806b(), String.valueOf(m95808a)));
                } else if (c5280rn.m95802f() == C5280rn.EnumC5281a.ATP_NETWORK) {
                    arrayList2.add(m96929a(c5280rn.m95806b(), String.valueOf(m95808a)));
                }
            } else if (m96270b && c5280rn.m95802f() == C5280rn.EnumC5281a.ATP_NETWORK) {
                arrayList2.add(m96929a(c5280rn.m95806b(), m101057a));
            }
        }
        C5022a c5022a = new C5022a(this, arrayList, arrayList2, m96270b);
        this.f8628b = c5022a;
        c5022a.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(C6200R.C6205id.listView)).setAdapter((ListAdapter) this.f8628b);
    }
}
