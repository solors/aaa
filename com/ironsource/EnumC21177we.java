package com.ironsource;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringNumberConversions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.we */
/* loaded from: classes6.dex */
public enum EnumC21177we {
    UnknownProvider(0),
    DeliverySonic(1),
    MarketPlaceISX(3);
    
    @NotNull

    /* renamed from: b */
    public static final C21178a f54334b = new C21178a(null);

    /* renamed from: a */
    private final int f54339a;

    @Metadata
    /* renamed from: com.ironsource.we$a */
    /* loaded from: classes6.dex */
    public static final class C21178a {
        private C21178a() {
        }

        public /* synthetic */ C21178a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final EnumC21177we m54344a(@Nullable Integer num) {
            EnumC21177we enumC21177we;
            EnumC21177we[] values = EnumC21177we.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumC21177we = null;
                    break;
                }
                enumC21177we = values[i];
                if (num != null && enumC21177we.m54345b() == num.intValue()) {
                    break;
                }
                i++;
            }
            return enumC21177we == null ? EnumC21177we.UnknownProvider : enumC21177we;
        }

        @NotNull
        /* renamed from: a */
        public final EnumC21177we m54343a(@NotNull String dynamicDemandSourceId) {
            List m16611C0;
            Integer m16640m;
            Intrinsics.checkNotNullParameter(dynamicDemandSourceId, "dynamicDemandSourceId");
            m16611C0 = C37690r.m16611C0(dynamicDemandSourceId, new String[]{"_"}, false, 0, 6, null);
            if (m16611C0.size() < 2) {
                return EnumC21177we.UnknownProvider;
            }
            m16640m = StringNumberConversions.m16640m((String) m16611C0.get(1));
            return m54344a(m16640m);
        }
    }

    EnumC21177we(int i) {
        this.f54339a = i;
    }

    /* renamed from: b */
    public final int m54345b() {
        return this.f54339a;
    }
}
