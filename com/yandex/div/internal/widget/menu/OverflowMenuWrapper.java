package com.yandex.div.internal.widget.menu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.PopupMenu;
import p1072z8.C45188d;
import p1072z8.C45189e;

/* renamed from: com.yandex.div.internal.widget.menu.c */
/* loaded from: classes8.dex */
public class OverflowMenuWrapper {
    @NonNull

    /* renamed from: a */
    private final Context f76209a;
    @NonNull

    /* renamed from: b */
    private final View f76210b;
    @Nullable

    /* renamed from: c */
    private final ViewGroup f76211c;

    /* renamed from: d */
    private int f76212d;
    @ColorInt

    /* renamed from: e */
    private int f76213e;
    @IntRange(from = 0, m105510to = 255)

    /* renamed from: f */
    private int f76214f;

    /* renamed from: g */
    private int f76215g;
    @DrawableRes

    /* renamed from: h */
    private int f76216h;
    @Nullable

    /* renamed from: i */
    private InterfaceC29825a f76217i;
    @Nullable

    /* renamed from: j */
    private View[] f76218j;
    @Nullable

    /* renamed from: k */
    private View[] f76219k;

    /* renamed from: l */
    private boolean f76220l;
    @DimenRes

    /* renamed from: m */
    private final int f76221m;
    @DimenRes

    /* renamed from: n */
    private final int f76222n;
    @Nullable

    /* renamed from: o */
    private PopupMenu f76223o;

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, @Nullable ViewGroup viewGroup) {
        this(context, view, viewGroup, C45188d.overflow_menu_margin_horizontal, C45188d.overflow_menu_margin_vertical);
    }

    /* renamed from: a */
    public static /* synthetic */ void m36281a(OverflowMenuWrapper overflowMenuWrapper, View view) {
        overflowMenuWrapper.m36278d(view);
    }

    /* renamed from: d */
    public /* synthetic */ void m36278d(View view) {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view, this.f76215g);
        InterfaceC29825a interfaceC29825a = this.f76217i;
        if (interfaceC29825a != null) {
            interfaceC29825a.mo1556a(popupMenu);
        }
        popupMenu.show();
        InterfaceC29825a interfaceC29825a2 = this.f76217i;
        if (interfaceC29825a2 != null) {
            interfaceC29825a2.mo36275b();
        }
        this.f76223o = popupMenu;
    }

    /* renamed from: b */
    public void m36280b() {
        PopupMenu popupMenu = this.f76223o;
        if (popupMenu != null) {
            popupMenu.dismiss();
            this.f76223o = null;
        }
    }

    /* renamed from: c */
    public View.OnClickListener m36279c() {
        return new View.OnClickListener() { // from class: com.yandex.div.internal.widget.menu.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverflowMenuWrapper.m36281a(OverflowMenuWrapper.this, view);
            }
        };
    }

    @NonNull
    /* renamed from: e */
    public OverflowMenuWrapper m36277e(@NonNull InterfaceC29825a interfaceC29825a) {
        this.f76217i = interfaceC29825a;
        return this;
    }

    @NonNull
    /* renamed from: f */
    public OverflowMenuWrapper m36276f(int i) {
        this.f76212d = i;
        return this;
    }

    public OverflowMenuWrapper(@NonNull Context context, @NonNull View view, @Nullable ViewGroup viewGroup, @DimenRes int i, @DimenRes int i2) {
        this.f76212d = 51;
        this.f76213e = -1;
        this.f76214f = 255;
        this.f76215g = 83;
        this.f76216h = C45189e.ic_more_vert_white_24dp;
        this.f76218j = null;
        this.f76219k = null;
        this.f76220l = false;
        this.f76209a = context;
        this.f76210b = view;
        this.f76211c = viewGroup;
        this.f76221m = i;
        this.f76222n = i2;
    }

    /* compiled from: OverflowMenuWrapper.java */
    /* renamed from: com.yandex.div.internal.widget.menu.c$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC29825a {
        /* renamed from: a */
        void mo1556a(@NonNull PopupMenu popupMenu);

        /* renamed from: b */
        void mo36275b();

        /* compiled from: OverflowMenuWrapper.java */
        /* renamed from: com.yandex.div.internal.widget.menu.c$a$a */
        /* loaded from: classes8.dex */
        public static class C29826a implements InterfaceC29825a {
            @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.InterfaceC29825a
            /* renamed from: b */
            public void mo36275b() {
            }
        }
    }
}
