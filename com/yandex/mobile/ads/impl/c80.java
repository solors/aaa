package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class c80 implements InterfaceC31780x {
    @NotNull

    /* renamed from: a */
    private final String f77544a;
    @NotNull

    /* renamed from: b */
    private final List<C30076a> f77545b;

    /* renamed from: com.yandex.mobile.ads.impl.c80$a */
    /* loaded from: classes8.dex */
    public static final class C30076a {
        @NotNull

        /* renamed from: a */
        private final String f77546a;
        @NotNull

        /* renamed from: b */
        private final String f77547b;

        public C30076a(@NotNull String title, @NotNull String url) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f77546a = title;
            this.f77547b = url;
        }

        @NotNull
        /* renamed from: a */
        public final String m35342a() {
            return this.f77546a;
        }

        @NotNull
        /* renamed from: b */
        public final String m35341b() {
            return this.f77547b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30076a)) {
                return false;
            }
            C30076a c30076a = (C30076a) obj;
            if (Intrinsics.m17075f(this.f77546a, c30076a.f77546a) && Intrinsics.m17075f(this.f77547b, c30076a.f77547b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f77547b.hashCode() + (this.f77546a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            String str = this.f77546a;
            String str2 = this.f77547b;
            return "Item(title=" + str + ", url=" + str2 + ")";
        }
    }

    public c80(@NotNull String actionType, @NotNull ArrayList items) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f77544a = actionType;
        this.f77545b = items;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31780x
    @NotNull
    /* renamed from: a */
    public final String mo27604a() {
        return this.f77544a;
    }

    @NotNull
    /* renamed from: c */
    public final List<C30076a> m35343c() {
        return this.f77545b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c80)) {
            return false;
        }
        c80 c80Var = (c80) obj;
        if (Intrinsics.m17075f(this.f77544a, c80Var.f77544a) && Intrinsics.m17075f(this.f77545b, c80Var.f77545b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f77545b.hashCode() + (this.f77544a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f77544a;
        List<C30076a> list = this.f77545b;
        return "FeedbackAction(actionType=" + str + ", items=" + list + ")";
    }
}
