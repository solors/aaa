package com.ironsource;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.v */
/* loaded from: classes6.dex */
public final class C21103v implements InterfaceC21191wr<JSONObject>, InterfaceC21094ur<C20993t> {
    @NotNull

    /* renamed from: a */
    private final Map<String, C19565a2> f53833a = new LinkedHashMap();

    /* renamed from: b */
    private int f53834b;

    @Metadata
    /* renamed from: com.ironsource.v$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C21104a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53835a;

        static {
            int[] iArr = new int[EnumC21045tr.values().length];
            try {
                iArr[EnumC21045tr.LoadRequest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21045tr.LoadSuccess.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21045tr.ShowSuccess.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC21045tr.ShowFailed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC21045tr.Destroyed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f53835a = iArr;
        }
    }

    /* renamed from: a */
    public final int m54548a() {
        return this.f53834b;
    }

    @Override // com.ironsource.InterfaceC20580od
    @NotNull
    /* renamed from: b */
    public JSONObject mo54546a(@NotNull EnumC21149vr mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, C19565a2> entry : this.f53833a.entrySet()) {
            String key = entry.getKey();
            JSONObject mo54546a = entry.getValue().mo54546a(mode);
            if (mo54546a.length() > 0) {
                jSONObject.put(key, mo54546a);
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    private final void m54543b(C20993t c20993t) {
        int i;
        int i2;
        int i3 = C21104a.f53835a[c20993t.m54872f().ordinal()];
        if (i3 == 2) {
            i = this.f53834b + 1;
        } else if ((i3 != 3 && i3 != 4 && i3 != 5) || (i2 = this.f53834b) <= 0) {
            return;
        } else {
            i = i2 - 1;
        }
        this.f53834b = i;
    }

    @Override // com.ironsource.InterfaceC21094ur
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo54545a(@NotNull C20993t record) {
        Intrinsics.checkNotNullParameter(record, "record");
        String m54875c = record.m54875c();
        Map<String, C19565a2> map = this.f53833a;
        C19565a2 c19565a2 = map.get(m54875c);
        if (c19565a2 == null) {
            c19565a2 = new C19565a2();
            map.put(m54875c, c19565a2);
        }
        c19565a2.mo54545a(record.m54877a(new C21055u()));
        m54543b(record);
    }

    /* renamed from: b */
    public final boolean m54544b() {
        return !this.f53833a.isEmpty();
    }
}
