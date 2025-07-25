package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p987te.AbstractC44407c;

/* compiled from: Json.kt */
@Metadata
/* renamed from: kotlinx.serialization.json.d */
/* loaded from: classes8.dex */
public final class C37855d {

    /* renamed from: a */
    private boolean f99718a;

    /* renamed from: b */
    private boolean f99719b;

    /* renamed from: c */
    private boolean f99720c;

    /* renamed from: d */
    private boolean f99721d;

    /* renamed from: e */
    private boolean f99722e;

    /* renamed from: f */
    private boolean f99723f;
    @NotNull

    /* renamed from: g */
    private String f99724g;

    /* renamed from: h */
    private boolean f99725h;

    /* renamed from: i */
    private boolean f99726i;
    @NotNull

    /* renamed from: j */
    private String f99727j;

    /* renamed from: k */
    private boolean f99728k;

    /* renamed from: l */
    private boolean f99729l;
    @NotNull

    /* renamed from: m */
    private AbstractC44407c f99730m;

    public C37855d(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f99718a = json.m15948e().m15931e();
        this.f99719b = json.m15948e().m15930f();
        this.f99720c = json.m15948e().m15929g();
        this.f99721d = json.m15948e().m15923m();
        this.f99722e = json.m15948e().m15934b();
        this.f99723f = json.m15948e().m15927i();
        this.f99724g = json.m15948e().m15926j();
        this.f99725h = json.m15948e().m15932d();
        this.f99726i = json.m15948e().m15924l();
        this.f99727j = json.m15948e().m15933c();
        this.f99728k = json.m15948e().m15935a();
        this.f99729l = json.m15948e().m15925k();
        json.m15948e().m15928h();
        this.f99730m = json.mo13747a();
    }

    @NotNull
    /* renamed from: a */
    public final JsonConfiguration m15942a() {
        if (this.f99726i && !Intrinsics.m17075f(this.f99727j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (!this.f99723f) {
            if (!Intrinsics.m17075f(this.f99724g, "    ")) {
                throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
            }
        } else if (!Intrinsics.m17075f(this.f99724g, "    ")) {
            String str = this.f99724g;
            boolean z = false;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        z2 = false;
                    }
                    if (!z2) {
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f99724g).toString());
            }
        }
        return new JsonConfiguration(this.f99718a, this.f99720c, this.f99721d, this.f99722e, this.f99723f, this.f99719b, this.f99724g, this.f99725h, this.f99726i, this.f99727j, this.f99728k, this.f99729l, null);
    }

    @NotNull
    /* renamed from: b */
    public final AbstractC44407c m15941b() {
        return this.f99730m;
    }

    /* renamed from: c */
    public final void m15940c(boolean z) {
        this.f99722e = z;
    }

    /* renamed from: d */
    public final void m15939d(boolean z) {
        this.f99718a = z;
    }

    /* renamed from: e */
    public final void m15938e(boolean z) {
        this.f99719b = z;
    }

    /* renamed from: f */
    public final void m15937f(boolean z) {
        this.f99720c = z;
    }

    /* renamed from: g */
    public final void m15936g(boolean z) {
        this.f99721d = z;
    }
}
