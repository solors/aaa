package sg.bigo.ads.core.p964e.p965a;

import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.model.MediaFile;
import org.w3c.dom.Node;
import sg.bigo.ads.core.p964e.C44180a;

/* renamed from: sg.bigo.ads.core.e.a.i */
/* loaded from: classes10.dex */
public final class C44205i {
    @NonNull

    /* renamed from: a */
    final Node f116023a;

    public C44205i(@NonNull Node node) {
        this.f116023a = node;
    }

    /* renamed from: a */
    public final String m3681a() {
        return C44180a.m3722e(this.f116023a, "type");
    }

    /* renamed from: b */
    public final String m3680b() {
        return C44180a.m3727b(this.f116023a);
    }

    /* renamed from: c */
    public final int m3679c() {
        return C44180a.m3723d(this.f116023a, MediaFile.FILE_SIZE).intValue();
    }

    /* renamed from: d */
    public final int m3678d() {
        return C44180a.m3723d(this.f116023a, MediaFile.BITRATE).intValue();
    }

    /* renamed from: e */
    public final String m3677e() {
        return C44180a.m3722e(this.f116023a, "md5");
    }
}
