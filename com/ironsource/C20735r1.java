package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.r1 */
/* loaded from: classes6.dex */
public final class C20735r1 {
    @Nullable

    /* renamed from: a */
    private final String f52695a;
    @NotNull

    /* renamed from: b */
    private final List<NetworkSettings> f52696b;
    @NotNull

    /* renamed from: c */
    private final C20278lj f52697c;

    /* JADX WARN: Multi-variable type inference failed */
    public C20735r1(@Nullable String str, @NotNull List<? extends NetworkSettings> providerList, @NotNull C20278lj publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f52695a = str;
        this.f52696b = providerList;
        this.f52697c = publisherDataHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C20735r1 m55574a(C20735r1 c20735r1, String str, List list, C20278lj c20278lj, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c20735r1.f52695a;
        }
        if ((i & 2) != 0) {
            list = c20735r1.f52696b;
        }
        if ((i & 4) != 0) {
            c20278lj = c20735r1.f52697c;
        }
        return c20735r1.m55573a(str, list, c20278lj);
    }

    @NotNull
    /* renamed from: b */
    public final List<NetworkSettings> m55572b() {
        return this.f52696b;
    }

    @NotNull
    /* renamed from: c */
    public final C20278lj m55571c() {
        return this.f52697c;
    }

    @NotNull
    /* renamed from: d */
    public final List<NetworkSettings> m55570d() {
        return this.f52696b;
    }

    @NotNull
    /* renamed from: e */
    public final C20278lj m55569e() {
        return this.f52697c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20735r1)) {
            return false;
        }
        C20735r1 c20735r1 = (C20735r1) obj;
        if (Intrinsics.m17075f(this.f52695a, c20735r1.f52695a) && Intrinsics.m17075f(this.f52696b, c20735r1.f52696b) && Intrinsics.m17075f(this.f52697c, c20735r1.f52697c)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final String m55568f() {
        return this.f52695a;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f52695a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((hashCode * 31) + this.f52696b.hashCode()) * 31) + this.f52697c.hashCode();
    }

    @NotNull
    public String toString() {
        return "AdUnitCommonData(userId=" + this.f52695a + ", providerList=" + this.f52696b + ", publisherDataHolder=" + this.f52697c + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C20735r1 m55573a(@Nullable String str, @NotNull List<? extends NetworkSettings> providerList, @NotNull C20278lj publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new C20735r1(str, providerList, publisherDataHolder);
    }

    @Nullable
    /* renamed from: a */
    public final String m55575a() {
        return this.f52695a;
    }
}
