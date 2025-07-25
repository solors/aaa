package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.z */
/* loaded from: classes4.dex */
public final class C15357z extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public C15357z(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public C15357z(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
    }
}
