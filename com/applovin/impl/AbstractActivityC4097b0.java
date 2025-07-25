package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import com.applovin.impl.AbstractC5223r;
import com.applovin.impl.AbstractView$OnClickListenerC4251dc;
import com.applovin.impl.C4176cc;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.C6200R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.b0 */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC4097b0 extends AbstractActivityC5263re {

    /* renamed from: a */
    private C5939z f4868a;

    /* renamed from: b */
    private C5416j f4869b;

    /* renamed from: c */
    private AbstractView$OnClickListenerC4251dc f4870c;

    /* renamed from: com.applovin.impl.b0$a */
    /* loaded from: classes2.dex */
    class C4098a extends AbstractView$OnClickListenerC4251dc {

        /* renamed from: f */
        final /* synthetic */ C5939z f4871f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4098a(Context context, C5939z c5939z) {
            super(context);
            this.f4871f = c5939z;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: b */
        protected int mo92914b() {
            return this.f4871f.m92602g().size();
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: c */
        protected List mo92913c(int i) {
            ArrayList arrayList = new ArrayList();
            C3980a0 c3980a0 = (C3980a0) this.f4871f.m92602g().get(i);
            arrayList.add(AbstractActivityC4097b0.this.m100587c(c3980a0.m101081c()));
            if (c3980a0.m101082b() != null) {
                arrayList.add(AbstractActivityC4097b0.this.m100594a("AB Test Experiment Name", c3980a0.m101082b()));
            }
            C4730kr m101080d = c3980a0.m101080d();
            AbstractActivityC4097b0 abstractActivityC4097b0 = AbstractActivityC4097b0.this;
            arrayList.add(abstractActivityC4097b0.m100594a("Device ID Targeting", abstractActivityC4097b0.m100595a(m101080d.m97898a())));
            AbstractActivityC4097b0 abstractActivityC4097b02 = AbstractActivityC4097b0.this;
            arrayList.add(abstractActivityC4097b02.m100594a("Device Type Targeting", abstractActivityC4097b02.m100590b(m101080d.m97897b())));
            if (m101080d.m97896c() != null) {
                arrayList.add(AbstractActivityC4097b0.this.m100593a(m101080d.m97896c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: d */
        protected int mo92911d(int i) {
            int i2;
            C3980a0 c3980a0 = (C3980a0) this.f4871f.m92602g().get(i);
            int i3 = 1;
            if (c3980a0.m101082b() != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (c3980a0.m101080d().m97896c() == null) {
                i3 = 0;
            }
            return i2 + 3 + i3;
        }

        @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc
        /* renamed from: e */
        protected C4176cc mo92909e(int i) {
            if (i == EnumC4099b.TARGETED_WATERFALL.ordinal()) {
                return new C4398fj("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            if (i == EnumC4099b.OTHER_WATERFALLS.ordinal()) {
                return new C4398fj("OTHER WATERFALLS");
            }
            return new C4398fj("");
        }
    }

    /* renamed from: com.applovin.impl.b0$b */
    /* loaded from: classes2.dex */
    public enum EnumC4099b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.AbstractActivityC5263re
    protected C5416j getSdk() {
        return this.f4869b;
    }

    public void initialize(final C5939z c5939z, final C5416j c5416j) {
        this.f4868a = c5939z;
        this.f4869b = c5416j;
        C4098a c4098a = new C4098a(this, c5939z);
        this.f4870c = c4098a;
        c4098a.m99823a(new AbstractView$OnClickListenerC4251dc.InterfaceC4252a() { // from class: com.applovin.impl.ts
            @Override // com.applovin.impl.AbstractView$OnClickListenerC4251dc.InterfaceC4252a
            /* renamed from: a */
            public final void mo93836a(C4708kb c4708kb, C4176cc c4176cc) {
                AbstractActivityC4097b0.this.m100598a(c5416j, c5939z, c4708kb, c4176cc);
            }
        });
        this.f4870c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C6200R.C6206layout.mediation_debugger_list_view);
        setTitle(this.f4868a.m92605d());
        ListView listView = (ListView) findViewById(C6200R.C6205id.listView);
        listView.setAdapter((ListAdapter) this.f4870c);
        listView.setDividerHeight(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractActivityC5263re, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AbstractView$OnClickListenerC4251dc abstractView$OnClickListenerC4251dc = this.f4870c;
        if (abstractView$OnClickListenerC4251dc != null) {
            abstractView$OnClickListenerC4251dc.m99823a((AbstractView$OnClickListenerC4251dc.InterfaceC4252a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public String m100590b(String str) {
        return str.equals("phone") ? "Phones" : str.equals("tablet") ? "Tablets" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public C4176cc m100587c(String str) {
        return C4176cc.m100220a(C4176cc.EnumC4179c.RIGHT_DETAIL).m100204b(StringUtils.createSpannedString(str, ViewCompat.MEASURED_STATE_MASK, 18, 1)).m100209a(this).m100206a(true).m100211a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m100595a(String str) {
        return str.equals("idfa") ? "IDFA Only" : str.equals("dnt") ? "No IDFA Only" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m100597a(C5939z c5939z, C4708kb c4708kb, C5416j c5416j, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c5939z, (C3980a0) c5939z.m92602g().get(c4708kb.m97991b()), null, c5416j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m100596a(C5939z c5939z, C4708kb c4708kb, C5416j c5416j, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        C3980a0 c3980a0 = (C3980a0) c5939z.m92602g().get(c4708kb.m97991b());
        maxDebuggerWaterfallSegmentsActivity.initialize(c3980a0.m101081c(), c3980a0.m101080d().m97896c(), c5416j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m100598a(final C5416j c5416j, final C5939z c5939z, final C4708kb c4708kb, C4176cc c4176cc) {
        if (c4708kb.m97992a() == 0) {
            AbstractC5223r.m96217a(this, MaxDebuggerAdUnitDetailActivity.class, c5416j.m95100e(), new AbstractC5223r.InterfaceC5225b() { // from class: com.applovin.impl.rs
                @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
                /* renamed from: a */
                public final void mo93279a(Activity activity) {
                    AbstractActivityC4097b0.m100597a(C5939z.this, c4708kb, c5416j, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        } else {
            AbstractC5223r.m96217a(this, MaxDebuggerWaterfallSegmentsActivity.class, c5416j.m95100e(), new AbstractC5223r.InterfaceC5225b() { // from class: com.applovin.impl.ss
                @Override // com.applovin.impl.AbstractC5223r.InterfaceC5225b
                /* renamed from: a */
                public final void mo93279a(Activity activity) {
                    AbstractActivityC4097b0.m100596a(C5939z.this, c4708kb, c5416j, (MaxDebuggerWaterfallSegmentsActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C4176cc m100594a(String str, String str2) {
        return C4176cc.m100220a(C4176cc.EnumC4179c.RIGHT_DETAIL).m100198d(str).m100200c(str2).m100211a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C4176cc m100593a(List list) {
        C4176cc.C4178b m100198d = C4176cc.m100220a(C4176cc.EnumC4179c.DETAIL).m100198d("Segment Targeting");
        return m100198d.m100208a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).m100209a(this).m100206a(true).m100211a();
    }
}
