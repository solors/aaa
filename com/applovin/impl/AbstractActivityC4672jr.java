package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.C4176cc;
import com.applovin.impl.sdk.C5416j;
import com.applovin.sdk.C6200R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.jr */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC4672jr extends AbstractActivityC5263re {

    /* renamed from: a */
    private String f7268a;

    /* renamed from: b */
    private C5416j f7269b;

    /* renamed from: c */
    private AbstractView$OnClickListenerC4251dc f7270c;

    /* renamed from: com.applovin.impl.jr$a */
    /* loaded from: classes2.dex */
    class C4673a extends AbstractView$OnClickListenerC4251dc {

        /* renamed from: f */
        final /* synthetic */ List f7271f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4673a(Context context, List list) {
            super(context);
            this.f7271f = list;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: a */
        protected C4176cc mo93837a() {
            return new C4176cc.C4178b(C4176cc.EnumC4179c.SECTION_CENTERED).m100198d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").m100211a();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: b */
        protected int mo92914b() {
            return 1;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: c */
        protected List mo92913c(int i) {
            return this.f7271f;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: d */
        protected int mo92911d(int i) {
            return this.f7271f.size();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: e */
        protected C4176cc mo92909e(int i) {
            return new C4398fj("SEGMENT TARGETING");
        }
    }

    /* renamed from: a */
    private List m98101a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C4176cc.m100220a(C4176cc.EnumC4179c.DETAIL).m100198d((String) it.next()).m100211a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f7269b;
    }

    public void initialize(String str, List<String> list, C5416j c5416j) {
        this.f7268a = str;
        this.f7269b = c5416j;
        C4673a c4673a = new C4673a(this, m98101a(list));
        this.f7270c = c4673a;
        c4673a.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        setTitle(this.f7268a);
        ((ListView) findViewById(C6200R.C6205id.listView)).setAdapter((ListAdapter) this.f7270c);
    }
}
