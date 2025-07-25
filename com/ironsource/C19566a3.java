package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: com.ironsource.a3 */
/* loaded from: classes6.dex */
public final class C19566a3 implements InterfaceC21191wr<JSONArray> {
    @NotNull

    /* renamed from: a */
    private final List<C21291z2> f49006a = new ArrayList();

    @Metadata
    /* renamed from: com.ironsource.a3$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C19567a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49007a;

        static {
            int[] iArr = new int[EnumC21149vr.values().length];
            try {
                iArr[EnumC21149vr.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21149vr.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f49007a = iArr;
        }
    }

    /* renamed from: b */
    private final List<C21291z2> m59488b() {
        List<C21291z2> list = this.f49006a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C21291z2) obj).m53924e() != EnumC21045tr.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final List<C21291z2> m59490a() {
        int m17154x;
        Set m17547e1;
        List<C21291z2> list = this.f49006a;
        ArrayList<C21291z2> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C21291z2 c21291z2 = (C21291z2) next;
            if ((c21291z2.m53924e() == EnumC21045tr.LoadSuccess || c21291z2.m53924e() == EnumC21045tr.LoadRequest) ? false : false) {
                arrayList.add(next);
            }
        }
        m17154x = C37566w.m17154x(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m17154x);
        for (C21291z2 c21291z22 : arrayList) {
            arrayList2.add(c21291z22.m53928a());
        }
        m17547e1 = _Collections.m17547e1(arrayList2);
        List<C21291z2> list2 = this.f49006a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            C21291z2 c21291z23 = (C21291z2) obj;
            if (c21291z23.m53924e() == EnumC21045tr.LoadSuccess && !m17547e1.contains(c21291z23.m53928a())) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    @Override // com.ironsource.InterfaceC20580od
    @NotNull
    /* renamed from: b */
    public JSONArray mo54546a(@NotNull EnumC21149vr mode) {
        int m17154x;
        int m17154x2;
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = C19567a.f49007a[mode.ordinal()];
        if (i == 1) {
            List<C21291z2> m59488b = m59488b();
            m17154x = C37566w.m17154x(m59488b, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            for (C21291z2 c21291z2 : m59488b) {
                arrayList.add(c21291z2.m53925d());
            }
            return new JSONArray((Collection) arrayList);
        } else if (i == 2) {
            List<C21291z2> m59490a = m59490a();
            m17154x2 = C37566w.m17154x(m59490a, 10);
            ArrayList arrayList2 = new ArrayList(m17154x2);
            for (C21291z2 c21291z22 : m59490a) {
                arrayList2.add(c21291z22.m53926c());
            }
            return new JSONArray((Collection) arrayList2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public final void m59489a(@NotNull C21291z2 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f49006a.add(event);
    }
}
