package p802n9;

import android.net.Uri;
import com.yandex.div.core.DivPreloader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: n9.b */
/* loaded from: classes8.dex */
public interface DivPlayerPreloader {
    @NotNull

    /* renamed from: a */
    public static final C38478b f101811a = C38478b.f101813a;
    @NotNull

    /* renamed from: b */
    public static final DivPlayerPreloader f101812b = new C38477a();

    /* compiled from: DivPlayerPreloader.kt */
    @Metadata
    /* renamed from: n9.b$a */
    /* loaded from: classes8.dex */
    public static final class C38477a implements DivPlayerPreloader {
        C38477a() {
        }

        @Override // p802n9.DivPlayerPreloader
        @NotNull
        /* renamed from: a */
        public DivPreloader.InterfaceC29757d mo14659a(@NotNull List<? extends Uri> src) {
            Intrinsics.checkNotNullParameter(src, "src");
            return DivPreloader.InterfaceC29757d.f75922a.m36677c();
        }
    }

    /* compiled from: DivPlayerPreloader.kt */
    @Metadata
    /* renamed from: n9.b$b */
    /* loaded from: classes8.dex */
    public static final class C38478b {

        /* renamed from: a */
        static final /* synthetic */ C38478b f101813a = new C38478b();

        private C38478b() {
        }
    }

    @NotNull
    /* renamed from: a */
    DivPreloader.InterfaceC29757d mo14659a(@NotNull List<? extends Uri> list);
}
