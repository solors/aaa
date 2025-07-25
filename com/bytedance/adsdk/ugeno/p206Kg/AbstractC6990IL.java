package com.bytedance.adsdk.ugeno.p206Kg;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.bytedance.adsdk.ugeno.Kg.IL */
/* loaded from: classes3.dex */
public abstract class AbstractC6990IL {

    /* renamed from: IL */
    private DataSetObserver f14955IL;

    /* renamed from: bg */
    private final DataSetObservable f14956bg = new DataSetObservable();

    /* renamed from: IL */
    public Parcelable m90341IL() {
        return null;
    }

    /* renamed from: bX */
    public void m90340bX() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f14955IL;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f14956bg.notifyChanged();
    }

    /* renamed from: bg */
    public float mo89955bg(int i) {
        return 1.0f;
    }

    /* renamed from: bg */
    public abstract int mo89957bg();

    /* renamed from: bg */
    public abstract boolean mo89952bg(View view, Object obj);

    /* renamed from: bg */
    public int mo89949bg(Object obj) {
        return -1;
    }

    /* renamed from: bg */
    public Object mo89951bg(ViewGroup viewGroup, int i) {
        return m90338bg((View) viewGroup, i);
    }

    /* renamed from: bg */
    public void mo89950bg(ViewGroup viewGroup, int i, Object obj) {
        m90337bg((View) viewGroup, i, obj);
    }

    @Deprecated
    /* renamed from: bg */
    public Object m90338bg(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    /* renamed from: bg */
    public void m90337bg(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m90339bg(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f14955IL = dataSetObserver;
        }
    }
}
