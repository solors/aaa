package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.applovin.impl.adview.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4028e extends View {

    /* renamed from: a */
    protected float f4657a;

    /* renamed from: b */
    protected final Context f4658b;

    /* renamed from: com.applovin.impl.adview.e$a */
    /* loaded from: classes2.dex */
    public enum EnumC4029a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);
        

        /* renamed from: a */
        private final int f4664a;

        EnumC4029a(int i) {
            this.f4664a = i;
        }

        /* renamed from: b */
        public int m100857b() {
            return this.f4664a;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4028e(Context context) {
        super(context);
        this.f4657a = 1.0f;
        this.f4658b = context;
    }

    /* renamed from: a */
    public void mo100836a(int i) {
        setViewScale(i / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f4657a * 30.0f;
    }

    public abstract EnumC4029a getStyle();

    public void setViewScale(float f) {
        this.f4657a = f;
    }

    /* renamed from: a */
    public static AbstractC4028e m100859a(EnumC4029a enumC4029a, Context context) {
        if (enumC4029a.equals(EnumC4029a.INVISIBLE)) {
            return new C4036h(context);
        }
        if (enumC4029a.equals(EnumC4029a.WHITE_ON_TRANSPARENT)) {
            return new C4038i(context);
        }
        if (enumC4029a.equals(EnumC4029a.TRANSPARENT_SKIP)) {
            return new C4040j(context);
        }
        return new C4045n(context);
    }
}
