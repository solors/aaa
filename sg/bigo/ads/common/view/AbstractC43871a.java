package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.IntRange;
import sg.bigo.ads.common.p907ab.C43593a;
import sg.bigo.ads.common.utils.C43841u;

/* renamed from: sg.bigo.ads.common.view.a */
/* loaded from: classes10.dex */
public abstract class AbstractC43871a extends ViewGroup {

    /* renamed from: a */
    private int f114870a;

    /* renamed from: b */
    private boolean f114871b;

    /* renamed from: c */
    private AbstractRunnableC43873a f114872c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.view.a$a */
    /* loaded from: classes10.dex */
    public static abstract class AbstractRunnableC43873a implements Runnable {

        /* renamed from: b */
        boolean f114874b;

        private AbstractRunnableC43873a() {
        }

        /* synthetic */ AbstractRunnableC43873a(byte b) {
            this();
        }

        /* renamed from: a */
        protected abstract void mo4721a();

        @Override // java.lang.Runnable
        public void run() {
            if (this.f114874b) {
                return;
            }
            mo4721a();
        }
    }

    public AbstractC43871a(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private synchronized void m4726a(boolean z) {
        AbstractRunnableC43873a abstractRunnableC43873a = this.f114872c;
        if (abstractRunnableC43873a != null) {
            abstractRunnableC43873a.f114874b = true;
            this.f114872c = null;
        }
        if (z) {
            AbstractRunnableC43873a abstractRunnableC43873a2 = new AbstractRunnableC43873a() { // from class: sg.bigo.ads.common.view.a.1
                @Override // sg.bigo.ads.common.view.AbstractC43871a.AbstractRunnableC43873a
                /* renamed from: a */
                protected final void mo4721a() {
                    if (AbstractC43871a.this.f114871b && AbstractC43871a.this.mo4725b() && C43841u.m4795c(AbstractC43871a.this) && C43593a.m5331a(AbstractC43871a.this, new Rect())) {
                        AbstractC43871a.this.mo4728a();
                    }
                    AbstractC43871a abstractC43871a = AbstractC43871a.this;
                    abstractC43871a.postDelayed(this, abstractC43871a.f114870a);
                }
            };
            this.f114872c = abstractRunnableC43873a2;
            postDelayed(abstractRunnableC43873a2, this.f114870a);
        }
    }

    /* renamed from: a */
    protected abstract void mo4728a();

    /* renamed from: b */
    protected abstract boolean mo4725b();

    /* renamed from: c */
    public final void m4723c() {
        if (this.f114871b) {
            return;
        }
        this.f114871b = true;
        m4726a(true);
    }

    /* renamed from: d */
    public final void m4722d() {
        this.f114871b = false;
        m4726a(false);
    }

    public int getFlipInterval() {
        return this.f114870a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m4726a(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m4726a(false);
    }

    public void setFlipInterval(@IntRange(from = 0) int i) {
        this.f114870a = i;
    }

    public AbstractC43871a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC43871a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f114870a = 3000;
        this.f114871b = false;
    }
}
