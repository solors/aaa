package kotlin.collections;

import com.facebook.internal.AnalyticsEvents;
import kotlin.Metadata;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AbstractIterator.kt */
@Metadata
/* renamed from: kotlin.collections.c1 */
/* loaded from: classes7.dex */
final class EnumC37536c1 {

    /* renamed from: b */
    public static final EnumC37536c1 f99231b = new EnumC37536c1("Ready", 0);

    /* renamed from: c */
    public static final EnumC37536c1 f99232c = new EnumC37536c1("NotReady", 1);

    /* renamed from: d */
    public static final EnumC37536c1 f99233d = new EnumC37536c1("Done", 2);

    /* renamed from: f */
    public static final EnumC37536c1 f99234f = new EnumC37536c1(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 3);

    /* renamed from: g */
    private static final /* synthetic */ EnumC37536c1[] f99235g;

    /* renamed from: h */
    private static final /* synthetic */ EnumEntries f99236h;

    static {
        EnumC37536c1[] m17579b = m17579b();
        f99235g = m17579b;
        f99236h = C44401b.m3113a(m17579b);
    }

    private EnumC37536c1(String str, int i) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC37536c1[] m17579b() {
        return new EnumC37536c1[]{f99231b, f99232c, f99233d, f99234f};
    }

    public static EnumC37536c1 valueOf(String str) {
        return (EnumC37536c1) Enum.valueOf(EnumC37536c1.class, str);
    }

    public static EnumC37536c1[] values() {
        return (EnumC37536c1[]) f99235g.clone();
    }
}
