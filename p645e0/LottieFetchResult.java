package p645e0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: e0.d */
/* loaded from: classes2.dex */
public interface LottieFetchResult extends Closeable {
    @Nullable
    /* renamed from: B */
    String mo25545B();

    @NonNull
    /* renamed from: G */
    InputStream mo25544G() throws IOException;

    @Nullable
    String contentType();

    boolean isSuccessful();
}
