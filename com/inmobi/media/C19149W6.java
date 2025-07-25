package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.W6 */
/* loaded from: classes6.dex */
public class C19149W6 {

    /* renamed from: a */
    public final String f47901a;

    /* renamed from: b */
    public final String f47902b;

    /* renamed from: c */
    public final String f47903c;

    /* renamed from: d */
    public final C19162X6 f47904d;

    /* renamed from: e */
    public Object f47905e;

    /* renamed from: f */
    public boolean f47906f;

    /* renamed from: g */
    public String f47907g;

    /* renamed from: h */
    public String f47908h;

    /* renamed from: i */
    public boolean f47909i;

    /* renamed from: j */
    public byte f47910j;

    /* renamed from: k */
    public byte f47911k;

    /* renamed from: l */
    public byte f47912l;

    /* renamed from: m */
    public byte f47913m;

    /* renamed from: n */
    public int f47914n;

    /* renamed from: o */
    public int f47915o;

    /* renamed from: p */
    public String f47916p;

    /* renamed from: q */
    public String f47917q;

    /* renamed from: r */
    public C19149W6 f47918r;

    /* renamed from: s */
    public final ArrayList f47919s;

    /* renamed from: t */
    public final HashMap f47920t;

    /* renamed from: u */
    public Object f47921u;

    /* renamed from: v */
    public int f47922v;

    /* renamed from: w */
    public C19149W6 f47923w;

    public C19149W6(String assetId, String assetName, String assetType, C19162X6 assetStyle, List trackers) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(assetStyle, "assetStyle");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.f47901a = assetId;
        this.f47902b = assetName;
        this.f47903c = assetType;
        this.f47904d = assetStyle;
        this.f47907g = "NO_ACTION";
        this.f47908h = "";
        this.f47913m = (byte) 2;
        this.f47914n = -1;
        this.f47916p = "";
        this.f47917q = "";
        ArrayList arrayList = new ArrayList();
        this.f47919s = arrayList;
        this.f47920t = new HashMap();
        arrayList.addAll(trackers);
    }

    /* renamed from: a */
    public static void m60606a(C19060P7 tracker, HashMap hashMap, C18922F6 c18922f6, InterfaceC18850A4 interfaceC18850A4) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        C19170Y1.f47986a.m60547a(AbstractC18994K8.m60977a(tracker.f47622e, hashMap), tracker.f47621d, true, c18922f6, EnumC19414p9.f48580b, interfaceC18850A4);
    }

    /* renamed from: d */
    public static void m60599d(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
    }

    /* renamed from: b */
    public final void m60602b(byte b) {
        this.f47913m = b;
    }

    /* renamed from: c */
    public final void m60600c(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
    }

    /* renamed from: b */
    public final void m60601b(String str) {
        String str2;
        if (str != null) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.m17071j(str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            str2 = str.subSequence(i, length + 1).toString();
        } else {
            str2 = null;
        }
        this.f47916p = str2;
    }

    /* renamed from: a */
    public final void m60607a(byte b) {
        this.f47910j = b;
    }

    /* renamed from: a */
    public final void m60605a(C19216b7 c19216b7) {
        this.f47918r = c19216b7;
    }

    /* renamed from: a */
    public final void m60603a(String eventType, HashMap hashMap, C18922F6 c18922f6, InterfaceC18850A4 interfaceC18850A4) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Iterator it = this.f47919s.iterator();
        while (it.hasNext()) {
            C19060P7 c19060p7 = (C19060P7) it.next();
            if (Intrinsics.m17075f(eventType, c19060p7.f47620c)) {
                m60606a(c19060p7, hashMap, c18922f6, interfaceC18850A4);
            }
        }
    }

    /* renamed from: a */
    public final void m60604a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        int length = value.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.m17071j(value.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        this.f47917q = value.subSequence(i, length + 1).toString();
    }

    public /* synthetic */ C19149W6(String str, String str2, String str3, C19162X6 c19162x6, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "root" : str2, (i & 4) != 0 ? "CONTAINER" : str3, (i & 8) != 0 ? new C19162X6() : c19162x6, new LinkedList());
    }
}
