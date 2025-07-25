package com.applovin.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C6200R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.dc */
/* loaded from: classes2.dex */
public abstract class AbstractView$OnClickListenerC4251dc extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a */
    protected Context f5609a;

    /* renamed from: b */
    private List f5610b = new ArrayList();

    /* renamed from: c */
    private Map f5611c = new HashMap();

    /* renamed from: d */
    private InterfaceC4252a f5612d;

    /* renamed from: com.applovin.impl.dc$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4252a {
        /* renamed from: a */
        void mo93836a(C4708kb c4708kb, C4176cc c4176cc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractView$OnClickListenerC4251dc(Context context) {
        this.f5609a = context.getApplicationContext();
    }

    /* renamed from: a */
    protected C4176cc mo93837a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: b */
    protected abstract int mo92914b();

    @Override // android.widget.Adapter
    /* renamed from: b */
    public C4176cc getItem(int i) {
        return (C4176cc) this.f5610b.get(i);
    }

    /* renamed from: c */
    protected abstract List mo92913c(int i);

    /* renamed from: c */
    public void m99821c() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.su
            @Override // java.lang.Runnable
            public final void run() {
                AbstractView$OnClickListenerC4251dc.this.notifyDataSetChanged();
            }
        });
    }

    /* renamed from: d */
    protected abstract int mo92911d(int i);

    /* renamed from: e */
    protected abstract C4176cc mo92909e(int i);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5610b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).m100213m();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C4116bc c4116bc;
        C4176cc item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.m100215j(), viewGroup, false);
            c4116bc = new C4116bc();
            c4116bc.f4987a = (TextView) view.findViewById(16908308);
            c4116bc.f4988b = (TextView) view.findViewById(16908309);
            c4116bc.f4989c = (ImageView) view.findViewById(C6200R.C6205id.imageView);
            c4116bc.f4990d = (ImageView) view.findViewById(C6200R.C6205id.detailImageView);
            view.setTag(c4116bc);
            view.setOnClickListener(this);
            view.setBackground(m99824a(view));
        } else {
            c4116bc = (C4116bc) view.getTag();
        }
        c4116bc.m100477a(i);
        c4116bc.m100476a(item);
        view.setEnabled(item.mo92899o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return C4176cc.m100212n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return getItem(i).mo92899o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i;
        this.f5610b = new ArrayList();
        int mo92914b = mo92914b();
        this.f5611c = new HashMap(mo92914b);
        C4176cc mo93837a = mo93837a();
        if (mo93837a != null) {
            this.f5610b.add(mo93837a);
            i = 1;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < mo92914b; i2++) {
            int mo92911d = mo92911d(i2);
            if (mo92911d != 0) {
                this.f5610b.add(mo92909e(i2));
                this.f5610b.addAll(mo92913c(i2));
                this.f5611c.put(Integer.valueOf(i2), Integer.valueOf(i));
                i += mo92911d + 1;
            }
        }
        this.f5610b.add(new C4398fj(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C4116bc c4116bc = (C4116bc) view.getTag();
        C4176cc m100475b = c4116bc.m100475b();
        C4708kb m99825a = m99825a(c4116bc.m100478a());
        InterfaceC4252a interfaceC4252a = this.f5612d;
        if (interfaceC4252a != null && m99825a != null) {
            interfaceC4252a.mo93836a(m99825a, m100475b);
        }
    }

    /* renamed from: a */
    private Drawable m99824a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AbstractC5539t3.m94551a(C6200R.C6202color.applovin_sdk_highlightListItemColor, this.f5609a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }

    /* renamed from: a */
    private C4708kb m99825a(int i) {
        for (int i2 = 0; i2 < mo92914b(); i2++) {
            Integer num = (Integer) this.f5611c.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + mo92911d(i2)) {
                    return new C4708kb(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m99823a(InterfaceC4252a interfaceC4252a) {
        this.f5612d = interfaceC4252a;
    }
}
