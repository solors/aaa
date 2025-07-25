package p804nd;

import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import kotlin.Metadata;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Lazy.kt */
@Metadata
/* renamed from: nd.n */
/* loaded from: classes5.dex */
public final class EnumC38505n {

    /* renamed from: b */
    public static final EnumC38505n f101865b = new EnumC38505n("SYNCHRONIZED", 0);

    /* renamed from: c */
    public static final EnumC38505n f101866c = new EnumC38505n("PUBLICATION", 1);

    /* renamed from: d */
    public static final EnumC38505n f101867d = new EnumC38505n(InterfaceC32663coo2iico.cco22, 2);

    /* renamed from: f */
    private static final /* synthetic */ EnumC38505n[] f101868f;

    /* renamed from: g */
    private static final /* synthetic */ EnumEntries f101869g;

    static {
        EnumC38505n[] m14551b = m14551b();
        f101868f = m14551b;
        f101869g = C44401b.m3113a(m14551b);
    }

    private EnumC38505n(String str, int i) {
    }

    /* renamed from: b */
    private static final /* synthetic */ EnumC38505n[] m14551b() {
        return new EnumC38505n[]{f101865b, f101866c, f101867d};
    }

    public static EnumC38505n valueOf(String str) {
        return (EnumC38505n) Enum.valueOf(EnumC38505n.class, str);
    }

    public static EnumC38505n[] values() {
        return (EnumC38505n[]) f101868f.clone();
    }
}
