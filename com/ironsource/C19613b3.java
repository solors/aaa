package com.ironsource;

import com.ironsource.InterfaceC20197k9;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.b3 */
/* loaded from: classes6.dex */
public class C19613b3 implements InterfaceC20128j3 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC19799e3 f49216a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC19970ge f49217b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC19778dl<Integer, Integer> f49218c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC20197k9 f49219d;
    @NotNull

    /* renamed from: e */
    private List<InterfaceC19952g3> f49220e;

    public C19613b3(@NotNull InterfaceC19799e3 eventBaseData, @NotNull InterfaceC19970ge eventsManager, @NotNull InterfaceC19778dl<Integer, Integer> eventsMapper, @NotNull InterfaceC20197k9 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        Intrinsics.checkNotNullParameter(eventsMapper, "eventsMapper");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f49216a = eventBaseData;
        this.f49217b = eventsManager;
        this.f49218c = eventsMapper;
        this.f49219d = currentTimeProvider;
        this.f49220e = new ArrayList();
    }

    @Override // com.ironsource.InterfaceC20128j3
    /* renamed from: a */
    public void mo57901a() {
        this.f49220e.clear();
    }

    @NotNull
    /* renamed from: b */
    public final List<InterfaceC19952g3> m59377b() {
        return this.f49220e;
    }

    public /* synthetic */ C19613b3(InterfaceC19799e3 interfaceC19799e3, InterfaceC19970ge interfaceC19970ge, InterfaceC19778dl interfaceC19778dl, InterfaceC20197k9 interfaceC20197k9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC19799e3, interfaceC19970ge, interfaceC19778dl, (i & 8) != 0 ? new InterfaceC20197k9.C20198a() : interfaceC20197k9);
    }

    /* renamed from: b */
    private final JSONObject m59376b(List<? extends InterfaceC19952g3> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (InterfaceC19952g3 interfaceC19952g3 : list) {
            interfaceC19952g3.mo58474a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC20128j3
    /* renamed from: a */
    public void mo57900a(int i, @NotNull List<InterfaceC19952g3> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            for (InterfaceC19952g3 interfaceC19952g3 : this.f49216a.mo58831a()) {
                arrayList.add(interfaceC19952g3);
            }
            for (InterfaceC19952g3 interfaceC19952g32 : this.f49220e) {
                arrayList.add(interfaceC19952g32);
            }
            this.f49217b.mo57283a(new C20200kb(this.f49218c.mo53929a(Integer.valueOf(i)).intValue(), this.f49219d.mo57675a(), m59376b(arrayList)));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            System.out.println((Object) ("LogRemote | Exception: " + e.getMessage()));
        }
    }

    /* renamed from: a */
    public final void m59378a(@NotNull List<InterfaceC19952g3> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f49220e = list;
    }

    @Override // com.ironsource.InterfaceC20128j3
    /* renamed from: a */
    public void mo57899a(@NotNull InterfaceC19952g3... analyticsEventEntity) {
        Intrinsics.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC19952g3 interfaceC19952g3 : analyticsEventEntity) {
            this.f49220e.add(interfaceC19952g3);
        }
    }
}
