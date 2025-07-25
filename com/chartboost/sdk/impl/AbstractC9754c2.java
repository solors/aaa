package com.chartboost.sdk.impl;

import androidx.compose.animation.core.C0379a;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import td.C44401b;
import td.EnumEntries;

/* renamed from: com.chartboost.sdk.impl.c2 */
/* loaded from: classes3.dex */
public abstract class AbstractC9754c2 {

    /* renamed from: j */
    public static final C9755a f21764j = new C9755a(null);

    /* renamed from: a */
    public final EnumC9757c f21765a;

    /* renamed from: b */
    public String f21766b;

    /* renamed from: c */
    public final EnumC10022l8 f21767c;

    /* renamed from: d */
    public final File f21768d;

    /* renamed from: e */
    public final AtomicReference f21769e;

    /* renamed from: f */
    public long f21770f;

    /* renamed from: g */
    public long f21771g;

    /* renamed from: h */
    public long f21772h;

    /* renamed from: i */
    public EnumC9756b f21773i;

    /* renamed from: com.chartboost.sdk.impl.c2$a */
    /* loaded from: classes3.dex */
    public static final class C9755a {
        public C9755a() {
        }

        public /* synthetic */ C9755a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.c2$b */
    /* loaded from: classes3.dex */
    public static final class EnumC9756b {

        /* renamed from: b */
        public static final EnumC9756b f21774b = new EnumC9756b("UI", 0);

        /* renamed from: c */
        public static final EnumC9756b f21775c = new EnumC9756b("ASYNC", 1);

        /* renamed from: d */
        public static final /* synthetic */ EnumC9756b[] f21776d;

        /* renamed from: e */
        public static final /* synthetic */ EnumEntries f21777e;

        static {
            EnumC9756b[] m81933a = m81933a();
            f21776d = m81933a;
            f21777e = C44401b.m3113a(m81933a);
        }

        public EnumC9756b(String str, int i) {
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC9756b[] m81933a() {
            return new EnumC9756b[]{f21774b, f21775c};
        }

        public static EnumC9756b valueOf(String str) {
            return (EnumC9756b) Enum.valueOf(EnumC9756b.class, str);
        }

        public static EnumC9756b[] values() {
            return (EnumC9756b[]) f21776d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.c2$c */
    /* loaded from: classes3.dex */
    public static final class EnumC9757c {

        /* renamed from: b */
        public static final EnumC9757c f21778b = new EnumC9757c("GET", 0);

        /* renamed from: c */
        public static final EnumC9757c f21779c = new EnumC9757c("POST", 1);

        /* renamed from: d */
        public static final /* synthetic */ EnumC9757c[] f21780d;

        /* renamed from: e */
        public static final /* synthetic */ EnumEntries f21781e;

        static {
            EnumC9757c[] m81932a = m81932a();
            f21780d = m81932a;
            f21781e = C44401b.m3113a(m81932a);
        }

        public EnumC9757c(String str, int i) {
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC9757c[] m81932a() {
            return new EnumC9757c[]{f21778b, f21779c};
        }

        public static EnumC9757c valueOf(String str) {
            return (EnumC9757c) Enum.valueOf(EnumC9757c.class, str);
        }

        public static EnumC9757c[] values() {
            return (EnumC9757c[]) f21780d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.c2$d */
    /* loaded from: classes3.dex */
    public static final class EnumC9758d {

        /* renamed from: b */
        public static final EnumC9758d f21782b = new EnumC9758d("CANCELED", 0);

        /* renamed from: c */
        public static final EnumC9758d f21783c = new EnumC9758d("QUEUED", 1);

        /* renamed from: d */
        public static final EnumC9758d f21784d = new EnumC9758d("PROCESSING", 2);

        /* renamed from: e */
        public static final /* synthetic */ EnumC9758d[] f21785e;

        /* renamed from: f */
        public static final /* synthetic */ EnumEntries f21786f;

        static {
            EnumC9758d[] m81931a = m81931a();
            f21785e = m81931a;
            f21786f = C44401b.m3113a(m81931a);
        }

        public EnumC9758d(String str, int i) {
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC9758d[] m81931a() {
            return new EnumC9758d[]{f21782b, f21783c, f21784d};
        }

        public static EnumC9758d valueOf(String str) {
            return (EnumC9758d) Enum.valueOf(EnumC9758d.class, str);
        }

        public static EnumC9758d[] values() {
            return (EnumC9758d[]) f21785e.clone();
        }
    }

    public AbstractC9754c2(EnumC9757c method, String uri, EnumC10022l8 priority, File file) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.f21765a = method;
        this.f21766b = uri;
        this.f21767c = priority;
        this.f21768d = file;
        this.f21769e = new AtomicReference(EnumC9758d.f21783c);
        this.f21773i = EnumC9756b.f21774b;
    }

    /* renamed from: a */
    public abstract void mo80239a(CBError cBError, C9843f2 c9843f2);

    /* renamed from: a */
    public void mo80238a(Object obj, C9843f2 c9843f2) {
    }

    /* renamed from: b */
    public final boolean m81937b() {
        return C0379a.m105461a(this.f21769e, EnumC9758d.f21783c, EnumC9758d.f21782b);
    }

    /* renamed from: c */
    public final EnumC9757c m81936c() {
        return this.f21765a;
    }

    /* renamed from: d */
    public final EnumC10022l8 m81935d() {
        return this.f21767c;
    }

    /* renamed from: e */
    public final String m81934e() {
        return this.f21766b;
    }

    /* renamed from: a */
    public void mo80237a(String uri, long j) {
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    /* renamed from: a */
    public C9800d2 mo80240a() {
        return new C9800d2(null, null, null);
    }

    /* renamed from: a */
    public C9824e2 mo79794a(C9843f2 c9843f2) {
        return C9824e2.f21939c.m81755a((Object) null);
    }
}
