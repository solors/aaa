package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class FilteringManifestParser<T extends FilterableManifest<T>> implements ParsingLoadable.Parser<T> {

    /* renamed from: a */
    private final ParsingLoadable.Parser<? extends T> f34039a;
    @Nullable

    /* renamed from: b */
    private final List<StreamKey> f34040b;

    public FilteringManifestParser(ParsingLoadable.Parser<? extends T> parser, @Nullable List<StreamKey> list) {
        this.f34039a = parser;
        this.f34040b = list;
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public T parse(Uri uri, InputStream inputStream) throws IOException {
        T parse = this.f34039a.parse(uri, inputStream);
        List<StreamKey> list = this.f34040b;
        return (list == null || list.isEmpty()) ? parse : (T) parse.copy(this.f34040b);
    }
}
