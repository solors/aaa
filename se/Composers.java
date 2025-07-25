package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: se.a0 */
/* loaded from: classes8.dex */
public final class Composers extends C42725r {
    @NotNull

    /* renamed from: c */
    private final Json f111794c;

    /* renamed from: d */
    private int f111795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Composers(@NotNull InterfaceC42743z0 writer, @NotNull Json json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f111794c = json;
    }

    @Override // se.C42725r
    /* renamed from: b */
    public void mo6694b() {
        m6687n(true);
        this.f111795d++;
    }

    @Override // se.C42725r
    /* renamed from: c */
    public void mo6693c() {
        m6687n(false);
        m6689j("\n");
        int i = this.f111795d;
        for (int i2 = 0; i2 < i; i2++) {
            m6689j(this.f111794c.m15948e().m15926j());
        }
    }

    @Override // se.C42725r
    /* renamed from: o */
    public void mo6686o() {
        m6692e(' ');
    }

    @Override // se.C42725r
    /* renamed from: p */
    public void mo6685p() {
        this.f111795d--;
    }
}
