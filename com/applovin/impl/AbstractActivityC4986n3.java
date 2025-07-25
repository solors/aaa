package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.AbstractView$OnClickListenerC4251dc;
import com.applovin.impl.C4176cc;
import com.applovin.impl.C5280rn;
import com.applovin.impl.sdk.C5416j;
import com.applovin.sdk.C6200R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.n3 */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC4986n3 extends AbstractActivityC5263re {

    /* renamed from: a */
    private C5416j f8496a;

    /* renamed from: b */
    private AbstractView$OnClickListenerC4251dc f8497b;

    /* renamed from: com.applovin.impl.n3$a */
    /* loaded from: classes2.dex */
    class C4987a extends AbstractView$OnClickListenerC4251dc {

        /* renamed from: f */
        final /* synthetic */ List f8498f;

        /* renamed from: g */
        final /* synthetic */ List f8499g;

        /* renamed from: h */
        final /* synthetic */ List f8500h;

        /* renamed from: i */
        final /* synthetic */ List f8501i;

        /* renamed from: j */
        final /* synthetic */ List f8502j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4987a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f8498f = list;
            this.f8499g = list2;
            this.f8500h = list3;
            this.f8501i = list4;
            this.f8502j = list5;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: b */
        protected int mo92914b() {
            return EnumC4989c.values().length;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: c */
        protected List mo92913c(int i) {
            List<C5280rn> list;
            boolean z = true;
            if (i == EnumC4989c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f8498f;
            } else if (i == EnumC4989c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f8499g;
            } else {
                z = false;
                if (i == EnumC4989c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.f8500h;
                } else if (i == EnumC4989c.LISTED_AC_NETWORKS.ordinal()) {
                    list = this.f8501i;
                } else {
                    list = this.f8502j;
                }
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (C5280rn c5280rn : list) {
                arrayList.add(AbstractActivityC4986n3.this.m97036a(c5280rn, z));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: d */
        protected int mo92911d(int i) {
            if (i == EnumC4989c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f8498f.size();
            }
            if (i == EnumC4989c.MISSING_AC_NETWORKS.ordinal()) {
                return this.f8499g.size();
            }
            if (i == EnumC4989c.LISTED_TC_NETWORKS.ordinal()) {
                return this.f8500h.size();
            }
            if (i == EnumC4989c.LISTED_AC_NETWORKS.ordinal()) {
                return this.f8501i.size();
            }
            return this.f8502j.size();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: e */
        protected C4176cc mo92909e(int i) {
            if (i == EnumC4989c.MISSING_TC_NETWORKS.ordinal()) {
                return new C4398fj("MISSING TCF VENDORS (TC STRING)");
            }
            if (i == EnumC4989c.MISSING_AC_NETWORKS.ordinal()) {
                return new C4398fj("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i == EnumC4989c.LISTED_TC_NETWORKS.ordinal()) {
                return new C4398fj("LISTED TCF VENDORS (TC STRING)");
            }
            if (i == EnumC4989c.LISTED_AC_NETWORKS.ordinal()) {
                return new C4398fj("LISTED ATP NETWORKS (AC STRING)");
            }
            return new C4398fj("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* renamed from: com.applovin.impl.n3$b */
    /* loaded from: classes2.dex */
    class C4988b implements AbstractView$OnClickListenerC4251dc.InterfaceC4252a {
        C4988b() {
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc.InterfaceC4252a
        /* renamed from: a */
        public void mo93836a(C4708kb c4708kb, C4176cc c4176cc) {
            AbstractC5927yp.m92679a(c4176cc.m100218c(), c4176cc.m100219b(), AbstractActivityC4986n3.this);
        }
    }

    /* renamed from: com.applovin.impl.n3$c */
    /* loaded from: classes2.dex */
    private enum EnumC4989c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f8496a;
    }

    public void initialize(List<C5280rn> list, List<C5280rn> list2, List<C5280rn> list3, List<C5280rn> list4, List<C5280rn> list5, C5416j c5416j) {
        this.f8496a = c5416j;
        C4987a c4987a = new C4987a(this, list, list2, list3, list4, list5);
        this.f8497b = c4987a;
        c4987a.m99823a(new C4988b());
        this.f8497b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(C6200R.C6205id.listView)).setAdapter((ListAdapter) this.f8497b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C4176cc m97036a(C5280rn c5280rn, boolean z) {
        C4176cc.C4178b m100221a = C4176cc.m100221a();
        boolean m96270b = this.f8496a.m95079j0().m96270b();
        C5280rn.EnumC5281a m95802f = c5280rn.m95802f();
        C5280rn.EnumC5281a enumC5281a = C5280rn.EnumC5281a.TCF_VENDOR;
        if (m95802f != enumC5281a && (c5280rn.m95802f() != C5280rn.EnumC5281a.ATP_NETWORK || !m96270b)) {
            m100221a.m100198d(c5280rn.m95806b());
        } else {
            String m95805c = c5280rn.m95805c();
            String str = c5280rn.m95802f() == enumC5281a ? "IAB Vendor ID: " : "Google ATP ID: ";
            C4176cc.C4178b m100203b = m100221a.m100198d(m95805c).m100199d(z ? SupportMenu.CATEGORY_MASK : ViewCompat.MEASURED_STATE_MASK).m100203b(m95805c);
            m100203b.m100207a(str + c5280rn.m95804d()).m100206a(true);
        }
        return m100221a.m100211a();
    }
}
