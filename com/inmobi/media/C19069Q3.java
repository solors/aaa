package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.inmobi.media.C19069Q3;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Q3 */
/* loaded from: classes6.dex */
public final class C19069Q3 implements InterfaceC19056P3 {

    /* renamed from: a */
    public final Movie f47630a;

    /* renamed from: b */
    public int f47631b;

    /* renamed from: c */
    public long f47632c;

    /* renamed from: d */
    public volatile boolean f47633d;

    /* renamed from: e */
    public InterfaceC19043O3 f47634e;

    public C19069Q3(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath);
        byte[] bArr = new byte[(int) file.length()];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read(bArr);
            AbstractC18994K8.m60979a((Closeable) fileInputStream);
            Movie decodeByteArray = Movie.decodeByteArray(bArr, 0, read);
            this.f47630a = decodeByteArray;
            if (decodeByteArray != null) {
                return;
            }
            throw new IllegalStateException("Cannot decode gif byte array".toString());
        } catch (Throwable th) {
            AbstractC18994K8.m60979a((Closeable) fileInputStream);
            throw th;
        }
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: a */
    public final void mo60795a(boolean z) {
        this.f47633d = z;
        if (!this.f47633d) {
            this.f47632c = SystemClock.uptimeMillis() - this.f47631b;
        }
        InterfaceC19043O3 interfaceC19043O3 = this.f47634e;
        if (interfaceC19043O3 != null) {
            Intrinsics.m17074g(interfaceC19043O3);
            ((C19081R3) interfaceC19043O3).invalidate();
        }
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: b */
    public final void mo60794b() {
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f47632c == 0) {
            this.f47632c = uptimeMillis;
        }
        Movie movie = this.f47630a;
        if (movie != null) {
            i = movie.duration();
        } else {
            i = 0;
        }
        if (i == 0) {
            i = 1000;
        }
        int i2 = (int) ((uptimeMillis - this.f47632c) % i);
        this.f47631b = i2;
        Movie movie2 = this.f47630a;
        if (movie2 != null) {
            movie2.setTime(i2);
        }
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: c */
    public final boolean mo60793c() {
        return !this.f47633d;
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: d */
    public final int mo60792d() {
        Movie movie = this.f47630a;
        if (movie != null) {
            return movie.width();
        }
        return 0;
    }

    /* renamed from: e */
    public final void m60791e() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o3.i1
            @Override // java.lang.Runnable
            public final void run() {
                C19069Q3.m60796a(C19069Q3.this);
            }
        });
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: a */
    public final int mo60799a() {
        Movie movie = this.f47630a;
        if (movie != null) {
            return movie.height();
        }
        return 0;
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: a */
    public final void mo60798a(Canvas canvas, float f, float f2) {
        Movie movie = this.f47630a;
        if (movie != null) {
            movie.draw(canvas, f, f2);
        }
        Movie movie2 = this.f47630a;
        if (this.f47631b + 20 >= (movie2 != null ? movie2.duration() : 0)) {
            m60791e();
        }
    }

    /* renamed from: a */
    public static final void m60796a(C19069Q3 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f47631b = 0;
        this$0.mo60795a(false);
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    /* renamed from: a */
    public final void mo60797a(InterfaceC19043O3 interfaceC19043O3) {
        this.f47634e = interfaceC19043O3;
    }

    @Override // com.inmobi.media.InterfaceC19056P3
    public final void start() {
    }
}
