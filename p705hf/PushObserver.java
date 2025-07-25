package p705hf;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: hf.l */
/* loaded from: classes10.dex */
public interface PushObserver {
    @NotNull

    /* renamed from: a */
    public static final C33574a f91768a = C33574a.f91770a;
    @NotNull

    /* renamed from: b */
    public static final PushObserver f91769b = new C33574a.C33575a();

    /* compiled from: PushObserver.kt */
    @Metadata
    /* renamed from: hf.l$a */
    /* loaded from: classes10.dex */
    public static final class C33574a {

        /* renamed from: a */
        static final /* synthetic */ C33574a f91770a = new C33574a();

        /* compiled from: PushObserver.kt */
        @Metadata
        /* renamed from: hf.l$a$a */
        /* loaded from: classes10.dex */
        private static final class C33575a implements PushObserver {
            @Override // p705hf.PushObserver
            /* renamed from: a */
            public void mo23335a(int i, @NotNull ErrorCode errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }

            @Override // p705hf.PushObserver
            /* renamed from: b */
            public boolean mo23334b(int i, @NotNull BufferedSource source, int i2, boolean z) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i2);
                return true;
            }

            @Override // p705hf.PushObserver
            public boolean onHeaders(int i, @NotNull List<C33542c> responseHeaders, boolean z) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // p705hf.PushObserver
            public boolean onRequest(int i, @NotNull List<C33542c> requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }
        }

        private C33574a() {
        }
    }

    /* renamed from: a */
    void mo23335a(int i, @NotNull ErrorCode errorCode);

    /* renamed from: b */
    boolean mo23334b(int i, @NotNull BufferedSource bufferedSource, int i2, boolean z) throws IOException;

    boolean onHeaders(int i, @NotNull List<C33542c> list, boolean z);

    boolean onRequest(int i, @NotNull List<C33542c> list);
}
