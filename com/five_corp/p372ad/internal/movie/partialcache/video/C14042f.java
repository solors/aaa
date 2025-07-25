package com.five_corp.p372ad.internal.movie.partialcache.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.movie.C14060x;
import com.five_corp.p372ad.internal.movie.partialcache.C14045w1;
import com.five_corp.p372ad.internal.movie.partialcache.mediacodec.C13994a;
import com.five_corp.p372ad.internal.movie.partialcache.mediacodec.C14001h;
import com.five_corp.p372ad.internal.movie.partialcache.mediacodec.C14009p;
import com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13995b;
import com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13996c;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.video.f */
/* loaded from: classes4.dex */
public final class C14042f implements InterfaceC13995b {

    /* renamed from: a */
    public final MediaFormat f26184a;

    /* renamed from: b */
    public final Handler f26185b;

    /* renamed from: c */
    public final C14040d f26186c;

    /* renamed from: e */
    public InterfaceC13996c f26188e;

    /* renamed from: g */
    public long f26190g;

    /* renamed from: f */
    public int f26189f = 1;

    /* renamed from: h */
    public long f26191h = 0;

    /* renamed from: d */
    public final ArrayDeque f26187d = new ArrayDeque();

    public C14042f(MediaFormat mediaFormat, Handler handler, C14040d c14040d) {
        this.f26184a = mediaFormat;
        this.f26185b = handler;
        this.f26186c = c14040d;
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13995b
    /* renamed from: a */
    public final void mo78160a(InterfaceC13996c interfaceC13996c, MediaFormat mediaFormat) {
    }

    /* renamed from: a */
    public final void m78161a(Surface surface, long j) {
        if (this.f26189f != 1) {
            return;
        }
        this.f26189f = 2;
        try {
            C14001h c14001h = new C14001h(MediaCodec.createDecoderByType(this.f26184a.getString("mime")), this, this.f26185b.getLooper());
            this.f26188e = c14001h;
            this.f26190g = j;
            c14001h.mo78184a(this.f26184a, surface);
        } catch (Exception e) {
            C14040d c14040d = this.f26186c;
            ((C14060x) c14040d.f26177c).m78148a(new C14068s(EnumC14106t.f26651r0, null, e, null));
        }
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13995b
    /* renamed from: a */
    public final void mo78157a(C14068s c14068s) {
        int i = this.f26189f;
        if (i == 5 || i == 6) {
            return;
        }
        this.f26189f = 5;
        C14040d c14040d = this.f26186c;
        ((C14060x) c14040d.f26177c).m78148a(new C14068s(EnumC14106t.f26640p5, null, null, c14068s));
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13995b
    /* renamed from: a */
    public final boolean mo78159a(InterfaceC13996c interfaceC13996c, C13994a c13994a) {
        C14045w1 m78165b;
        int i = this.f26189f;
        if (i == 1 || i == 5 || i == 6 || this.f26188e != interfaceC13996c || (m78165b = this.f26186c.f26176b.f26029f.m78165b()) == null) {
            return false;
        }
        try {
            ByteBuffer byteBuffer = c13994a.f26089b;
            ByteBuffer wrap = ByteBuffer.wrap(m78165b.f26192a, m78165b.f26193b, m78165b.f26194c);
            byteBuffer.rewind();
            while (wrap.position() < wrap.limit()) {
                int i2 = wrap.getInt();
                byteBuffer.put(new byte[]{0, 0, 0, 1});
                byteBuffer.put(wrap.array(), wrap.position(), i2);
                wrap.position(wrap.position() + i2);
            }
            int position = byteBuffer.position();
            byteBuffer.position(0);
            byteBuffer.limit(position);
            this.f26188e.mo78183a(c13994a, m78165b, position);
        } catch (Exception e) {
            mo78157a(new C14068s(EnumC14106t.f26648q5, null, e, null));
        }
        return true;
    }

    @Override // com.five_corp.p372ad.internal.movie.partialcache.mediacodec.InterfaceC13995b
    /* renamed from: a */
    public final void mo78158a(InterfaceC13996c interfaceC13996c, C14009p c14009p) {
        int i = this.f26189f;
        if (i == 1 || i == 5 || i == 6 || this.f26188e != interfaceC13996c || c14009p.m78177b()) {
            return;
        }
        if (this.f26189f != 2) {
            if (!this.f26187d.isEmpty() || c14009p.m78178a() >= this.f26191h) {
                this.f26187d.addLast(c14009p);
            } else {
                this.f26188e.mo78181a(c14009p, true);
            }
        } else if (c14009p.m78178a() < this.f26190g) {
            this.f26188e.mo78181a(c14009p, false);
        } else {
            this.f26188e.mo78181a(c14009p, true);
            this.f26189f = 3;
            C14040d c14040d = this.f26186c;
            c14040d.getClass();
            c14040d.f26175a.post(new RunnableC14037a(c14040d, new C14038b(c14040d)));
        }
    }

    /* renamed from: a */
    public final void m78162a(long j) {
        C14009p c14009p;
        int i = this.f26189f;
        if (i == 3 || i == 4) {
            this.f26189f = 4;
            this.f26191h = j;
            if (this.f26187d.isEmpty() || ((C14009p) this.f26187d.peekFirst()).m78178a() >= j) {
                return;
            }
            Object pollFirst = this.f26187d.pollFirst();
            while (true) {
                c14009p = (C14009p) pollFirst;
                if (this.f26187d.isEmpty() || ((C14009p) this.f26187d.peekFirst()).m78178a() >= j) {
                    break;
                }
                this.f26188e.mo78181a(c14009p, false);
                pollFirst = this.f26187d.pollFirst();
            }
            this.f26188e.mo78181a(c14009p, true);
        }
    }

    /* renamed from: a */
    public final void m78163a() {
        int i = this.f26189f;
        if (i == 1 || i == 6) {
            return;
        }
        if (i == 5) {
            this.f26189f = 6;
        } else {
            this.f26189f = 1;
        }
        InterfaceC13996c interfaceC13996c = this.f26188e;
        if (interfaceC13996c != null) {
            interfaceC13996c.release();
            this.f26188e = null;
        }
        this.f26187d.clear();
    }
}
