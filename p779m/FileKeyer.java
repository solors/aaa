package p779m;

import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p837q.C39310n;

@Metadata
/* renamed from: m.a */
/* loaded from: classes2.dex */
public final class FileKeyer implements Keyer<File> {

    /* renamed from: a */
    private final boolean f100958a;

    public FileKeyer(boolean z) {
        this.f100958a = z;
    }

    @Override // p779m.Keyer
    @NotNull
    /* renamed from: b */
    public String mo15478a(@NotNull File file, @NotNull C39310n c39310n) {
        if (this.f100958a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
