package sg.bigo.ads.common.p933u;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.p933u.p935b.AbstractC43797c;
import sg.bigo.ads.common.p933u.p936c.C43800a;
import sg.bigo.ads.common.p933u.p936c.InterfaceC43802c;

/* renamed from: sg.bigo.ads.common.u.b */
/* loaded from: classes10.dex */
public abstract class AbstractC43793b<Req extends AbstractC43797c, Res extends InterfaceC43802c> {

    /* renamed from: c */
    public static AbstractC43793b<AbstractC43797c, C43800a> f114602c = new C43794a();

    /* renamed from: sg.bigo.ads.common.u.b$a */
    /* loaded from: classes10.dex */
    static class C43794a<Req extends AbstractC43797c> extends AbstractC43793b<Req, C43800a> {

        /* renamed from: a */
        Req f114603a;

        /* renamed from: b */
        C43800a f114604b;

        /* renamed from: d */
        C43808h f114605d;

        @Override // sg.bigo.ads.common.p933u.AbstractC43793b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C43800a mo3801a(@NonNull C43800a c43800a) {
            return c43800a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // sg.bigo.ads.common.p933u.AbstractC43793b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo3803a(@NonNull AbstractC43797c abstractC43797c, @NonNull C43800a c43800a) {
            this.f114603a = abstractC43797c;
            this.f114604b = c43800a;
        }

        @Override // sg.bigo.ads.common.p933u.AbstractC43793b
        /* renamed from: a */
        public final void mo3802a(@NonNull Req req, @NonNull C43808h c43808h) {
            this.f114603a = req;
            this.f114605d = c43808h;
        }
    }

    /* renamed from: a */
    public abstract Res mo3801a(@NonNull C43800a c43800a);

    /* renamed from: a */
    public void mo4090a(@NonNull Req req) {
    }

    /* renamed from: a */
    public abstract void mo3803a(@NonNull Req req, @NonNull Res res);

    /* renamed from: a */
    public abstract void mo3802a(@NonNull Req req, @NonNull C43808h c43808h);

    /* renamed from: a */
    public void mo3804a(@NonNull Req req, @Nullable String str, int i) {
    }

    /* renamed from: a */
    public boolean mo3805a(@NonNull Req req, int i) {
        return i >= 200 && i < 300;
    }
}
