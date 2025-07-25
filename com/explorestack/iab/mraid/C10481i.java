package com.explorestack.iab.mraid;

import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.explorestack.iab.utils.C10512g;

/* renamed from: com.explorestack.iab.mraid.i */
/* loaded from: classes3.dex */
public class C10481i {
    @NonNull

    /* renamed from: a */
    private final Rect f23931a = new Rect();
    @NonNull

    /* renamed from: b */
    private final Rect f23932b = new Rect();
    @NonNull

    /* renamed from: c */
    private final Rect f23933c = new Rect();
    @NonNull

    /* renamed from: d */
    private final Rect f23934d = new Rect();
    @NonNull

    /* renamed from: e */
    private final Rect f23935e = new Rect();
    @NonNull

    /* renamed from: f */
    private final Rect f23936f = new Rect();
    @NonNull

    /* renamed from: g */
    private final Rect f23937g = new Rect();
    @NonNull

    /* renamed from: h */
    private final Rect f23938h = new Rect();

    /* renamed from: i */
    private final float f23939i;

    public C10481i(@NonNull Context context) {
        this.f23939i = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private boolean m79495e(Rect rect, Rect rect2, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && i + i3 == rect.right && i2 + i4 == rect.bottom) {
            return false;
        }
        rect.set(i, i2, i3 + i, i4 + i2);
        m79498b(rect, rect2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public Rect m79499a() {
        return this.f23936f;
    }

    @VisibleForTesting
    /* renamed from: b */
    void m79498b(Rect rect, Rect rect2) {
        rect2.set(C10512g.m79323J(rect.left, this.f23939i), C10512g.m79323J(rect.top, this.f23939i), C10512g.m79323J(rect.right, this.f23939i), C10512g.m79323J(rect.bottom, this.f23939i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m79497c(int i, int i2) {
        if (this.f23931a.width() == i && this.f23931a.height() == i2) {
            return false;
        }
        this.f23931a.set(0, 0, i, i2);
        m79498b(this.f23931a, this.f23932b);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m79496d(int i, int i2, int i3, int i4) {
        return m79495e(this.f23935e, this.f23936f, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: f */
    public Rect m79494f() {
        return this.f23937g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m79493g(int i, int i2, int i3, int i4) {
        return m79495e(this.f23937g, this.f23938h, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: h */
    public Rect m79492h() {
        return this.f23938h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m79491i(int i, int i2, int i3, int i4) {
        return m79495e(this.f23933c, this.f23934d, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: j */
    public Rect m79490j() {
        return this.f23934d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: k */
    public Rect m79489k() {
        return this.f23932b;
    }
}
