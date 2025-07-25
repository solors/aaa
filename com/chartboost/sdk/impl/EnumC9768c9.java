package com.chartboost.sdk.impl;

import com.smaato.sdk.video.vast.model.VastTree;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsJVM;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.chartboost.sdk.impl.c9 */
/* loaded from: classes3.dex */
public final class EnumC9768c9 {

    /* renamed from: c */
    public static final C9769a f21806c;

    /* renamed from: d */
    public static final EnumC9768c9 f21807d = new EnumC9768c9("MRAID", 0, "mraid");

    /* renamed from: e */
    public static final EnumC9768c9 f21808e = new EnumC9768c9("HTML", 1, "html");

    /* renamed from: f */
    public static final EnumC9768c9 f21809f = new EnumC9768c9(VastTree.VAST, 2, "vast");

    /* renamed from: g */
    public static final EnumC9768c9 f21810g = new EnumC9768c9("UNKNOWN", 3, "unknown");

    /* renamed from: h */
    public static final /* synthetic */ EnumC9768c9[] f21811h;

    /* renamed from: i */
    public static final /* synthetic */ EnumEntries f21812i;

    /* renamed from: b */
    public final String f21813b;

    /* renamed from: com.chartboost.sdk.impl.c9$a */
    /* loaded from: classes3.dex */
    public static final class C9769a {
        public C9769a() {
        }

        /* renamed from: a */
        public final EnumC9768c9 m81902a(String str) {
            Object obj;
            boolean m16615y;
            Iterator<E> it = EnumC9768c9.m81904b().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    m16615y = StringsJVM.m16615y(((EnumC9768c9) obj).m81903c(), str, true);
                    if (m16615y) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            EnumC9768c9 enumC9768c9 = (EnumC9768c9) obj;
            if (enumC9768c9 == null) {
                return EnumC9768c9.f21810g;
            }
            return enumC9768c9;
        }

        public /* synthetic */ C9769a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        EnumC9768c9[] m81905a = m81905a();
        f21811h = m81905a;
        f21812i = C44401b.m3113a(m81905a);
        f21806c = new C9769a(null);
    }

    public EnumC9768c9(String str, int i, String str2) {
        this.f21813b = str2;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC9768c9[] m81905a() {
        return new EnumC9768c9[]{f21807d, f21808e, f21809f, f21810g};
    }

    /* renamed from: b */
    public static EnumEntries m81904b() {
        return f21812i;
    }

    public static EnumC9768c9 valueOf(String str) {
        return (EnumC9768c9) Enum.valueOf(EnumC9768c9.class, str);
    }

    public static EnumC9768c9[] values() {
        return (EnumC9768c9[]) f21811h.clone();
    }

    /* renamed from: c */
    public final String m81903c() {
        return this.f21813b;
    }
}
