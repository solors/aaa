package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.AbstractC5223r;
import com.applovin.impl.AbstractView$OnClickListenerC4251dc;
import com.applovin.impl.C4176cc;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.C6200R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC4155c0 extends AbstractActivityC5263re {

    /* renamed from: a */
    private C5416j f5160a;

    /* renamed from: b */
    private AbstractView$OnClickListenerC4251dc f5161b;

    /* renamed from: c */
    private List f5162c;

    /* renamed from: d */
    private boolean f5163d;

    /* renamed from: f */
    private ListView f5164f;

    /* renamed from: com.applovin.impl.c0$a */
    /* loaded from: classes2.dex */
    class C4156a extends AbstractView$OnClickListenerC4251dc {

        /* renamed from: f */
        final /* synthetic */ List f5165f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4156a(Context context, List list) {
            super(context);
            this.f5165f = list;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: b */
        protected int mo92914b() {
            return 1;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: c */
        protected List mo92913c(int i) {
            return AbstractActivityC4155c0.this.f5162c;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: d */
        protected int mo92911d(int i) {
            return this.f5165f.size();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: e */
        protected C4176cc mo92909e(int i) {
            return new C4398fj("");
        }
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f5160a;
    }

    public void initialize(final List<C5939z> list, boolean z, final C5416j c5416j) {
        this.f5163d = z;
        this.f5160a = c5416j;
        this.f5162c = m100297a(list);
        C4156a c4156a = new C4156a(this, list);
        this.f5161b = c4156a;
        c4156a.m99823a(new AbstractView$OnClickListenerC4251dc.InterfaceC4252a() { // from class: com.applovin.impl.du
            @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc.InterfaceC4252a
            /* renamed from: a */
            public final void mo93836a(C4708kb c4708kb, C4176cc c4176cc) {
                AbstractActivityC4155c0.this.m100296a(list, c5416j, c4708kb, c4176cc);
            }
        });
        this.f5161b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        StringBuilder sb2 = new StringBuilder();
        if (this.f5163d) {
            str = "Selective Init ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("Ad Units");
        setTitle(sb2.toString());
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(C6200R.C6205id.listView);
        this.f5164f = listView;
        listView.setAdapter((ListAdapter) this.f5161b);
    }

    /* renamed from: a */
    private List m100297a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5939z c5939z = (C5939z) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c5939z.m92606c(), ViewCompat.MEASURED_STATE_MASK));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c5939z.m92607b(), ViewCompat.MEASURED_STATE_MASK));
            arrayList.add(C4176cc.m100220a(C4176cc.EnumC4179c.DETAIL).m100204b(StringUtils.createSpannedString(c5939z.m92605d(), ViewCompat.MEASURED_STATE_MASK, 18, 1)).m100208a(new SpannedString(spannableStringBuilder)).m100209a(this).m100206a(true).m100211a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m100296a(List list, final C5416j c5416j, C4708kb c4708kb, C4176cc c4176cc) {
        final C5939z c5939z = (C5939z) list.get(c4708kb.m97992a());
        if (c5939z.m92602g().size() == 1) {
            AbstractC5223r.m96217a(this, MaxDebuggerAdUnitDetailActivity.class, c5416j.m95100e(), new AbstractC5223r.InterfaceC5225b() { // from class: com.applovin.impl.eu
                @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
                /* renamed from: a */
                public final void mo93279a(Activity activity) {
                    ((MaxDebuggerAdUnitDetailActivity) activity).initialize(C5939z.this, null, null, c5416j);
                }
            });
        } else {
            AbstractC5223r.m96217a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, c5416j.m95100e(), new AbstractC5223r.InterfaceC5225b() { // from class: com.applovin.impl.fu
                @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
                /* renamed from: a */
                public final void mo93279a(Activity activity) {
                    ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(C5939z.this, c5416j);
                }
            });
        }
    }
}
